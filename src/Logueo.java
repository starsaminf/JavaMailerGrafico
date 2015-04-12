
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
/*
 * EnviarCorre.java
 *
 * Created on 31-07-2011, 10:42:19 PM
 * @author sams
 * starsaminf@gmail.com
 */

public class Logueo extends javax.swing.JFrame {

    Properties props = new Properties();
    Session session = null;
    Transport t = null;
    static boolean s = true;

    /** COSNTRUCTOR */
    public Logueo() {
        initComponents();
        this.B_Loge1.setVisible(true);
        this.bien.setVisible(false);
        this.No.setVisible(false);
        this.Cargar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        Lis_correo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        pas = new javax.swing.JTextField();
        No = new javax.swing.JLabel();
        Cargar = new javax.swing.JLabel();
        bien = new javax.swing.JLabel();
        B_Loge1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicia Sesion");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 51, 255));
        setFont(new java.awt.Font("Agency FB", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Eras Medium ITC", 3, 18));
        jLabel3.setText("Java Mailer Zam");

        jLabel1.setText("CORREO ELECTRONICO");

        Lis_correo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "@.....", "@hotmail.com", "@gmail.com" }));
        Lis_correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lis_correoActionPerformed(evt);
            }
        });

        jLabel2.setText("CONTRASEÑA");

        No.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/071.png"))); // NOI18N

        Cargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/aero_light.gif"))); // NOI18N

        bien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/492.png"))); // NOI18N

        B_Loge1.setText("INGRESAR");
        B_Loge1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Loge1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel4.setText("zamuel01@gmail.com");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("inf-121-lab.blogspot.com");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(No)
                        .addGap(18, 18, 18)
                        .addComponent(bien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B_Loge1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pas)
                                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Lis_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lis_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B_Loge1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bien)
                        .addComponent(Cargar)
                        .addComponent(No)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_Loge1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Loge1ActionPerformed
        try {
            // Validamops el LOGUEO 
            this.B_Loge1.setVisible(false);
            this.Cargar.setVisible(true);
            No.setVisible(false);
            t = session.getTransport("smtp");

            if (s) {
                if (logueo(t, user.getText() + "@hotmail.com", pas.getText())) {
                    this.bien.setVisible(true);
                    this.Cargar.setVisible(false);

                    EnviarCorre a = new EnviarCorre(user.getText() + "@hotmail.com", t, session);
                    a.setVisible(true);
                    this.dispose();
                } else {
                    this.No.setVisible(true);
                    this.reset();

                }
            } else {
                if (logueo(t, user.getText() + "@gmail.com", pas.getText())) {
                    this.bien.setVisible(true);
                    this.Cargar.setVisible(false);

                    EnviarCorre a = new EnviarCorre(user.getText() + "@gmail.com", t, session);
                    a.setVisible(true);
                    this.dispose();
                } else {
                    this.No.setVisible(true);
                    this.reset();
                }
            }

        } catch (NoSuchProviderException ex) {
            Logger.getLogger(Logueo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_B_Loge1ActionPerformed

    private void Lis_correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lis_correoActionPerformed
        if (((String) Lis_correo.getSelectedItem()).equals("@hotmail.com")) {
            props.setProperty("mail.smtp.host", "smtp.live.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "25");
            props.setProperty("mail.smtp.user", "STARSAMINF");
            props.setProperty("mail.smtp.auth", "true");
            session = Session.getDefaultInstance(props);
            s = true;

        } else {
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", "STARSAMINF");
            props.setProperty("mail.smtp.auth", "true");
            session = Session.getDefaultInstance(props);
            s = false;
        }
    }//GEN-LAST:event_Lis_correoActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Loge1;
    private javax.swing.JLabel Cargar;
    private javax.swing.JComboBox Lis_correo;
    private static javax.swing.JLabel No;
    private javax.swing.JLabel bien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField pas;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    //restaurar ventana
    public void reset() {
        this.B_Loge1.setVisible(true);
        this.bien.setVisible(false);
        this.No.setVisible(true);
        this.Cargar.setVisible(false);
    }
    //fin restaurar ventana

    ///verifica si el correo y pas son correctos
    public static boolean logueo(Transport t, String coreo, String pas) {
        try {
            t.connect(coreo, pas);
            return true;
        } catch (MessagingException ex) {
            //    System.out.print("NO MALA CONTRASEÑA ");
            //  No.setVisible(true);
            return false;
        }
    }
    //fin verifica correo y pas 
}
