
public class EscreverComand implements Command {
    private Editor editor;
    private String text;

    public EscreverComand(Editor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    public void execute() {
        editor.write(text);
    }

    public void undo() {
        editor.deleteLast(text.length());
    }
}
