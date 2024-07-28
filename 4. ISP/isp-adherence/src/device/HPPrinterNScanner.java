package device;

public class HPPrinterNScanner implements IPrint, IScan {

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

}
