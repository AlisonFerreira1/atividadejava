public class ComandoEscrever implements Comando {
    private Editor editor;
    private String texto;

    public ComandoEscrever(Editor editor, String texto) {
        this.editor = editor;
        this.texto = texto;
    }

    @Override
    public void executar() {
        editor.escrever(texto);
    }

    @Override
    public void desfazer() {
        editor.apagarUltimos(texto.length());
    }
}

