package unities;

import unities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status ;

    private List<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

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
    public void additem(OrderItem item){
        this.items.add(item);

    }
    public void remove(OrderItem item){
        this.items.remove(item);

    }
    public Double total(){
    Double soma = 0.0;
        for (OrderItem d : items){
            soma += d.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ORDER SUMMARY:\n");
        stringBuilder.append("Order moment: " + sdf.format(moment) + "\n");
        stringBuilder.append("Order status:" + status + "\n");
        stringBuilder.append(client+ "\n");
        stringBuilder.append("Order items:\n");
        for (OrderItem c : items){
            stringBuilder.append(c.toString() + "\n");

        }
        stringBuilder.append("Total price: $" + total() + "\n");

        return stringBuilder.toString();
    }




}
