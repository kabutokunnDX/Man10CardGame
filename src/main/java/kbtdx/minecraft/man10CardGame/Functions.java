package kbtdx.minecraft.man10CardGame;

import java.util.ArrayList;
import java.util.List;

public class Functions {

    public static List<Card> generateDeck(){
        List<Card> deck = new ArrayList<>();
        for (int i=0;i<10;i++){
            deck.add(new Card(CardType.NUMBER,CardColor.RED,i));
        }
        for (int i=0;i<10;i++){
            deck.add(new Card(CardType.NUMBER,CardColor.BLUE,i));
        }
        for (int i=0;i<10;i++){
            deck.add(new Card(CardType.NUMBER,CardColor.GREEN,i));
        }
        for (int i=0;i<10;i++){
            deck.add(new Card(CardType.NUMBER,CardColor.YELLOW,i));
        }
        
        return deck;
    }
}
