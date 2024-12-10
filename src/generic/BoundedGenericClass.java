package generic;

import model.Employee;

public class BoundedGenericClass<T extends Employee> {
    private T employee;

    public BoundedGenericClass(T employee) {
        this.employee = employee;
    }

    public T getEmployee() {
        return employee;
    }

    public void setEmployee(T employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "employee=" + employee +
                '}';
    }

    public String displayEmployeeDetails() {
        return employee.toString();
    }

}
