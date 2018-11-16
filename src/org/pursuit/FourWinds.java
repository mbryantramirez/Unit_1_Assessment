package org.pursuit;
//TASK #03
public class FourWinds {
    public static final int NORTH = 0;
    public static final int SOUTH = 1;
    public static final int EAST = 2;
    public static final int WEST = 3;

    /**
     * Should follow the instructions -
     *
     * This class should also have 4 (four) static "getter" methods, with public access modifiers
     * getNorth, getSouth, getEast, and getWest,
     *
     * a project should be consistent with naming conventions throughout the code
     * For example, in Java,
     * all classes should be named using UpperCamelCase,
     * while methods and variables should have lowerCamelCase names.
     * Static final variables will be all uppercase
     *
     */
    public static int getNorth() {
        return NORTH;
    }

    public static int getSouth() {
        return SOUTH;
    }

    public static int getEast() {
        return EAST;
    }

    public static int getWest() {
        return WEST;
    }

}
