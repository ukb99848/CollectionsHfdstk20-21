package be.vdab.collectionshfdstk21;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Oklahoma");
        set.add("Indiana");
        set.add("Georgia");
        set.add("Texas");
        set.add("Texas2");

        set.add("Texas2");
        System.out.println(set);




    }
}
