package trabalho.classes;

import problema1.wmaPlay;
import trabalho.interfaces.FormatoAudio;

public class WmaFormatoAudio implements FormatoAudio {
	
	private wmaPlay wma;

	@Override
	public void abrir(String arquivo) {
		wmaPlay wma = new wmaPlay();
		wma.setFile(arquivo);
		wma.setLocation(0);
		wma.open();
	}

	@Override
	public void reproduzir() {
		wma.play();
	}

	@Override
	public void pausar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void parar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void avancar(int segundos) {
		wma.setLocation(segundos);
	}

	@Override
	public void retornar(int segundos) {
		wma.setLocation(segundos);
	}

	@Override
	public void liberar() {
		// TODO Auto-generated method stub

	}

}
