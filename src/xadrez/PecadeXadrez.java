package xadrez;

import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class PecadeXadrez extends Peca {

    private Cor cor;

    public PecadeXadrez(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
}
