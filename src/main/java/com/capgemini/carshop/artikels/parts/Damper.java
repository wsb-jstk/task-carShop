package com.capgemini.carshop.artikels.parts;

import com.capgemini.carshop.artikels.AbstractArticle;

public final class Damper extends Part implements Interchangeable{

    protected int height;

    //TODO Zadanie 1: zamienic na enum
    String type;

    public Damper(double price, int height, int catalogNumber, String manufacturer, String type) {
        this.price = price;
        this.height = height;
        this.originalPartNumber = OriginalParts.ORIGINAL_DAMPER_DIESEL;
        //TODO initialize all fields
    }

    public double getNetPrice() {
        return price * 0.8d;
    }

    @Override
    public boolean isCompatible(Part p) {
        return this.originalPartNumber == p.originalPartNumber;
    }
}
