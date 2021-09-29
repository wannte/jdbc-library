package jdbc.utils;

import java.util.Collection;
import jdbc.exception.EmptyResultDataAccessException;
import jdbc.exception.IncorrectResultSizeDataAccessException;

public class DataAccessUtils {
    private DataAccessUtils() {
    }

    public static <T> T nullableSingleResult(Collection<T> results) throws IncorrectResultSizeDataAccessException {
        if (results.isEmpty()) {
            throw new EmptyResultDataAccessException(1);
        }

        if (results.size() > 1) {
            throw new IncorrectResultSizeDataAccessException(1, results.size());
        }
        return results.iterator().next();
    }
}
