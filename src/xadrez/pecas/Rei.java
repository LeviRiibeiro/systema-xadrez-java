package xadrez.pecas;

import tabuleiro.Tabuleiro;
import xadrez.Cor;
import xadrez.PecadeXadrez;

public class Rei extends PecadeXadrez {
    public Rei(Tabuleiro tabuleiro, Cor cor){
        super(tabuleiro, cor);
    }

    @Override
    public String toString() {
        return "♚";
    }

}



