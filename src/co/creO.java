/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultListModel;
import java.util.Arrays;
import java.util.ArrayList;

/**
 *
 * @author anngi
 */
public class creO extends javax.swing.JFrame {

    /**
     * Creates new form creO
     */
    public creO() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 124, 426, 236));

        jButton1.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        jButton1.setText("Ordenar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 378, 168, 53));

        jButton2.setFont(new java.awt.Font("Ravie", 0, 14)); // NOI18N
        jButton2.setText("Desordenar");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 378, 183, 53));

        jLabel1.setFont(new java.awt.Font("Pristina", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 255));
        jLabel1.setText("Creencias Fundamentales De La Religion Adventista");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 68, 489, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\anngi\\Documents\\Programacion\\OrdenCreencias\\Imagen\\fondo_pantalla - copia.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        jMenu1.setBackground(new java.awt.Color(204, 255, 204));
        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
      
    }//GEN-LAST:event_formFocusGained

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       DefaultListModel listModel = new DefaultListModel();
       String CRA [] = new String [28];
       CRA[0]="1.Las Sagradas Escrituras";
       CRA[1]="2.La Trinidad";
       CRA[2]="3.Dios Padre";
       CRA[3]="4.Dios Hijo";
       CRA[4]="5.Dios Espíritu Santo";
       CRA[5]="6.Dios es el Creador";
       CRA[6]="7.La Naturaleza del Hombre";
       CRA[7]="8.El Gran Conflicto";
       CRA[8]="9.Vida, Muerte y Ressurrección de Cristo";
       CRA[9]="10.La Experiencia de la Salvación";
       CRA[10]="11.El crecimiento en Cristo";
       CRA[11]="12.La Iglesia";
       CRA[12]="13.El Remaneciente y su Misión";
       CRA[13]="14.Unidad en el Cuerpo de Cristo";
       CRA[14]="15.El Bautismo";
       CRA[15]="16.La Cena del Señor";
       CRA[16]="17.Dones y Ministerios Espirituales";
       CRA[17]="18.El Don de Profecía";
       CRA[18]="19.La Ley de Dios";
       CRA[19]="20.El Sábado";
       CRA[20]="21.Mayordomía";
       CRA[21]="22.Conducta Cristiana";
       CRA[22]="23.Matrimonio y Familia";
       CRA[23]="24.El Ministerio de Cristo en el Santuario Celestial";
       CRA[24]="25.La Segunda Venida de Cristo";
       CRA[25]="26.Muerte y Resurrección";
       CRA[26]="27.El Milenio y El Fin Del Pecado";
       CRA[27]="28.La Nueva tierra";
for(int i=0; i<CRA.length; i++) {
   listModel.addElement(CRA[i]);
}
 jList1.setModel(listModel);  
 
  
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     cargarORDEN ();   // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  cargarDESORDEN() ;
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
            java.util.logging.Logger.getLogger(creO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(creO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(creO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(creO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new creO().setVisible(true);
            }
        });
    }
 public void cargarDESORDEN() {
  ;
     String CRA [] = new String [28];
       CRA[0]="1.Las Sagradas Escrituras";
       CRA[1]="2.La Trinidad";
       CRA[2]="3.Dios Padre";
       CRA[3]="4.Dios Hijo";
       CRA[4]="5.Dios Espíritu Santo";
       CRA[5]="6.Dios es el Creador";
       CRA[6]="7.La Naturaleza del Hombre";
       CRA[7]="8.El Gran Conflicto";
       CRA[8]="9.Vida, Muerte y Ressurrección de Cristo";
       CRA[9]="10.La Experiencia de la Salvación";
       CRA[10]="11.El crecimiento en Cristo";
       CRA[11]="12.La Iglesia";
       CRA[12]="13.El Remaneciente y su Misión";
       CRA[13]="14.Unidad en el Cuerpo de Cristo";
       CRA[14]="15.El Bautismo";
       CRA[15]="16.La Cena del Señor";
       CRA[16]="17.Dones y Ministerios Espirituales";
       CRA[17]="18.El Don de Profecía";
       CRA[18]="19.La Ley de Dios";
       CRA[19]="20.El Sábado";
       CRA[20]="21.Mayordomía";
       CRA[21]="22.Conducta Cristiana";
       CRA[22]="23.Matrimonio y Familia";
       CRA[23]="24.El Ministerio de Cristo en el Santuario Celestial";
       CRA[24]="25.La Segunda Venida de Cristo";
       CRA[25]="26.Muerte y Resurrección";
       CRA[26]="27.El Milenio y El Fin Del Pecado";
       CRA[27]="28.La Nueva tierra";
           modelList = new DefaultListModel();
           jList1.setModel(modelList);
        ArrayList<Integer> valores = generarValoresAleatorios();
    for (Integer valor : valores) {
            modelList.addElement(CRA [valor]);
        }
    }

public ArrayList<Integer> generarValoresAleatorios() {
       ArrayList<Integer> valores = new ArrayList<Integer>();
        int valor = 0;
    for (int i = 0; i < 28; i++) {
        valor = (int) ((Math.random()*(28*1)-1));
        valores.add(valor);
        }
        return valores;
 }
  public void vector() { 
      
  }
  
  
    public void cargarORDEN() {
     DefaultListModel listModel = new DefaultListModel();
       String CRA [] = new String [28];
       CRA[0]="1.Las Sagradas Escrituras"; CRA[4]="5.Dios Espíritu Santo";CRA[26]="27.El Milenio y El Fin Del Pecado";
       CRA[6]="7.La Naturaleza del Hombre";CRA[5]="6.Dios es el Creador"; CRA[7]="8.El Gran Conflicto";CRA[2]="3.Dios Padre";
       CRA[8]="9.Vida, Muerte y Ressurrección de Cristo";CRA[9]="10.La Experiencia de la Salvación";CRA[12]="13.El Remaneciente y su Misión";
       CRA[11]="12.La Iglesia";      CRA[10]="11.El crecimiento en Cristo";CRA[13]="14.Unidad en el Cuerpo de Cristo";CRA[20]="21.Mayordomía";
       CRA[14]="15.El Bautismo"; CRA[15]="16.La Cena del Señor";  CRA[16]="17.Dones y Ministerios Espirituales";  CRA[17]="18.El Don de Profecía";
       CRA[1]="2.La Trinidad";CRA[19]="20.El Sábado";   CRA[21]="22.Conducta Cristiana";  CRA[22]="23.Matrimonio y Familia"; CRA[3]="4.Dios Hijo";
       CRA[23]="24.El Ministerio de Cristo en el Santuario Celestial"; CRA[24]="25.La Segunda Venida de Cristo"; CRA[25]="26.Muerte y Resurrección";
       CRA[27]="28.La Nueva tierra";
for(int i=0; i<CRA.length; i++) {
   listModel.addElement(CRA[i]);
}
 jList1.setModel(listModel);  
 int i,j = 0;
 String aux;
    for(i=0;i<CRA.length-1;i++)
        for(j=0;j<CRA.length-i-1;j++)
            if(CRA[j].compareToIgnoreCase( CRA[j+1] ) > 0 ) { 
                    aux   = CRA[j]; 
                    CRA[j]  = CRA[j+1]; 
                    CRA[j+1]= aux; 
                 }  listModel.addElement(CRA[j+1]);
jList1.setModel(listModel); 

       }
    private DefaultListModel modelList;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
