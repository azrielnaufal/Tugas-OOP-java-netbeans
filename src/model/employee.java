package tubes;

import connect.connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class employee {
    String id_pegawai;
    String password;
    String nama_pegawai;

//    public employee(String id_pegawai, String password, String nama_pegawai) throws SQLException {
//        Statement statement =(Statement)connect.GetConnection().createStatement();
//        statement.executeUpdate("INSERT INTO pegawai VALUES " + "('" + id_pegawai + "','" + password + "','" + nama_pegawai + "')");
//    }
    public String getId_pegawai() {
        return id_pegawai;
    }
    public void setId_pegawai(String id_pegawai) {
        this.id_pegawai = id_pegawai;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getNama_pegawai() {
        return nama_pegawai;
    }
    public void setNama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }
    public void daftarAkun (String id, String password, String nama) throws SQLException{
        Statement statement =(Statement)connect.GetConnection().createStatement();
        statement.executeUpdate("INSERT INTO pegawai VALUES " + "('" + id + "','" + password + "','" + nama + "')");       
    }
    public String checkAkun (String id, String password) throws SQLException{
        String text;
        Statement statement =(Statement)connect.GetConnection().createStatement();
        ResultSet result = statement.executeQuery("select * from pegawai where " + "id_pegawai ='" + id + "'");
            if (result.next()){
                if (password.equals(result.getString("password"))){
                    text = "berhasil";
                }else{
                    text = "password salah";
                }
            }else{
                text = "user tidak ditemukan";
            }
        return text;
    }
    public String getNama_pegawai_db (String id) throws SQLException{
        Statement statement =(Statement)connect.GetConnection().createStatement();
        ResultSet result = statement.executeQuery("select * from pegawai where " + "id_pegawai ='" + id + "'"); 
        return result.getString("nama_pegawai");
    }

}
