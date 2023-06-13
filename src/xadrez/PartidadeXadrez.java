package xadrez;

import tabuleiro.Tabuleiro;

public class PartidadeXadrez {

    private Tabuleiro tabuleiro;

    public PartidadeXadrez() {
        tabuleiro = new  Tabuleiro(8, 8);
    }

    public PecadeXadres[][] getPecas() {
        PecadeXadres[][] mat = new PecadeXadres[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for (int i = 0; i < tabuleiro.getColunas(); i++) {
            for (int j = 0; j < tabuleiro.getColunas(); j++) {
                mat[i][j] = (PecadeXadres) tabuleiro.peca(i, j);
            }
        }
        return mat;
    }
}
