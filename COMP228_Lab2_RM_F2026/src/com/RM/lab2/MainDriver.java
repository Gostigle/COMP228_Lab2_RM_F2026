package com.RM.lab2;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainDriver {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter principal: ");
        BigDecimal principal = input.nextBigDecimal();

        System.out.print("Enter rate: ");
        BigDecimal rate = input.nextBigDecimal();

        System.out.print("Enter time: ");
        double time = input.nextDouble();

        
        Interest interest1 = new Interest(principal, rate, time);
        Interest interest2 = new Interest(principal, rate, time);
        Interest interest3 = new Interest(principal, rate, time);
        Interest interest4 = new Interest(principal, rate, time);
        Interest interest5 = new Interest(principal, rate, time);

        double p_d = principal.doubleValue();
        double r_d = rate.doubleValue();

        System.out.println();

      
        System.out.println("Interest 1 Simple: "
                + interest1.Simple_Interest(principal, rate, time));

        System.out.println("Interest 1 Compound: "
                + interest1.Compound_Interest(principal, rate, time));

    
        System.out.println("Interest 2 Simple (Double): "
                + interest2.Simple_Interest(p_d, r_d, time));

        System.out.println("Interest 2 Compound (Double): "
                + interest2.Compound_Interest(p_d, r_d, time));

    
        System.out.println("Interest 3 Simple: "
                + interest3.Simple_Interest(principal, rate, time));

        System.out.println("Interest 3 Compound: "
                + interest3.Compound_Interest(principal, rate, time));

        
        System.out.println("Interest 4 Simple (Double): "
                + interest4.Simple_Interest(p_d, r_d, time));

        System.out.println("Interest 4 Compound (Double): "
                + interest4.Compound_Interest(p_d, r_d, time));

      
        System.out.println("Interest 5 Simple: "
                + interest5.Simple_Interest(principal, rate, time));

        System.out.println("Interest 5 Compound: "
                + interest5.Compound_Interest(principal, rate, time));

        input.close();
    }
}
