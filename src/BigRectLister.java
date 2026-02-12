import java.awt.*;
import java.util.ArrayList;

public class BigRectLister {
    public static void main (String[] args) {
        // instantiating bigRectangleFilter
        BigRectangleFilter bigRectangleFilter = new BigRectangleFilter();
        // creating an ArrayList for rectangles
        ArrayList<Rectangle> rectangles = new ArrayList<>();
        // creating rectangles
         Rectangle rectangle1 = new Rectangle(1, 1,1, 1);
         Rectangle rectangle2 = new Rectangle(2, 2,2, 2);
         Rectangle rectangle3 = new Rectangle(3, 3,3, 3);
         Rectangle rectangle4 = new Rectangle(4, 4,4, 4);
         Rectangle rectangle5 = new Rectangle(5, 5,5, 5);
         Rectangle rectangle6 = new Rectangle(6, 6,6, 6);
         Rectangle rectangle7 = new Rectangle(7, 7,1, 2);
         Rectangle rectangle8 = new Rectangle(8, 8,1, 3);
         Rectangle rectangle9 = new Rectangle(9, 9,1, 4);
        Rectangle rectangle10 = new Rectangle(1, 1,2, 3);
        // adding rectangles to "rectangles" arrayList
        rectangles.addFirst((rectangle1));
        rectangles.add((rectangle2));
        rectangles.add((rectangle3));
        rectangles.add((rectangle4));
        rectangles.add((rectangle5));
        rectangles.add((rectangle6));
        rectangles.add((rectangle7));
        rectangles.add((rectangle8));
        rectangles.add((rectangle9));
        rectangles.add((rectangle10));
        for (Rectangle rectangle : rectangles) {
            System.out.printf("%-50s %8s\n", rectangle, bigRectangleFilter.accept(rectangle));
        }
    }
}
