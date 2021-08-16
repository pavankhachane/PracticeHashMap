package com.pavan;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeHashMap {

    private static Scanner scanner = new Scanner(System.in);
    private static List<String> areaList;

    public static void main(String[] args) {
        // write your code here
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {
            System.out.println();
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    initializeDefaultHashMap();
                    break;
                case 2:
                    customObjectsHashMap();
                    break;
                case 3:
                    sortCustomHashMapObjects();
                    break;
                case 4:
                    compareCustomHashMapObjects();
                    break;
                case 5:
                    performHashMapOperations();
                    break;
                case 6:
                    createTreeMap();
                    break;
                case 10:
                    quit = true;
                    break;
                default:
                    System.out.println("Illegal Input");
                    break;
            }
        }
    }

    private static void createTreeMap() {
    }

    private static void performHashMapOperations() {
    }

    private static void compareCustomHashMapObjects() {

        Employee e1 = new Employee(201, "Pavan", "Khachane");
        Employee e2 = new Employee(101, "Satyam", "Wakekar");
        Employee e3 = new Employee(401, "Prasanna", "Phirke");
        Employee e4 = new Employee(301, "Tejas", "Bhangale");
        Employee e5 = new Employee(301, "Tejas", "Bhangale");

        Map<Employee, Integer> map = new HashMap<>();
        map.put(e1,1);
        map.put(e2,2);
        map.put(e3,3);
        map.put(e4,4);
        map.put(e5,5);

        System.out.println(map);

        Map<Employee, Integer> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap);

        Map<Employee, Integer> result = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry :: getKey,
                        Map.Entry :: getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new
                ));

        System.out.println("Sort by Key using Java 8 ");
        System.out.println(result);
        System.out.println("Sort by Values using Java 8 ");

        Map<Employee, Integer> result2 = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry :: getKey,
                        Map.Entry :: getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new
                ));
        System.out.println(result2);
    }

    private static void sortCustomHashMapObjects() {
    }

    private static void customObjectsHashMap() {
        Employee e1 = new Employee(201, "Pavan", "Khachane");
        Employee e2 = new Employee(101, "Satyam", "Wakekar");
        Employee e3 = new Employee(401, "Prasanna", "Phirke");
        Employee e4 = new Employee(301, "Tejas", "Bhangale");
        Employee e5 = new Employee(301, "Tejas", "Bhangale");

        Account a1 = new Account(1111, 25000.0, "HDFC Bank", "Nagpur");
        Account a2 = new Account(1234, 55000.0, "City Bank", "New York");
        Account a3 = new Account(1111, 65000.0, "Alahabad Bank", "Malkapur");
        Account a4 = new Account(1111, 75000.0, "Kotak Mahindra Bank", "Mumbai");
        Account a5 = new Account(1111, 75000.0, "SBI Bank", "Nagpur");

        Map<Employee, Account> map = new HashMap<>();

        map.put(e1,a1);
        map.put(e2,a2);
        map.put(e3,a3);
        map.put(e4,a4);
        map.put(e5,a5);

        System.out.println(map);
    }

    private static void initializeDefaultHashMap() {
        Map<Integer, String> map = new HashMap<>();

        map.put(2, "Pavan");
        map.put(1, "Pavan");
        map.put(2, "PAVAN");
        map.put(0, "Tejas");
        map.put(25, "Sameer");
        map.put(45, "Vinayak");
        map.put(4, null);
      //  map.put(null, "Test");
      //  map.put(null, null); // will be ignored as null already present

        System.out.println(map);
        System.out.println(map.get(2));

        map.putIfAbsent(46, "Lokhande");
        System.out.println(map);

        System.out.println(map.remove(45, map.get(45)));
        System.out.println(map);
        System.out.println("getOrDefault(Object key, V defaultValue) => " + map.getOrDefault(46, "Lokhan"));

        System.out.println();
        System.out.println("Iteration on Map : ");

        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + " ==> " + m.getValue() + " ==> " + m.getClass());
        }

        System.out.println("Iteration using Iterator: ");
        Iterator<Integer> itr = map.keySet().iterator();
        while(itr.hasNext()){
            Integer key = (Integer) itr.next();
            System.out.print(" " + key);
        }

        System.out.println("\nKeySet : ");
        for(Integer i : map.keySet()){
            System.out.print(" " + i);
        }

        System.out.println(" \nValues : ");
        for(String s : map.values()){
            System.out.print(" " + s);
        }

        System.out.println("\n\nIteration using Java 8 forEach :");
        map.forEach((k,v) -> System.out.println("Key = "+ k + ", Value = " + v ));

        System.out.println("Sorting using TreeMap: ");
        System.out.println(" Before Sorting");
        System.out.println(map);
        Map<Integer, String> sortedMap = new TreeMap<>(map);
        System.out.println("After Sorting");
        System.out.println(sortedMap);

    }

    private static void printInstructions() {

        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To Initialize HashMap with Default Values");
        System.out.println("\t 2 - To use Custom Objects in HashMap");
        System.out.println("\t 3 - To sort Custom Objects in HashMap");
        System.out.println("\t 4 - To compare Default and Custom Objects in HashMap");
        System.out.println("\t 5 - To performHashMapOperations in HashMap");
        System.out.println("\t 6 - To create TreeMap");
        System.out.println("\t 10 - To quite an application");
    }

}
