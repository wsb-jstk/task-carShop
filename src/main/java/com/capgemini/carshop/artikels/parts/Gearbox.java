package com.capgemini.carshop.artikels.parts;

import com.capgemini.carshop.artikels.AbstractArticle;

public class Gearbox extends Part {
    int gears;
    boolean manual;

    @Override
    public double getNetPrice() {
        return 0;
    }

}
