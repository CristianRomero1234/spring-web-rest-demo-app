package com.cristianromero.demo.controllers;

import com.cristianromero.demo.models.TestTable;
import com.cristianromero.demo.services.TestTableService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cromero
 */
@RestController
@RequestMapping("/api/testtable")
public class TestTableRESTController {
    
    @Autowired
    private TestTableService testTableService;
    
    @GetMapping
    public List<TestTable> getAllTestTables() {
        return testTableService.getAllTestTables();
    }

    @GetMapping("/{id}")
    public TestTable getTestTableById(@PathVariable Long id) {
        return testTableService.getTestTableById(id).orElseThrow();
    }

    @PostMapping
    public TestTable createTestTable(@RequestBody TestTable testTable) {
        return testTableService.saveTestTable(testTable);
    }

    @PutMapping("/{id}")
    public TestTable updateTestTable(@PathVariable Long id, @RequestBody TestTable TestTableDetails) {
        return testTableService.updateTestTable(id, TestTableDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteTestTable(@PathVariable Long id) {
        testTableService.deleteTestTable(id);
    }
}
    

