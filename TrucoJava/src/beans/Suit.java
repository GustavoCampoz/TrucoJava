package beans;

import org.jetbrains.annotations.Contract;

/**
 * Created by Bruno on 07/05/2016.
 */
public enum Suit {
    Diamonds, Spades, Hearths, Clubs;

    @Override
    public String toString(){
        switch (this){
            case Diamonds: return "d";
            case Spades: return "s";
            case Hearths: return "h";
            case Clubs: return "c";
        }

        return "ERROR";
    }
}