public class Main {
    public static void main(String[] args) {
        testLSP(new Rectangle(2, 3));
        testLSP(new Square(5));

        // Unable to substitute square (subclass) in place of rectangle (base class).
        // testLSP method (or any similar logic) could break if square is substituted in place of rectangle.
    }

    private static void testLSP(Rectangle rectangle) {
        int width = rectangle.getWidth();
        rectangle.setHeight(10);
        System.out.println("Expected area = " + width * 10 + ", Actual area = " + rectangle.getArea());
    }
}