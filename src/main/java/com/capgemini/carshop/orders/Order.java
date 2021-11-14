package com.capgemini.carshop.orders;

import com.capgemini.carshop.artikels.AbstractArticle;
import com.capgemini.carshop.artikels.Oil;
import com.capgemini.carshop.artikels.parts.Damper;
import com.capgemini.carshop.artikels.parts.Spring;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Order {

    Sender sender;
    boolean readyToSend;
    Customer customer;
    List<AbstractArticle> articles;

    public Order(Sender sender) {
        customer = new Customer();
        this.sender = sender;

    }

    public void checkOrder() {
        if(readyToSend) {
            sender.sendMessage();
        }
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }
}
