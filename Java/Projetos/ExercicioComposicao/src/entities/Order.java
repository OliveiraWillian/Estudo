package entities;

import entities.enums.OrderStatus;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    //atributos
private Date moment;
private OrderStatus status;
private Client client;

private List<OrderItem> items = new ArrayList<>();

    //contrutor
    public Order() {}

    public Order(Date moment, OrderStatus status,Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

//getsesets

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }


//metodos

    public void addItem(OrderItem item){
        items.add(item);
    }
    public void removeItem(OrderItem item){
        items.remove(item);
    }

    public Double total(){
        double soma = 0;
        for (OrderItem c: items){
            soma += c.getQuantity() * c.getPrice();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ORDER SUMMARY: \n");
            stringBuilder.append("Order moment: " + sdf.format(moment)+"\n");
        stringBuilder.append("Order status: " + status + "\n");
        stringBuilder.append("Client: " + client +"\n");
        stringBuilder.append("Order items\n");
        int somaTotal = 0;
        for (OrderItem c: items){
            stringBuilder.append(c.getProduct().getName()+", Quantity: "+ c.getQuantity() + ", Subtotal: "+ c.subTotal() + "\n");
            somaTotal += c.subTotal();
        }
        stringBuilder.append("Total price: " + somaTotal + "\n");
        return stringBuilder.toString();
    }
}
