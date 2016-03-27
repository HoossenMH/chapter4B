package com.chapter4B;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * MHHoossen_213223538_3.A
 */
public class TestSmallBusiness {

    private SmallBusiness business;

    @Before
    public void setUp()
    {
        business = new SmallBusiness("Hasan","13",50);
    }

    @Test
    public void testName()
    {
        Assert.assertEquals("Hasan", business.shop().getName());
    }

    @Test
    public void testRegNum()
    {
        Assert.assertEquals("13", business.shop().getRegNum());
    }

    @Test
    public void testAmount()
    {
        Assert.assertEquals(50, business.shop().getLoanAmount(),0.0f);
    }

    @Test
    public void testInterest()
    {
        Assert.assertEquals(2.5, business.shop().interest(),0.0f);
    }
}
