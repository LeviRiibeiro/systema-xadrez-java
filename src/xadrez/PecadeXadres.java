package xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecadeXadres extends Peca {

    private Cor cor;

    public PecadeXadres(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
}
