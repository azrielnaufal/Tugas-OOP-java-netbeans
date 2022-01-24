package controller;

import model.employee;
import view.loginEmployeeJframe;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginEmployee_controller {
    private loginEmployeeJframe theView;
    private employee theModel;
    
    public loginEmployee_controller(loginEmployeeJframe view, employee model){
        this.theView = view;
        this.theModel = model;
        
        this.theView.addLoginListener(new loginListener());
        this.theView.addDaftarListener(new signUpListener());
    }
    
    class loginListener implements ActionListener{
        public void actionPerformed(ActionEvent arg0){
            //check user dan password sesuai
        }
    }
    
    class signUpListener implements ActionListener{
        public void actionPerformed(ActionEvent arg0){
            //daftar
            try{
                String id = theView.getSignUp_idPegawai();
                String pass = theView.getSignUp_password();
                String nama = theView.getSignUp_nama();
                
                theModel.daftarAkun(id, pass, nama);
                theView.displayMessage("pegawai berhasil registrasi");
                theView.resetSignUp_field();
            }catch (Exception e){
                theView.displayMessage("gagal memasukkan data ke database");
            }   
        }
    }
}
