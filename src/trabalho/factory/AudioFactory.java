package trabalho.factory;

import java.security.InvalidParameterException;

import trabalho.classes.AiffFormatoAudio;
import trabalho.classes.WavFormatoAudio;
import trabalho.classes.WmaFormatoAudio;
import trabalho.interfaces.FormatoAudio;

public class AudioFactory {
	
	private static FormatoAudio audio;
	private static AudioFactory instance;
	
	public AudioFactory(String arquivo) {
		
		String formato = (arquivo.lastIndexOf(".") == 0) ? ""
				: arquivo.substring(arquivo.lastIndexOf(".") + 1);
		
		switch(formato) {
			case "aiff":
				audio = new AiffFormatoAudio();
			break;
			case "wav":
				audio = new WavFormatoAudio();
				break;
			case "wma":
				audio = new WmaFormatoAudio();
			break;
			default:
				throw new InvalidParameterException("Formato de arquivo inválido.");
		}
		
		audio.abrir(arquivo);
	}
	
	public static void reproduzirSimples(String arquivo) {
		instance = new AudioFactory(arquivo);
		instance.audio.reproduzir();
	}

	public static void pararSimples() {
		instance.audio.liberar();
	}

	public FormatoAudio getAudio() {
		return audio;
	}
}
