package org.example;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class AñadirUsuario extends JFrame {
    private JTextField correo;
    private JComboBox idioma;
    private JComboBox plataforma;
    private JButton confirmarYGuardarButton;
    private JButton volverAtrásButton;
    private JPanel ventana;
    private JTable tabla;
    private JCheckBox checkBox1;
    private DefaultTableModel model;

    public AñadirUsuario() {
        this.setContentPane(ventana);
        this.setTitle("Añadir Usuario");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);

        String[] cabecera = {"Titulo","Plataforma","Año"};
        model = new DefaultTableModel(cabecera,0);
        tabla.setModel(model);


        confirmarYGuardarButton.addActionListener((ActionEvent e)-> {

            String correo = this.correo.getText();
            String idioma = this.idioma.getSelectedItem().toString();
            String rol = this.plataforma.getSelectedItem().toString();

            if (correo.isEmpty()|| idioma.isEmpty() || rol.isEmpty()){
                JOptionPane.showMessageDialog(this, "Hay campos vacios");
                return;
            }

            checkBox1.getText();
            if (checkBox1.isSelected()){
                JOptionPane.showMessageDialog(this, "Usuario [Administrador] creado correctamente "+correo);
            }else{
                JOptionPane.showMessageDialog(this, "Usuario creado correctamente "+correo);
            }


            model.addRow(new Object[]{correo, idioma, rol});




        });










    }


}
