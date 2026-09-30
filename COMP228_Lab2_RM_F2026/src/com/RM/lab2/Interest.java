package com.RM.lab2;

import java.math.BigDecimal;

public class Interest {

    BigDecimal principal;
    BigDecimal rate;
    double time;

    
    public Interest(BigDecimal principal, BigDecimal rate, double time)
    {
       
        if (principal.compareTo(BigDecimal.ZERO) < 0)
        {
            throw new IllegalArgumentException("Principal cannot be negative.");
        }

        if (rate.compareTo(BigDecimal.ZERO) < 0)
        {
            throw new IllegalArgumentException("Rate cannot be negative.");
        }

        if (time < 0)
        {
            throw new IllegalArgumentException("Time cannot be negative.");
        }

     
        if (principal.doubleValue() == principal.intValue())
        {
            throw new IllegalArgumentException("Principal cannot be an integer.");
        }

        if (rate.doubleValue() == rate.intValue())
        {
            throw new IllegalArgumentException("Rate cannot be an integer.");
        }

        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    
    public BigDecimal Simple_Interest(BigDecimal principal, BigDecimal rate, double time)
    {
        BigDecimal interest = principal.multiply(rate);

        interest = interest.multiply(BigDecimal.valueOf(time));

        interest = interest.divide(BigDecimal.valueOf(100));

        return interest;
    }

 
    public BigDecimal Compound_Interest(BigDecimal principal, BigDecimal rate, double time)
    {
        BigDecimal ratePart = rate.divide(BigDecimal.valueOf(100));

        double power = Math.pow(1 + ratePart.doubleValue(), time);

        BigDecimal interest = principal.multiply(BigDecimal.valueOf(power));

        interest = interest.subtract(principal);

        return interest;
    }

  
    public BigDecimal Simple_Interest(Double principal, Double rate, Double time)
    {
        double interest = (principal * rate * time) / 100;

        return BigDecimal.valueOf(interest);
    }

 
    public BigDecimal Compound_Interest(Double principal, Double rate, Double time)
    {
        double interest = (principal * Math.pow(1 + (rate / 100), time)) - principal;

        return BigDecimal.valueOf(interest);
    }
}
