package aplicacao;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.PartidaDeXadrez;


public class Programa {
    public static void main(String[] args) {

        PartidaDeXadrez partidadeXadrez = new PartidaDeXadrez();
        UI.printBoard(partidadeXadrez.getPecas());

    }




}
