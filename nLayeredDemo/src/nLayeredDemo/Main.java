package nLayeredDemo;

import nLayeredDemo.business.abstracts.IProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.jLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {
        IProductService productService= new ProductManager(new HibernateProductDao(),new jLoggerManagerAdapter());
        Product product= new Product(1,2,"xd",12,3);
        productService.add(product);
    }
}
