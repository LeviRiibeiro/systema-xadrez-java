package aplicacao;

import xadrez.PecadeXadrez;

public class UI {

    public static void printBoard(PecadeXadrez[][] peca) {
        for (int i=0; i<peca.length; i++){
            System.out.print((8 - i) + " ");
            for (int j=0; j<peca.length; j++) {
                printPeca(peca[i][j]);
            }
            System.out.println();
        }
        System.out.println("  a b c d e f g h ");
    }
      private static void printPeca(PecadeXadrez peca) {
        if (peca == null) {
            System.out.print("-");
        }
        else {
            System.out.print(peca);
        }
          System.out.print(" ");
      }
}
