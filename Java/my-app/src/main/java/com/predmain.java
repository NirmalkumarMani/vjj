package com.mycompany.app;
import java.io.*;
import java.util.*;
 class Predmain {
    public static void main(String args[]) {
        Employee e = new Employee(23, "dd", 22, "F");
        Employee e1 = new Employee(34, "dfhj", 28, "M");
        Employee e2 = new Employee(3, "ddfg", 20, "F");
        List<Employee> li = new ArrayList<Employee>();
        li.addAll(Arrays.asList(new Employee[] { e, e1, e2 }));
        Predicateinf fi = new Predicateinf();
        System.out.println(fi.fop(li, fi.isAdultMale()));
        System.out.println(fi.fop(li, fi.isAdultFemale()));
        System.out.println(fi.fop(li, fi.isAdultAge()));

    }
}