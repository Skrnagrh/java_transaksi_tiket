/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasUtama;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Personal
 */
public class Transaksi extends javax.swing.JFrame {

    String nomor1, nama1, kode1, namakereta1, jurusan1, jenistiket1, Harga1;
    String nomor2, nama2, kode2, namakereta2, jenistiket2, Harga2, jurusan2;
    String Number="";
    int beli, bayar, kembali;
    private DefaultTableModel tableModel;
    private Connection connection;
    
    public Transaksi() {
        initComponents();
        
    }
    
    public Transaksi(String nomor1, String nama1, String kode1, String  namakereta1, String jurusan1, String jenistiket1, String Harga1) {
        initComponents();
        //Hasil Data Dari Pilih Tiket
        this.nomor1          = nomor1;
        this.nama1           = nama1;
        this.kode1           = kode1;
        this.namakereta1     = namakereta1;
        this.jurusan1        = jurusan1;
        this.jenistiket1     = jenistiket1;
        this.Harga1          = Harga1;  
        displayno.setText    (""+this.nomor1);
        displaynama.setText  (""+this.nama1);
        displaykode.setText  (""+this.kode1);
        displaynamakereta.setText  (""+this.namakereta1);
        displayjurusan.setText (""+this.jurusan1);
        displayjenistiket.setText (""+this.jenistiket1);
        displayharga.setText (""+this.Harga1);
        
              
    }

    Transaksi(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Transaksi(String nomor, String nama, String kode, String namakereta, String jenistiket, String Harga, String jurusan, String namatiket1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        spinTiket = new javax.swing.JSpinner();
        displayPembayaran = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        displayjumlahtiket = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        displayharga = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        displaynama = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        displayBayar = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        displayKembalian = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        displaynamakereta = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        displaykode = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        displayno = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        displayjurusan = new javax.swing.JTextField();
        displayjenistiket = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1220, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel2.setText("Jurusan");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, 30));

