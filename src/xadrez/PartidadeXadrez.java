package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidadeXadrez {

    private Tabuleiro tabuleiro;

    public PartidadeXadrez() {
        tabuleiro = new Tabuleiro(8, 8);
        inicialSetup();
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

    private void inicialSetup(){
        tabuleiro.lugarnoTabuleiro(new Torre(tabuleiro, Cor.BRANCA), new Posicao(2, 1));
        tabuleiro.lugarnoTabuleiro(new Rei(tabuleiro, Cor.PRETA), new Posicao(4, 5));
        tabuleiro.lugarnoTabuleiro(new Rei(tabuleiro, Cor.BRANCA), new Posicao(5, 4));
    }


}
