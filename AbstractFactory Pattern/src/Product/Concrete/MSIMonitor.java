package Product.Concrete;

import Product.Abstract.Monitor;

public class MSIMonitor implements Monitor {

    @Override
    public void assemble() {
        System.out.println("Assemble MSIMonitor");
    }

    public MSIMonitor() {
        System.out.println("Creating MSIMonitor");
    }
}
