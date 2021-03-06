/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import google_translate.GoogleTranslate;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import merge_subtitle.MergeSubtitle;
import subtitle_translate.SubtitleTranslate;

/**
 *
 * @author castiel
 */
public class View extends javax.swing.JFrame {
    
    private SubtitleTranslate s = new SubtitleTranslate();
    /**
     * Creates new form Form
     */
    public View() {
        initComponents();// Khoi tao 
        //PrintStream out = new PrintStream( new Log(jTextArea1) );
        //System.setOut( out );
        Logger.getGlobal().setLevel(Level.ALL);
        Handler h = new Handler() {
            @Override
            public void publish(LogRecord lr) {
                View.this.jTextArea1.append(lr.getMessage() + "\n");
            }

            @Override
            public void flush() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void close() throws SecurityException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

        };
        Logger.getLogger("").addHandler(h);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
 regenerated by the View Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("The first subtitle"));
        jPanel1.setMaximumSize(new java.awt.Dimension(554, 109));
        jPanel1.setMinimumSize(new java.awt.Dimension(554, 109));
        jPanel1.setPreferredSize(new java.awt.Dimension(554, 109));

        jLabel4.setText("Postition");

        jTextField1.setEditable(false);
        jTextField1.setMaximumSize(new java.awt.Dimension(4, 19));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField1MouseExited(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(MergeSubtitle.Tag_Label));
        jComboBox1.setSelectedIndex(1);
        jComboBox1.setMinimumSize(null);
        jComboBox1.setName(""); // NOI18N
        jComboBox1.setPreferredSize(null);

        jButton1.setText("Choose Subtitle");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setText("Preview");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Log"));

