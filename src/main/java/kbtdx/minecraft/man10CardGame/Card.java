package kbtdx.minecraft.man10CardGame;

public class Card {

    private CardType type;
    private CardColor color;
    private Integer num;
    public Card(CardType type,CardColor color,Integer num){
        this.type = type;
        this.color = color;
        this.num = num;
    }

    public Card(CardType type,CardColor color){
        this.type = type;
        this.color = color;
        if (type != CardType.NUMBER){
            this.num = null;
        }
    }

    public CardType getType(){
        return this.type;
    }

    public CardColor getColor(){
        return this.color;
    }

    public Integer getNum(){
        return this.num;
    }

    public void setNum(Integer number){
        this.num = number;
    }
}
