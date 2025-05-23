/*
 * Copyright (c) 2014  Akila Ranasinghe </ SPYD3R-X >
 * All rights reserved.
 * GitHub: https://github.com/SPYD3R-X
 * 09 Nov 2014 08:36:10 PM By AKILA.
 */
package UI;

import com.sun.java.swing.plaf.windows.WindowsButtonUI;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import static UI.Alarm_UI.lb_check;
import static UI.Alarm_UI.lb_currently_state;
import static UI.Alarm_UI.settings_ampm;
import static UI.Alarm_UI.settings_hr;
import static UI.Alarm_UI.settings_min;
import static UI.Alarm_UI.settings_tn;
import static UI.Alarm_UI.txt_alm_timeviewer;
import static UI.Alarm_UI.txt_on_off;

/**
 *
 * @author AKILA
 */
public class Settings_UI extends javax.swing.JDialog {

    /**
     * Creates new form Settings_UI
     *
     * @param parent
     * @param modal
     */
    public Settings_UI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setuis();
        check();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox_hour = new javax.swing.JComboBox();
        jComboBox_min = new javax.swing.JComboBox();
        jComboBox_ampm = new javax.swing.JComboBox();
        btn_alarmON = new javax.swing.JButton();
        btn_alarmOFF = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_tone = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btn_play = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alarm Settings");
        setAlwaysOnTop(true);
        setResizable(false);

        jComboBox_hour.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jComboBox_hour.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Hour", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBox_min.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jComboBox_min.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Min", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));

        jComboBox_ampm.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jComboBox_ampm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AM", "PM" }));

        btn_alarmON.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_alarmON.setText("On");
        btn_alarmON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alarmONActionPerformed(evt);
            }
        });

        btn_alarmOFF.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_alarmOFF.setText("Off");
        btn_alarmOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alarmOFFActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Alarm time settings");

        jComboBox_tone.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jComboBox_tone.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tone 1", "Tone 2", "Tone 3" }));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Alarm tone");

        btn_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Play_1.png"))); // NOI18N
        btn_play.setText("  Play");
        btn_play.setContentAreaFilled(false);
        btn_play.setFocusPainted(false);
        btn_play.setFocusable(false);
        btn_play.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_play.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Play_2.png"))); // NOI18N
        btn_play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_playActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jComboBox_hour, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox_ampm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jComboBox_tone, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_play))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_alarmON, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_alarmOFF)
                .addGap(64, 64, 64))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox_hour, jComboBox_min});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_alarmOFF, btn_alarmON});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox_hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_min, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_ampm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_play, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_tone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_alarmON)
                    .addComponent(btn_alarmOFF))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_alarmOFF, btn_alarmON});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox_ampm, jComboBox_hour, jComboBox_min, jLabel3});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn_play, jComboBox_tone});

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_alarmONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alarmONActionPerformed

        int aa = jComboBox_hour.getSelectedIndex();
        int bb = jComboBox_min.getSelectedIndex();
        if (0 == aa) {
            this.setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(null, "Select hour befor set alarm", "", 0);
            this.setAlwaysOnTop(true);
        }
        if (0 == bb) {
            this.setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(null, "Select minute befor set alarm", "", 0);
            this.setAlwaysOnTop(true);
        }
        if (!(0 == aa | 0 == bb)) {
            try {
                String hour = jComboBox_hour.getSelectedItem().toString();
                String min = jComboBox_min.getSelectedItem().toString();
                String ampm = jComboBox_ampm.getSelectedItem().toString();
                Alarm_UI.seted_time.setText(hour + ":" + min + "-" + ampm);
                int tn = jComboBox_tone.getSelectedIndex();

                Alarm_UI.txt_on_off.setText("Alarm On");
                Alarm_UI.txt_alm_timeviewer.setText(hour + ":" + min + " " + ampm);
                Alarm_UI.lb_currently_state.setText("off");
                Alarm_UI.btn_on_off.setVisible(false);
                Alarm_UI.txt_tone_no.setText(String.valueOf(tn));
                Alarm_UI.btn_count_on.doClick();

                int stng_hr = jComboBox_hour.getSelectedIndex();
                int stng_min = jComboBox_min.getSelectedIndex();
                int stng_ampm = jComboBox_ampm.getSelectedIndex();
                int stng_tone = jComboBox_tone.getSelectedIndex();

                Alarm_UI.lb_check.setText("ac");
                Alarm_UI.settings_hr.setText(String.valueOf(stng_hr));
                Alarm_UI.settings_min.setText(String.valueOf(stng_min));
                Alarm_UI.settings_ampm.setText(String.valueOf(stng_ampm));
                Alarm_UI.settings_tn.setText(String.valueOf(stng_tone));
                this.dispose();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_alarmONActionPerformed

    private void btn_alarmOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alarmOFFActionPerformed

        txt_on_off.setText("Alarm off");
        txt_alm_timeviewer.setText("00:00   ");
        lb_currently_state.setText("on");
        Alarm_UI.lb_check.setText("nac");
        this.dispose();
    }//GEN-LAST:event_btn_alarmOFFActionPerformed

    private void btn_playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_playActionPerformed

        // Play Selected Alarm-Audio...
        int i = jComboBox_tone.getSelectedIndex();
        if (i == 0) {
            try {
                URL url = this.getClass().getResource("/Audio/alarm1.wav");
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
                Clip clip = AudioSystem.getClip();
                clip.open(audioIn);
                clip.start();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                System.out.println(e);
            }
        }
        if (i == 1) {
            try {
                URL url = this.getClass().getResource("/Audio/alarm2.wav");
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
                Clip clip = AudioSystem.getClip();
                clip.open(audioIn);
                clip.start();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                System.out.println(e);
            }
        }
        if (i == 2) {
            try {
                URL url = this.getClass().getResource("/Audio/alarm3.wav");
                AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
                Clip clip = AudioSystem.getClip();
                clip.open(audioIn);
                clip.start();
            } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
                System.out.println(e);
            }
        }

    }//GEN-LAST:event_btn_playActionPerformed

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
            java.util.logging.Logger.getLogger(Settings_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Settings_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Settings_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Settings_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Settings_UI dialog = new Settings_UI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_alarmOFF;
    public static javax.swing.JButton btn_alarmON;
    public static javax.swing.JButton btn_play;
    public static javax.swing.JComboBox jComboBox_ampm;
    public static javax.swing.JComboBox jComboBox_hour;
    public static javax.swing.JComboBox jComboBox_min;
    public static javax.swing.JComboBox jComboBox_tone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    private void setuis() {

        btn_play.setUI(new WindowsButtonUI());
        btn_play.setContentAreaFilled(false);
        btn_play.setFocusPainted(false);
    }

    private void check() {
        String s = "ac";
        String ss = "nac";
        String txt = lb_check.getText();

        if (txt.equals(s)) {
            int hr = Integer.valueOf(settings_hr.getText());
            int min = Integer.valueOf(settings_min.getText());
            int ampm = Integer.valueOf(settings_ampm.getText());
            int tn = Integer.valueOf(settings_tn.getText());
            jComboBox_hour.setSelectedIndex(hr);
            jComboBox_min.setSelectedIndex(min);
            jComboBox_ampm.setSelectedIndex(ampm);
            jComboBox_tone.setSelectedIndex(tn);
        }
    }
}
