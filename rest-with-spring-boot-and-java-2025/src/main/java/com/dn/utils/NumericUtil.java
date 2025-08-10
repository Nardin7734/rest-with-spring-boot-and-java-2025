package com.dn.utils;

import com.dn.exception.UnsuportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public class NumericUtil
{
    public static Double toDouble( String strNumber )
    {
        return Double.parseDouble( strNumber );
    }

    public static boolean isNumeric( String strNumber )
    {
        if( strNumber == null || strNumber.isEmpty() ) return false;
        String number = strNumber.replace( ",", "." );

        return number.matches( "[-+]?[0-9]*\\.?[0-9]+" );
    }


    public static Double sum( Double n1, Double n2 )
    {
        return n1 + n2;
    }


    public static Double subtraction( Double n1, Double n2 )
    {
        return n1 - n2;
    }

    public static Double multiply( Double n1, Double n2 )
    {
        return n1 * n2;
    }


    public static Double divide( Double n1, Double n2 )
    {
        return n1/n2;
    }


    public static Double mean( Double n1, Double n2 )
    {
        return ( n1 + n2 ) / 2;
    }


    public static Double squareRoot( Double n1 )
    {
        return Math.sqrt( n1 );
    }
}
