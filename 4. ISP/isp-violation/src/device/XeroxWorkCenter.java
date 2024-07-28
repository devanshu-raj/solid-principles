package device;

public class XeroxWorkCenter implements IMultiPurpose {

    @Override
    public void print() {
        // Actual logic goes here
        System.out.println("SUCCESS: XeroxWorkCenter Print");
    }

    @Override
    public void getPrintSpoolDetails() {
        // Actual logic goes here
        System.out.println("SUCCESS: XeroxWorkCenter Get Print Spool Details");
    }

    @Override
    public void scan() {
        // Actual logic goes here
        System.out.println("SUCCESS: XeroxWorkCenter Scan");
    }

    @Override
    public void scanPhoto() {
        // Actual logic goes here
        System.out.println("SUCCESS: XeroxWorkCenter Scan Photo");
    }

    @Override
    public void fax() {
        // Actual logic goes here
        System.out.println("SUCCESS: XeroxWorkCenter Fax");
    }

    @Override
    public void internetFax() {
        // Actual logic goes here
        System.out.println("SUCCESS: XeroxWorkCenter Internet Fax");
    }

}
