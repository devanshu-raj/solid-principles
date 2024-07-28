import device.CanonPrinter;
import device.HPPrinterNScanner;
import device.XeroxWorkCenter;

public class Main {
    public static void main(String[] args) {
        XeroxWorkCenter firstDevice = new XeroxWorkCenter();
        System.out.print("Scan from First device: "); firstDevice.scan();
        System.out.print("Print from First device: "); firstDevice.print();
        System.out.print("Fax from First device: "); firstDevice.fax();

        HPPrinterNScanner secondDevice = new HPPrinterNScanner();
        System.out.print("\nScan from Second device: "); secondDevice.scan();
        System.out.print("Print from Second device: "); secondDevice.print();

        CanonPrinter thirdDevice = new CanonPrinter();
        System.out.print("\nPrint from Third device: "); thirdDevice.print();
    }

}
