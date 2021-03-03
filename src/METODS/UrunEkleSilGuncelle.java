package METODS;
import java.sql.*;
import java.time.*;
import java.util.logging.*;
import StokForm.StokTakipForm;
import static StokForm.UrunListesi.tableDB;
import javax.swing.*;
import Interfaces.IGuncelle;

//FINAL tanımlama yapıldı
public final class UrunEkleSilGuncelle implements IGuncelle{
    
    //CONSTRUCTER
    public UrunEkleSilGuncelle() {
        
    }
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
    private int ALIS_FIYATI;
    private int MIKTAR;
    private int SATIS_FIYATI;
    private LocalDateTime KAYIT_TARIHI;

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
    public int getALIS_FIYATI() {
        return ALIS_FIYATI;
    }
    public String getBIRIM() {
        return BIRIM;
    }
    public int getMIKTAR() {
        return MIKTAR;
    }
    public int getSATIS_FIYATI() {
        return SATIS_FIYATI;
    }
    public LocalDateTime getKAYIT_TARIHI() {
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
    public void setALIS_FIYATI(int ALIS_FIYATI) {
        this.ALIS_FIYATI = ALIS_FIYATI;
    }
    public void setBIRIM(String BIRIM) {
        this.BIRIM = BIRIM;
    }
    public void setMIKTAR(int MIKTAR) {
        this.MIKTAR = MIKTAR;
    }
    public void setSATIS_FIYATI(int SATIS_FIYATI) {
        this.SATIS_FIYATI = SATIS_FIYATI;
    }
    public void setKAYIT_TARIHI(LocalDateTime KAYIT_TARIHI) {
        this.KAYIT_TARIHI = KAYIT_TARIHI;
    }
    
    //URUN GUNCELLEME METODU
    @Override
    public void UrunGuncelle(String URUN_ID){
        Connection con;
        PreparedStatement pst;
        try {
            //Class.forName("net.unaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://stokDB.accdb");
            
            pst = con.prepareStatement("UPDATE URUNBILGILERI "
                    + "SET AD='"+AD+"', ACIKLAMA='"+ACIKLAMA+"', MARKA='"+MARKA+"', KATEGORI='"+KATEGORI+"', "
                            + "BIRIM='"+BIRIM+"', MIKTAR="+MIKTAR+", FIYAT_ALIS="+ALIS_FIYATI+", FIYAT_SATIS="+SATIS_FIYATI+" "
                                    + "WHERE ID="+Integer.parseInt(URUN_ID));
            
            /*
            pst.setString(1, AD);
            pst.setString(2, ACIKLAMA);
            pst.setString(3, MARKA);
            pst.setString(4, KATEGORI);
            pst.setString(5, BIRIM);
            pst.setInt(6, MIKTAR);
            pst.setInt(7, ALIS_FIYATI);
            pst.setInt(8, SATIS_FIYATI);
            */
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Ürün Güncellendi!","BAŞARILI !",1);
            
        } catch (SQLException ex) {
            Logger.getLogger(StokTakipForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }

   //URUN EKLEME METODU
    public void UrunEkle(){
        Connection con;
        PreparedStatement pst;
        try {
            //Class.forName("net.unaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://stokDB.accdb");
            
            pst = con.prepareStatement("insert into "
                    + "URUNBILGILERI(AD,ACIKLAMA,MARKA,KATEGORI,BIRIM,MIKTAR,FIYAT_ALIS,FIYAT_SATIS)"
                    + "values(?,?,?,?,?,?,?,?)");
            
            pst.setString(1, AD);
            pst.setString(2, ACIKLAMA);
            pst.setString(3, MARKA);
            pst.setString(4, KATEGORI);
            pst.setString(5, BIRIM);
            pst.setInt(6, MIKTAR);
            pst.setInt(7, ALIS_FIYATI);
            pst.setInt(8, SATIS_FIYATI);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Ürün Eklendi!","BAŞARILI !",1);
            
        } catch (SQLException ex) {
            Logger.getLogger(StokTakipForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    public void UrunSil(int ID){
        Connection con;
        PreparedStatement pst;
        
        try {
            //Class.forName("net.unaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://stokDB.accdb");
            
            Statement st = con.createStatement();
            String sql = "SELECT *FROM URUNBILGILERI WHERE ID="+ID;
            ResultSet rs = st.executeQuery(sql);
            
            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(null,"Silinecek ürün bulunamadı!","HATA !",1);
            }
            else{
                pst = con.prepareStatement("DELETE FROM URUNBILGILERI WHERE ID="+ID);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Ürün Başarıyla Silindi!","BAŞARILI !",1);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StokTakipForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
}
