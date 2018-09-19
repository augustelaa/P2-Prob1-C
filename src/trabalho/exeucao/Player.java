package trabalho.exeucao;

import java.security.InvalidParameterException;

import problema1.AIFFSuperPlayer;
import problema1.WAVPlayer;
import problema1.wmaPlay;
import trabalho.classes.AiffFormatoAudio;
import trabalho.classes.WavFormatoAudio;
import trabalho.classes.WmaFormatoAudio;
import trabalho.interfaces.FormatoAudio;

public class Player {

	public static void main(String[] args) {
//		AIFFSuperPlayer aif = new AIFFSuperPlayer("qualquerai.aiff");
//		aif.play();
//		
//		WAVPlayer wav = new WAVPlayer("qualquer.wav");
//		wav.play();
//		
//		wmaPlay wma = new wmaPlay();
//		wma.setFile("arquivo.wma");
//		wma.open();
//		wma.setLocation(0);
//		wma.play();
		
		
		String nomeArquivo = "musica.wav";		
		String retorno = (nomeArquivo.lastIndexOf(".") == 0) ? ""
					: nomeArquivo.substring(nomeArquivo.lastIndexOf(".") + 1);
		
		
		
		
		
		FormatoAudio formato = null;
		switch(retorno) {
		case "aiff":
			formato = new AiffFormatoAudio();
		break;
		case "wav":
			formato = new WavFormatoAudio();
			break;
		case "wma":
			formato = new WmaFormatoAudio();
		break;
		default:
			throw new InvalidParameterException("Formato de arquivo inválido.");
		}
		formato.abrir(nomeArquivo);
		formato.reproduzir();
		
		
		
//		switch(retorno) {
//		case "aiff":
//			AIFFSuperPlayer aif = new AIFFSuperPlayer("qualquerai.aiff");
//			aif.play();
//		break;
//		case "wav":
//			WAVPlayer wav = new WAVPlayer(nomeArquivo);
//			wav.play();
//			break;
//		case "wma":
//			wmaPlay wma = new wmaPlay();
//			wma.setFile(nomeArquivo);
//			wma.open();
//			wma.setLocation(0);
//			wma.play();
//		break;
//		default:
//			throw new InvalidParameterException("Formato de arquivo inválido.");
//		}
		
		
	}

}
