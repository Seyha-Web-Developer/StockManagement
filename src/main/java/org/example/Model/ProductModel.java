package org.example.Model;

public class ProductModel {
    private int id;
    private String name;
    private double unitPrice;
    private int stockQuantity;
    private String importedDate;

    public ProductModel(String name, double unitPrice, int stockQuantity,String importedDate) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.stockQuantity = stockQuantity;
        this.importedDate = importedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getImportedDate() {
        return importedDate;
    }

    public void setImportedDate(String importedDate) {
        this.importedDate = importedDate;
    }

    @Override
    public String toString() {
        return "ProductModel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", stockQuantity=" + stockQuantity +
                '}';
    }


}
