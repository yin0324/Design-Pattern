package Product.Concrete;

import Product.Abstract.GPU;

public class ASUSGPU implements GPU {
    @Override
    public void assemble() {
        System.out.println("Assemble ASUSGPU");
    }

    public ASUSGPU() {
        System.out.println("Creating ASUSGPU");
    }
}
