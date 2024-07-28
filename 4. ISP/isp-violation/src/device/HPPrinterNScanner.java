package device;

public class HPPrinterNScanner implements IMultiPurpose {

    @Override
    public void print() {
        // Actual logic goes here
        System.out.println("SUCCESS: HPPrinterNScanner Print");
    }

    @Override
    public void getPrintSpoolDetails() {
        // Actual logic goes here
        System.out.println("SUCCESS: HPPrinterNScanner Get Print Spool Details");
    }

    @Override
    public void scan() {
        // Actual logic goes here
        System.out.println("SUCCESS: HPPrinterNScanner Scan");
    }

    @Override
    public void scanPhoto() {
        // Actual logic goes here
        System.out.println("SUCCESS: HPPrinterNScanner Scan Photo");
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
