package nLayeredDemo.dataAccess.concretes;

import nLayeredDemo.dataAccess.abstracts.IProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class HibernateProductDao implements IProductDao {

    @Override
    public void add(Product product) {
        System.out.println("çalışıyor mu bakem " +product.getName());
    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
