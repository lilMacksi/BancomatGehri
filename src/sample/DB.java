package sample;

import sample.DTO.AccountDTO;

import java.sql.*;

public class DB {

    private static Connection connection = null;

    public DB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            if (DB.connection == null) {
                DB.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cashmachine?serverTimezone=UTC", "root", "sql123");
                System.out.println("Connected to DB");
            }
        } catch (ClassNotFoundException | SQLException err) {
            System.out.println("Could not establish database connection");
            err.printStackTrace();
            System.exit(0);
        }
    }

    public int getCorrespondingBillsAmount(String value) {
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT value FROM cashmachine;";
            ResultSet rs = statement.executeQuery(query);
            int amount = 0;
            while (rs.next()) {
                amount = rs.getInt(value);
            }
            return amount;
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(0);
            return 0;
        }
    }


    public AccountDTO getAccountById(int id) {
        AccountDTO dto = new AccountDTO();
        try {
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM account WHERE = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                dto.setName(rs.getString("name"));
                dto.setFirstName(rs.getString("firstName"));
                dto.setAccountName(rs.getString("accountName"));
                dto.setIBAN(rs.getString("iban"));
                dto.setBankName(rs.getString("bankName"));
                dto.setCardNumber(rs.getInt("cardNumber"));
                dto.setValidUntil(rs.getString("validUntil"));
                dto.setPIN(rs.getInt("pin"));
                dto.setCardLimit(rs.getInt("cardLimit"));
                dto.setLocked(rs.getBoolean("isLocked"));
                dto.setAccountBalance(rs.getInt("accountBalance"));
            }
            return dto;
        } catch (SQLException e) {
            e.printStackTrace();
            System.exit(0);
            return new AccountDTO();
        }
    }
}
