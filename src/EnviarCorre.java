
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
/*
 * EnviarCorre.java
 *
 * Created on 31-07-2011, 10:42:19 PM
 * @author sams
 * starsaminf@gmail.com
 */

public class EnviarCorre extends javax.swing.JFrame {

    Session session;
    Transport t;
    MimeMessage message;
    String coreo = "";

    public EnviarCorre() {
        initComponents();
    }

    public EnviarCorre(String coreo, Transport x, Session se) {
        this.coreo = coreo;
        initComponents();
        this.Jde.setText(coreo);
        session = se;
        t = x;
        message = new MimeMessage(session);
        B.setVisible(false);
        N.setVisible(false);
        Mailmalo.setVisible(false);
        Asuntomalo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        BEnviar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Jde = new javax.swing.JTextField();
        Jpara = new javax.swing.JTextField();
        Jasunto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mensaje = new javax.swing.JTextArea();
        B = new javax.swing.JLabel();
        N = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Mailmalo = new javax.swing.JLabel();
        Asuntomalo = new javax.swing.JLabel();

        jDialog1.setTitle("Error al enviar correo");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 12));
        jLabel1.setText("CREAR UN NUEVO MENSAJE");

        BEnviar.setText("Enviar");
        BEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEnviarActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel2.setText("De         :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel3.setText("Para      :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel4.setText("Asunto  :");

        Jde.setEditable(false);

        Mensaje.setColumns(20);
        Mensaje.setRows(5);
        Mensaje.setText("starsaminf");
        jScrollPane1.setViewportView(Mensaje);

        B.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/492.png"))); // NOI18N

        N.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/071.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel5.setText("Creado por Zam");

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel6.setText("zamuel01@gmail.com");

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 11));
        jLabel7.setText("zamuel01@gmail.com");

        Mailmalo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Mailmalo.setForeground(new java.awt.Color(255, 0, 102));
        Mailmalo.setText("CORREO MALO");

        Asuntomalo.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        Asuntomalo.setForeground(new java.awt.Color(255, 102, 102));
        Asuntomalo.setText("FALTA ASUNTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(BEnviar)
                                    .addGap(48, 48, 48)
                                    .addComponent(jButton2))
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel5)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                            .addComponent(B)
                            .addGap(18, 18, 18)
                            .addComponent(N))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Jasunto))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Jde))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Jpara, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Asuntomalo)
                                        .addComponent(Mailmalo))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Jde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jpara, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Mailmalo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jasunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(Asuntomalo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BEnviar)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(B)
                        .addComponent(N)))
                .addGap(3, 3, 3)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEnviarActionPerformed
        BEnviar.setVisible(false);
        if (validar2()) {
            Mailmalo.setVisible(false);
            if (validar3()) {
                Asuntomalo.setVisible(false);
                try {
                    MimeMessage message = new MimeMessage(session);
                    message.setFrom(new InternetAddress(coreo));
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(Jpara.getText()));
                    message.setSubject(Jasunto.getText() + " zam");
                    message.setText(Mensaje.getText() + "\n\n\nDesarrollador por zam :\n\n Mi correo es :zamuel01@gmail.com\n Mi  blog es ;inf-121-lab.blogspot.com\n\nLICENCIA ---> GNU\n");
                    if (enviar2(t, session, message)) {
                        B.setVisible(true);
                        this.reset(1);
                    } else {
                        JOptionPane.showMessageDialog(this, "ALGO PASO AL ENVIAR EL MENSAJE ", "ERROR ", JOptionPane.ERROR_MESSAGE);
                        N.setVisible(true);
                        this.reset(0);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "ALGO PASO AL ENVIAR EL MENSAJE ", "ERROR ", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                Asuntomalo.setVisible(true);
                BEnviar.setVisible(true);
            }

        } else {
            Mailmalo.setVisible(true);
            BEnviar.setVisible(true);
        }




    }//GEN-LAST:event_BEnviarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // BOTON SALIR
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Asuntomalo;
    private javax.swing.JLabel B;
    private javax.swing.JButton BEnviar;
    private javax.swing.JTextField Jasunto;
    private javax.swing.JTextField Jde;
    private javax.swing.JTextField Jpara;
    private javax.swing.JLabel Mailmalo;
    private javax.swing.JTextArea Mensaje;
    private javax.swing.JLabel N;
    private javax.swing.JButton jButton2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
//VALIDAR 

    public boolean validar2() {
        if (Jpara.getText().indexOf("@") > -1) {
            return true;
        }
        return false;
    }

    public boolean validar3() {
        if (!Jasunto.getText().equals("")) {
            return true;
        }
        return false;
    }
//FIN VALIDAR
    //restaurar ventana

    public void reset(int y) {

        if (y == 1) {
            BEnviar.setVisible(true);
            this.B.setVisible(true);
            this.N.setVisible(false);
            this.BEnviar.setVisible(true);
            Mailmalo.setVisible(false);
            Asuntomalo.setVisible(false);
            Mensaje.setText("");
            Jasunto.setText("");
            Jpara.setText("");
        } else {

            this.B.setVisible(false);
            this.N.setVisible(true);
            this.BEnviar.setVisible(true);
            Mensaje.setText("");
            Jasunto.setText("");
            Jpara.setText("");

        }

    }
    //fin restaurar ventana

    public static boolean enviar2(Transport t, Session session, MimeMessage message) throws MessagingException {
        try {
            for (int i = 0; i < 1; i++) {
                t.sendMessage(message, message.getAllRecipients());
            }

            try {
                t.close();
            } catch (MessagingException ex) {
                Logger.getLogger(EnviarCorre.class.getName()).log(Level.SEVERE, null, ex);
            }
            return true;
        } catch (NoSuchProviderException ex) {
            Logger.getLogger(EnviarCorre.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
