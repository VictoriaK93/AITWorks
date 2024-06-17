package classwork_32.company.tests;

import classwork_31.model.Employee;
import classwork_31.model.Manager;
import classwork_31.model.SalesManager;
import classwork_32.company.dao.Company;
import classwork_32.company.dao.CompanyImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CompanyImplTest {
    Company company;
    Employee[] e;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        e = new Employee[4];
        e[0] = new Manager(101, "John", "Smith", 45, 160, 5000, 5);
        e[1] = new SalesManager( 102,"Anna", "Black", 36, 160,25000, 0.1 );
        e[2] = new SalesManager(103, "Thomas", "White",28,160,30000,0.1);

    }

    @Test
    void addEmployee() {
    }

    @Test
    void removeEmployee() {
    }

    @Test
    void findEmployee() {
    }

    @Test
    void quantity() {
    }

    @Test
    void totalSalary() {
    }

    @Test
    void avgSalary() {
    }

    @Test
    void totalSales() {
    }

    @Test
    void printEmployee() {
    }

    @Test
    void findEmployeeHoursGreaterThen() {
    }

    @Test
    void findEmployeeSalaryRange() {
    }
}
