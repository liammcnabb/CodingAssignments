package com.company;

/**
 * @author Liam McNabb
 */
public class AppleDiscount extends Offers {

    /**
     * Empty constructor. Sets variables to the default.
     */
    public AppleDiscount() { super(); }

    /**
     * Full constructor. Sets all variables
     * @param name name of the discount
     * @param required the required goods
     * @param discount the discount of the offer
     */
    public AppleDiscount(String name, Goods[] required, double discount)
    {
        super(name, required, discount);
    }

    /**
     * Copy constructor. Used as a deep copy for the object
     * @param other other object to copy from
     */
    public AppleDiscount(AppleDiscount other)
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
        if(basket[Goods.APPLES].getQuantity() >=
                getRequirements()[Goods.APPLES].getQuantity())
        {
            System.out.print(getName() + "-");
            double value = getDiscount()*basket[Goods.APPLES].getPrice()
                    * basket[Goods.APPLES].getQuantity();
            if(value >= 1)
                System.out.println("£"+String.format("%.2f", value));
            else
                System.out.println(""+(int)(value*100)+"p");

            if (currentTotal - value < 0)
                return 0;

            return currentTotal - value;

        }
        return currentTotal;
    }
}
