package day_48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerObjects {

    public static void main(String[] args) {

    Customer cs1 = new Customer();
    System.out.println(cs1.toString()); // print with default values
    cs1.setId(1);
    cs1.setName("Bobby Brown");
    System.out.println(cs1);

    Customer cs2 = new Customer("John",3);
    Customer cs3 = new Customer("Babajan", 5321);
    System.out.println(cs2);
    System.out.println(cs3);

    //array of customers
    Customer [] todaysCustomers = {cs1,cs2,cs3, new Customer("Vadym",0757)};

    // arrayList of Customer objects

    List<Customer> customerList = new ArrayList<>();
    customerList.add(cs1);
    customerList.add(cs2);
    customerList.add(cs3);
    customerList.add(new Customer("Babajaga", 6666));
    customerList.add(new Customer("Kashey",3333));

    //Print info of first
        System.out.println(todaysCustomers[0].toString());
        System.out.println(customerList.get(0).toString());
        System.out.println(customerList); // will print all customers in one line

        System.out.println("-----For Loop-----");
        for(int i = 0; i < customerList.size(); i++) {

            System.out.println(customerList.get(i));
        }

        System.out.println("------For Each Loop-----");
        for(Customer each : customerList) {
            System.out.println(each);
        }
        // print all names of Customer in the list
        System.out.println("----- Names Of Customers ------");
        for(Customer each : customerList) {
            System.out.println(each.getName());
        }
        // forEach method and lambda expression
        customerList.forEach(each -> System.out.println(each.getName()));






    }
}
