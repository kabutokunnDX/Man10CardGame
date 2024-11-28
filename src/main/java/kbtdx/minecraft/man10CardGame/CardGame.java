package kbtdx.minecraft.man10CardGame;

import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static kbtdx.minecraft.man10CardGame.Man10CardGame.*;

public class CardGame extends Thread{

    private int maxPlayers;
    private Player ownerPlayer;
    private List<Player> players;
    private int timer;
    private boolean isStarted;
    private boolean isRecruiting;
    private State currentState;
    private Map<Player, List<Card>> playerWithDeck;
    private Player oyaPlayer;

    public CardGame(Player owner, int maxPlayers){
        this.ownerPlayer = owner;
        this.maxPlayers = maxPlayers;
        this.isStarted = true;
        this.currentState = State.RECRUITMENT;
        this.timer = 60;
        playerWithDeck = new HashMap<>();
    }

    public void run(){ //募集開始
        players.add(this.ownerPlayer);
        while (isRecruiting){
            if (this.currentState == State.RECRUITMENT){
                if (players.size() != maxPlayers){
                    if (timer == 60){
                        Bukkit.broadcast(Component.text(ownerPlayer.getName() + "が" + maxPlayers + "人で、LastCardを開始しました。残り60秒...."));
                    }else if (timer <= 0){
                        if (games.containsKey(this.ownerPlayer)){
                            games.remove(this.ownerPlayer);
                            ownerPlayer.sendMessage(Component.text("人数が集まらなかったため、募集を終了しました。"));
                            break;
                        }
                    }
                    s_sleep(1000);
                    timer--;
                }else {
                    this.currentState = State.PLAYING;
                }
            }
        }

    }


    public int getMaxPlayers(){
        return this.maxPlayers;
    }

    public Player getOwnerPlayer(){
        return this.ownerPlayer;
    }

    public void joinGame(Player player){
        if (players.size() < maxPlayers){
            players.add(player);
        }else {
            player.sendMessage(Component.text("参加人数の上限に達しています。"));
        }
    }

    public State getCurrentState(){
        return this.currentState;
    }

    enum State{
        RECRUITMENT,
        PLAYING
    }

    private void s_sleep(int millis)  {
        try{
            sleep(millis);
        }catch (InterruptedException ignored){}
    }
}
