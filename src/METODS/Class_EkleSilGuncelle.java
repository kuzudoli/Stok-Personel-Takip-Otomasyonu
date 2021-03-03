package METODS;
import ConnectionZ.Connectionz;
import Interfaces.Interface3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Class_EkleSilGuncelle implements Interface3{


    private String PID;
    private String PAD;
    private String PSOYAD;
    private String PTCKNO;
    private String PDOGUMTARIHI;
    private String PDOGUMYERI;
    private String PCINSIYET;
    private String PMEDENIHAL;
    private String PEHLIYET;
    private String PEVNO;
    private String PCEPNO;
    private String PEPOSTA;
    private String PSEHIR;
    private String PILCE;
    private String PACIKADRES;
    private String PDEPARTMAN;
    private String PPOZISYON;
    private String PMAAS;
    private String PGIRISTARIHI;
    private String PCIKISTARIHI;
    private String PIZINGUNU;
    
    //get ve set metodları

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        this.PID = PID;
    }

    public String getPAD() {
        return PAD;
    }

    public void setPAD(String PAD) {
        this.PAD = PAD;
    }

    public String getPSOYAD() {
        return PSOYAD;
    }

    public void setPSOYAD(String PSOYAD) {
        this.PSOYAD = PSOYAD;
    }

    public String getPTCKNO() {
        return PTCKNO;
    }

    public void setPTCKNO(String PTCKNO) {
        this.PTCKNO = PTCKNO;
    }

    public String getPDOGUMTARIHI() {
        return PDOGUMTARIHI;
    }

    public void setPDOGUMTARIHI(String PDOGUMTARIHI) {
        this.PDOGUMTARIHI = PDOGUMTARIHI;
    }

    public String getPDOGUMYERI() {
        return PDOGUMYERI;
    }

    public void setPDOGUMYERI(String PDOGUMYERI) {
        this.PDOGUMYERI = PDOGUMYERI;
    }

    public String getPCINSIYET() {
        return PCINSIYET;
    }

    public void setPCINSIYET(String PCINSIYET) {
        this.PCINSIYET = PCINSIYET;
    }

    public String getPMEDENIHAL() {
        return PMEDENIHAL;
    }

    public void setPMEDENIHAL(String PMEDENIHAL) {
        this.PMEDENIHAL = PMEDENIHAL;
    }

    public String getPEHLIYET() {
        return PEHLIYET;
    }

    public void setPEHLIYET(String PEHLIYET) {
        this.PEHLIYET = PEHLIYET;
    }

    public String getPEVNO() {
        return PEVNO;
    }

    public void setPEVNO(String PEVNO) {
        this.PEVNO = PEVNO;
    }

    public String getPCEPNO() {
        return PCEPNO;
    }

    public void setPCEPNO(String PCEPNO) {
        this.PCEPNO = PCEPNO;
    }

    public String getPEPOSTA() {
        return PEPOSTA;
    }

    public void setPEPOSTA(String PEPOSTA) {
        this.PEPOSTA = PEPOSTA;
    }

    public String getPSEHIR() {
        return PSEHIR;
    }

    public void setPSEHIR(String PSEHIR) {
        this.PSEHIR = PSEHIR;
    }

    public String getPILCE() {
        return PILCE;
    }

    public void setPILCE(String PILCE) {
        this.PILCE = PILCE;
    }

    public String getPACIKADRES() {
        return PACIKADRES;
    }

    public void setPACIKADRES(String PACIKADRES) {
        this.PACIKADRES = PACIKADRES;
    }

    public String getPDEPARTMAN() {
        return PDEPARTMAN;
    }

    public void setPDEPARTMAN(String PDEPARTMAN) {
        this.PDEPARTMAN = PDEPARTMAN;
    }

    public String getPPOZISYON() {
        return PPOZISYON;
    }

    public void setPPOZISYON(String PPOZISYON) {
        this.PPOZISYON = PPOZISYON;
    }

    public String getPMAAS() {
        return PMAAS;
    }

    public void setPMAAS(String PMAAS) {
        this.PMAAS = PMAAS;
    }

    public String getPGIRISTARIHI() {
        return PGIRISTARIHI;
    }

    public void setPGIRISTARIHI(String PGIRISTARIHI) {
        this.PGIRISTARIHI = PGIRISTARIHI;
    }

    public String getPCIKISTARIHI() {
        return PCIKISTARIHI;
    }

    public void setPCIKISTARIHI(String PCIKISTARIHI) {
        this.PCIKISTARIHI = PCIKISTARIHI;
    }

    public String getPIZINGUNU() {
        return PIZINGUNU;
    }

    public void setPIZINGUNU(String PIZINGUNU) {
        this.PIZINGUNU = PIZINGUNU;
    }
    
        String updateID;

    public String getUpdateID() {
        return updateID;
    }

    public void setUpdateID(String updateID) {
        this.updateID = updateID;
    }
        

    @Override
    public void Personel_Guncelle() {
                    Connection con;
            try{
                con = Connectionz.getConnection();
                String sql = "update tbl_personel set PAD=?,PSOYAD=?,PTCKNO=?,PDOGUMTARIHI=?,PDOGUMYERI=?,PCINSIYET=?,PMEDENIHAL=?,PEHLIYET=?,PEVTEL=?,PCEPTEL=?,PEPOSTA=?,"
                        + "PSEHIR=?,PILCE=?,PACIKADRES=?,PDEPARTMAN=?,PPOZISYON=?,PMAAS=?,PGIRISTARIHI=?,PCIKISTARIHI=?,PIZINGUNU=? where PID=?";
                System.out.println(updateID);
                PreparedStatement pst = con.prepareStatement(sql);
                
                
                pst.setString(1,PAD);
                pst.setString(2,PSOYAD);
                pst.setString(3,PTCKNO);
                pst.setString(4,PDOGUMTARIHI);
                pst.setString(5,PDOGUMYERI);
                pst.setString(6,PCINSIYET);
                pst.setString(7,PMEDENIHAL);
                pst.setString(8,PEHLIYET);
                pst.setString(9,PEVNO);
                pst.setString(10,PCEPNO);
                pst.setString(11,PEPOSTA);
                pst.setString(12,PSEHIR);
                pst.setString(13,PILCE);
                pst.setString(14,PACIKADRES);
                pst.setString(15,PDEPARTMAN);
                pst.setString(16,PPOZISYON);
                pst.setString(17,PMAAS);
                pst.setString(18,PGIRISTARIHI);
                pst.setString(19,PCIKISTARIHI);
                pst.setString(20,PIZINGUNU);
                pst.setString(21,updateID);
                
                int ok = JOptionPane.showConfirmDialog(null,"Personel Bilgilerini Güncellemek İstediğinizden Emin Misiniz ?","Güncelleme Onay",JOptionPane.YES_NO_OPTION);
                    if(ok==0){
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Personel Bilgileri Güncellendi !","Başarılı !",1);
                    }
                
                pst.executeUpdate();
                
            }
            catch(Exception ex){
                System.out.println(""+ex);
            }
    }

    @Override
    public void Personel_Ekle() {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
           try {
           // Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://Personeller_DB.accdb");
            
               pst = con.prepareStatement("insert into tbl_personel(PID,PAD,PSOYAD,PTCKNO,PDOGUMTARIHI,PDOGUMYERI,PCINSIYET,PMEDENIHAL,PEHLIYET,"
                  + "PEVTEL,PCEPTEL,PEPOSTA,"
                  + "PSEHIR,PILCE,PACIKADRES,"
                  + "PDEPARTMAN,PPOZISYON,PMAAS,PGIRISTARIHI,PCIKISTARIHI,PIZINGUNU)"
                  + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            //PERSONEL KİMLİK BİLGİLERİ TABLO ALANI
          pst.setString(1,PID);
          pst.setString(2,PAD);
          pst.setString(3,PSOYAD);
          pst.setString(4,PTCKNO);
          pst.setString(5,PDOGUMTARIHI);
          pst.setString(6,PDOGUMYERI);
          pst.setString(7,PCINSIYET);
          pst.setString(8,PMEDENIHAL);
          pst.setString(9,PEHLIYET);
          pst.setString(10,PEVNO);
          pst.setString(11,PCEPNO);
          pst.setString(12,PEPOSTA);
          pst.setString(13,PSEHIR);
          pst.setString(14,PILCE);
          pst.setString(15,PACIKADRES);
          pst.setString(16,PDEPARTMAN);
          pst.setString(17,PPOZISYON);
          pst.setString(18,PMAAS);
          pst.setString(19,PGIRISTARIHI);
          pst.setString(20,PCIKISTARIHI);
          pst.setString(21,PIZINGUNU);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Personel Ekleme İşlemi Tamamlandı !");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Class_EkleSilGuncelle.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }

    @Override
    public void Personel_Sil(String PID) {
        //SİL
        Connection con;
        PreparedStatement pst;

        try {
            //Class.forName("net.unaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://Personeller_DB.accdb");

            Statement st = con.createStatement();
            String sql = "SELECT *FROM tbl_personel WHERE PID="+PID;
            ResultSet rs = st.executeQuery(sql);

            if(!rs.isBeforeFirst()){
                JOptionPane.showMessageDialog(null,"Bu ID'ye Ait Personel Bulunamadı !","Hata !",1);
            }
            else{
                sql = "DELETE FROM tbl_personel WHERE PID="+PID; 
                pst = con.prepareStatement(sql);
                //
                    
                //
                
                int ok = JOptionPane.showConfirmDialog(null,"Personeli Silmek İstediğinizden Emin Misiniz ?","Silme Onay",JOptionPane.YES_NO_OPTION);
            
                if(ok==0){
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null,"Personel Silindi !","Başarılı !",1);
                    }
                pst.executeUpdate();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Class_EkleSilGuncelle.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex);
        }
      //

           
    } 
}
