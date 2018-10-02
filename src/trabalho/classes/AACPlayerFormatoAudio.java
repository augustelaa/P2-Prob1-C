package trabalho.classes;

import problema1.AACPlayer;
import trabalho.interfaces.FormatoAudio;

public class AACPlayerFormatoAudio implements FormatoAudio {
	
	private AACPlayer aac;

	@Override
	public void abrir(String arquivo) {
		aac = new AACPlayer(arquivo);
	}

	@Override
	public void reproduzir() {
		aac.play();
	}

	@Override
	public void pausar() {
		aac.stop();
	}

	@Override
	public void parar() {
		aac.stop();
		aac.setLocation(0);
	}

	@Override
	public void avancar(int segundos) {
		int atual = aac.getLocation();
		aac.setLocation(atual + segundos);
		aac.play();
	}

	@Override
	public void retornar(int segundos) {
		int atual = aac.getLocation();
		aac.setLocation(atual - segundos);
		aac.play();
	}

	@Override
	public void liberar() {
		aac.stop();
		aac = null;
	}

}
