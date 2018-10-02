package trabalho.classes;

import problema1.MP3DJ;
import trabalho.interfaces.FormatoAudio;

public class MP3DJFormatoAudio implements FormatoAudio {
	
	private MP3DJ mp3;
	private String arquivo;

	@Override
	public void abrir(String arquivo) {
		mp3 = new MP3DJ();
		this.arquivo = arquivo;
		mp3.setFile(arquivo);
	}

	@Override
	public void reproduzir() {
		mp3.play();
	}

	@Override
	public void pausar() {
		mp3.stop();
	}

	@Override
	public void parar() {
		mp3.stop();
		mp3.setFile(arquivo);
	}

	@Override
	public void avancar(int segundos) {
		mp3.forward(segundos);
	}

	@Override
	public void retornar(int segundos) {
		mp3.reward(segundos);
	}

	@Override
	public void liberar() {
		mp3.stop();
		mp3 = null;
	}

}
