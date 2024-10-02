package com.cristianromero.demo.services;

import com.cristianromero.demo.datasources.repositories.TestTableRepository;
import com.cristianromero.demo.models.TestTable;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author cromero
 */
@Service
public class TestTableService {

    @Autowired
    private TestTableRepository testTableRepository;

    public List<TestTable> getAllTestTables() {
        return testTableRepository.findAll();
    }

    public Optional<TestTable> getTestTableById(Long id) {
        return testTableRepository.findById(id);
    }

    public TestTable saveTestTable(TestTable testTable) {
        return testTableRepository.save(testTable);
    }

    public void deleteTestTable(Long id) {
        testTableRepository.deleteById(id);
    }

    public TestTable updateTestTable(Long id, TestTable TestTableDetails) {
        TestTable testTable = testTableRepository.findById(id).orElseThrow();
        testTable.setName(TestTableDetails.getName());
        return testTableRepository.save(testTable);
    }

}
