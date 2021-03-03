package METODS;
//import javaprojedeneme2.UrunListesi;
import StokForm.UrunListesi;
import StokForm.UrunListesiUpdate;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;
import StokForm.StokTakipForm;
import static StokForm.UrunListesi.tableDB;
import static StokForm.UrunListesiUpdate.tableDB2;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import Interfaces.IAraListele;
//FINAL tanımlama yapıldı
public final class UrunAraListele implements IAraListele {
    
    private String ID;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    private String AD;
    private String MARKA;
    private String KATEGORI;
    private String ACIKLAMA;
    private String BIRIM;
    private String ALIS_FIYATI;
    private String MIKTAR;
    private String SATIS_FIYATI;
    private String KAYIT_TARIHI;

    //GETS
    public String getAD() {
        return AD;
    }
    public String getMARKA() {
        return MARKA;
    }
    public String getKATEGORI() {
        return KATEGORI;
    }
    public String getACIKLAMA() {
        return ACIKLAMA;
    }
    public String getALIS_FIYATI() {
        return ALIS_FIYATI;
    }
    public String getBIRIM() {
        return BIRIM;
    }
    public String getMIKTAR() {
        return MIKTAR;
    }
    public String getSATIS_FIYATI() {
        return SATIS_FIYATI;
    }
    public String getKAYIT_TARIHI() {
        return KAYIT_TARIHI;
    }

    //SETS
    public void setAD(String AD) {
        this.AD = AD;
    }
    public void setMARKA(String MARKA) {
        this.MARKA = MARKA;
    }
    public void setKATEGORI(String KATEGORI) {
        this.KATEGORI = KATEGORI;
    }
    public void setACIKLAMA(String ACIKLAMA) {
        this.ACIKLAMA = ACIKLAMA;
    }
    public void setALIS_FIYATI(String ALIS_FIYATI) {
        this.ALIS_FIYATI = ALIS_FIYATI;
    }
    public void setBIRIM(String BIRIM) {
        this.BIRIM = BIRIM;
    }
    public void setMIKTAR(String MIKTAR) {
        this.MIKTAR = MIKTAR;
    }
    public void setSATIS_FIYATI(String SATIS_FIYATI) {
        this.SATIS_FIYATI = SATIS_FIYATI;
    }
    public void setKAYIT_TARIHI(String KAYIT_TARIHI) {
        this.KAYIT_TARIHI = KAYIT_TARIHI;
    }
    
