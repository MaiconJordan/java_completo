package br.com.exercicioenum.application;

import br.com.exercicioenum.entities.OrderItem;
import br.com.exercicioenum.entities.Product;

public class Program {
    public static void main(String[] args) {
        Product p = new Product("TV", 1000.00);
        OrderItem oi1 = new OrderItem(1, 1000.0, p);
        System.out.println(oi1);

    }
}
