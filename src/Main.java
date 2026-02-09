public class Main {
    public static void main (String[] args) {
        ShortWordFilter shortWordFilter = new ShortWordFilter();
        boolean word = shortWordFilter.accept("HELLO!");
    }
}
