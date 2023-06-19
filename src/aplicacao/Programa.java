package aplicacao;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.PartidadeXadrez;

public class Programa {
    public static void main(String[] args) {

        PartidadeXadrez partidadeXadrez = new PartidadeXadrez();
        UI.printBoard(partidadeXadrez.getPecas());

    }




}
