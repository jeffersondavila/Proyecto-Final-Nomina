
package vista;

import Imagenes.fondovistas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeff
 */
public class ChequesEmpleados extends javax.swing.JInternalFrame {

 String cod;
    /**
     * Creates new form BajasEmpleados
     */
    public ChequesEmpleados() {
        initComponents();
        Label5.setBorder(new fondovistas());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JLabel();
        txt_puesto = new javax.swing.JLabel();
        txt_estado = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        ESTADO = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_sueldo = new javax.swing.JLabel();
        btnIngresar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_extraordinario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_bonificacion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_comision = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_otros = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_anticipos = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_descuentos = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        btnTotal = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txt_confirmar = new javax.swing.JTextField();
        Label5 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setMaximumSize(new java.awt.Dimension(550, 630));
        setMinimumSize(new java.awt.Dimension(550, 630));
        setPreferredSize(new java.awt.Dimension(550, 630));
        setVisible(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        jLabel1.setText("Codigo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(128, 72, 36, 26);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(182, 72, 91, 30);

        jLabel2.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(125, 121, 41, 26);

        jLabel3.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(125, 165, 43, 26);

        jLabel4.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        jLabel4.setText("Puesto:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(125, 209, 36, 26);

        jLabel5.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        jLabel5.setText("Estado:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(126, 297, 36, 26);
        getContentPane().add(txt_nombre);
        txt_nombre.setBounds(188, 121, 178, 16);
        getContentPane().add(txt_apellido);
        txt_apellido.setBounds(188, 165, 178, 16);
        getContentPane().add(txt_puesto);
        txt_puesto.setBounds(188, 209, 178, 14);
        getContentPane().add(txt_estado);
        txt_estado.setBounds(188, 297, 178, 14);

        btnBuscar.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(291, 68, 75, 35);
        getContentPane().add(ESTADO);
        ESTADO.setBounds(232, 576, 0, 0);

        jLabel11.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        jLabel11.setText("Sueldo:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(126, 253, 35, 26);
        getContentPane().add(txt_sueldo);
        txt_sueldo.setBounds(188, 253, 178, 16);

        btnIngresar.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        btnIngresar.setText("INGRESAR");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar);
        btnIngresar.setBounds(370, 530, 106, 35);

        jLabel10.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        jLabel10.setText("Sueldo Extraordinario:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(10, 378, 106, 26);
        getContentPane().add(txt_extraordinario);
        txt_extraordinario.setBounds(120, 378, 134, 30);

        jLabel13.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        jLabel13.setText("Bonificación:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(55, 415, 61, 26);
        getContentPane().add(txt_bonificacion);
        txt_bonificacion.setBounds(120, 415, 134, 30);

        jLabel14.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        jLabel14.setText("Comisiones:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(58, 456, 58, 26);
        getContentPane().add(txt_comision);
        txt_comision.setBounds(120, 456, 134, 30);

        jLabel15.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        jLabel15.setText("Otros:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(82, 493, 30, 26);
        getContentPane().add(txt_otros);
        txt_otros.setBounds(120, 493, 134, 30);

        jLabel16.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        jLabel16.setText("Anticipos:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(301, 378, 49, 26);
        getContentPane().add(txt_anticipos);
        txt_anticipos.setBounds(354, 378, 134, 30);

        jLabel17.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        jLabel17.setText("Descuentos:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(293, 415, 58, 26);
        getContentPane().add(txt_descuentos);
        txt_descuentos.setBounds(355, 415, 133, 30);

        jLabel18.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        jLabel18.setText("Confirmar Codigo:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 340, 90, 26);

        jLabel19.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        jLabel19.setText("Descuentos");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(414, 341, 68, 26);

        txt_total.setEditable(false);
        getContentPane().add(txt_total);
        txt_total.setBounds(355, 493, 133, 30);

        jLabel20.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        jLabel20.setText("Total Devengado");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(272, 493, 79, 26);

        btnTotal.setFont(new java.awt.Font("Javanese Text", 0, 11)); // NOI18N
        btnTotal.setText("Total Devengado");
        btnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalActionPerformed(evt);
            }
        });
        getContentPane().add(btnTotal);
        btnTotal.setBounds(355, 452, 128, 35);

        jLabel6.setFont(new java.awt.Font("Javanese Text", 1, 20)); // NOI18N
        jLabel6.setText("Cheques Empleados");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(142, 30, 200, 30);
        getContentPane().add(txt_confirmar);
        txt_confirmar.setBounds(120, 340, 130, 30);
        getContentPane().add(Label5);
        Label5.setBounds(0, 0, 540, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:  
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdnomina", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from templeados where codigoE = ?");
            pst.setString(1, jTextField1.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                txt_nombre.setText(rs.getString("nombreE"));
                txt_apellido.setText(rs.getString("apellidoE"));
                txt_puesto.setText(rs.getString("puestoE"));
                txt_sueldo.setText(rs.getString("sueldoE"));
                txt_estado.setText(rs.getString("estadoE"));
                cod=jTextField1.getText();
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no registrado.");
            jTextField1.setText("");
            }
            
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

        int b1, b2;
        b1 = Integer.parseInt(jTextField1.getText());
        b2 = Integer.parseInt(txt_confirmar.getText());
        
        try{
            if (b1 == b2)
            {
                
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bdnomina", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into tCheques values(?,?,?,?,?,?,?,?,?)");
            pst.setString(1, "0");
            pst.setString(2, txt_confirmar.getText().trim());
            pst.setString(3,txt_extraordinario.getText().trim());
            pst.setString(4, txt_bonificacion.getText().trim());
            pst.setString(5, txt_comision.getText().trim());
            pst.setString(6, txt_otros.getText().trim());
            pst.setString(7, txt_anticipos.getText().trim());
            pst.setString(8, txt_descuentos.getText().trim());
            pst.setString(9, txt_total.getText().trim());
            pst.executeUpdate();
            
            txt_confirmar.setText("");
            txt_extraordinario.setText("");
            txt_bonificacion.setText("");
            txt_comision.setText("");
            txt_otros.setText("");
            txt_anticipos.setText("");
            txt_descuentos.setText("");
            txt_total.setText("");
            
            txt_nombre.setText(null);
            txt_apellido.setText(null);
            txt_puesto.setText(null);
            txt_sueldo.setText(null);
            txt_estado.setText(null);
            jTextField1.setText(null);
            
            }
            
            else 
            {
                JOptionPane.showMessageDialog(null, "El codigo del Empleado es incorrecto");
            }
            

        }catch (Exception e){
            System.out.print(e.getMessage());
        }
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalActionPerformed

        double sueldo, sueldoex, bonificacion, comision, otro, anticipo, descuento, total;
        
        sueldo= Double.parseDouble(txt_sueldo.getText());
        sueldoex= Double.parseDouble(txt_extraordinario.getText());
        bonificacion= Double.parseDouble(txt_bonificacion.getText());
        comision= Double.parseDouble(txt_comision.getText());
        otro= Double.parseDouble(txt_otros.getText());
        anticipo= Double.parseDouble(txt_anticipos.getText());
        descuento= Double.parseDouble(txt_descuentos.getText());
        
        total= sueldo + sueldoex + bonificacion + comision + otro - anticipo - descuento;
        
        txt_total.setText(String.valueOf(total));
        
    }//GEN-LAST:event_btnTotalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ESTADO;
    private javax.swing.JLabel Label5;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt_anticipos;
    private javax.swing.JLabel txt_apellido;
    private javax.swing.JTextField txt_bonificacion;
    private javax.swing.JTextField txt_comision;
    private javax.swing.JTextField txt_confirmar;
    private javax.swing.JTextField txt_descuentos;
    private javax.swing.JLabel txt_estado;
    private javax.swing.JTextField txt_extraordinario;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JTextField txt_otros;
    private javax.swing.JLabel txt_puesto;
    private javax.swing.JLabel txt_sueldo;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
