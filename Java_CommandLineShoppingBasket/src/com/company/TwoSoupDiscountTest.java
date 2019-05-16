package com.company;

import org.junit.Assert;
import org.junit.Test;

public class TwoSoupDiscountTest {

    /** TwoSoupDiscount.calculateDiscount() tests*/
    @Test
    public void sub_ZeroSoup_returnNoChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.SOUP].setQuantity(0);
        final double subtotal = 3.00;
        final double expected = 3.00;
        final double result = offer[1].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_OneSoup_returnNoChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.SOUP].setQuantity(1);
        final double subtotal = 3.00;
        final double expected = 3.00;
        final double result = offer[1].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_MaxSoup_returnNoChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.SOUP].setQuantity(Integer.MAX_VALUE);
        final double subtotal = Integer.MAX_VALUE;
        final double expected = Integer.MAX_VALUE;
        final double result = offer[1].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_NegativeSoup_returnNoChange(){
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.SOUP].setQuantity(-1);
        final double subtotal = 3.00;
        final double expected = 3.00;
        final double result = offer[1].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_MinSoup_returnNoChange(){
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.SOUP].setQuantity(Integer.MIN_VALUE);
        final double subtotal = 3.00;
        final double expected = 3.00;
        final double result = offer[1].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_ZeroBread_returnNoChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.BREAD].setQuantity(0);
        final double subtotal = 3.00;
        final double expected = 3.00;
        final double result = offer[1].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_OneBread_returnNoChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.BREAD].setQuantity(1);
        final double subtotal = 3.00;
        final double expected = 3.00;
        final double result = offer[1].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_MaxBread_returnNoChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.BREAD].setQuantity(Integer.MAX_VALUE);
        final double subtotal = Integer.MAX_VALUE;
        final double expected = Integer.MAX_VALUE;
        final double result = offer[1].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_NegativeBread_returnNoChange(){
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.BREAD].setQuantity(-1);
        final double subtotal = 3.00;
        final double expected = 3.00;
        final double result = offer[1].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_MinBread_returnNoChange(){
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.BREAD].setQuantity(Integer.MIN_VALUE);
        final double subtotal = 3.00;
        final double expected = 3.00;
        final double result = offer[1].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_OneBreadOneSoup_returnNoChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.BREAD].setQuantity(1);
        items[Goods.SOUP].setQuantity(1);
        final double subtotal = 3.00;
        final double expected = 3.00;
        final double result = offer[1].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_OneBreadTwoSoup_returnNoChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.BREAD].setQuantity(1);
        items[Goods.SOUP].setQuantity(2);
        final double subtotal = 3.00;
        final double expected = 3.00 - (0.5*items[Goods.BREAD].getPrice());
        final double result = offer[1].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

    @Test
    public void sub_MaxBreadMaxSoup_returnNoChange() {
        Goods[] items = Main.initialGoodsArray();
        Offers[] offer = Main.initializeOffers(items);
        items[Goods.BREAD].setQuantity(Integer.MAX_VALUE);
        items[Goods.SOUP].setQuantity(Integer.MAX_VALUE);
        final double subtotal = Integer.MAX_VALUE;
        final double expected = Integer.MAX_VALUE - ((Integer.MAX_VALUE/2)*0.5*items[Goods.BREAD].getPrice());
        final double result = offer[1].calculateDiscount(items,subtotal);
        Assert.assertTrue(result == expected);
    }

}