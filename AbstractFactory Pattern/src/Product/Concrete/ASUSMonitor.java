package Product.Concrete;

import Product.Abstract.Monitor;

public class ASUSMonitor implements Monitor {
    public void assemble() {
        System.out.println("Assemble ASUSMonitor");
    }

    public ASUSMonitor() {
        System.out.println("Creating ASUSMonitor");
    }
}
