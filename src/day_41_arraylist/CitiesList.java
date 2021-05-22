package day_41_arraylist;

import java.util.ArrayList;

public class CitiesList<cities> {
    public static void main(String[] args) {
        // declare arraylist
        ArrayList<String> cities = new ArrayList<>();
        // add values to arraylist -> add methods
        cities.add("Washington DC");
        cities.add("New York");
        cities.add("Viena");
        cities.add("Adana");
        cities.add("LA");

        cities.add(0, "Ashgabat");
        System.out.println(cities);
        System.out.println("first city = " + cities.get(0));
        System.out.println("last city = " + cities.get(5));
        // find last index using size()-1
        System.out.println("last city = " + cities.get(cities.size()-1));
        // Arraylist methods:
        /* ->add(value)
           ->get()
           ->size()
           ->remove()
           ->clear()
           ->isEmpty()
           ->contains()
            */
        System.out.println("count of items = " + cities.size());
        int size = cities.size();
        System.out.println("size = " + size);

        for(int i = 0; i< cities.size()/2; i++);
        System.out.print(cities +" ");
        cities.remove(3);
        cities.remove("New York");
        System.out.println("\nafter remove " + cities);

        cities.clear();
        System.out.println("all cities is gone" + cities);

        if(cities.isEmpty()){}
        System.out.println("list ia empty");

        if(cities.size() == 0){
            System.out.println("list ia empty");
        }

    }

    }




