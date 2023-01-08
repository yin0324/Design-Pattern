package Factory.Concrete;

import Factory.Abstract.Company;
import Product.Abstract.GPU;
import Product.Abstract.Monitor;
import Product.Concrete.ASUSGPU;
import Product.Concrete.ASUSMonitor;

public class ASUS extends Company {
    @Override
    public GPU createGPU() {
        return new ASUSGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new ASUSMonitor();
    }
}
