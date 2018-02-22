package com.gkatzioura.solid.ocp;

import java.math.BigDecimal;

public class DiscountService {

    public BigDecimal applyDiscounts(BigDecimal price,Discount[] discounts) {

        BigDecimal discountPrice = price.add(BigDecimal.ZERO);

        for(Discount discount:discounts) {

            discountPrice = discount.apply(discountPrice);
        }

        return discountPrice;
    }
}
