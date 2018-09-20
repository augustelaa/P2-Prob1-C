package trabalho.exeucao;

import trabalho.factory.AudioFactory;

public class Player {

	public static void main(String[] args) {

		AudioFactory.reproduzirSimples("musica.wav");

		AudioFactory.pararSimples();

		AudioFactory player = new AudioFactory("musica.aiff");
		player.getAudio().reproduzir();
		player.getAudio().parar();
		
		
		AudioFactory playerWMA = new AudioFactory("musica.wma");
		playerWMA.getAudio().reproduzir();
		playerWMA.getAudio().parar();

		AudioFactory playerMP3 = new AudioFactory("musica.mp3");
		playerMP3.getAudio().reproduzir();
		playerMP3.getAudio().parar();
	}

}
