package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.IEntity;

public class Product implements IEntity {
    private int id;
    private int categoryId;
    private String name;
    private double unitPrice;
    private int unitInStock;

    public Product(){}

    public Product(int id, int categoryId, String name, double unitPrice, int unitInStock) {
        this.id = id;
        this.categoryId = categoryId;
        this.name = name;
        this.unitPrice = unitPrice;
        this.unitInStock = unitInStock;
    }

    public int getId() {
        return id;
    }

    public Product setId(int id) {
        this.id = id;
        return this;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public Product setCategoryId(int categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public Product setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public Product setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
        return this;
    }
}
