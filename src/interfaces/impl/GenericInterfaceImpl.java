package interfaces.impl;

import model.Employee;
import interfaces.GenericInterface;

public class GenericInterfaceImpl<T> implements GenericInterface<T> {


    @Override
    public void print(T employee) {
        System.out.println("Employee: " + employee.toString());

    }
}


