package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;

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

    private void lugarDaNovaPeca(char coluna, int linha, PecadeXadrez pecadeXadrez) {
        tabuleiro.lugarnoTabuleiro(pecadeXadrez, new PosicaoXadrez(coluna, linha).toPosicao());
    }


    private void inicialSetup() {
       lugarDaNovaPeca('b', 6, new Rei(tabuleiro, Cor.BRANCA));
       lugarDaNovaPeca('c', 5, new Rei(tabuleiro, Cor.PRETA));
    }
}
