package org.example;

public class Main {
    public static void main(String[] args) {

        Employee employee = Employee.builder().build();
        EmployeeRepositoryImpl repository = new EmployeeRepositoryImpl(new SqlServerDatabaseImpl());
        repository.createEmployee(employee);

        repository = new EmployeeRepositoryImpl(new OracleDatabaseImpl());
        repository.createEmployee(employee);
    }
}