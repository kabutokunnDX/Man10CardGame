package kbtdx.minecraft.man10CardGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Functions {

    public static List<Card> generateDeck(){ //山札作成
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
        for (int i=0;i<6;i++){ //種類変更・シャッフルカード
            deck.add(new Card(CardType.CHANGE));
            deck.add(new Card(CardType.SHUFFLE));
        }
        for (int i=0;i<6;i++){ //赤特殊カード
            deck.add(new Card(CardType.SKIP,CardColor.RED));
            deck.add(new Card(CardType.CARDDRAW2,CardColor.RED));
            deck.add(new Card(CardType.CARDDRAW4,CardColor.RED));
            deck.add(new Card(CardType.REVERSE,CardColor.RED));
        }
        for (int i=0;i<6;i++){ //青特殊カード
            deck.add(new Card(CardType.SKIP,CardColor.BLUE));
            deck.add(new Card(CardType.CARDDRAW2,CardColor.BLUE));
            deck.add(new Card(CardType.CARDDRAW4,CardColor.BLUE));
            deck.add(new Card(CardType.REVERSE,CardColor.BLUE));
        }
        for (int i=0;i<6;i++){ //緑特殊カード
            deck.add(new Card(CardType.SKIP,CardColor.GREEN));
            deck.add(new Card(CardType.CARDDRAW2,CardColor.GREEN));
            deck.add(new Card(CardType.CARDDRAW4,CardColor.GREEN));
            deck.add(new Card(CardType.REVERSE,CardColor.GREEN));
        }
        for (int i=0;i<6;i++){ //黄色特殊カード
            deck.add(new Card(CardType.SKIP,CardColor.YELLOW));
            deck.add(new Card(CardType.CARDDRAW2,CardColor.YELLOW));
            deck.add(new Card(CardType.CARDDRAW4,CardColor.YELLOW));
            deck.add(new Card(CardType.REVERSE,CardColor.YELLOW));
        }
        Collections.shuffle(deck);
        
        return deck;
    }

    public static Boolean isNumber(String num){
        try{
            int integer = Integer.parseInt(num);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