        jScrollPane1.setAutoscrolls(true);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));

        jButton3.setText("Merge");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("The second subtitle"));
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(554, 109));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(554, 109));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(554, 109));

        jPanel2.setMaximumSize(new java.awt.Dimension(272, 108));
        jPanel2.setMinimumSize(new java.awt.Dimension(272, 108));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(MergeSubtitle.Tag_Label));
        jComboBox2.setSelectedIndex(7);
        jComboBox2.setMinimumSize(null);
        jComboBox2.setPreferredSize(null);

        jLabel5.setText("Position");

        jButton2.setText("Choose Subtitle");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Preview");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField2MouseExited(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("The 2nd subtitle", jPanel2);
        jPanel2.getAccessibleContext().setAccessibleName("The second subtitle");

        jPanel5.setMaximumSize(new java.awt.Dimension(272, 108));
        jPanel5.setMinimumSize(new java.awt.Dimension(272, 108));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(GoogleTranslate.lang_label));

        jLabel1.setText("Source Lang");

        jLabel2.setText("Target Lang");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(GoogleTranslate.lang_label));

        jLabel3.setText("Position");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(MergeSubtitle.Tag_Label));
        jComboBox5.setSelectedIndex(7);
        jComboBox5.setMinimumSize(null);
        jComboBox5.setPreferredSize(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(10, 10, 10)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Translate", jPanel5);
        jPanel5.getAccessibleContext().setAccessibleName(" Use content translated from the first subtitle ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.getAccessibleContext().setAccessibleName("Logger");
        jPanel3.getAccessibleContext().setAccessibleDescription("");
        jTabbedPane1.getAccessibleContext().setAccessibleName("tab");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser l;
        if ( !this.jTextField1.getText().isEmpty() )
            l = new JFileChooser( this.jTextField1.getText() );
        else if ( !this.jTextField2.getText().isEmpty() )
            l = new JFileChooser( this.jTextField2.getText() );
        else
            l = new JFileChooser();
        
        if ( l.showOpenDialog(null) == JFileChooser.APPROVE_OPTION ){
            this.jTextField1.setText(l.getSelectedFile().getPath() );
        }
        if ( !this.jTextField1.getText().isEmpty() && !this.jTextField2.getText().isEmpty() ){
            this.jTextField3.setText(this.jTextField1.getText().substring(0, this.jTextField1.getText().lastIndexOf("/")) + "/Merge.srt");
        }
        
        
        if ( !this.jTextField1.getText().isEmpty() && this.jTextField1.isEnabled() ){
            String tmp = this.jTextField1.getText();
            this.jTextField3.setText( tmp.substring(0, tmp.lastIndexOf("/") + 1) + "Merge.srt");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Thread r = new Thread(){
            @Override
            public void run() {
                View.this.MergeAction();
            }
        };
        r.start();
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void MergeAction(){
            if ( !this.jTextField1.getText().isEmpty() && ( (!this.jTextField2.getText().isEmpty() && this.jTabbedPane1.getSelectedIndex() == 0) || this.jTabbedPane1.getSelectedIndex() == 1 ) )
                try{
                    this.jTextField1.setEnabled(false);
                    this.jTextField2.setEnabled(false);
                    this.jTextField3.setEnabled(false);
                    this.jButton1.setEnabled(false);
                    this.jButton2.setEnabled(false);
                    this.jButton4.setEnabled(false);
                    this.jButton5.setEnabled(false);
                    this.jComboBox1.setEnabled(false);
                    this.jComboBox2.setEnabled(false);
                    this.jComboBox3.setEnabled(false);
                    this.jComboBox4.setEnabled(false);
                    this.jComboBox5.setEnabled(false);
                   // Tab 1 ==== Trasnalte + Merget
                    if ( this.jTabbedPane1.getSelectedIndex() == 1 ){
                        this.jTextField3.setText( this.jTextField1.getText().substring(0, this.jTextField1.getText().lastIndexOf("/") + 1) + "Merge.srt");
                        MergeSubtitle m = new MergeSubtitle();
                        Logger.getLogger(this.getName()).info("Creating temp translate : " + this.jTextField1.getText()+".temp.srt");
                        Logger.getLogger(this.getName()).info("Translating ... ");
                        s.Translate(GoogleTranslate.lang_code[this.jComboBox3.getSelectedIndex()], 
                                GoogleTranslate.lang_code[this.jComboBox4.getSelectedIndex()], 
                                this.jTextField1.getText(), this.jTextField1.getText()+".temp.srt");
                        m.getInputFile(this.jTextField1.getText(), this.jTextField1.getText()+".temp.srt" );
                        m.setTag1( MergeSubtitle.Tag_code[this.jComboBox1.getSelectedIndex()] );            
                        m.setTag2( MergeSubtitle.Tag_code[this.jComboBox5.getSelectedIndex()] );
                        m.Merge();
                        m.SaveMergeSub( this.jTextField3.getText() );                    
                        File f = new File(this.jTextField1.getText()+".temp.srt");
                        if ( f.delete() ){ 
                            Logger.getLogger(this.getName()).info("temp translate delete : successfully ");
                        } else {
                            Logger.getLogger(this.getName()).info("temp translate delete : fail ");
                        }

                    } else if ( this.jTabbedPane1.getSelectedIndex() == 0 ){//Tab 0 == Merget
                        MergeSubtitle m = new MergeSubtitle();
                        m.getInputFile(this.jTextField1.getText(), this.jTextField2.getText() );
                        m.setTag1( MergeSubtitle.Tag_code[this.jComboBox1.getSelectedIndex()] );   
                        m.setTag2( MergeSubtitle.Tag_code[this.jComboBox2.getSelectedIndex()] );
                        m.Merge();
                        m.SaveMergeSub( this.jTextField3.getText() );                    
                    }
                }
                catch(Exception e){
                    this.jTextArea1.setText( this.jTextArea1.getText() + "\n" + e.getMessage() );
                    e.printStackTrace();
                } finally {
                    this.jTextField3.setEnabled(true);
                    this.jButton1.setEnabled(true);
                    this.jButton2.setEnabled(true);
                    this.jButton4.setEnabled(true);
                    this.jButton5.setEnabled(true);
                    this.jComboBox1.setEnabled(true);
                    this.jComboBox2.setEnabled(true);
                    this.jComboBox3.setEnabled(true);
                    this.jComboBox4.setEnabled(true);
                    this.jComboBox5.setEnabled(true);
                    Logger.getLogger(View.this.getName()).log(Level.INFO, "Finished!");
                }
            else
                Logger.getLogger(View.this.getName()).log(Level.WARNING, "File Input");
                 //this.jTextArea1.setText( this.jTextArea1.getText() + "\n" + "FILE INPUT" );

    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if ( !this.jTextField1.getText().isEmpty() ){
            try {
                Scanner in = new Scanner( new InputStreamReader( new FileInputStream( this.jTextField1.getText() )));
                this.jTextArea1.setText( this.jTextArea1.getText() + "\n" + "--------------FILE1----------------" );
                for ( int i = 0; i<7; i++ )
                    this.jTextArea1.setText( this.jTextArea1.getText() + "\n" + in.nextLine() );
                this.jTextArea1.setText( this.jTextArea1.getText() + "\n" + "----------------------------------" );
            } catch (FileNotFoundException ex) {
                this.jTextArea1.setText( this.jTextArea1.getText() + "\n" + ex.getMessage() );
            }
            
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseExited
        if ( !this.jTextField1.getText().isEmpty() && this.jTextField1.isEnabled() ){
            String tmp = this.jTextField1.getText();
            this.jTextField3.setText( tmp.substring(0, tmp.lastIndexOf("/") + 1) + "Merge.srt");
        }
    }//GEN-LAST:event_jTextField1MouseExited

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseExited
        if ( !this.jTextField2.getText().isEmpty() && this.jTextField2.isEnabled() ){
            String tmp = this.jTextField2.getText();
            this.jTextField3.setText( tmp.substring(0, tmp.lastIndexOf("/") + 1) + "Merge.srt");
        }
    }//GEN-LAST:event_jTextField2MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if ( !this.jTextField2.getText().isEmpty() ){
            try {
                Scanner in = new Scanner( new InputStreamReader( new FileInputStream( this.jTextField2.getText() )));
                this.jTextArea1.setText( this.jTextArea1.getText() + "\n" + "--------------FILE2----------------" );
                for ( int i = 0; i<7; i++ )
                this.jTextArea1.setText( this.jTextArea1.getText() + "\n" + in.nextLine() );
                this.jTextArea1.setText( this.jTextArea1.getText() + "\n" + "----------------------------------" );
            } catch (FileNotFoundException ex) {
                this.jTextArea1.setText( this.jTextArea1.getText() + "\n" + ex.getMessage() );
            }

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser l;
        if ( !this.jTextField2.getText().isEmpty() )
        l = new JFileChooser( this.jTextField2.getText() );
        else if ( !this.jTextField1.getText().isEmpty() )
        l = new JFileChooser( this.jTextField1.getText() );
        else
        l = new JFileChooser();

        if ( l.showOpenDialog(null) == JFileChooser.APPROVE_OPTION ){
            this.jTextField2.setText(l.getSelectedFile().getPath() );
        }
        if ( !this.jTextField1.getText().isEmpty() && !this.jTextField2.getText().isEmpty() ){
            this.jTextField3.setText(this.jTextField2.getText().substring(0, this.jTextField2.getText().lastIndexOf("/")) + "/Merge.srt");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }
    
    private class Listen implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           String cmd = e.getActionCommand();
           if ( cmd.compareTo("File1") == 0 ){
               
           }
        }
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
