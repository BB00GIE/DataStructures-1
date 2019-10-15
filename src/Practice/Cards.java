package Practice;

import java.util.*;
import java.util.Scanner;


public class Cards {
    private String Suit;
    private String Value;

    public static void main(String[] args) {
        Cards[] set = MakeDeck();
        shuffle(set);
        playGame(MakeStack(set));





    }


    public Cards(String Suit, String Value) {
        this.Suit = Suit;
        this.Value = Value;
    }
    public static Cards[] MakeDeck() {
        Cards[] set  = new Cards[52];
        String[] suit = {"hearts", "clubs", "spades", "diamonds"};
        String[] value = {"1","2","3","4","5","6","7","8","9","10","J","Q","K"};
        Cards card;
        int j = 0;
        for(int s = 0; s < 4; s ++) {
            String val = suit[s];
            for(int i = 0; i<13;i++) {
                String temp = value[i];
                card = new Cards(val,temp);
                set[j] = card;
                j++;
            }
        }
        return set;
    }
    public static Cards[] shuffle(Cards[] d) {
        List<Cards> lst = Arrays.asList(d);
        Collections.shuffle(lst);
        d = lst.toArray(new Cards[0]);
        return d;

    }
    public static Stack<Cards> MakeStack(Cards[] d) {
        Stack<Cards> deck = new Stack();
        for (int i =0;i<d.length;i++){
            deck.push(d[i]);
        }
        return deck;
    }
    public static void playGame(Stack<Cards> deck){
        Scanner sc = new Scanner(System.in);
        while(!deck.empty()){
            System.out.println("Guess the suit of the next card");
            String suit = sc.next();
            System.out.println("Your guess was " + suit);
            System.out.println(deck.pop().Suit);
            System.out.println("Guess the value of the next card");
            String value = sc.next();
            System.out.println("Your guess was " + value);
            System.out.println(deck.pop().Value);
        }
    }


}
