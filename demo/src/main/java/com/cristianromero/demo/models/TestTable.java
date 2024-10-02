package com.cristianromero.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author cromero
 */
@Entity
public class TestTable {

    /*
    idTestTable INT PRIMARY KEY,
    name VARCHAR(100)

     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTestTable;

    private String name;

    public TestTable() {
    }

    public TestTable(Long idTestTable, String name) {
        this.idTestTable = idTestTable;
        this.name = name;
    }

    public Long getIdTestTable() {
        return idTestTable;
    }

    public void setIdTestTable(Long idTestTable) {
        this.idTestTable = idTestTable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
