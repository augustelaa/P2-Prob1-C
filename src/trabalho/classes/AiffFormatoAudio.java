package trabalho.classes;

import problema1.AIFFSuperPlayer;
import trabalho.interfaces.FormatoAudio;

public class AiffFormatoAudio implements FormatoAudio {
	
	private AIFFSuperPlayer aif;

	@Override
	public void abrir(String arquivo) {
		aif = new AIFFSuperPlayer(arquivo);
	}

	@Override
	public void reproduzir() {
		aif.play();
	}

	@Override
	public void pausar() {
		aif.pause();
	}

	@Override
	public void parar() {
		aif.stop();
		aif.setCursor(0);
	}

	@Override
	public void avancar(int segundos) {
		int atual = aif.pause();
		aif.setCursor(atual + segundos);
		aif.play();
	}

	@Override
	public void retornar(int segundos) {
		int atual = aif.pause();
		aif.setCursor(atual - segundos);
		aif.play();
	}

	@Override
	public void liberar() {
		aif.stop();
		aif.release();
	}

}
