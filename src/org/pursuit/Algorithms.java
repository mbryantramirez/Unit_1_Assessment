package org.pursuit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
//TASK #05
public class Algorithms implements DataStructures {

    @Override
    public char[] stringToCharArray(String word) {
        char[] array = new char[word.length()];

        for(int i = 0; i < array.length; i++){
            array[i] = word.charAt(i);
        }

        return array;
    }

    @Override
    public ArrayList<Integer> multiplicationTableList(int number) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 1; i <= 10; i++){
            arrayList.add(i*number);
        }

        return arrayList;
    }

    @Override
    public HashMap<String, Integer> wordLength(String[] wordArray) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(int i = 0; i < wordArray.length;i++){
            hashMap.put(wordArray[i],wordArray[i].length());
        }
        return hashMap;
    }

    @Override
    public HashSet<Character> uniqueCharacters(String word) {
        HashSet<Character> hashSet = new HashSet<>();

        for(int i = 0; i < word.length(); i++){
            hashSet.add(word.charAt(i));
        }

        return hashSet;

    }
}
