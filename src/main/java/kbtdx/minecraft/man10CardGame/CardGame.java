package kbtdx.minecraft.man10CardGame;

import java.util.List;

public class CardGame extends Thread{


    @Override
    public void run(){ //ゲーム開始
        List<Card> deck = Functions.generateDeck();
    }
}
