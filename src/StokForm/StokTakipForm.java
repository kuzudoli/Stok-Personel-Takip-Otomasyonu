package StokForm;
import METODS.UrunEkleSilGuncelle;
import METODS.UrunAraListele;
import java.sql.*;
import java.time.*;
import java.util.*;
import static StokForm.UrunListesi.tableDB;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableModel;
public class StokTakipForm extends javax.swing.JFrame {

    public StokTakipForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtURUNADI = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtACIKLAMA = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtFIYATALIS = new javax.swing.JTextField();
        txtMIKTAR = new javax.swing.JTextField();
        txtFIYATSATIS = new javax.swing.JTextField();
        comboBIRIM = new javax.swing.JComboBox<>();
        btnURUNEKLE = new javax.swing.JButton();
        txtMARKA = new javax.swing.JTextField();
        comboKATEGORI = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtU_AD = new javax.swing.JTextField();
        btnARA2 = new javax.swing.JButton();
        btnARA1 = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnARA3 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtU_MARKA = new javax.swing.JTextField();
        btnARA4 = new javax.swing.JButton();
        comboU_KATEGORI = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtUrunID = new javax.swing.JTextField();
        btnARA5 = new javax.swing.JButton();
        btnARA6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtUpAD = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtUpACIKLAMA = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtUpALIS = new javax.swing.JTextField();
        txtUpMIKTAR = new javax.swing.JTextField();
        txtUpSATIS = new javax.swing.JTextField();
        comboUpBIRIM = new javax.swing.JComboBox<>();
        btnGUNCELLE = new javax.swing.JButton();
        txtUpMARKA = new javax.swing.JTextField();
        comboUpKATEGORI = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        btnSİL = new javax.swing.JButton();
        txtSILINECEK_ID = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("STOK TAKİP MODÜLÜ");
        setIconImages(null);
        setResizable(false);

        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        jPanel2.setBackground(new java.awt.Color(236, 236, 236));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("ÜRÜN ADI:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("MARKA:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("KATEGORİ:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("AÇIKLAMA");

        txtACIKLAMA.setColumns(20);
        txtACIKLAMA.setRows(5);
        jScrollPane1.setViewportView(txtACIKLAMA);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setText("ALIŞ FİYATI:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("BİRİM:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("MİKTAR:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("SATIŞ FİYATI:");

        comboBIRIM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz...", "PAKET", "ADET", "KOLİ" }));

        btnURUNEKLE.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnURUNEKLE.setText("ÜRÜNÜ EKLE");
        btnURUNEKLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnURUNEKLEActionPerformed(evt);
            }
        });

        comboKATEGORI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz...", "BİLGİSAYAR / TABLET", "YAZICILAR / PROJEKSİYON", "TELEFON / TELEFON AKSESUAR", "TV / GÖRÜNTÜ / SES SİSTEMLERİ", "BEYAZ EŞYA", "ELEKTRİKLİ EV ALETLERİ", "FOTO / KAMERA", "KLİMA VE ISITICILAR", "OYUN / OYUN KONSOLLARI", "OYUNCU AKSESUAR" }));
        comboKATEGORI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboKATEGORIActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton2.setText("TEMİZLE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtURUNADI)
                                    .addComponent(txtMARKA)
                                    .addComponent(comboKATEGORI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel4))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMIKTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFIYATALIS)
                                    .addComponent(comboBIRIM, 0, 154, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(txtFIYATSATIS, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnURUNEKLE, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFIYATALIS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(comboBIRIM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtMIKTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtURUNADI, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMARKA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboKATEGORI, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFIYATSATIS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnURUNEKLE, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ÜRÜN EKLE", jPanel2);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("ÜRÜN ADI:");

        txtU_AD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtU_AD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtU_ADActionPerformed(evt);
            }
        });

