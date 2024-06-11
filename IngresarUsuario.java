package Interfaz;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class IngresarUsuario extends JFrame {
   private JPanel background;
   private JButton botonAceptar;
   private JLabel labelApellidos;
   private JLabel labelCorreo;
   private JLabel labelDireccion;
   private JLabel labelNombre;
   private JLabel labelNombre1;
   private JLabel labelTelefono;
   private JLabel logo;
   private JTextField textFieldApellidos;
   private JTextField textFieldCorreo;
   private JTextField textFieldDireccion;
   private JTextField textFieldNombre;
   private JTextField textFieldTelefono;

   public IngresarUsuario() {
      this.initComponents();
   }

   private void initComponents() {
      this.labelNombre1 = new JLabel();
      this.background = new JPanel();
      this.labelNombre = new JLabel();
      this.labelDireccion = new JLabel();
      this.labelTelefono = new JLabel();
      this.labelCorreo = new JLabel();
      this.labelApellidos = new JLabel();
      this.logo = new JLabel();
      this.textFieldNombre = new JTextField();
      this.textFieldApellidos = new JTextField();
      this.textFieldCorreo = new JTextField();
      this.textFieldDireccion = new JTextField();
      this.textFieldTelefono = new JTextField();
      this.botonAceptar = new JButton();
      this.labelNombre1.setBackground(new Color(153, 153, 255));
      this.labelNombre1.setFont(new Font("Segoe UI", 0, 14));
      this.labelNombre1.setHorizontalAlignment(0);
      this.labelNombre1.setText("Nombre:");
      this.labelNombre1.setToolTipText("");
      this.labelNombre1.setBorder(BorderFactory.createLineBorder((Color)null));
      this.labelNombre1.setOpaque(true);
      this.setDefaultCloseOperation(3);
      this.background.setBackground(new Color(255, 255, 255));
      this.background.setToolTipText("");
      this.labelNombre.setBackground(new Color(153, 153, 255));
      this.labelNombre.setFont(new Font("Segoe UI", 0, 14));
      this.labelNombre.setHorizontalAlignment(0);
      this.labelNombre.setText("Nombres");
      this.labelNombre.setToolTipText("");
      this.labelNombre.setBorder(BorderFactory.createLineBorder((Color)null));
      this.labelNombre.setOpaque(true);
      this.labelDireccion.setBackground(new Color(153, 153, 255));
      this.labelDireccion.setFont(new Font("Segoe UI", 0, 14));
      this.labelDireccion.setHorizontalAlignment(0);
      this.labelDireccion.setText("Direcci\u00f3n");
      this.labelDireccion.setToolTipText("");
      this.labelDireccion.setBorder(BorderFactory.createLineBorder((Color)null));
      this.labelDireccion.setOpaque(true);
      this.labelTelefono.setBackground(new Color(153, 153, 255));
      this.labelTelefono.setFont(new Font("Segoe UI", 0, 14));
      this.labelTelefono.setHorizontalAlignment(0);
      this.labelTelefono.setText("Telefono");
      this.labelTelefono.setToolTipText("");
      this.labelTelefono.setBorder(BorderFactory.createLineBorder((Color)null));
      this.labelTelefono.setOpaque(true);
      this.labelCorreo.setBackground(new Color(153, 153, 255));
      this.labelCorreo.setFont(new Font("Segoe UI", 0, 14));
      this.labelCorreo.setHorizontalAlignment(0);
      this.labelCorreo.setText("Correo");
      this.labelCorreo.setToolTipText("");
      this.labelCorreo.setBorder(BorderFactory.createLineBorder((Color)null));
      this.labelCorreo.setOpaque(true);
      this.labelApellidos.setBackground(new Color(153, 153, 255));
      this.labelApellidos.setFont(new Font("Segoe UI", 0, 14));
      this.labelApellidos.setHorizontalAlignment(0);
      this.labelApellidos.setText("Apellidos");
      this.labelApellidos.setToolTipText("");
      this.labelApellidos.setBorder(BorderFactory.createLineBorder((Color)null));
      this.labelApellidos.setOpaque(true);
      this.textFieldNombre.setText("Ingrese sus nombres");
      this.textFieldNombre.addActionListener(new 1(this));
      this.textFieldApellidos.setText("Ingrese sus apellidos");
      this.textFieldApellidos.addActionListener(new 2(this));
      this.textFieldCorreo.setText("Ingrese su correo");
      this.textFieldCorreo.addActionListener(new 3(this));
      this.textFieldDireccion.setText("Ingrese su direccion");
      this.textFieldDireccion.addActionListener(new 4(this));
      this.textFieldTelefono.setText("Ingrese su telefono");
      this.textFieldTelefono.addActionListener(new 5(this));
      this.botonAceptar.setText("Aceptar");
      this.botonAceptar.addActionListener(new 6(this));
      GroupLayout backgroundLayout = new GroupLayout(this.background);
      this.background.setLayout(backgroundLayout);
      backgroundLayout.setHorizontalGroup(backgroundLayout.createParallelGroup(Alignment.LEADING).addGroup(backgroundLayout.createSequentialGroup().addGroup(backgroundLayout.createParallelGroup(Alignment.LEADING).addGroup(backgroundLayout.createSequentialGroup().addGap(336, 336, 336).addComponent(this.botonAceptar)).addGroup(backgroundLayout.createSequentialGroup().addGap(204, 204, 204).addGroup(backgroundLayout.createParallelGroup(Alignment.LEADING).addComponent(this.labelNombre, -2, 86, -2).addComponent(this.labelApellidos, -2, 86, -2).addComponent(this.labelDireccion, -2, 86, -2).addComponent(this.labelCorreo, -2, 86, -2).addComponent(this.labelTelefono, -2, 86, -2)).addGap(83, 83, 83).addGroup(backgroundLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.textFieldNombre).addComponent(this.textFieldApellidos).addComponent(this.textFieldDireccion).addComponent(this.textFieldTelefono).addComponent(this.textFieldCorreo, -2, 209, -2)).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.logo, -2, 72, -2))).addContainerGap(58, 32767)));
      backgroundLayout.setVerticalGroup(backgroundLayout.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING, backgroundLayout.createSequentialGroup().addGroup(backgroundLayout.createParallelGroup(Alignment.LEADING).addGroup(backgroundLayout.createSequentialGroup().addGap(25, 25, 25).addComponent(this.logo, -1, 71, 32767).addGap(247, 247, 247)).addGroup(Alignment.TRAILING, backgroundLayout.createSequentialGroup().addContainerGap(-1, 32767).addGroup(backgroundLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.labelNombre, -1, -1, 32767).addComponent(this.textFieldNombre, -2, 27, -2)).addGap(18, 18, 18).addGroup(backgroundLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.labelApellidos, -1, -1, 32767).addComponent(this.textFieldApellidos, -2, 27, -2)).addGap(18, 18, 18).addGroup(backgroundLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.labelDireccion, -1, -1, 32767).addComponent(this.textFieldDireccion, -2, 27, -2)).addGap(18, 18, 18).addGroup(backgroundLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.labelTelefono, -1, -1, 32767).addComponent(this.textFieldTelefono, -2, 27, -2)).addGap(18, 18, 18).addGroup(backgroundLayout.createParallelGroup(Alignment.LEADING, false).addComponent(this.labelCorreo, -1, -1, 32767).addComponent(this.textFieldCorreo, -2, 27, -2)).addGap(55, 55, 55))).addComponent(this.botonAceptar, -2, 27, -2).addGap(67, 67, 67)));
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.background, -1, -1, 32767));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.background, -1, -1, 32767));
      this.pack();
   }

   private void botonAceptarActionPerformed(ActionEvent evt) {
   }

   private void textFieldNombreActionPerformed(ActionEvent evt) {
   }

   private void textFieldApellidosActionPerformed(ActionEvent evt) {
   }

   private void textFieldCorreoActionPerformed(ActionEvent evt) {
   }

   private void textFieldDireccionActionPerformed(ActionEvent evt) {
   }

   private void textFieldTelefonoActionPerformed(ActionEvent evt) {
   }

   public static void main(String[] args) {
      try {
         UIManager.LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            UIManager.LookAndFeelInfo info = var1[var3];
            if ("Nimbus".equals(info.getName())) {
               UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException var5) {
         Logger.getLogger(IngresarUsuario.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(IngresarUsuario.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(IngresarUsuario.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(IngresarUsuario.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new 7());
   }
}
