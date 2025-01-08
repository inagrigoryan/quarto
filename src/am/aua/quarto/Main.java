package am.aua.quarto;

import am.aua.quarto.cli.*;
import am.aua.quarto.ui.*;

public class Main {

    public static void main(String[] args) {
        if(args.length != 0 && args[0].equalsIgnoreCase("-console")) {
            QuartoConsole game1 = new QuartoConsole();
            game1.play();
        }
        QuartoConsole game1 = new QuartoConsole();
        game1.play();

//        GameSetUp gameSetUp = new GameSetUp();
//        gameSetUp.setVisible(true);
    }
}