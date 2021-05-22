package day_43_list_custom_classes;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Employee {
    // instance/ object variables
    String name;
    String jobTitle;

    // instance/method
    public void work(){
        System.out.println(name + " works as " + jobTitle);
    }
}
