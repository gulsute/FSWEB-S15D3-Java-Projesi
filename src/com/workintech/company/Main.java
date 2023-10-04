package com.workintech.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "dogancan", "kinik"));
        employees.add(new Employee(1, "dogancan", "kinik"));
        employees.add(new Employee(2, "seyyit", "arvas"));
        employees.add(new Employee(2, "seyyit", "arvas"));
        employees.add(new Employee(3, "anil", "ensari"));
        employees.add(new Employee(3, "anil", "ensari"));
        employees.add(new Employee(4, "gulsu", "tuncay"));

        Map<Integer, Employee> employeeMap = new HashMap<>();
        List<Employee> removedEmp = new ArrayList<>();

        Iterator iterator=employees.iterator();
        while (iterator.hasNext()){
            Employee employee=(Employee)iterator.next();
            if (employee==null){
                System.out.println("Null data mevcut");
            }
            if(employeeMap.containsKey(employee.getId())){
                iterator.remove();
                removedEmp.add(employee);
            } else {
                employeeMap.put(employee.getId(), employee);
            }
        }

        System.out.println(employees);
        System.out.println(employeeMap);
        System.out.println(removedEmp);
    }
}