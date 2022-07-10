package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.IProductService;
import nLayeredDemo.core.ILoggerService;
import nLayeredDemo.dataAccess.abstracts.IProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements IProductService {

    private IProductDao productDao;
    private ILoggerService loggerService;

    public ProductManager(IProductDao productDao, ILoggerService loggerService) {
        super();
        this.productDao = productDao;
        this.loggerService=loggerService;
    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId()==1){
            System.out.println("capacity is full");
            return;
        }
        this.productDao.add(product);
        this.loggerService.logToSystem("ürün eklendi. "+ product.getName());
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
