package com.mycompany.app;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
   Map<Employee1.Gender, Long> countByGender  = Employee1.persons()
        .stream()
        .collect(Collectors.groupingBy(Employee1::getGender,Collectors.counting())); 
    System.out.println(countByGender);


  }
}

class Employee1 {
  public static enum Gender {
    MALE, FEMALE
  }

  private long id;
  private String name;
  private Gender gender;
  private LocalDate dob;
  private double income;

  public Employee1(long id, String name, Gender gender, LocalDate dob,
      double income) {
    this.id = id;
    this.name = name;
    this.gender = gender;
    this.dob = dob;
    this.income = income;
  }
  public Gender getGender() {
    return gender;
  }
  public String getName()
  {
      return name;
  }
  public static List<Employee1> persons() {
    Employee1 p1 = new Employee1(1, "Jake", Gender.MALE, LocalDate.of(1971,
        Month.JANUARY, 1), 2343.0);
    Employee1 p2 = new Employee1(2, "Jack", Gender.MALE, LocalDate.of(1972,
        Month.JULY, 21), 7100.0);
    Employee1 p3 = new Employee1(3, "Jane", Gender.FEMALE, LocalDate.of(1973,
        Month.MAY, 29), 5455.0);
    Employee1 p4 = new Employee1(4, "Jode", Gender.MALE, LocalDate.of(1974,
        Month.OCTOBER, 16), 1800.0);
    Employee1 p5 = new Employee1(5, "Jeny", Gender.FEMALE, LocalDate.of(1975,
        Month.DECEMBER, 13), 1234.0);
    Employee1 p6 = new Employee1(6, "Jason", Gender.MALE, LocalDate.of(1976,
        Month.JUNE, 9), 3211.0);

    List<Employee1> persons = Arrays.asList(p1, p2, p3, p4, p5, p6);

    return persons;
  }
}