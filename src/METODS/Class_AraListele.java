package METODS;
import Interfaces.Interface2;

public class Class_AraListele implements Interface2{ 

    //STATIC DEĞİŞKEN KULLANIMINA ÖRNEKLER ; 
    
    private static String PID;
    private static String PAD;
    private static String PSOYAD;
    private static String PTCKNO;
    private static String PDOGUMTARIHI;
    private static String PDOGUMYERI;
    private static String PCINSIYET;
    private static String PMEDENIHAL;
    private static String PEHLIYET;
    private static String PEVNO;
    private static String PCEPNO;
    private static String PEPOSTA;
    private static String PSEHIR;
    private static String PILCE;
    private static String PACIKADRES;
    private static String PDEPARTMAN;
    private static String PPOZISYON;
    private static String PMAAS;
    private static String PGIRISTARIHI;
    private static String PCIKISTARIHI;
    private static String PIZINGUNU;
    
    //GET VE SET METODLARI (BURADA STATIC DEĞİŞKENLERİN GET VE SET FONKSİYONLARI , 
    //STATIC OLDUĞU İÇİN this. KOMUTU YERINE SINIFI REFERANS ALARAK YAZILMIŞTIR.

    public String getPID() {
        return PID;
    }

    public void setPID(String PID) {
        Class_AraListele.PID = PID;
    }

    public String getPAD() {
        return PAD;
    }

    public void setPAD(String PAD) {
        Class_AraListele.PAD = PAD;
    }

    public String getPSOYAD() {
        return PSOYAD;
    }

    public void setPSOYAD(String PSOYAD) {
        Class_AraListele.PSOYAD = PSOYAD;
    }

    public String getPTCKNO() {
        return PTCKNO;
    }

    public void setPTCKNO(String PTCKNO) {
        Class_AraListele.PTCKNO = PTCKNO;
    }

    public String getPDOGUMTARIHI() {
        return PDOGUMTARIHI;
    }

    public void setPDOGUMTARIHI(String PDOGUMTARIHI) {
        Class_AraListele.PDOGUMTARIHI = PDOGUMTARIHI;
    }

    public String getPDOGUMYERI() {
        return PDOGUMYERI;
    }

    public void setPDOGUMYERI(String PDOGUMYERI) {
        Class_AraListele.PDOGUMYERI = PDOGUMYERI;
    }

    public String getPCINSIYET() {
        return PCINSIYET;
    }

    public void setPCINSIYET(String PCINSIYET) {
        Class_AraListele.PCINSIYET = PCINSIYET;
    }

    public String getPMEDENIHAL() {
        return PMEDENIHAL;
    }

    public void setPMEDENIHAL(String PMEDENIHAL) {
        Class_AraListele.PMEDENIHAL = PMEDENIHAL;
    }

    public String getPEHLIYET() {
        return PEHLIYET;
    }

    public void setPEHLIYET(String PEHLIYET) {
        Class_AraListele.PEHLIYET = PEHLIYET;
    }

    public String getPEVNO() {
        return PEVNO;
    }

    public void setPEVNO(String PEVNO) {
        Class_AraListele.PEVNO = PEVNO;
    }

    public String getPCEPNO() {
        return PCEPNO;
    }

    public void setPCEPNO(String PCEPNO) {
        Class_AraListele.PCEPNO = PCEPNO;
    }

    public String getPEPOSTA() {
        return PEPOSTA;
    }

    public void setPEPOSTA(String PEPOSTA) {
        Class_AraListele.PEPOSTA = PEPOSTA;
    }

    public String getPSEHIR() {
        return PSEHIR;
    }

    public void setPSEHIR(String PSEHIR) {
        Class_AraListele.PSEHIR = PSEHIR;
    }

    public String getPILCE() {
        return PILCE;
    }

    public void setPILCE(String PILCE) {
        Class_AraListele.PILCE = PILCE;
    }

    public String getPACIKADRES() {
        return PACIKADRES;
    }

    public void setPACIKADRES(String PACIKADRES) {
        Class_AraListele.PACIKADRES = PACIKADRES;
    }

    public String getPDEPARTMAN() {
        return PDEPARTMAN;
    }

    public void setPDEPARTMAN(String PDEPARTMAN) {
        Class_AraListele.PDEPARTMAN = PDEPARTMAN;
    }

    public String getPPOZISYON() {
        return PPOZISYON;
    }

    public void setPPOZISYON(String PPOZISYON) {
        Class_AraListele.PPOZISYON = PPOZISYON;
    }

    public String getPMAAS() {
        return PMAAS;
    }

    public void setPMAAS(String PMAAS) {
        Class_AraListele.PMAAS = PMAAS;
    }

    public String getPGIRISTARIHI() {
        return PGIRISTARIHI;
    }

    public void setPGIRISTARIHI(String PGIRISTARIHI) {
        Class_AraListele.PGIRISTARIHI = PGIRISTARIHI;
    }

    public String getPCIKISTARIHI() {
        return PCIKISTARIHI;
    }

    public void setPCIKISTARIHI(String PCIKISTARIHI) {
        Class_AraListele.PCIKISTARIHI = PCIKISTARIHI;
    }

    public String getPIZINGUNU() {
        return PIZINGUNU;
    }

    public void setPIZINGUNU(String PIZINGUNU) {
        Class_AraListele.PIZINGUNU = PIZINGUNU;
    }

    @Override
    public void Personel_Listele() {
       //PERSONEL LİSTELEME FONKSİYONU.(Asıl işlemler , programın daha akıcı ve kolay kullanılabilir olması için form içerisindeki fonksiyonlarda yazıldı)
    }

    
    @Override
    public void Personel_Ara(String PID) {
        //ARAMA
    }
    //PERSONEL ARAMA FONKSİYONU.(Asıl işlemler , programın daha akıcı ve kolay kullanılabilir olması için form içerisindeki fonksiyonlarda yazıldı)
}
