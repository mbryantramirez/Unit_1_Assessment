package org.pursuit;
//TASK #02
public class Overloader {
    /**
     * You should be following the instructions casting definitely works here
     * but you run the risk of coming up with unexpected results instead
     *
     * Ctrl+Alt+L to format code methods dont need to be so close together
     */

    public double doubleDivision(int value1, int value2){
        return (double)value1/(double)value2;
    }
    public double doubleDivision(int value1, double value2){
        return (double)value1/value2;
    }
    public double doubleDivision(double value1, int value2) {
        return value1/(double)value2;
    }
    public double doubleDivision(double value1, double value2){
        return value1/value2;
    }

}
