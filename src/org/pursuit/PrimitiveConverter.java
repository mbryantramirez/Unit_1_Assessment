package org.pursuit;
//TASK #01

public class PrimitiveConverter {
    /**
     * Unnecessary boxing 'Integer.valueOf(intPar)'
     *
     * Inspection info: wrapping of primitive values in objects.
     *
     * Explicit manual boxing is unnecessary under Java 5 and newer,
     * and can be safely removed.
     *
     * Follow Intellij hints/cautions you have functional code but you can save yourself some
     * typing
     */

    public Integer intToInteger(int intPar){
        return Integer.valueOf(intPar);
    }
    public Double doubleToDouble(double doublePar){
       return Double.valueOf(doublePar);
    }
    public Character charToCharacter(char charPar){
        return Character.valueOf(charPar);
    }
    public Boolean booleanToBoolean(boolean boolPar){
        return Boolean.valueOf(boolPar);
    }
}
