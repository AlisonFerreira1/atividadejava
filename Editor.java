public class Editor {
    private StringBuilder text = new StringBuilder();

    public void write(String input) {
        text.append(input);
    }

    public void deleteLast(int count) {
        if(count <= text.length()) {
            text.delete(text.length() - count, text.length());
        }
    }

    public String getText() {
        return text.toString();
    }
}