        btnARA2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnARA2.setText("ÜRÜNÜ BUL");
        btnARA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnARA2ActionPerformed(evt);
            }
        });

        btnARA1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnARA1.setText("ÜRÜNÜ BUL");
        btnARA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnARA1ActionPerformed(evt);
            }
        });

        txtID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("ÜRÜN ID:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("ÜRÜN KATEGORİ:");

        btnARA3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnARA3.setText("ÜRÜNÜ BUL");
        btnARA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnARA3ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("ÜRÜN MARKA:");

        txtU_MARKA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtU_MARKA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtU_MARKAActionPerformed(evt);
            }
        });

        btnARA4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnARA4.setText("ÜRÜNÜ BUL");
        btnARA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnARA4ActionPerformed(evt);
            }
        });

        comboU_KATEGORI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz...", "BİLGİSAYAR / TABLET", "YAZICILAR / PROJEKSİYON", "TELEFON / TELEFON AKSESUAR", "TV / GÖRÜNTÜ / SES SİSTEMLERİ", "BEYAZ EŞYA", "ELEKTRİKLİ EV ALETLERİ", "FOTO / KAMERA", "KLİMA VE ISITICILAR", "OYUN / OYUN KONSOLLARI", "OYUNCU AKSESUAR" }));
        comboU_KATEGORI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboU_KATEGORIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtU_AD, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnARA2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(btnARA1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtU_MARKA, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(comboU_KATEGORI, 0, 0, Short.MAX_VALUE))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnARA4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnARA3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnARA1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtU_AD, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnARA2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboU_KATEGORI)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnARA3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtU_MARKA, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnARA4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("ÜRÜN ARA", jPanel6);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("ÜRÜN ID:");

        txtUrunID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUrunID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUrunIDActionPerformed(evt);
            }
        });

        btnARA5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnARA5.setText("ÜRÜNÜ BUL");
        btnARA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnARA5ActionPerformed(evt);
            }
        });

        btnARA6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnARA6.setText("LİSTEDEN SEÇ");
        btnARA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnARA6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUrunID, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnARA5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnARA6)
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(txtUrunID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btnARA5)
                .addComponent(btnARA6))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Ürün Bilgileri"));
        jPanel5.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("ÜRÜN ADI:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("MARKA:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("KATEGORİ:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("AÇIKLAMA");

        txtUpACIKLAMA.setColumns(20);
        txtUpACIKLAMA.setRows(5);
        jScrollPane2.setViewportView(txtUpACIKLAMA);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel18.setText("ALIŞ FİYATI:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel19.setText("BİRİM:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel20.setText("MİKTAR:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel21.setText("SATIŞ FİYATI:");

        comboUpBIRIM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz...", "PAKET", "ADET", "KOLİ" }));

        btnGUNCELLE.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnGUNCELLE.setText("ÜRÜNÜ GÜNCELLE");
        btnGUNCELLE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGUNCELLEActionPerformed(evt);
            }
        });

        comboUpKATEGORI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz...", "BİLGİSAYAR / TABLET", "YAZICILAR / PROJEKSİYON", "TELEFON / TELEFON AKSESUAR", "TV / GÖRÜNTÜ / SES SİSTEMLERİ", "BEYAZ EŞYA", "ELEKTRİKLİ EV ALETLERİ", "FOTO / KAMERA", "KLİMA VE ISITICILAR", "OYUN / OYUN KONSOLLARI", "OYUNCU AKSESUAR" }));
        comboUpKATEGORI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboUpKATEGORIActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUpAD)
                                    .addComponent(txtUpMARKA)
                                    .addComponent(comboUpKATEGORI, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel12))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUpMIKTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUpALIS)
                                    .addComponent(comboUpBIRIM, 0, 154, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addComponent(txtUpSATIS, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(btnGUNCELLE, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUpALIS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(comboUpBIRIM, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtUpMIKTAR, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUpAD, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUpMARKA, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboUpKATEGORI, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUpSATIS, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGUNCELLE, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ÜRÜN GÜNCELLE", jPanel7);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 667, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 27, Short.MAX_VALUE)
        );

        btnSİL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSİL.setText("ÜRÜNÜ SİL");
        btnSİL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSİLActionPerformed(evt);
            }
        });

        txtSILINECEK_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSILINECEK_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSILINECEK_IDActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("ÜRÜN ID:");

        jLabel23.setText("*Lütfen silmek istediğiniz ürünün ID numarasını giriniz");

        jLabel24.setText("*ID numarasını ürün listesinden bulabilirsiniz");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSILINECEK_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnSİL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSILINECEK_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSİL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ÜRÜN SİL", jPanel8);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("ÜRÜNLER LİSTESİ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("TÜM ÜRÜNLERİ LİSTELE", jPanel9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public static void setVariables(){
        
    }
    private void btnURUNEKLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnURUNEKLEActionPerformed
        
        //FORM ÜZERİNDEKİ INPUTLARDAN VERILER DEGISKENLERE AKTARILIYOR
        String AD,ACIKLAMA,BIRIM,MARKA,KATEGORI;
        int FIYATALIS,MIKTAR,FIYATSATIS;
        
        AD = txtURUNADI.getText().toUpperCase();
        ACIKLAMA = txtACIKLAMA.getText().toUpperCase();
        BIRIM = (String)comboBIRIM.getSelectedItem();
        MARKA = txtMARKA.getText().toUpperCase();
        KATEGORI = (String)comboKATEGORI.getSelectedItem();
        MIKTAR = Integer.parseInt(txtMIKTAR.getText());
        FIYATALIS=Integer.parseInt(txtFIYATALIS.getText());
        FIYATSATIS=Integer.parseInt(txtFIYATSATIS.getText());
        
        //COMBOBOX SEÇİM YAPMAYA ZORLUYOR
        if(AD!="" && MARKA!="" && MIKTAR>0 && FIYATALIS>0 && FIYATSATIS>0 && KATEGORI!="Seçiniz..." && BIRIM!="Seçiniz..."){           
            //URUN EKLEMEK İÇİN SINIFTAN NESE ÜRETİLİYOR
            UrunEkleSilGuncelle ekle = new UrunEkleSilGuncelle();
        
            //PRIVATE DEĞİŞKENLERE SET METODLARI İLE ERİŞİM SAĞLANARAK ATAMA YAPILIYOR
            ekle.setAD(AD);
            ekle.setACIKLAMA(ACIKLAMA);
            ekle.setMARKA(MARKA);
            ekle.setKATEGORI(KATEGORI);
            ekle.setBIRIM(BIRIM);
            ekle.setMIKTAR(MIKTAR);
            ekle.setALIS_FIYATI(FIYATALIS);
            ekle.setSATIS_FIYATI(FIYATSATIS);
            //EKLEME METODU ÇAĞIRILIYOR
            ekle.UrunEkle();
        }
        else if(KATEGORI=="Seçiniz...")
            JOptionPane.showMessageDialog(null,"Kategori Seçiniz!","HATA !",1); 
        else if(BIRIM=="Seçiniz...")
                JOptionPane.showMessageDialog(null,"Birim Seçiniz!","HATA !",1); 
    }//GEN-LAST:event_btnURUNEKLEActionPerformed

    private void comboKATEGORIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboKATEGORIActionPerformed
        if(comboKATEGORI.getSelectedItem().toString()=="Seçiniz..."){
            JOptionPane.showMessageDialog(null,"Lütfen KATEGORI SEÇİNİZ!","HATA !",1);
        }
    }//GEN-LAST:event_comboKATEGORIActionPerformed

    private void txtU_ADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtU_ADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtU_ADActionPerformed

    //AD ILE ARAMA
    private void btnARA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnARA2ActionPerformed
        String AD;
        UrunAraListele urunListe = new UrunAraListele();
        AD=txtU_AD.getText();
        urunListe.UrunAra(AD);
        
        //STATIC METOD KULLANIMI
        UrunAraListele.tabloSutunAyarla();
    }//GEN-LAST:event_btnARA2ActionPerformed
    //ID ILE ARAMA
    private void btnARA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnARA1ActionPerformed
        int ID;
        UrunAraListele urunListe = new UrunAraListele();
        ID=Integer.parseInt(txtID.getText());
        urunListe.UrunAra(ID);
        
        //STATIC METOD KULLANIMI
        UrunAraListele.tabloSutunAyarla();
    }//GEN-LAST:event_btnARA1ActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnARA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnARA3ActionPerformed
        String KATEGORI;
        UrunAraListele urunListe = new UrunAraListele();
        KATEGORI=(String)comboU_KATEGORI.getSelectedItem();
        urunListe.UrunAra(KATEGORI, "KATEGORI");
        
        //STATIC METOD KULLANIMI
        UrunAraListele.tabloSutunAyarla();
    }//GEN-LAST:event_btnARA3ActionPerformed

    private void txtU_MARKAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtU_MARKAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtU_MARKAActionPerformed

    private void btnARA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnARA4ActionPerformed
        String MARKA;
        UrunAraListele urunListe = new UrunAraListele();
        MARKA = txtU_MARKA.getText();
        urunListe.UrunAra(MARKA, 1);
        
        //STATIC METOD KULLANIMI
        UrunAraListele.tabloSutunAyarla();
    }//GEN-LAST:event_btnARA4ActionPerformed

    private void comboU_KATEGORIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboU_KATEGORIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboU_KATEGORIActionPerformed

    private void txtUrunIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUrunIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUrunIDActionPerformed

    private void btnARA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnARA5ActionPerformed
        int ID;
        ID = Integer.parseInt(txtUrunID.getText());
        String tmpID = txtUrunID.getText();
        
        UrunAraListele urunGetir = new UrunAraListele();
        
        //ID NUMARASINA GÖRE ARAMA YAPILIR
        urunGetir.UrunGuncellemeAra(ID);
        
        //BULUNAN ÜRÜNÜN BİLGİLERİ INPUTLARA YERLESTIRILIR
        txtUpAD.setText(urunGetir.getAD());
        txtUpACIKLAMA.setText(urunGetir.getACIKLAMA());
        txtUpMARKA.setText(urunGetir.getMARKA());
        txtUpALIS.setText(urunGetir.getALIS_FIYATI());
        txtUpSATIS.setText(urunGetir.getSATIS_FIYATI());
        comboUpBIRIM.setSelectedItem(urunGetir.getBIRIM());
        comboUpKATEGORI.setSelectedItem(urunGetir.getKATEGORI());
        txtUpMIKTAR.setText(urunGetir.getMIKTAR());
        
        /*
        UrunEkleSilGuncelle yeni = new UrunEkleSilGuncelle();
        yeni.setID(tmpID);
        yeni.setAD(txtUpAD.getText());
        yeni.setACIKLAMA(txtUpACIKLAMA.getText());
        yeni.setALIS_FIYATI(Integer.parseInt(txtUpALIS.getText()));
        yeni.setSATIS_FIYATI(Integer.parseInt(txtUpSATIS.getText()));
        yeni.setBIRIM(comboUpBIRIM.getSelectedItem().toString());
        yeni.setKATEGORI(comboUpKATEGORI.getSelectedItem().toString());
        yeni.setMARKA(txtUpMARKA.getText());
        yeni.setMIKTAR(Integer.parseInt(txtUpMIKTAR.getText()));
        */
    }//GEN-LAST:event_btnARA5ActionPerformed

    private void btnGUNCELLEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGUNCELLEActionPerformed
        //ÜRÜNÜN ID DEĞERİNİ ALIR
        String ID = txtUrunID.getText();
        
        //FORM ÜZERİNDEKİ INPUTLARDAN VERILER DEGISKENLERE AKTARILIYOR
        String AD,ACIKLAMA,BIRIM,MARKA,KATEGORI;
        int FIYATALIS,MIKTAR,FIYATSATIS;
        
        AD = txtUpAD.getText().toUpperCase();
        ACIKLAMA = txtUpACIKLAMA.getText().toUpperCase();
        BIRIM = (String)comboUpBIRIM.getSelectedItem();
        MARKA = txtUpMARKA.getText().toUpperCase();
        KATEGORI = (String)comboUpKATEGORI.getSelectedItem();
        MIKTAR = Integer.parseInt(txtUpMIKTAR.getText());
        FIYATALIS=Integer.parseInt(txtUpALIS.getText());
        FIYATSATIS=Integer.parseInt(txtUpSATIS.getText());
        
        //COMBOBOX SEÇİM YAPMAYA ZORLUYOR
        if(KATEGORI!="Seçiniz..." && BIRIM!="Seçiniz..."){           
            //URUN EKLEMEK İÇİN SINIFTAN NESE ÜRETİLİYOR
            UrunEkleSilGuncelle guncelle = new UrunEkleSilGuncelle();
        
            //PRIVATE DEĞİŞKENLERE SET METODLARI İLE ERİŞİM SAĞLANARAK ATAMA YAPILIYOR
            guncelle.setAD(AD);
            guncelle.setACIKLAMA(ACIKLAMA);
            guncelle.setMARKA(MARKA);
            guncelle.setKATEGORI(KATEGORI);
            guncelle.setBIRIM(BIRIM);
            guncelle.setMIKTAR(MIKTAR);
            guncelle.setALIS_FIYATI(FIYATALIS);
            guncelle.setSATIS_FIYATI(FIYATSATIS);
            //EKLEME METODU ÇAĞIRILIYOR
            guncelle.UrunGuncelle(ID);
        }
        else if(KATEGORI=="Seçiniz...")
            JOptionPane.showMessageDialog(null,"Kategori Seçiniz!","HATA !",1); 
        else if(BIRIM=="Seçiniz...")
                JOptionPane.showMessageDialog(null,"Birim Seçiniz!","HATA !",1);
    }//GEN-LAST:event_btnGUNCELLEActionPerformed

    private void comboUpKATEGORIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboUpKATEGORIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboUpKATEGORIActionPerformed

    private void btnARA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnARA6ActionPerformed
        UrunAraListele urunListe = new UrunAraListele();
        urunListe.UrunListeleUpdate();
        
    }//GEN-LAST:event_btnARA6ActionPerformed

    private void btnSİLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSİLActionPerformed
        int ID;
        ID = Integer.parseInt(txtSILINECEK_ID.getText());
        
        UrunEkleSilGuncelle sil = new UrunEkleSilGuncelle();
        sil.UrunSil(ID);
    }//GEN-LAST:event_btnSİLActionPerformed

    private void txtSILINECEK_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSILINECEK_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSILINECEK_IDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UrunAraListele liste = new UrunAraListele();
        liste.UrunListele();
        UrunAraListele.tabloSutunAyarla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Ekleme Sonrası TextField'leri Temizleme Butonu.
        TextTemizle();
        
    }//GEN-LAST:event_jButton2ActionPerformed
         public final void TextTemizle(){
            txtURUNADI.setText("");
            txtMARKA.setText("");
            txtFIYATALIS.setText("");
            comboKATEGORI.setSelectedIndex(0);
            comboBIRIM.setSelectedIndex(0);
            txtMIKTAR.setText("");
            txtFIYATSATIS.setText("");
            txtACIKLAMA.setText("");
        }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StokTakipForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnARA1;
    private javax.swing.JButton btnARA2;
    private javax.swing.JButton btnARA3;
    private javax.swing.JButton btnARA4;
    private javax.swing.JButton btnARA5;
    private javax.swing.JButton btnARA6;
    private javax.swing.JButton btnGUNCELLE;
    private javax.swing.JButton btnSİL;
    private javax.swing.JButton btnURUNEKLE;
    private javax.swing.JComboBox<String> comboBIRIM;
    private javax.swing.JComboBox<String> comboKATEGORI;
    private javax.swing.JComboBox<String> comboU_KATEGORI;
    public javax.swing.JComboBox<String> comboUpBIRIM;
    public javax.swing.JComboBox<String> comboUpKATEGORI;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea txtACIKLAMA;
    private javax.swing.JTextField txtFIYATALIS;
    private javax.swing.JTextField txtFIYATSATIS;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMARKA;
    private javax.swing.JTextField txtMIKTAR;
    private javax.swing.JTextField txtSILINECEK_ID;
    private javax.swing.JTextField txtURUNADI;
    private javax.swing.JTextField txtU_AD;
    private javax.swing.JTextField txtU_MARKA;
    public javax.swing.JTextArea txtUpACIKLAMA;
    public javax.swing.JTextField txtUpAD;
    public javax.swing.JTextField txtUpALIS;
    public javax.swing.JTextField txtUpMARKA;
    public javax.swing.JTextField txtUpMIKTAR;
    public javax.swing.JTextField txtUpSATIS;
    private javax.swing.JTextField txtUrunID;
    // End of variables declaration//GEN-END:variables
}
