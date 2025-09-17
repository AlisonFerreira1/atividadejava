
public class Editor {
    private StringBuilder texto = new StringBuilder();

    public void escrever(String entrada) {
        texto.append(entrada);
    }

    public void apagarUltimos(int quantidade) {
        if(quantidade <= texto.length()) {
            texto.delete(texto.length() - quantidade, texto.length());
        }
    }

    public String getTexto() {
        return texto.toString();
    }
}
