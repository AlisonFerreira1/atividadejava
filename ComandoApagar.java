public class ComandoApagar implements Comando {
    private Editor editor;
    private String textoApagado;

    public ComandoApagar(Editor editor, int quantidade) {
        this.editor = editor;
        int inicio = Math.max(0, editor.getTexto().length() - quantidade);
        this.textoApagado = editor.getTexto().substring(inicio);
    }

    @Override
    public void executar() {
        editor.apagarUltimos(textoApagado.length());
    }

    @Override
    public void desfazer() {
        editor.escrever(textoApagado);
    }
}