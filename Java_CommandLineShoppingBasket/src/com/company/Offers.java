package com.company;

/**
 * @author Liam McNabb
 */
public class Offers
{
    private Goods[] m_requirements;
    private double m_discount = 0.0;
    private String m_name = "";

    /**
     * Empty constructor. All variables set to defaults
     */
    public Offers()
    {
        setName("");
        setRequirements(null);
        setDiscount(0.0);
    }

    /**
     * Full constructor for the Offers
     * @param name name of the offer. (Displayed at discount print)
     * @param required A set of the required Goods to activate the offer
     * @param discount the discount to be applied when calculating
     */
    public Offers(String name, Goods[] required, double discount)
    {
        setName(name);
        setRequirements(required);
        setDiscount(discount);
    }

    /**
     * Copy Constructor. Used to create a deep copy of the object
     * @param other object to copy from
     */
    public Offers(Offers other)
    {
        setName(other.getName());
        setRequirements(other.getRequirements());
        setDiscount(other.getDiscount());
    }

    /**
     * The method to override for calculateDiscount.
     * @param basket The basket of items to verify discounts from
     * @param currentTotal the current subtotal
     * @return the new sub/total after the discount.
     */
    public double calculateDiscount(Goods[] basket, double currentTotal)
    {
        return 0.0;
    }

    /**
     * Getter method for the offer requirements
     * @return array of goods requirements
     */
    public Goods[] getRequirements() {
        return m_requirements;
    }

    /**
     * Setter method for the offer requirements
     * @param requirements new value for the array of goods requirements
     */
    public void setRequirements(Goods[] requirements) {
        this.m_requirements = requirements;
    }

    /**
     * Getter method for the offer name
     * @return the offer name
     */
    public String getName() {
        return m_name;
    }

    /**
     * Setter method for the offer name
     * @param name new value for offer name
     */
    public void setName(String name) {
        this.m_name = name;
    }

    /**
     * Getter method for offer discount
     * @return offer discount
     */
    public double getDiscount() {
        return m_discount;
    }

    /**
     * Setter method for offer discount
     * @param m_discount new value of offer discount
     */
    public void setDiscount(double m_discount) {
        this.m_discount = m_discount;
    }
}
