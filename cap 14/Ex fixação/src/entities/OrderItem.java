package entities;

import java.util.ArrayList;
import java.util.List;
import entities.Product;

public class OrderItem {

    private int quantity;
    private double price;

    private List<Product> product = new ArrayList<>();

    public OrderItem() {
    }

    public OrderItem(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public List<Product> getProduct() {
        return product;
    }

    public void addProduct(Product product) {
        product.add(product);
    }

    public void removeProduct(Product product) {
        product.remove(product);
    }

    Double subTotal() {
        return quantity * price;
    }

   
    
}
