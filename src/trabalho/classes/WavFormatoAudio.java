package trabalho.classes;

import problema1.WAVPlayer;
import trabalho.interfaces.FormatoAudio;

public class WavFormatoAudio implements FormatoAudio {
	
	private WAVPlayer wav;
	
	@Override
	public void abrir(String arquivo) {
		wav = new WAVPlayer(arquivo);
	}

	@Override
	public void reproduzir() {
		wav.play();

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
		// TODO Auto-generated method stub

	}

	@Override
	public void retornar(int segundos) {
		// TODO Auto-generated method stub

	}

	@Override
	public void liberar() {
		// TODO Auto-generated method stub

	}

}
