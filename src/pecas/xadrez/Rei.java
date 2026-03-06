package pecas.xadrez;

import jogo_tabuleiro.Posicao;
import xadrez.Cor;
import xadrez.PecaXadrez;

public class Rei extends PecaXadrez {

	public Rei(Posicao posicao, Cor cor) {
		super(posicao, cor);
	}
	
	@Override
	public String toString() {
		return "R";
	}

}
