package trabalho.interfaces;

public interface FormatoAudio {
	public void abrir(String arquivo);
	public void reproduzir();
	public void pausar();
	public void parar();
	public void avancar(int segundos);
	public void retornar(int segundos);
	public void liberar();
}
