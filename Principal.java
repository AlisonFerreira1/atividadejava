public class Principal {
    public static void main(String[] args) {
        Editor editor = new Editor();
        GerenciadorEditor gerenciador = new GerenciadorEditor();

        Comando escreverOla = new ComandoEscrever(editor, "Olá ");
        gerenciador.executarComando(escreverOla);
        System.out.println(editor.getTexto());

        Comando escreverMundo = new ComandoEscrever(editor, "Mundo!");
        gerenciador.executarComando(escreverMundo);
        System.out.println(editor.getTexto());

        gerenciador.desfazer();
        System.out.println("Desfazer: " + editor.getTexto());

        gerenciador.refazer();
        System.out.println("Refazer: " + editor.getTexto());
    }
}
