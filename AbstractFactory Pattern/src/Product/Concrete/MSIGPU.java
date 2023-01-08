package Product.Concrete;

import Product.Abstract.GPU;

public class MSIGPU implements GPU {
    @Override
    public void assemble() {
        System.out.println("Assemble MSIGPU");
    }

    public MSIGPU() {
        System.out.println("Creating MSIGPU");
    }
}
