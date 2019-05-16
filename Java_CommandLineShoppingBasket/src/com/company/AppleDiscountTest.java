package com.company;

import org.junit.Assert;
import org.junit.Test;

public class AppleDiscountTest
{
    /** AppleDiscount.calculateDiscount tests */
    @Test
    public void sub_ZeroApples_returnNoChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.APPLES].setQuantity(0);
        final double subtotal = 3.00;
        final double expected = 3.00;
        final double result = offer[0].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_OneApple_returnChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.APPLES].setQuantity(1);
        final double subtotal = 3.00;
        final double expected = 2.90;
        final double result = offer[0].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_MaxApple_returnChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.APPLES].setQuantity(Integer.MAX_VALUE);
        final double subtotal = Integer.MAX_VALUE;
        final double expected = Integer.MAX_VALUE*0.9;
        final double result = offer[0].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_NegativeApple_returnNoChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.APPLES].setQuantity(-1);
        final double subtotal = 3.00;
        final double expected = 3.00;
        final double result = offer[0].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_MinApple_returnNoChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.APPLES].setQuantity(Integer.MIN_VALUE);
        final double subtotal = 3.00;
        final double expected = 3.00;
        final double result = offer[0].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_OneSoup_returnChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.SOUP].setQuantity(1);
        final double subtotal = 3.00;
        final double expected = 3.00;
        final double result = offer[0].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_OneBread_returnChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.BREAD].setQuantity(1);
        final double subtotal = 3.00;
        final double expected = 3.00;
        final double result = offer[0].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_OneMilk_returnChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.MILK].setQuantity(1);
        final double subtotal = 3.00;
        final double expected = 3.00;
        final double result = offer[0].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }


}