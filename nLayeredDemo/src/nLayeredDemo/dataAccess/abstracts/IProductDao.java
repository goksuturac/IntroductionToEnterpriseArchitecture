package nLayeredDemo.dataAccess.abstracts;

import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public interface IProductDao {
    void add(Product product);
    void delete(Product product);
    void update(Product product);
    Product get(int id);
    List<Product> getAll();
}