    @Override
    public void UrunListele() {
        try {
            //Class.forName("net.unaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://stokDB.accdb");
            
            Statement st = con.createStatement();
            String sql = "SELECT *FROM URUNBILGILERI";
            ResultSet rs = st.executeQuery(sql);
            
            //Yeni pencere açar
            UrunListesi URUNLISTE = new UrunListesi();
            URUNLISTE.setVisible(true);
            URUNLISTE.pack();
            URUNLISTE.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(null,"Ürün Bulunamadı!");
            }
            else{
                while(rs.next()){
                    String U_ID=String.valueOf(rs.getInt("ID"));
                    String U_AD=rs.getString("AD");
                    String U_ACIKLAMA=rs.getString("ACIKLAMA");
                    String U_MARKA=rs.getString("MARKA");
                    String U_KATEGORI=rs.getString("KATEGORI");
                    String U_BIRIM=rs.getString("BIRIM");
                    String U_MIKTAR=String.valueOf(rs.getInt("MIKTAR"));
                    String U_ALIS=String.valueOf(rs.getInt("FIYAT_ALIS"));
                    String U_SATIS=String.valueOf(rs.getInt("FIYAT_SATIS"));
                    String U_TARIH=rs.getString("KAYIT_TARIHI");
                
                    String tbData[] = {U_ID,U_AD,U_ACIKLAMA,U_MARKA,U_KATEGORI,U_BIRIM,U_MIKTAR,U_ALIS,U_SATIS,U_TARIH};
                    
                    DefaultTableModel tblModel = (DefaultTableModel)URUNLISTE.tableDB.getModel();
                    tblModel.addRow(tbData);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StokTakipForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    @Override
    public void UrunListeleUpdate() {
        try {
            //Class.forName("net.unaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://stokDB.accdb");
            
            Statement st = con.createStatement();
            String sql = "SELECT *FROM URUNBILGILERI";
            ResultSet rs = st.executeQuery(sql);
            
            //Yeni pencere açar
            UrunListesiUpdate URUNLISTE = new UrunListesiUpdate();
            URUNLISTE.setVisible(true);
            URUNLISTE.pack();
            URUNLISTE.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(null,"Ürün Bulunamadı!");
            }
            else{
                while(rs.next()){
                    String U_ID=String.valueOf(rs.getInt("ID"));
                    String U_AD=rs.getString("AD");
                    String U_ACIKLAMA=rs.getString("ACIKLAMA");
                    String U_MARKA=rs.getString("MARKA");
                    String U_KATEGORI=rs.getString("KATEGORI");
                    String U_BIRIM=rs.getString("BIRIM");
                    String U_MIKTAR=String.valueOf(rs.getInt("MIKTAR"));
                    String U_ALIS=String.valueOf(rs.getInt("FIYAT_ALIS"));
                    String U_SATIS=String.valueOf(rs.getInt("FIYAT_SATIS"));
                    String U_TARIH=rs.getString("KAYIT_TARIHI");
                
                    String tbData[] = {U_ID,U_AD,U_ACIKLAMA,U_MARKA,U_KATEGORI,U_BIRIM,U_MIKTAR,U_ALIS,U_SATIS,U_TARIH};
                    
                    DefaultTableModel tblModel = (DefaultTableModel)URUNLISTE.tableDB2.getModel();
                    tblModel.addRow(tbData);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StokTakipForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    @Override
    public void UrunAra(int ID) {
        try {
            //Class.forName("net.unaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://stokDB.accdb");
            
            Statement st = con.createStatement();
            String sql = "SELECT *FROM URUNBILGILERI WHERE ID="+ID;
            ResultSet rs = st.executeQuery(sql);
            
            //Yeni pencere açar
            UrunListesi URUNLISTE = new UrunListesi();
            URUNLISTE.setVisible(true);
            URUNLISTE.pack();
            URUNLISTE.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(null,"Ürün Bulunamadı!");
            }
            else{
                while(rs.next()){
                    String U_ID=String.valueOf(rs.getInt("ID"));
                    String U_AD=rs.getString("AD");
                    String U_ACIKLAMA=rs.getString("ACIKLAMA");
                    String U_MARKA=rs.getString("MARKA");
                    String U_KATEGORI=rs.getString("KATEGORI");
                    String U_BIRIM=rs.getString("BIRIM");
                    String U_MIKTAR=String.valueOf(rs.getInt("MIKTAR"));
                    String U_ALIS=String.valueOf(rs.getInt("FIYAT_ALIS"));
                    String U_SATIS=String.valueOf(rs.getInt("FIYAT_SATIS"));
                    String U_TARIH=rs.getString("KAYIT_TARIHI");
                
                    String tbData[] = {U_ID,U_AD,U_ACIKLAMA,U_MARKA,U_KATEGORI,U_BIRIM,U_MIKTAR,U_ALIS,U_SATIS,U_TARIH};
                    
                    DefaultTableModel tblModel = (DefaultTableModel)URUNLISTE.tableDB.getModel();
                    tblModel.addRow(tbData);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StokTakipForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    public void UrunGuncellemeAra(int ID){
        try {
            //Class.forName("net.unaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://stokDB.accdb");
            
            Statement st = con.createStatement();
            String sql = "SELECT *FROM URUNBILGILERI WHERE ID="+ID;
            ResultSet rs = st.executeQuery(sql);
            
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(null,"Ürün Bulunamadı!");
            }
            else{
                while(rs.next()){
                    AD=rs.getString("AD");
                    ACIKLAMA=rs.getString("ACIKLAMA");
                    MARKA=rs.getString("MARKA");
                    KATEGORI=rs.getString("KATEGORI");
                    BIRIM=rs.getString("BIRIM");
                    MIKTAR=String.valueOf(rs.getInt("MIKTAR"));
                    ALIS_FIYATI=String.valueOf(rs.getInt("FIYAT_ALIS"));
                    SATIS_FIYATI=String.valueOf(rs.getInt("FIYAT_SATIS"));
                    KAYIT_TARIHI=rs.getString("KAYIT_TARIHI");
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(StokTakipForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
        
    }
    @Override
    public void UrunAra(String AD) {
        try {
            //Class.forName("net.unaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://stokDB.accdb");
            
            Statement st = con.createStatement();
            //Sql de string ifadeler kısıtlama olarak kullanılırsa tırnak işareti içerisinde olmalıdır!
            String sql = "SELECT *FROM URUNBILGILERI WHERE AD='" + AD +"'";
            ResultSet rs = st.executeQuery(sql);
            
            //Yeni pencere oluşturur
            UrunListesi URUNLISTE = new UrunListesi();
            URUNLISTE.setVisible(true);
            URUNLISTE.pack();
            URUNLISTE.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(null,"Ürün Bulunamadı!");
            }
            else{
                while(rs.next()){
                    String U_ID=String.valueOf(rs.getInt("ID"));
                    String U_AD=rs.getString("AD");
                    String U_ACIKLAMA=rs.getString("ACIKLAMA");
                    String U_MARKA=rs.getString("MARKA");
                    String U_KATEGORI=rs.getString("KATEGORI");
                    String U_BIRIM=rs.getString("BIRIM");
                    String U_MIKTAR=String.valueOf(rs.getInt("MIKTAR"));
                    String U_ALIS=String.valueOf(rs.getInt("FIYAT_ALIS"));
                    String U_SATIS=String.valueOf(rs.getInt("FIYAT_SATIS"));
                    String U_TARIH=rs.getString("KAYIT_TARIHI");
                
                    String tbData[] = {U_ID,U_AD,U_ACIKLAMA,U_MARKA,U_KATEGORI,U_BIRIM,U_MIKTAR,U_ALIS,U_SATIS,U_TARIH};
                    
                    DefaultTableModel tblModel = (DefaultTableModel)URUNLISTE.tableDB.getModel();
                    tblModel.addRow(tbData);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StokTakipForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }

    @Override
    public void UrunAra(String KATEGORI, String tmpKATEGORI) {
        try {
            //Class.forName("net.unaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://stokDB.accdb");
            
            Statement st = con.createStatement();
            //Sql de string ifadeler kısıtlama olarak kullanılırsa tırnak işareti içerisinde olmalıdır!
            String sql = "SELECT *FROM URUNBILGILERI WHERE KATEGORI='" + KATEGORI +"'";
            ResultSet rs = st.executeQuery(sql);
            
            //Yeni pencere açar
            UrunListesi URUNLISTE = new UrunListesi();
            URUNLISTE.setVisible(true);
            URUNLISTE.pack();
            URUNLISTE.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(null,"Ürün Bulunamadı!","HATA !",1);
            }
            else{
                while(rs.next()){
                    String U_ID=String.valueOf(rs.getInt("ID"));
                    String U_AD=rs.getString("AD");
                    String U_ACIKLAMA=rs.getString("ACIKLAMA");
                    String U_MARKA=rs.getString("MARKA");
                    String U_KATEGORI=rs.getString("KATEGORI");
                    String U_BIRIM=rs.getString("BIRIM");
                    String U_MIKTAR=String.valueOf(rs.getInt("MIKTAR"));
                    String U_ALIS=String.valueOf(rs.getInt("FIYAT_ALIS"));
                    String U_SATIS=String.valueOf(rs.getInt("FIYAT_SATIS"));
                    String U_TARIH=rs.getString("KAYIT_TARIHI");
                
                    String tbData[] = {U_ID,U_AD,U_ACIKLAMA,U_MARKA,U_KATEGORI,U_BIRIM,U_MIKTAR,U_ALIS,U_SATIS,U_TARIH};
                
                    DefaultTableModel tblModel = (DefaultTableModel)URUNLISTE.tableDB.getModel();
                    tblModel.addRow(tbData);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StokTakipForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }

    @Override
    public void UrunAra(String MARKA, int tmpMARKA) {
        try {
            //Class.forName("net.unaccess.jdbc.UcanaccessDriver");
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://stokDB.accdb");
            
            Statement st = con.createStatement();
            //Sql de string ifadeler kısıtlama olarak kullanılırsa tırnak işareti içerisinde olmalıdır!
            String sql = "SELECT *FROM URUNBILGILERI WHERE MARKA='" + MARKA +"'";
            ResultSet rs = st.executeQuery(sql);
            
            //Yeni pencere açar
            UrunListesi URUNLISTE = new UrunListesi();
            URUNLISTE.setVisible(true);
            URUNLISTE.pack();
            URUNLISTE.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(null,"Ürün Bulunamadı!","HATA !",1);
            }
            else{
                while(rs.next()){
                    String U_ID=String.valueOf(rs.getInt("ID"));
                    String U_AD=rs.getString("AD");
                    String U_ACIKLAMA=rs.getString("ACIKLAMA");
                    String U_MARKA=rs.getString("MARKA");
                    String U_KATEGORI=rs.getString("KATEGORI");
                    String U_BIRIM=rs.getString("BIRIM");
                    String U_MIKTAR=String.valueOf(rs.getInt("MIKTAR"));
                    String U_ALIS=String.valueOf(rs.getInt("FIYAT_ALIS"));
                    String U_SATIS=String.valueOf(rs.getInt("FIYAT_SATIS"));
                    String U_TARIH=rs.getString("KAYIT_TARIHI");
                
                    String tbData[] = {U_ID,U_AD,U_ACIKLAMA,U_MARKA,U_KATEGORI,U_BIRIM,U_MIKTAR,U_ALIS,U_SATIS,U_TARIH};
                          
                    DefaultTableModel tblModel = (DefaultTableModel)URUNLISTE.tableDB.getModel();
                    tblModel.addRow(tbData);
                }
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(StokTakipForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    //STATIC ILE NESNE OLUSTURMAYA GEREK KALMADI
    public static void tabloSutunAyarla(){
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tableDB.setRowHeight(30);
        tableDB.getColumnModel().getColumn(0).setPreferredWidth(70);
        tableDB.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableDB.getColumnModel().getColumn(2).setPreferredWidth(250);
        tableDB.getColumnModel().getColumn(3).setPreferredWidth(100);
        tableDB.getColumnModel().getColumn(4).setPreferredWidth(150);
        tableDB.getColumnModel().getColumn(5).setPreferredWidth(60);
        tableDB.getColumnModel().getColumn(6).setPreferredWidth(60);
        tableDB.getColumnModel().getColumn(7).setPreferredWidth(100);
        tableDB.getColumnModel().getColumn(8).setPreferredWidth(100);
        tableDB.getColumnModel().getColumn(9).setPreferredWidth(100);
        
        tableDB2.setRowHeight(30);
        tableDB2.getColumnModel().getColumn(0).setPreferredWidth(70);
        tableDB2.getColumnModel().getColumn(1).setPreferredWidth(200);
        tableDB2.getColumnModel().getColumn(2).setPreferredWidth(250);
        tableDB2.getColumnModel().getColumn(3).setPreferredWidth(100);
        tableDB2.getColumnModel().getColumn(4).setPreferredWidth(150);
        tableDB2.getColumnModel().getColumn(5).setPreferredWidth(60);
        tableDB2.getColumnModel().getColumn(6).setPreferredWidth(60);
        tableDB2.getColumnModel().getColumn(7).setPreferredWidth(100);
        tableDB2.getColumnModel().getColumn(8).setPreferredWidth(100);
        tableDB2.getColumnModel().getColumn(9).setPreferredWidth(100);
        for(int i=0;i<10;i++){
            tableDB.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
            tableDB2.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }   
    }
    
}
