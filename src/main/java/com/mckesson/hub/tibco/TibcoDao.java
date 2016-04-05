package com.mckesson.hub.tibco;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Created by Zatko on 4/1/16.
 */
public class TibcoDao {

    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void getSomeDatabaseTable() {

        int rowCount = this.jdbcTemplate.queryForObject("select count(*) from pe_eq_engine", Integer.class);

        System.out.println("row count: " + rowCount);
    }
}
