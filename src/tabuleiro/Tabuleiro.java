package tabuleiro;

public class Tabuleiro {

    private int linha;
    private int coluna;
    private Peca[][] pecas;

    public Tabuleiro(int linha, int coluna) {
        if (linha < 1 || coluna < 1) {
            throw new TabuleiroException("Erro ao criar tabuleiro: ele deve possuir pelo menos 1 linha e 1 coluna");
        }
        this.linha = linha;
        this.coluna = coluna;
        pecas = new Peca[linha][coluna];
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public Peca peca(int linha, int coluna) {
        if (!posicaoExistente(linha, coluna)) {
            throw new TabuleiroException("Posição fora do tabuleiro");
        }
        return pecas[linha][coluna];
    }

    public Peca peca(Posicao posicao) {
        if (!posicaoExistente(posicao)) {
            throw new TabuleiroException("Posição fora do tabuleiro");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }

    public void lugarnoTabuleiro(Peca peca, Posicao posicao) {
        pecas[posicao.getLinha()][posicao.getColuna()] = peca;
        peca.posicao = posicao;
    }

    private boolean posicaoExistente(int linha, int coluna) {
        return linha >= 0 && linha < this.linha && coluna >= 0 && coluna < this.coluna;
    }

    public boolean posicaoExistente(Posicao posicao) {
        return posicaoExistente(posicao.getLinha(), posicao.getColuna());
    }

    public boolean temUmaPeca(Posicao posicao) {
        if (!posicaoExistente(posicao)) {
            throw new TabuleiroException("Posição fora do tabuleiro");
        }
        return peca(posicao) != null;
    }

}
