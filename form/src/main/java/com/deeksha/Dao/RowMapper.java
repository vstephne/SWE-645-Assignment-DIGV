package com.deeksha.Dao;

import org.springframework.jdbc.core.ResultSetExtractor;

public interface RowMapper<T> extends ResultSetExtractor<T> {

}
