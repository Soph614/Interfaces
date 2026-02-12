import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static void main (String[] args) {
        // instantiating bigRectangleFilter
        BigRectangleFilter bigRectangleFilter = new BigRectangleFilter();
        // creating an ArrayList for rectangles
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        // creating rectangles
        Rectangle rectangle01 = new Rectangle(1, 1);
        Rectangle rectangle02 = new Rectangle(2, 2);
        Rectangle rectangle03 = new Rectangle(3, 3);
        Rectangle rectangle04 = new Rectangle(4, 4);
        Rectangle rectangle05 = new Rectangle(5, 5);
        Rectangle rectangle06 = new Rectangle(6, 6);
        Rectangle rectangle07 = new Rectangle(1, 2);
        Rectangle rectangle08 = new Rectangle(1, 3);
        Rectangle rectangle09 = new Rectangle(1, 4);
        Rectangle rectangle10 = new Rectangle(2, 3);
        // adding rectangles to "rectangles" arrayList
        rectangles.addFirst((rectangle01));
        rectangles.add((rectangle02));
        rectangles.add((rectangle03));
        rectangles.add((rectangle04));
        rectangles.add((rectangle05));
        rectangles.add((rectangle06));
        rectangles.add((rectangle07));
        rectangles.add((rectangle08));
        rectangles.add((rectangle09));
        rectangles.add((rectangle10));
        for (Rectangle rectangle : rectangles) {
            if (bigRectangleFilter.accept(rectangle)) {
                System.out.println(rectangle);
            }
            else {}
        }
    }
}
