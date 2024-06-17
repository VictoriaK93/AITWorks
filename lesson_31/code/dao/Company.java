package dao;

import classwork_31.model.Employee;

public interface Company {

    // define abstract methods
    boolean addEmployee(Employee employee);
    Employee removeEmployee(int id);
    Employee findEmployee(int id);
    int quantity();  // quantity of employees
    double totalSalary();
    double avgSalary();
    double totalSales();
    void printEmployee();

    // список сотрудников
    Employee [] findEmployeeHoursGreaterThen(int hours);

    // список сотрудников с зарплатой от...до...
    Employee[] findEmployeeSalaryRange(double min, double max);

}
