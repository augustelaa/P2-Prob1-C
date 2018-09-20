package trabalho.classes;

import problema1.WAVPlayer;
import trabalho.interfaces.FormatoAudio;

public class WavFormatoAudio implements FormatoAudio {
	
	private WAVPlayer wav;
	private String arquivo;
	
	@Override
	public void abrir(String arquivo) {
		wav = new WAVPlayer(arquivo);
		this.arquivo = arquivo;
	}

	@Override
	public void reproduzir() {
		wav.play();
	}

	@Override
	public void pausar() {
		wav.stop();
	}

	@Override
	public void parar() {
		wav.stop();
		wav = new WAVPlayer(arquivo);
	}

	@Override
	public void avancar(int segundos) {
		wav.forward(segundos);
	}

	@Override
	public void retornar(int segundos) {
		wav.reward(segundos);
	}

	@Override
	public void liberar() {
		wav.stop();
		wav = null;
	}

}
