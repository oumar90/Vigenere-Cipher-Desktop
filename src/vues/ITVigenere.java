/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vues;

import base.GestionDeBasseDeDonnee;
import entites.TableKeys;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author oudjira
 */
public class ITVigenere extends javax.swing.JFrame {

    //Variable global
    String textclaire = "";
    String key = "";
        
    public ITVigenere() {
        initComponents();
        setTitle("Application cryptographique");
        
        //Dabord la connexion à la BD
        if(GestionDeBasseDeDonnee.loadConnection()){
            //la liste des clefs
            List<TableKeys> liste = GestionDeBasseDeDonnee.getAllKeyByUser();
            comBox.addItem("");
            for(int i=0; i < liste.size(); i++){
                comBox.addItem(liste.get(i).getIndicateur());
            }
            
           
        }else{
            JOptionPane boiteDialog = new JOptionPane();
                boiteDialog.showMessageDialog(null, "Error lors de la connexion à la base de données pour les clefs !",
                "Error!",
                JOptionPane.ERROR_MESSAGE);
        }
                
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        textentree = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        textsortie = new javax.swing.JEditorPane();
        jLabel4 = new javax.swing.JLabel();
        jDesktopPane6 = new javax.swing.JDesktopPane();
        jLabel3 = new javax.swing.JLabel();
        comBox = new javax.swing.JComboBox<>();
        buttonRegisterKey = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        textIndicateur = new javax.swing.JTextField();
        textkey = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jDesktopPane7 = new javax.swing.JDesktopPane();
        btninit = new javax.swing.JButton();
        btnimport = new javax.swing.JButton();
        btncrypter = new javax.swing.JButton();
        btncopi1 = new javax.swing.JButton();
        jDesktopPane5 = new javax.swing.JDesktopPane();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jDesktopPane8 = new javax.swing.JDesktopPane();
        jDesktopPane12 = new javax.swing.JDesktopPane();
        btninit2 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        btndecrypter = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textentree.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jScrollPane1.setViewportView(textentree);

        jTabbedPane1.addTab("Entree", jScrollPane1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Entrée");

        jDesktopPane1.setLayer(jTabbedPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        textsortie.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jScrollPane2.setViewportView(textsortie);

        jTabbedPane4.addTab("Sortie", jScrollPane2);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Sortie");

        jDesktopPane4.setLayer(jTabbedPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane4.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane4Layout = new javax.swing.GroupLayout(jDesktopPane4);
        jDesktopPane4.setLayout(jDesktopPane4Layout);
        jDesktopPane4Layout.setHorizontalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane4Layout.setVerticalGroup(
            jDesktopPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Clé de chiffrement");

        comBox.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        comBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxActionPerformed(evt);
            }
        });

        buttonRegisterKey.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        buttonRegisterKey.setText("Enregistrer la clé");
        buttonRegisterKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisterKeyActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Indicateur");

        textIndicateur.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textIndicateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIndicateurActionPerformed(evt);
            }
        });

        textkey.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        textkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textkeyActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Générer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jDesktopPane6.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane6.setLayer(comBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane6.setLayer(buttonRegisterKey, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane6.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane6.setLayer(textIndicateur, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane6.setLayer(textkey, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane6.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane6Layout = new javax.swing.GroupLayout(jDesktopPane6);
        jDesktopPane6.setLayout(jDesktopPane6Layout);
        jDesktopPane6Layout.setHorizontalGroup(
            jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane6Layout.createSequentialGroup()
                .addGroup(jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane6Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(33, 33, 33)
                .addGroup(jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jDesktopPane6Layout.createSequentialGroup()
                        .addComponent(textIndicateur, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRegisterKey)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(textkey))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane6Layout.setVerticalGroup(
            jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textkey, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(comBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRegisterKey)
                    .addComponent(jLabel5)
                    .addComponent(textIndicateur, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btninit.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btninit.setText("Initialiser");
        btninit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninitActionPerformed(evt);
            }
        });

        btnimport.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnimport.setText("Importer");
        btnimport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimportActionPerformed(evt);
            }
        });

        btncrypter.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btncrypter.setText("Crypter");
        btncrypter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrypterActionPerformed(evt);
            }
        });

        btncopi1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btncopi1.setText("Copier vers le presse papier");
        btncopi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncopi1ActionPerformed(evt);
            }
        });

        jDesktopPane7.setLayer(btninit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane7.setLayer(btnimport, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane7.setLayer(btncrypter, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane7.setLayer(btncopi1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane7Layout = new javax.swing.GroupLayout(jDesktopPane7);
        jDesktopPane7.setLayout(jDesktopPane7Layout);
        jDesktopPane7Layout.setHorizontalGroup(
            jDesktopPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btninit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncrypter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnimport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btncopi1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane7Layout.setVerticalGroup(
            jDesktopPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnimport)
                .addGap(18, 18, 18)
                .addComponent(btninit)
                .addGap(18, 18, 18)
                .addComponent(btncrypter)
                .addGap(27, 27, 27)
                .addComponent(btncopi1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jDesktopPane3.setLayer(jDesktopPane7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane3Layout = new javax.swing.GroupLayout(jDesktopPane3);
        jDesktopPane3.setLayout(jDesktopPane3Layout);
        jDesktopPane3Layout.setHorizontalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jDesktopPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );
        jDesktopPane3Layout.setVerticalGroup(
            jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jDesktopPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jDesktopPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Type de clé");

        jRadioButton7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton7.setText("Alphanumérique");

        jRadioButton8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton8.setText("Numérique(rapide)");

        jDesktopPane5.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane5.setLayer(jRadioButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane5.setLayer(jRadioButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane5Layout = new javax.swing.GroupLayout(jDesktopPane5);
        jDesktopPane5.setLayout(jDesktopPane5Layout);
        jDesktopPane5Layout.setHorizontalGroup(
            jDesktopPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jDesktopPane5Layout.setVerticalGroup(
            jDesktopPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton7)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btninit2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btninit2.setText("Initialiser");
        btninit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninit2ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton7.setText("Exporter");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        btndecrypter.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btndecrypter.setText("Décrypter");
        btndecrypter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndecrypterActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton9.setText("Copier vers le presse papier");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jDesktopPane12.setLayer(btninit2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane12.setLayer(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane12.setLayer(btndecrypter, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane12.setLayer(jButton9, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane12Layout = new javax.swing.GroupLayout(jDesktopPane12);
        jDesktopPane12.setLayout(jDesktopPane12Layout);
        jDesktopPane12Layout.setHorizontalGroup(
            jDesktopPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btninit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btndecrypter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE))
                .addContainerGap())
        );
        jDesktopPane12Layout.setVerticalGroup(
            jDesktopPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btninit2)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(btndecrypter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addContainerGap())
        );

        jDesktopPane8.setLayer(jDesktopPane12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane8Layout = new javax.swing.GroupLayout(jDesktopPane8);
        jDesktopPane8.setLayout(jDesktopPane8Layout);
        jDesktopPane8Layout.setHorizontalGroup(
            jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane8Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jDesktopPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(50, Short.MAX_VALUE)))
        );
        jDesktopPane8Layout.setVerticalGroup(
            jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jDesktopPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jDesktopPane12)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jDesktopPane6)
                            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDesktopPane4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDesktopPane3)
                            .addComponent(jDesktopPane5)
                            .addComponent(jDesktopPane8))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane3)
                    .addComponent(jDesktopPane1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDesktopPane5)
                    .addComponent(jDesktopPane6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDesktopPane4)
                    .addComponent(jDesktopPane8))
                .addContainerGap())
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Enregister");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Quitter");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Show");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Exécuter");

        jMenuItem3.setText("jMenuItem3");
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Débogage");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Tools");
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Help");
        jMenuBar1.add(jMenu8);

        jMenu5.setText("About");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxActionPerformed
       //Combobox
       String indicateur= comBox.getSelectedItem().toString();
        textIndicateur.setText(indicateur);
        
        if(comBox.getSelectedItem().toString() == ""){
            textIndicateur.setText("");
            textkey.setText("");
        }else{
        // On recupere la clé de la BD à partir de l'indicateur
            GestionDeBasseDeDonnee.loadConnection();
            TableKeys key= GestionDeBasseDeDonnee.getKeyByUser(indicateur);
            textIndicateur.setText(key.getIndicateur());
            textkey.setText(key.getKey());
        }
    }//GEN-LAST:event_comBoxActionPerformed

    private void buttonRegisterKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisterKeyActionPerformed
        // Enregistrement de la clef
        // on recupère les valeurs à enregistrer
        String indicateur = textIndicateur.getText();
        String textKey = textkey.getText();

        //entity tablekeys
        TableKeys key= new TableKeys();
        key.setIndicateur(indicateur);
        key.setKey(textKey);

        //Dabord la connexion à la BD
        if(GestionDeBasseDeDonnee.loadConnection()){
            //Enregistrement de la clé
            if(GestionDeBasseDeDonnee.saveKey(key)){
                comBox.addItem(indicateur);
                JOptionPane boiteDialog = new JOptionPane();
                boiteDialog.showMessageDialog(null, "La clef a  été enregistré avec succès !",
                    "Enregistrement reussi !",
                    JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane boiteDialog = new JOptionPane();
                boiteDialog.showMessageDialog(null, "Verifier que l'utilisateur n'existe pas déjà"
                    + " et les champs ne doivent pas etre vide.",
                    "Erreur !",
                    JOptionPane.ERROR_MESSAGE);
            }

        }else{
            JOptionPane boiteDialog = new JOptionPane();
            boiteDialog.showMessageDialog(null, "Error lors de la connexion à la base de données pour les clefs !",
                "Error!",
                JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_buttonRegisterKeyActionPerformed

    private void textkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textkeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textkeyActionPerformed

    private void btninitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninitActionPerformed
        // Initialiser le code
        textentree.setText(null);
    }//GEN-LAST:event_btninitActionPerformed

    private void btnimportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimportActionPerformed
        // Importer

        JFileChooser dialogue = new JFileChooser(new File("."));
        dialogue.showOpenDialog(null);
        File fichier =  dialogue.getSelectedFile();
        String filename = fichier.getAbsolutePath();

        try {
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            textentree.read(br, null);
            br.close();
            textentree.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }//GEN-LAST:event_btnimportActionPerformed

    private void btncrypterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrypterActionPerformed
        // Crypter
        //vigenere.Vigenere.chiffrer(TOOL_TIP_TEXT_KEY, TOOL_TIP_TEXT_KEY);
        Methodes methode = new Methodes();
        String encrypt = "";
        try {
            encrypt = methode.Chiffrer(textentree.getText(), textkey.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Veillez remplir tout le champ, SVP!", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        textsortie.setText(encrypt);
    }//GEN-LAST:event_btncrypterActionPerformed

    private void btncopi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncopi1ActionPerformed
        // Presse papier

        String msg = textentree.getText();

        StringSelection ss = new StringSelection(msg);

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

    }//GEN-LAST:event_btncopi1ActionPerformed

    private void btninit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninit2ActionPerformed
        // Reset
        textsortie.setText(null);
    }//GEN-LAST:event_btninit2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // Exporter
        JFileChooser filechoose = new JFileChooser();
        filechoose.setCurrentDirectory(new File("."));  /* ouvrir la boite de dialogue dans répertoire courant */
        filechoose.setDialogTitle("Enregistrer tous les fichiers"); /* nom de la boite de dialogue */

        filechoose.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); /* pour afficher seulement les répertoires */

        String approve = new String("Enregistrer"); /* Le bouton pour valider l’enregistrement portera la mention Enregistrer */
        int resultatEnregistrer = filechoose.showDialog(filechoose, approve);
        if (resultatEnregistrer == JFileChooser.APPROVE_OPTION){ /* Si l’utilisateur clique sur le bouton Enregistrer */
            String chemin = filechoose.getSelectedFile().getAbsolutePath(); /* pour avoir le chemin absolu */

            FileWriter fw = null;
            try {
                fw = new FileWriter(new File(chemin));
                fw.write(textsortie.getText());
                fw.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void btndecrypterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndecrypterActionPerformed
        // Decrypter
        Methodes methode = new Methodes();
        String decrypt = "";
        try {
            decrypt = methode.Dechiffrer(textentree.getText(), textkey.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Veillez remplir tout le champ, SVP!", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
        textsortie.setText(decrypt);

    }//GEN-LAST:event_btndecrypterActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // Presse papier

        String msg = textsortie.getText();

        StringSelection ss = new StringSelection(msg);

        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void textIndicateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIndicateurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIndicateurActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          Methodes methode = new Methodes();
        String numb = "";
        int nub = 8 ;
        
        numb = methode.generate(nub);
        
        textkey.setText(numb);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(ITVigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ITVigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ITVigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ITVigenere.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ITVigenere().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncopi1;
    private javax.swing.JButton btncrypter;
    private javax.swing.JButton btndecrypter;
    private javax.swing.JButton btnimport;
    private javax.swing.JButton btninit;
    private javax.swing.JButton btninit2;
    private javax.swing.JButton buttonRegisterKey;
    private javax.swing.JComboBox<String> comBox;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane12;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JDesktopPane jDesktopPane5;
    private javax.swing.JDesktopPane jDesktopPane6;
    private javax.swing.JDesktopPane jDesktopPane7;
    private javax.swing.JDesktopPane jDesktopPane8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTextField textIndicateur;
    private javax.swing.JEditorPane textentree;
    private javax.swing.JPasswordField textkey;
    private javax.swing.JEditorPane textsortie;
    // End of variables declaration//GEN-END:variables
}
