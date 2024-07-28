// LSP adherence using factory pattern
public class Main {
    public static void main(String[] args) {
        testLSP(RectangleFactory.newRectangle(2, 3));
        testLSP(RectangleFactory.newSquare(5));

        // Since square is no longer a subclass of rectangle, hence no LSP violation can happen
        // Handle the case of square differently as it can't be substituted in rectangle's place
    }

    private static void testLSP(Rectangle rectangle) {
        if(rectangle.isSquare()) {
            rectangle.setWidth(10);
            rectangle.setHeight(10);
        }
        int width = rectangle.getWidth();
        rectangle.setHeight(10);
        System.out.println("Expected area = " + width * 10 + ", Actual area = " + rectangle.getArea());
    }
}