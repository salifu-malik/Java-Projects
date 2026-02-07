import java.sql.*;
import java.util.*;

public class DatabaseHelper {
    private final Connection conn;

    public DatabaseHelper(Connection conn) {
        this.conn = conn;
    }

    // FUNCTION TO INSERT
    public boolean insertData(String tableName, List<String> columns, List<Object> values) throws SQLException {
        String colString = String.join(", ", columns);
        String valPlaceholders = String.join(", ", Collections.nCopies(values.size(), "?"));
        String sql = "INSERT INTO " + tableName + " (" + colString + ") VALUES (" + valPlaceholders + ")";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            for (int i = 0; i < values.size(); i++) {
                stmt.setObject(i + 1, values.get(i));
            }
            return stmt.executeUpdate() > 0;
        }
    }

    // FUNCTION TO SELECT
    public List<Map<String, Object>> selectData(String tableName, String columns, Map<String, Object> conditions,
                                                String conditionType, Integer limit, String orderBy, String orderDir) throws SQLException {

        StringBuilder sql = new StringBuilder("SELECT " + columns + " FROM " + tableName);

        if (!conditions.isEmpty()) {
            sql.append(" WHERE ");
            List<String> clauses = new ArrayList<>();
            for (String key : conditions.keySet()) {
                clauses.add(key + " = ?");
            }
            sql.append(String.join(" " + conditionType + " ", clauses));
        }

        if (orderBy != null) sql.append(" ORDER BY ").append(orderBy).append(" ").append(orderDir);
        if (limit != null) sql.append(" LIMIT ").append(limit);

        try (PreparedStatement stmt = conn.prepareStatement(sql.toString())) {
            int i = 1;
            for (Object val : conditions.values()) {
                stmt.setObject(i++, val);
            }

            ResultSet rs = stmt.executeQuery();
            List<Map<String, Object>> result = new ArrayList<>();
            ResultSetMetaData meta = rs.getMetaData();
            int colCount = meta.getColumnCount();

            while (rs.next()) {
                Map<String, Object> row = new LinkedHashMap<>();
                for (int j = 1; j <= colCount; j++) {
                    row.put(meta.getColumnName(j), rs.getObject(j));
                }
                result.add(row);
            }
            return result;
        }
    }

    // FINAL TO UPDATE
    public boolean updateData(String tableName, Map<String, Object> updates, Map<String, Object> conditions) throws SQLException {
        StringBuilder sql = new StringBuilder("UPDATE " + tableName + " SET ");
        List<String> setClauses = new ArrayList<>();

        for (String col : updates.keySet()) {
            setClauses.add(col + " = ?");
        }

        sql.append(String.join(", ", setClauses));

        if (!conditions.isEmpty()) {
            sql.append(" WHERE ");
            List<String> conds = new ArrayList<>();
            for (String col : conditions.keySet()) {
                conds.add(col + " = ?");
            }
            sql.append(String.join(" AND ", conds));
        }

        try (PreparedStatement stmt = conn.prepareStatement(sql.toString())) {
            int i = 1;
            for (Object val : updates.values()) {
                stmt.setObject(i++, val);
            }
            for (Object val : conditions.values()) {
                stmt.setObject(i++, val);
            }
            return stmt.executeUpdate() > 0;
        }
    }

    //FUNCTION TO  DELETE
    public boolean deleteData(String tableName, Map<String, Object> conditions) throws SQLException {
        StringBuilder sql = new StringBuilder("DELETE FROM " + tableName);

        if (!conditions.isEmpty()) {
            sql.append(" WHERE ");
            List<String> conds = new ArrayList<>();
            for (String col : conditions.keySet()) {
                conds.add(col + " = ?");
            }
            sql.append(String.join(" AND ", conds));
        }

        try (PreparedStatement stmt = conn.prepareStatement(sql.toString())) {
            int i = 1;
            for (Object val : conditions.values()) {
                stmt.setObject(i++, val);
            }
            return stmt.executeUpdate() > 0;
        }
    }
}
