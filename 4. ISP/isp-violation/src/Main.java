import device.CanonPrinter;
import device.HPPrinterNScanner;
import device.IMultiPurpose;
import device.XeroxWorkCenter;

public class Main {
    public static void main(String[] args) {
        IMultiPurpose firstDevice = new XeroxWorkCenter();
        System.out.print("Scan from First device: "); firstDevice.scan();
        System.out.print("Print from First device: "); firstDevice.print();
        System.out.print("Fax from First device: "); firstDevice.fax();

        IMultiPurpose secondDevice = new HPPrinterNScanner();
        System.out.print("\nScan from Second device: "); secondDevice.scan();
        System.out.print("Print from Second device: "); secondDevice.print();
        System.out.print("Fax from Second device: "); secondDevice.fax();

        IMultiPurpose thirdDevice = new CanonPrinter();
        System.out.print("\nScan from Third device: "); thirdDevice.scan();
        System.out.print("Print from Third device: "); thirdDevice.print();
        System.out.print("Fax from Third device: "); thirdDevice.fax();

        // The code will break wherever an unimplemented method is called
    }
}