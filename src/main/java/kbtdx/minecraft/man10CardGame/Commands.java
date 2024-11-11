package kbtdx.minecraft.man10CardGame;

import net.kyori.adventure.text.Component;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;
import static kbtdx.minecraft.man10CardGame.Man10CardGame.*;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String s, @NotNull String[] args) {
        if (sender.hasPermission("mlc.player")) {
            switch (args.length){
                case 0:
                    return true;
                case 1: //start join list
                    if (args[0].equalsIgnoreCase("list")){
                        sender.sendMessage(Component.text("募集中のゲームは以下の通りです"));

                    }

            }

        }

        return true;
    }
}
