package jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import jdbc.exception.DataAccessException;

@FunctionalInterface
public interface ResultSetExtractor<T> {
    T extractData(ResultSet rs) throws SQLException, DataAccessException;
}
