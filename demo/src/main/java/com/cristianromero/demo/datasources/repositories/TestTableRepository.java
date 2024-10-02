package com.cristianromero.demo.datasources.repositories;

import com.cristianromero.demo.models.TestTable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author cromero
 */
public interface TestTableRepository  extends JpaRepository<TestTable, Long> {
    
}
