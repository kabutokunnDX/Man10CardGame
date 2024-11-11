package kbtdx.minecraft.man10CardGame;


import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class PlayerRecruitment extends Thread{

    private Player owner;

    private final Integer maxPlayer;
    private Boolean isPlayerGathered;
    private Integer timer;

    public PlayerRecruitment(Player owner,Integer maxPlayer){ //コンストラクタ
        this.maxPlayer = maxPlayer;
        this.owner = owner;
        timer = 60;
    }

    @Override
    public void run(){
        Bukkit.broadcast(Component.text("§4§l" + owner.getName() +"§r§f§2が§4§l" + maxPlayer.toString() + "§r§f2人で§8§lLastCard§f§r§2を開始しました！"));
        Bukkit.broadcast(Component.text("§4§lプレイヤー§f§2§lが2人で§8§lLastCard§f§r§2§lを募集中！§2§l残り" + timer + "秒..."));
        while(!isPlayerGathered){
            timer--;
            switch (timer){
                case 30: Bukkit.broadcast(Component.text("§4§lプレイヤー§f§2§lが2人で§8§lLastCard§f§r§2§lを募集中！§2§l残り" + timer + "秒..."));
                case 20: Bukkit.broadcast(Component.text("§4§lプレイヤー§f§2§lが2人で§8§lLastCard§f§r§2§lを募集中！§2§l残り" + timer + "秒..."));
                case 10: Bukkit.broadcast(Component.text("§4§lプレイヤー§f§2§lが2人で§8§lLastCard§f§r§2§lを募集中！§2§l残り" + timer + "秒..."));
                case 5:Bukkit.broadcast(Component.text("§4§lプレイヤー§f§2§lが2人で§8§lLastCard§f§r§2§lを募集中！§2§l残り" + timer + "秒..."));
                case 4:Bukkit.broadcast(Component.text("§4§lプレイヤー§f§2§lが2人で§8§lLastCard§f§r§2§lを募集中！§2§l残り" + timer + "秒..."));
                case 3:Bukkit.broadcast(Component.text("§4§lプレイヤー§f§2§lが2人で§8§lLastCard§f§r§2§lを募集中！§2§l残り" + timer + "秒..."));
                case 2:Bukkit.broadcast(Component.text("§4§lプレイヤー§f§2§lが2人で§8§lLastCard§f§r§2§lを募集中！§2§l残り" + timer + "秒..."));
                case 1:Bukkit.broadcast(Component.text("§4§lプレイヤー§f§2§lが2人で§8§lLastCard§f§r§2§lを募集中！§2§l残り" + timer + "秒..."));
            }
            sleepp(1000);
        }
        owner.getPlayer().sendMessage(Component.text("プレイヤーが集まりませんでした。"));
    }

    public Player getOwner() {
        return owner;
    }

    private void sleepp(int mil) {
        try{
            Thread.sleep(mil);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Integer getMaxPlayer() {
        return maxPlayer;
    }
}
