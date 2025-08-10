package com.dn.controllers;

import com.dn.exception.UnsuportedMathOperationException;
import com.dn.utils.NumericUtil;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "/math" )
public class MathController
{

    @RequestMapping( "sum/{n1}/{n2}" )
    public Double sum( @PathVariable( "n1" ) String n1, @PathVariable( "n2" ) String n2 ) throws UnsuportedMathOperationException
    {
        if( !NumericUtil.isNumeric( n1 ) || !NumericUtil.isNumeric( n2 ) ) throw new UnsuportedMathOperationException( "You need to inform two numeric values" );
        return NumericUtil.sum( NumericUtil.toDouble( n1 ), NumericUtil.toDouble( n2 ) );
    }

    @RequestMapping( "subtraction/{n1}/{n2}" )
    public Double subtraction( @PathVariable( "n1" ) String n1, @PathVariable( "n2" ) String n2 ) throws UnsuportedMathOperationException
    {
        if( !NumericUtil.isNumeric( n1 ) || !NumericUtil.isNumeric( n2 ) ) throw new UnsuportedMathOperationException( "You need to inform two numeric values" );
        return NumericUtil.subtraction( NumericUtil.toDouble( n1 ), NumericUtil.toDouble( n2 ) );
    }

    @RequestMapping( "multiply/{n1}/{n2}" )
    public Double multiply( @PathVariable( "n1" ) String n1, @PathVariable( "n2" ) String n2 ) throws UnsuportedMathOperationException
    {
        if( !NumericUtil.isNumeric( n1 ) || !NumericUtil.isNumeric( n2 ) ) throw new UnsuportedMathOperationException( "You need to inform two numeric values" );
        return NumericUtil.multiply( NumericUtil.toDouble( n1 ), NumericUtil.toDouble( n2 ) );
    }

    @RequestMapping( "division/{n1}/{n2}" )
    public Double divide( @PathVariable( "n1" ) String n1, @PathVariable( "n2" ) String n2 ) throws UnsuportedMathOperationException
    {
        if( !NumericUtil.isNumeric( n1 ) || !NumericUtil.isNumeric( n2 ) ) throw new UnsuportedMathOperationException( "You need to inform two numeric values" );
        return NumericUtil.divide( NumericUtil.toDouble( n1 ), NumericUtil.toDouble( n2 ) );
    }

    @RequestMapping( "mean/{n1}/{n2}" )
    public Double mean( @PathVariable( "n1" ) String n1, @PathVariable( "n2" ) String n2 ) throws UnsuportedMathOperationException
    {
        if( !NumericUtil.isNumeric( n1 ) || !NumericUtil.isNumeric( n2 ) ) throw new UnsuportedMathOperationException( "You need to inform two numeric values" );
        return NumericUtil.mean( NumericUtil.toDouble( n1 ), NumericUtil.toDouble( n2 ) );
    }

    @RequestMapping( "squareroot/{n1}" )
    public Double squareRoot( @PathVariable( "n1" ) String n1 ) throws UnsuportedMathOperationException
    {
        if( !NumericUtil.isNumeric( n1 ) ) throw new UnsuportedMathOperationException( "You need to inform one numeric values" );
        return NumericUtil.squareRoot( NumericUtil.toDouble( n1 ) );
    }
}
