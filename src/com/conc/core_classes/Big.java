package com.conc.core_classes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by student on 25.05.2018.
 */
public class Big {

    public static void main(String[] args) {

        BigInteger bi = new BigInteger("99999999999999999999999");
        System.out.println(bi.pow(9));

        BigDecimal bd1 = new BigDecimal("9.99999999999999999999");
        BigDecimal bd2 = new BigDecimal("9.99999999999999999999");
        System.out.println(bd1.multiply(bd2, MathContext.DECIMAL32));
        double d1 = 9.99999999999999999999;
        double d2 = 9.99999999999999999999;
        System.out.println(d1 * d2);

        Date date = new Date();
        System.out.println(date);

        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.MONTH));

        System.out.println();

        int num = 40000000;
        NumberFormat n = NumberFormat.getInstance();
        System.out.println(n.format(num));
        NumberFormat n2 = NumberFormat.getInstance(Locale.ITALY);
        System.out.println(n2.format(num));

    }
}
