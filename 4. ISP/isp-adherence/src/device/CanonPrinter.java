package device;

public class CanonPrinter implements IPrint {

    @Override
    public void print() {
        // Actual logic goes here
        System.out.println("SUCCESS: CanonPrinter Print");
    }

    @Override
    public void getPrintSpoolDetails() {
        // Actual logic goes here
        System.out.println("SUCCESS: CanonPrinter Get Print Spool Details");
    }

}
