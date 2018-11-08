package org.pursuit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//TASK #04
public interface DataStructures {
    char[] stringToCharArray(String word);
    ArrayList<Integer> multiplicationTableList(int number);
    HashMap<String, Integer> wordLength(String[] wordArray);
    HashSet<Character> uniqueCharacters(String word);
}
