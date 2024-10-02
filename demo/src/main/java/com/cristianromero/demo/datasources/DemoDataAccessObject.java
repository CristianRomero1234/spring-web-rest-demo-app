package com.cristianromero.demo.datasources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cromero
 */
@Repository(value = "com.cristianromero.demo.datasources.DemoDataAccessObject")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class DemoDataAccessObject {

    private static String SELECT_FIRST_NAME_IN_TABLE = "SELECT name FROM test_table WHERE id_test_table=1";

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    public String getFirstName() {
        List<String> namesFound
                = jdbcTemplate.queryForList(SELECT_FIRST_NAME_IN_TABLE,
                        new MapSqlParameterSource(),
                        String.class);
        return namesFound.get(0);
    }
}
