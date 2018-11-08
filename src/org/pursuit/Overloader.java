package org.pursuit;
//TASK #02
public class Overloader {


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
