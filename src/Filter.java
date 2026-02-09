public interface Filter {
    boolean accept(Object x);
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