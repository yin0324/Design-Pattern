import Factory.Abstract.Company;
import Factory.Concrete.ASUS;
import Factory.Concrete.MSI;

public class Main {
    public static void main(String[] args) {
        Company AUSU = new ASUS();
        AUSU.createGPU();
        AUSU.createMonitor();

        Company MSI = new MSI();
        MSI.createGPU();
        MSI.createMonitor();
    }
}