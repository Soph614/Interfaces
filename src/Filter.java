import java.awt.*;

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

class BigRectangleFilter implements Filter {
    public boolean accept(Object rect) {
        Rectangle rectangle = (Rectangle) rect;
        boolean isBigRectangle = false;
        double perimeter = rectangle.width + rectangle.width + rectangle.height + rectangle.height;
        if (perimeter > 10) {
            isBigRectangle = true;
        }
        return isBigRectangle;
    }
}