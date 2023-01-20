package com.malevieira.collections;

import java.util.*;


public class CollectionsMap {

    public static void main(String[] args) {

        Set<String> birds = new HashSet<>();

        birds.add("canario");
        birds.add("bentevi");
        birds.add("pardal");
        birds.add("toBeRemoved");

        // cannot remove by index
        birds.remove("toBeRemoved");

        // looping through a set
        // by enhanced loop
        System.out.println("Enhanced loop");
        for (String bird : birds) {
            System.out.println(bird);
        }

        // by iterator
        System.out.println("loop by Iterator");
        Iterator<String> birdsIterator = birds.iterator();
        while(birdsIterator.hasNext()) {
            System.out.println(birdsIterator.next());
        }

        // using lambda / function interfaces
        System.out.println("loop with lambda - foreach");
        birds.forEach(str -> System.out.println(str));

        // using lambda with method reference
        System.out.println("loop with lambda - foreach and method reference");
        birds.forEach(System.out::println);

        // using Set to remove all duplicated elements from a List
        List<String> animals = Arrays.asList("Macaco", "Urubu", "Crocodilo", "Gorilla", "Macaco");
        System.out.println("List : " + animals);

        Set<String> animalsSet = new HashSet<>();
        animalsSet.addAll(animals);

        System.out.println("Set : " + animalsSet);

    }
}
