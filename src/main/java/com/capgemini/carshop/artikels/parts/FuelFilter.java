package com.capgemini.carshop.artikels.parts;

import com.capgemini.carshop.artikels.AbstractArticle;

public class FuelFilter extends Part {
    //TODO ZADANIE 2: zamienic na enum
    String fuelType;

    public double getNetPrice() {
        return price * 0.9d;
    }
}
