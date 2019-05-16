package com.company;

/**
 * @author Liam McNabb
 */
public class TwoSoupDiscount extends Offers {

    /**
     * Empty constructor. Sets all variables to default.
     */
    public TwoSoupDiscount() { super(); }

    /**
     * Full constructor.
     * @param name name of the offer
     * @param required required goods to activate discount
     * @param discount the discount value for the offer
     */
    public TwoSoupDiscount(String name, Goods[] required, double discount)
    {
        super(name, required, discount);
    }

    /**
     * Copy constructor for a deep copy
     * @param other other TwoSoupDiscount to make a copy of.
     */
    public TwoSoupDiscount(TwoSoupDiscount other)
    {
        super(other);
    }

    /**
     * The overridden method for calculateDiscount.
     * @param basket The basket of items to verify discounts from
     * @param currentTotal the current subtotal
     * @return the new sub/total after the discount.
     */
    public double calculateDiscount(Goods[] basket, double currentTotal)
    {
        if(basket[Goods.SOUP].getQuantity() >= getRequirements()[Goods.SOUP].getQuantity() &&
                basket[Goods.BREAD].getQuantity() >= getRequirements()[Goods.BREAD].getQuantity())
        {
            int discounted = 0;
            if(basket[Goods.BREAD].getQuantity() < (int) basket[Goods.SOUP].getQuantity()/2)
                discounted = basket[Goods.BREAD].getQuantity();
            else
                discounted = (int) basket[Goods.SOUP].getQuantity()/2;

            System.out.print(getName() + "-");
            double value = getDiscount() * basket[Goods.BREAD].getPrice() * discounted;
            if(value >= 1)
                System.out.println("£"+String.format("%.2f", value));
            else
                System.out.println(""+(int)(value*100)+"p");
            return currentTotal - value;
        }
        return currentTotal;
    }
}
