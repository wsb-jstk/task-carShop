package com.capgemini.carshop.artikels;

public abstract class AbstractArticle {

    protected double price;
    protected int catalogNumber;
    protected String manufacturer;

    /**
     * Returns net price
     * @return
     */
    public abstract double getNetPrice();
}
