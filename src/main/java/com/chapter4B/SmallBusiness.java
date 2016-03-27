package com.chapter4B;

/**
 * MHHoossen_213223538_3.A
 */
public class SmallBusiness {

    private PizzaShop shop;


    public SmallBusiness(){
        shop = new PizzaShop();
    }

    public SmallBusiness(String nm, String regNum, double amount)
    {
        shop = new PizzaShop(nm, regNum, amount);
    }

    public PizzaShop shop()
    {
        return this.shop;
    }

}
