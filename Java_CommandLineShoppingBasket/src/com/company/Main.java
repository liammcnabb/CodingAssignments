package com.company;

/**
 * @author Liam McNabb
 */
public class Main
{
    private static final int ITEMS_CHOICE = 4;
    private static final int OFFERS_CHOICE = 2;

    /**
     * Creates an intial array that holds all possible goods
     * @return the finished array of all possible goods
     */
    protected static Goods[] initializeGoods()
    {
        Goods[] array = new Goods[ITEMS_CHOICE];
        Goods temp;

        temp = new Goods("Soup", 0.65);
        array[Goods.SOUP] = temp;
        temp = new Goods("Bread",0.80);
        array[Goods.BREAD] = temp;
        temp = new Goods("Milk", 1.30);
        array[Goods.MILK] = temp;
        temp = new Goods("Apples", 1.00);
        array[Goods.APPLES] = temp;
        return array;
    }

    /**
     * Creates an initial array of offers that holds all possible discounts
     * @param goods list of available goods, used to depict offer requirements
     * @return returns the list of special offers.
     */
    protected static Offers[] initializeOffers(Goods[] goods)
    {
        Offers[] specials = new Offers[OFFERS_CHOICE];
        Goods[] offerR;
        String name;

        offerR = new Goods[ITEMS_CHOICE];
        for(int i = 0; i < ITEMS_CHOICE; ++i)
            offerR[i] = new Goods(goods[i]);

        offerR[Goods.APPLES].setQuantity(1);
        name = "Apples 10% off: ";
        Offers offer = new AppleDiscount(name, offerR, 0.1);
        specials[0] = offer;

        offerR = new Goods[ITEMS_CHOICE];
        for(int i = 0; i < ITEMS_CHOICE; ++i)
            offerR[i] = new Goods(goods[i]);
        offerR[Goods.SOUP].setQuantity(2);
        offerR[Goods.BREAD].setQuantity(1);
        name = "Bread 1/2 price with 2 soups: ";
        offer = new TwoSoupDiscount(name, offerR, 0.5);
        specials[1] = offer;

        return specials;
    }

    /**
     * Identifies the index of the item in the goods list.
     * If an item isn't found return index -1. (Case sensitive)
     * @param available the available goods the item can be
     * @param item the item to test
     * @return the index of the item in available
     */
    public static int identifyItem(Goods[] available, String item)
    {
        if( item == null)
            return -1;

        for(int i = 0; i <available.length; ++i)
            if (item.equals(available[i].getName()))
                return i;

        return -1;
    }

    /**
     * calculates and prints the subtotal
     * @param stList list of items to garner subtotal of
     * @return the original subtotal before discounts
     */
    private static double calculateSubTotal(Goods[] stList)
    {
        System.out.print("Subtotal: £");

        double subtotal = 0.00;
        for(Goods item : stList)
            subtotal += (item.getPrice()* item.getQuantity());

        System.out.println(String.format("%.2f", subtotal));
        return subtotal;
    }

    /**
     * The Main method called to run the program. The model is
     * 1. Intialize goods, 2. Initialize offers, 3. Identify quantity of items
     * 4. Calculate and print subtotal, 5. Apply Discounts, 6. Print Total
     * @param args presents basket (case sensitive)
     */
    public static void main(String[] args)
    {
        int basketLength = args.length;
        Goods[] available = initializeGoods();
        Offers[] specials = initializeOffers(available);

        for( int i = 0; i < basketLength; ++i )
        {
            int itemIndex = identifyItem(available,args[i]);
            if(itemIndex == -1)
            {
                System.err.println("Could not diagnose item \'" + args[i] + "\' in basket.");
                System.exit(1);
            }
            else
            {
                available[itemIndex].setQuantity(available[itemIndex].getQuantity()+1);
            }

        }

        double subtotal = calculateSubTotal(available);
        double total = subtotal;

        for( int i = 0; i < OFFERS_CHOICE; ++i )
            total = specials[i].calculateDiscount(available,total);

        if(subtotal == total)
            System.out.println("(no offers available)");

        System.out.println("Total: £" + String.format("%.2f", total));
    }
}
