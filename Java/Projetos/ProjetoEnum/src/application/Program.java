package application;

import entities.enums.OrderStatus;
import entitiess.Order;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
    Order order = new Order(1080,new Date(), OrderStatus.PENDENTE_PAGAMENTO);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.PROCESSANDO;
        OrderStatus os2 = OrderStatus.valueOf("PROCESSANDO");
        System.out.println(os1);
        System.out.println(os2);
    }
}
