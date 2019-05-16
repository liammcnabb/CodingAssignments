package com.company;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

    /** Main.IdentifyItem Tests*/
    @Test
    public void give_null_returnsMinusOne()
    {
            Goods[] items = Main.initialGoodsArray();
            final int expected = -1;
            final String item = null;
            final int result = Main.identifyItem(items,item);
            Assert.assertEquals(result, expected);
    }
    @Test
    public void give_emptyString_returnsMinusOne()
    {
        Goods[] items = Main.initialGoodsArray();
        final int expected = -1;
        final String item = "";
        final int result = Main.identifyItem(items,item);
        Assert.assertEquals(result, expected);
    }
    @Test
    public void give_unknownItem_returnsMinusOne()
    {
        Goods[] items = Main.initialGoodsArray();
        final int expected = -1;
        final String item = "banana";
        final int result = Main.identifyItem(items,item);
        Assert.assertEquals(result, expected);
    }
    @Test
    public void give_soup_returnsZero()
    {
        Goods[] items = Main.initialGoodsArray();
        final int expected = Goods.SOUP;
        final String item = "Soup";
        final int result = Main.identifyItem(items,item);
        Assert.assertEquals(result, expected);
    }
    @Test
    public void give_bread_returnsOne()
    {
        Goods[] items = Main.initialGoodsArray();
        final int expected = Goods.BREAD;
        final String item = "Bread";
        final int result = Main.identifyItem(items,item);
        Assert.assertEquals(result, expected);
    }
    @Test
    public void give_milk_returnsTwo()
    {
        Goods[] items = Main.initialGoodsArray();
        final int expected = Goods.MILK;
        final String item = "Milk";
        final int result = Main.identifyItem(items,item);
        Assert.assertEquals(result, expected);
    }
    @Test
    public void give_apples_returnsThree()
    {
        Goods[] items = Main.initialGoodsArray();
        final int expected = Goods.APPLES;
        final String item = "Apples";
        final int result = Main.identifyItem(items,item);
        Assert.assertEquals(result, expected);
    }
}