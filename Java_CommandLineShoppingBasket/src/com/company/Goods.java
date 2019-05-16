package com.company;

/**
 * @author Liam McNabb
 */
public class Goods
{
    public static final int SOUP = 0;
    public static final int BREAD = 1;
    public static final int MILK = 2;
    public static final int APPLES = 3;

    private String m_name = "";
    private double m_price = 0.00;
    private int m_quantity = 0;

    /**
     * Empty Constructor, sets variables to default value
     */
    public Goods()
    {
        setName("");
        setPrice(0.0);
    }
    /**
     * Full Constructor. Sets all variables as the constructor input
     * @param name Name of the goods
     * @param price price of the goods
     */
    public Goods(String name, double price)
    {
        setName(name);
        setPrice(price);
    }

    /**
     * Copy Constructor, used to creat a deep copy of Goods Object
     * @param other other goods object to copy from
     */
    public Goods(Goods other)
    {
        setName(other.getName());
        setPrice(other.getPrice());
    }

    /**
     * Getter method for Goods name
     * @return Goods name
     */
    public String getName() {
        return m_name;
    }

    /**
     * Setter method for Goods name
     * @param m_name new name of Goods
     */
    public void setName(String m_name) {
        this.m_name = m_name;
    }

    /**
     * Getter method for price of the goods
     * @return Goods price
     */
    public double getPrice() {
        return m_price;
    }

    /**
     * Setter method for price of the goods
     * @param m_price new price of the Goods
     */
    public void setPrice(double m_price) {
        if(m_price < 0.0)
            this.m_price = 0.00;
        this.m_price = m_price;
    }

    /**
     * Getter method of quanity of the Goods available
     * @return the total quantity of the Goods
     */
    public int getQuantity() {
        return m_quantity;
    }

    /**
     * Setter method of quantity of the Goods available
     * @param m_quantity new quantity of the Goods available
     */
    public void setQuantity(int m_quantity) {
        if(m_quantity < 0)
            m_quantity = 0;
        this.m_quantity = m_quantity;
    }
}
