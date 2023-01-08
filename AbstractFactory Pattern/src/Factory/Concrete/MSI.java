package Factory.Concrete;

import Factory.Abstract.Company;
import Product.Abstract.GPU;
import Product.Abstract.Monitor;
import Product.Concrete.MSIGPU;
import Product.Concrete.MSIMonitor;

public class MSI extends Company {

    @Override
    public GPU createGPU() {
        return new MSIGPU();
    }

    @Override
    public Monitor createMonitor() {
        return new MSIMonitor();

    }
}
