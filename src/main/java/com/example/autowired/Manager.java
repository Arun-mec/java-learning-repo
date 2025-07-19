package com.example.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Manager {

    @Autowired
    private Employee employee;

    public Employee getEmployee() {
        return employee;
    }

//    @Autowired
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }

    //    @Autowired
//    public Manager(Employee employee) {
//        this.employee = employee;
//    }

    @Override
    public String toString() {
        return "Manager{" +
                "employee=" + employee +
                '}';
    }
}
