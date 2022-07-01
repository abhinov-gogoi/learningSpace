package com.in28minutes.hibernate;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.Gson;
import org.h2.util.json.JSONObject;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class JDBC {
    static final String DB_URL = "jdbc:mysql://remotemysql.com/03ZeLcEdG3";
    static final String USER = "03ZeLcEdG3";
    static final String PASS = "TGuPoOIlq9";
    static final String QUERY = "SELECT * FROM flight";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(QUERY);) {
            // Extract data from result set
            List<Map<String, Object>> result = resultSetToArrayList(rs);

            // convert to json
            Gson gson = new Gson();
            String json = gson.toJson(result);
            System.out.println(json);
        } catch ( SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Map<String, Object>> resultSetToArrayList(ResultSet rs) throws SQLException{
        ResultSetMetaData md = rs.getMetaData();
        int columns = md.getColumnCount();
        List<Map<String, Object>> list = new ArrayList<>();
        while (rs.next()){
            Map<String, Object> row = new HashMap<>(columns);
            for(int i=1; i<=columns; ++i){
                row.put(md.getColumnName(i),rs.getObject(i));
            }
            list.add(row);
        }
        return list;
    }
}
