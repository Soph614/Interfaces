public class Main {
    public static void main (String[] args) {
    }
    class ShortWordFilter implements Filter {
        public boolean accept(Object w) {
            String word = (String) w;
            if (word.length() < 5) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}
