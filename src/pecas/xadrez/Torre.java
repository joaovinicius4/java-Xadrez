package pecas.xadrez;

import jogo_tabuleiro.Posicao;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Torre extends PecaXadrez {

	public Torre(Posicao posicao, Cor cor) {
		super(posicao, cor);
	}

	@Override 
	public String toString() {
		return "T";
	}
}
