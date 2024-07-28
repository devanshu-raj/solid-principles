package device;

public class CanonPrinter implements IMultiPurpose {

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

    @Override
    public void scan() {
        // Empty method implementation as this can't scan
        System.out.println("ERROR: Unable to perform operation");
    }

    @Override
    public void scanPhoto() {
        // Empty method implementation as this can't scan photo
        System.out.println("ERROR: Unable to perform operation");
    }

    @Override
    public void fax() {
        // Empty method implementation as this can't fax
        System.out.println("ERROR: Unable to perform operation");
    }

    @Override
    public void internetFax() {
        // Empty method implementation as this can't internet fax
        System.out.println("ERROR: Unable to perform operation");
    }
}
