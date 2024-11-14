package kbtdx.minecraft.man10CardGame;

import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import static kbtdx.minecraft.man10CardGame.Man10CardGame.*;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (sender.hasPermission("mlc.player")) {
            Player p = (Player) sender;
            switch (args.length){
                case 0:
                    return true;
                case 1: //start join list
                    if (args[0].equalsIgnoreCase("list")){
                        sender.sendMessage(Component.text("募集中のゲームは以下の通りです"));
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("start")){
                        sender.sendMessage(Component.text("/lastcard start プレイ人数"));
                        return true;
                    }
                    if (args[0].equalsIgnoreCase("join")){
                        sender.sendMessage(Component.text("/lastcard join プレイヤー名"));
                    }

                case 2:
                    if (args[0].equalsIgnoreCase("start")){
                        if (!playingPlayerList.contains(p)){
                            if (Functions.isNumber(args[1])){
                                PlayerRecruitment pr = new PlayerRecruitment(p,Integer.parseInt(args[1]));
                                playingPlayerList.add(p);
                                playerRecruitList.put(p,pr);
                                pr.start();
                            }else {
                                sender.sendMessage(Component.text("プレイ人数が無効です。"));
                            }
                        }else {
                            sender.sendMessage(Component.text("あなたはすでに募集を開始しているか、ゲームに参加しています。"));
                        }

                    }
            }

        }

        return true;
    }
}
