package org.example;

public class EmployeeRepositoryImpl {
    private Crudable databaseImpl;

    public EmployeeRepositoryImpl(Crudable database){
        this.databaseImpl = database;
    }

    public void createEmployee(Employee employee){
        databaseImpl.createData(employee);
    }

    public Employee readEmployee(String ID){
        Object retrieved = databaseImpl.readData(ID);
        if(retrieved instanceof Employee employee){
            return employee;
        }
        return null;
    }

    public void updateEmployee(Employee employee){
        databaseImpl.updateData(employee);
    }

    public void deleteEmployee(String ID){
        Employee employee = this.readEmployee(ID);
        if(employee != null){
            databaseImpl.deleteData(ID);
        }
    }
}
