package com.gkatzioura.solid.ocp;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SeniorDiscount implements Discount {

    @Override
    public BigDecimal apply(BigDecimal price) {

        BigDecimal percent = new BigDecimal("0.20");
        BigDecimal discount = price.multiply(percent);
        return price.subtract(discount.setScale(2, RoundingMode.HALF_UP));
    }
}