        spinTiket.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        spinTiket.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinTiketspinnerTiket(evt);
            }
        });
        jPanel1.add(spinTiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 440, 200, 30));

        displayPembayaran.setEditable(false);
        displayPembayaran.setBackground(new java.awt.Color(255, 255, 255));
        displayPembayaran.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel1.add(displayPembayaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 480, 30));

        jLabel6.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel6.setText("Jumlah Tiket");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel8.setText("Rp.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 560, -1, 30));

        displayjumlahtiket.setEditable(false);
        displayjumlahtiket.setBackground(new java.awt.Color(255, 255, 255));
        displayjumlahtiket.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel1.add(displayjumlahtiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 300, 30));

        jLabel9.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel9.setText("Total Bayar");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel10.setText("Kode Kereta");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, 30));

        displayharga.setEditable(false);
        displayharga.setBackground(new java.awt.Color(255, 255, 255));
        displayharga.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel1.add(displayharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 510, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TugasUtama/icon/PROSES.png"))); // NOI18N
        jButton2.setText("Proses");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 600, -1, 50));

        jLabel12.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel12.setText("Nama");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 30));

        jLabel13.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel13.setText(":");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 20, 30));

        displaynama.setEditable(false);
        displaynama.setBackground(new java.awt.Color(255, 255, 255));
        displaynama.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel1.add(displaynama, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 510, 30));

        jLabel14.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel14.setText("Bayar");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, -1));

        displayBayar.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel1.add(displayBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 480, 30));

        jLabel17.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel17.setText("Kembalian");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, -1, -1));

        displayKembalian.setEditable(false);
        displayKembalian.setBackground(new java.awt.Color(255, 255, 255));
        displayKembalian.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel1.add(displayKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 560, 480, 30));

        jLabel20.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel20.setText("Nama Kereta");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, 30));

        displaynamakereta.setEditable(false);
        displaynamakereta.setBackground(new java.awt.Color(255, 255, 255));
        displaynamakereta.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel1.add(displaynamakereta, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 510, 30));

        jLabel21.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel21.setText("Harga Tiket");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, 40));

        jLabel22.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel22.setText(":");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 20, -1));

        jLabel23.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel23.setText(":");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 399, 20, 20));

        displaykode.setEditable(false);
        displaykode.setBackground(new java.awt.Color(255, 255, 255));
        displaykode.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel1.add(displaykode, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 510, 30));

        jLabel15.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel15.setText(":");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 20, -1));

        jLabel16.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel16.setText(":");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 20, -1));

        jLabel18.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel18.setText(":");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 440, 20, 30));

        jLabel19.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel19.setText(":");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 20, -1));

        jLabel11.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel11.setText("Rp.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 490, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel24.setText(":");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 20, 30));

        jLabel25.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel25.setText(":");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 20, 30));

        jLabel26.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel26.setText("Rp.");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 520, -1, 20));

        jLabel27.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel27.setText("No Transaksi");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 30));

        jLabel28.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel28.setText(":");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 20, -1));

        displayno.setEditable(false);
        displayno.setBackground(new java.awt.Color(255, 255, 255));
        displayno.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel1.add(displayno, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 510, 30));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TugasUtama/icon/paper-plane.png"))); // NOI18N
        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 600, 130, 50));

        displayjurusan.setEditable(false);
        displayjurusan.setBackground(new java.awt.Color(255, 255, 255));
        displayjurusan.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel1.add(displayjurusan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 510, 30));

        displayjenistiket.setEditable(false);
        displayjenistiket.setBackground(new java.awt.Color(255, 255, 255));
        displayjenistiket.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jPanel1.add(displayjenistiket, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 510, 30));

        jLabel29.setFont(new java.awt.Font("Tekton Pro", 1, 24)); // NOI18N
        jLabel29.setText(":");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 349, 20, 30));

        jLabel30.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel30.setText("Jenis Tiket");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, -1, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Tekton Pro", 1, 48)); // NOI18N
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 110));

        jLabel32.setFont(new java.awt.Font("Tekton Pro", 1, 48)); // NOI18N
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TugasUtama/header/2.png"))); // NOI18N
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 650, 60));

        jLabel33.setFont(new java.awt.Font("Tekton Pro", 1, 48)); // NOI18N
        jPanel3.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 110, 110));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1210, 110));

        jButton9.setBackground(new java.awt.Color(255, 255, 255));
        jButton9.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TugasUtama/icon/close.png"))); // NOI18N
        jButton9.setText("Cancel");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 600, 130, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TugasUtama/people/2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 530, 520));

        jLabel34.setFont(new java.awt.Font("Tekton Pro", 1, 18)); // NOI18N
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TugasUtama/layout/4.png"))); // NOI18N
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -60, 1260, 790));

        getContentPane().add(jPanel1);

        jMenu1.setText("File");

        jMenuItem1.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jMenuItem1.setText("Menu Utama");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jMenuItem2.setText("Daftar Nama Kereta");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jMenuItem3.setText("Data Penumpang");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setFont(new java.awt.Font("Tekton Pro", 0, 18)); // NOI18N
        jMenuItem4.setText("Pilih Tiket");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1247, 739));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void spinTiketspinnerTiket(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinTiketspinnerTiket
        Integer myInt  = (Integer) spinTiket.getValue();
        String spinner = myInt.toString();
        displayjumlahtiket.setText(spinner);
        int a = Integer.parseInt(displayharga.getText());
        int b = Integer.parseInt(displayjumlahtiket.getText());
        int c = b * a;
        displayPembayaran.setText(""+c);

    }//GEN-LAST:event_spinTiketspinnerTiket

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        beli  = Integer.parseInt(displayPembayaran.getText());
        bayar = Integer.parseInt(displayBayar.getText());
        if (bayar < beli){
            javax.swing.JOptionPane.showMessageDialog(null, "Maaf Uang Anda Kurang!");
            bayar=0;
            Number="";
            displayBayar.setText("");
        }
        else{
            kembali = bayar - beli;
            Number = Integer.toString(kembali);
            displayKembalian.setText(Number);
            Number ="";
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        try {
            connection = Database.getConnection();
            String query = "INSERT INTO tablepenumpang"
            + "(No, Nama, Kodekereta, Namakereta, Jurusan, Jenistiket, Hargatiket, Jumlahtiket, TotalBayar, Bayar, kembalian)"
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
            java.sql.PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, displayno.getText());
            statement.setString(2, displaynama.getText());
            statement.setString(3, displaykode.getText());
            statement.setString(4, displaynamakereta.getText());
            statement.setString(5, displayjurusan.getText());
            statement.setString(6, displayjenistiket.getText());
            statement.setString(7, displayharga.getText());
            statement.setString(8, displayjumlahtiket.getText());
            statement.setString(9, displayPembayaran.getText());
            statement.setString(10, displayBayar.getText());
            statement.setString(11, displayKembalian.getText());
            statement.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
            statement.close();

        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data Gagal Ditambahkan");
            System.out.println(ex);
        }
        nomor2      = displayno.getText();
        nama2       = displaynama.getText();
        kode2       = displaykode.getText();
        namakereta2 = displaynamakereta.getText();
        jurusan2    = displayjurusan.getText();
        jenistiket2 = displayjenistiket.getText();
        Tiket Tk = new Tiket(nomor2, nama2, kode2, namakereta2, jurusan2, jenistiket2);
        Tk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //Menu Utama
        new Menuutama().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            //Daftar Nama Kereta
            new Daftarnamakereta().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Transaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //Data Nama Penumpang 
        new Datapenumpang().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       //Pilih Kode Kereta Dan Jurusan
       new Pilihtiket().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        displayno.setText("");
        displaynama.setText("");
        displaykode.setText("");
        displaynamakereta.setText("");
        displayjurusan.setText("");
        displayjenistiket.setText("");
        displayharga.setText("");
        displayjumlahtiket.setText("");
        displayPembayaran.setText("");
        displayBayar.setText("");
        displayKembalian.setText("");
        //Pilih Kode Kereta Dan Jurusan
        new Pilihtiket().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField displayBayar;
    private javax.swing.JTextField displayKembalian;
    private javax.swing.JTextField displayPembayaran;
    private javax.swing.JTextField displayharga;
    private javax.swing.JTextField displayjenistiket;
    private javax.swing.JTextField displayjumlahtiket;
    private javax.swing.JTextField displayjurusan;
    private javax.swing.JTextField displaykode;
    private javax.swing.JTextField displaynama;
    private javax.swing.JTextField displaynamakereta;
    private javax.swing.JTextField displayno;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSpinner spinTiket;
    // End of variables declaration//GEN-END:variables
}
