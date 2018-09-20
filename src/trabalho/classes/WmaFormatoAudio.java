package trabalho.classes;

import problema1.wmaPlay;
import trabalho.interfaces.FormatoAudio;

public class WmaFormatoAudio implements FormatoAudio {
	
	private wmaPlay wma;

	@Override
	public void abrir(String arquivo) {
		wma = new wmaPlay();
		wma.setFile(arquivo);
		wma.open();
		wma.setLocation(0);
	}

	@Override
	public void reproduzir() {
		wma.play();
	}

	@Override
	public void pausar() {
		wma.stop();
	}

	@Override
	public void parar() {
		wma.stop();
		wma.setLocation(0);
	}

	@Override
	public void avancar(int segundos) {
		int atual = wma.getLocation();
		wma.setLocation(atual + segundos);
	}

	@Override
	public void retornar(int segundos) {
		int atual = wma.getLocation();
		wma.setLocation(atual - segundos);
	}

	@Override
	public void liberar() {
		wma.stop();
		wma = null;
	}

}
