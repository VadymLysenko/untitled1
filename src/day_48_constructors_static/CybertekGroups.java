package day_48_constructors_static;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Arrays;


public class CybertekGroups {

    public static void main(String[] args) {

        Group group1 = new Group("CyberTanks"); // dependency injection
        //Group object depends on String name
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.getName());
        System.out.println(group1.getMembers().toString());

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephan","Akrem","Wakshum","Bulent","Andrea","Andrei"));
        System.out.println(group2.getMembers());

        if(group2.getMembers().contains("Akrem")) {
            System.out.println("Akrem is in group");
        }else{
            System.out.println("Akrem is not here");
        }
        // remove some members from groupq
        group1.removeMember("Pavel");
        group1.removeMember("Elvin");
        System.out.println(group1.getMembers().toString());

            }
}
