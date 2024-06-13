package tugas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBKoneksi {
    private static final String URL = "jdbc:sqlite:data9.db";
    private static Connection instance;

    private DBKoneksi() {
        // Private constructor to prevent instantiation
    }

    public static Connection connect() throws SQLException {
        if (instance == null || instance.isClosed()) {
            try {
                instance = DriverManager.getConnection(URL);
                // System.out.println("Koneksi ke SQLite berhasil.");
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
        return instance;
    }
}