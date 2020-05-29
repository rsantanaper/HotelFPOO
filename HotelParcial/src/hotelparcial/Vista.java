package hotelparcial;

import java.awt.event.KeyEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Reyes Hernando Santana Perez
 * ID 170035
 */
public class Vista extends javax.swing.JFrame {

    public DefaultTableModel tabla;

    public Vista() {
        initComponents();
        tabla = (DefaultTableModel) tbl_habitacion.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_habitacion = new javax.swing.JTable();
        btn_consulta = new javax.swing.JButton();
        txthab = new javax.swing.JTextField();
        btn_reserva = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Panel de Reservaciones\n");
        setAlwaysOnTop(true);
        setBackground(java.awt.SystemColor.activeCaption);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setLocation(new java.awt.Point(500, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_habitacion.setBackground(java.awt.SystemColor.activeCaption);
        tbl_habitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_habitacion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, -1, 155));

        btn_consulta.setBackground(new java.awt.Color(102, 255, 255));
        btn_consulta.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        btn_consulta.setForeground(new java.awt.Color(153, 153, 255));
        btn_consulta.setText("Consultar");
        btn_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_consulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 205, -1, -1));

        txthab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txthabKeyTyped(evt);
            }
        });
        getContentPane().add(txthab, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 267, 54, -1));

        btn_reserva.setBackground(new java.awt.Color(102, 102, 255));
        btn_reserva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btn_reserva.setForeground(new java.awt.Color(0, 0, 255));
        btn_reserva.setText("Reservar");
        btn_reserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reservaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 266, -1, 30));

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 5, -1, -1));

        jLabel2.setText("Habitacion a reservar: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        btn_salir.setBackground(new java.awt.Color(255, 51, 102));
        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 268, 70, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaActionPerformed
        tabla.setColumnCount(0);
        tabla.setRowCount(0);
        try {
            mostrar();
        } catch (RemoteException | NotBoundException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_consultaActionPerformed

    private void btn_reservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reservaActionPerformed
        reservar();
    }//GEN-LAST:event_btn_reservaActionPerformed

    private void txthabKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthabKeyTyped
        int NA = evt.getKeyChar();
        if (Character.isDigit(NA) || NA == KeyEvent.VK_DELETE) {

        } else {
            evt.consume();
            JOptionPane.showMessageDialog(null,"Solo ingrese numeros!","Ventana Error Datos",JOptionPane.ERROR_MESSAGE);
            getToolkit().beep();
        }
    }//GEN-LAST:event_txthabKeyTyped

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    private void mostrar() throws RemoteException, NotBoundException {
        try {
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 4800);
            Hotel hothab = (Hotel) reg.lookup("Hotel");
            List<Habitacion> ls = hothab.ConsultarHabitacion();
            tabla.addColumn("Habitacion");
            tabla.addColumn("Valor");
            tabla.addColumn("Camas");
            String[] fila = {"", "", ""};
            for (Habitacion s : ls) {
                fila[0] = Integer.toString(s.getHabitacion());
                fila[1] = Integer.toString(s.getValor());
                fila[2] = Integer.toString(s.getCamas());
                tabla.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
    
    private void reservar(){
        try {
            Registry reg = LocateRegistry.getRegistry("127.0.0.1", 4800);
            Hotel hothab = (Hotel) reg.lookup("Hotel");
            
            int hab = Integer.parseInt(txthab.getText());
            String res = hothab.ReservarHabitacion(hab);
            JOptionPane.showMessageDialog(null,res,"Reserva",JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consulta;
    private javax.swing.JButton btn_reserva;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_habitacion;
    private javax.swing.JTextField txthab;
    // End of variables declaration//GEN-END:variables

}
