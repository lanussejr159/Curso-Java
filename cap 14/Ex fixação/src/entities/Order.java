package entities;

import java.util.Date;

import entities.enums.OrderStatus;

public class Order {
    
    private Date date;
    private OrderStatus status;

    public Order () {
    }

    public Order(Date date, OrderStatus status) {
        this.date = date;
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

   

    
}
