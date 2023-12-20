/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.sql.*;

/**
 *
 * @author naufa
 */
public class DBConn {
    
    static final String INSERT_USER_QUERY = "INSERT INTO users (email, username, password) VALUES (";
    static final String INSERT_ASESMEN_QUERY = "INSERT INTO tabelasesmen (emailPengguna, jenisAsesmen, hasilAsesmen, umur, tinggi, berat, sis, dia, tanggal) VALUES (";
    static final String INSERT_KONSULTASI_QUERY = "INSERT INTO tabelkonsultasi (emailPengguna, pesan, balasan, tanggal) VALUES (";
    static final String SELECT_USER_QUERY = "SELECT * FROM users WHERE email=";
    static final String SELECT_ASESMEN_QUERY = "SELECT * FROM tabelasesmen WHERE emailPengguna=";
    static final String SELECT_KONSULTASI_QUERY = "SELECT * FROM tabelkonsultasi WHERE emailPengguna=";
    
    static final String DB_URL = "jdbc:mysql://localhost:3306/hemon";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public void insertUserToDB(User user) {
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            stmt.executeUpdate(INSERT_USER_QUERY + "'" + user.getEmail() + "', '" + user.getUsername() + "', '" + user.getPassword() + "')");

            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    
    }
    
    public void insertAsesmenToDB(Asesmen asesmen) {
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            stmt.executeUpdate(INSERT_ASESMEN_QUERY + "'" + asesmen.getPengguna().getEmail() + "', '" + asesmen.getJenisAsesmen() + "', '" + asesmen.getHasilDiagnosis() 
                    + "', '" + asesmen.getUsia() + "', '" + asesmen.getTinggiBadan() + "', '" + asesmen.getBeratBadan() + "', '" + asesmen.getTekananDarahSis()
                    + "', '" + asesmen.getTekananDarahDia() + "', '" + asesmen.getTanggal() + "')");

            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    
    public void insertKonsultasiToDB(Konsultasi konsultasi) {
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            stmt.executeUpdate(INSERT_KONSULTASI_QUERY + "'" + konsultasi.getPengirim().getEmail() + "', '" + konsultasi.getPesan() + "', '" + konsultasi.getBalasan()
                    + "', '" + konsultasi.getTanggal() + "')");

            conn.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        
    }
    public ResultSet queryAllAsesmenFromDB(User user) {
        
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SELECT_ASESMEN_QUERY + "'" + user.getEmail() + "'");
            
//            conn.close();
            return rs;
            
            
        } catch (SQLException e){
            e.printStackTrace();
        } 
        
        return null;
    }
    
    public ResultSet queryAllKonsultasiFromDB(User user) {
        
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery(SELECT_KONSULTASI_QUERY + "'" + user.getEmail() + "'");
            
            
            
//            conn.close();
            return rs;
            
            
        } catch (SQLException e){
            e.printStackTrace();
        } 
        
        return null;
    }
    
    public ResultSet queryUserFromDB(User user) {
        
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(SELECT_USER_QUERY + "'" + user.getEmail() + "'" + "AND password='" + user.getPassword() + "'");
            
//            conn.close();
            return rs;
            
            
        } catch (SQLException e){
            e.printStackTrace();
        } 
        
        return null;
    }
    
}
