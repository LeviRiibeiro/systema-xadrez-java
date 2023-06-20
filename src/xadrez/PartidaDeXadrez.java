package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {

    private Tabuleiro tabuleiro;

    public PartidaDeXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        inicialSetup();
    }

    public PecadeXadrez[][] getPecas() {
        PecadeXadrez[][] mat = new PecadeXadrez[tabuleiro.getLinha()][tabuleiro.getColuna()];
        for (int i = 0; i < tabuleiro.getLinha(); i++) {
            for (int j = 0; j < tabuleiro.getColuna(); j++) {
                mat[i][j] = (PecadeXadrez) tabuleiro.peca(new Posicao(i, j));
            }
        }
        return mat;
    }

    private void inicialSetup() {
        tabuleiro.lugarnoTabuleiro(new Torre(tabuleiro, Cor.BRANCA), new Posicao(5, 1));
        tabuleiro.lugarnoTabuleiro(new Torre(tabuleiro, Cor.PRETA), new Posicao(6, 1));
        tabuleiro.lugarnoTabuleiro(new Rei(tabuleiro, Cor.BRANCA), new Posicao(7, 0));
        tabuleiro.lugarnoTabuleiro(new Rei(tabuleiro, Cor.PRETA), new Posicao(7, 1));
    }
}
