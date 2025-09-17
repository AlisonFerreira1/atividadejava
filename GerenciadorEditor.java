import java.util.Stack;

public class GerenciadorEditor {
    private Stack<Comando> historico = new Stack<>();
    private Stack<Comando> refazerPilha = new Stack<>();

    public void executarComando(Comando comando) {
        comando.executar();
        historico.push(comando);  // ✅ tipo correto
        refazerPilha.clear();
    }

    public void desfazer() {
        if(!historico.isEmpty()) {
            Comando comando = historico.pop();
            comando.desfazer();
            refazerPilha.push(comando);
        }
    }

    public void refazer() {
        if(!refazerPilha.isEmpty()) {
            Comando comando = refazerPilha.pop();
            comando.executar();
            historico.push(comando);
        }
    }
}
