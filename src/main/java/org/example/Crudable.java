package org.example;

public interface Crudable {

    void createData(Object data);

    Object readData(String ID);

    void updateData(Object data);

    void deleteData(String ID);
}
