package Factory.Abstract;

import Product.Abstract.GPU;
import Product.Abstract.Monitor;

public abstract class Company {
    public abstract GPU createGPU();
    public abstract Monitor createMonitor();
}
