package kbtdx.minecraft.man10CardGame;

public class Card { //数字カード

    private final CardType type;
    private final CardColor color;
    private Integer num;
    public Card(CardType type,CardColor color,Integer num){
        this.type = type;
        this.color = color;
        this.num = num;
    }

    public Card(CardType type,CardColor color){ //特殊カード
        this.type = type;
        this.color = color;
        if (type != CardType.NUMBER){
            this.num = null;
        }
    }
    public Card(CardType type){ //特殊カードその2
        this.type = type;
        this.color = null;
        this.num = null;
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
