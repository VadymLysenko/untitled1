package day_41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        List<String> myCars = new ArrayList<>();
        myCars.add("toyota");
        myCars.add("volvo");
        myCars.add("ford");
        myCars.add("moskvich");
        myCars.add("tesla");
        myCars.add(0,"jeep");
        myCars.add(1,"lada");
        myCars.add(2,"yugo");

        System.out.println(myCars.toString());
        String allCarsIn1st = myCars.toString();
        System.out.println("allCarsIn1st = " + allCarsIn1st);
        myCars.set(0, "Lamborghini");
        System.out.println("after set = " + myCars.toString());

        // change index 4 to honda

        myCars.set(4, "honda");
        System.out.println("after set = " + myCars.toString());

        System.out.println("index of ford = " + myCars.indexOf("ford"));
        int ladaIndex = myCars.indexOf("lada");
        System.out.println("index of lada = " + myCars.indexOf("lada"));

        myCars.set(ladaIndex,"jiguli");
        System.out.println(myCars.toString());
        myCars.set(3,"ferrari");
        System.out.println("after replace = " + myCars.toString());

        if(myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"), "ferrari");
        }else{
            System.out.println("lada is not found ");
        }
        System.out.println("sfter set ferrari = " + myCars.toString());

        for(int i = 0; i < myCars.size(); i++){
            if(myCars.get(i).equals("ferrari")){
                // change to prius
                myCars.set(i,"prius");

            }else if(myCars.get(i).equals("moskvich")){
                myCars.set(i, "lexus");

            }else if(myCars.get(i).equals("jiguli")){
                myCars.set(i, "audi");
            }


        }
        System.out.println("after loop = " + myCars);


    }
}
