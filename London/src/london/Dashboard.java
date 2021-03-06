
package london;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author alumno
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    ArrayList<Contacto> vContacto;
    ArrayList<String> vVips= null;
      Contacto c;
      DefaultListModel listModelFiesta;
      DefaultListModel listModelGente;
      

    @Override
    public void setTitle(String title) {
        super.setTitle(title); //To change body of generated methods, choose Tools | Templates.
    }
      
    public Dashboard() {
        initComponents();
        vContacto = new ArrayList();        
        vVips= london.Fichero.agregarVipsLista();  
        
        listModelFiesta = new DefaultListModel();
        jListVips.setModel(listModelFiesta);   
        
        listModelGente = new DefaultListModel();
        jListfiesta.setModel(listModelGente);  
        
        for (int i = 0; i < vVips.size(); i++) {
            listModelFiesta.addElement(vVips.get(i).toString());
        }
        this.setTitle("Lista Discoteca London");
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonNuevaPersona = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListVips = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListfiesta = new javax.swing.JList<>();
        jTextFieldDNI = new javax.swing.JTextField();
        jLabelDNItexto = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelLondon = new javax.swing.JLabel();
        jLabelVipsTexto = new javax.swing.JLabel();
        jButtonEntrar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonNuevaPersona.setText("Añadir persona");
        jButtonNuevaPersona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonNuevaPersonaMouseClicked(evt);
            }
        });
        jButtonNuevaPersona.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtonNuevaPersonaKeyPressed(evt);
            }
        });

        jListVips.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListVips);

        jListfiesta.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListfiesta);

        jLabelDNItexto.setText("DNI");

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBuscarMouseClicked(evt);
            }
        });

        jLabelLondon.setText("London");

        jLabelVipsTexto.setText("Gente");

        jButtonEntrar.setText("Entrar");
        jButtonEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEntrarMouseClicked(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelLondon)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(jButtonNuevaPersona)
                                    .addComponent(jTextFieldDNI)
                                    .addComponent(jLabelDNItexto)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabelVipsTexto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBuscar))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabelLondon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelDNItexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jButtonNuevaPersona)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelVipsTexto)
                            .addComponent(jButtonEntrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalir)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevaPersonaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtonNuevaPersonaKeyPressed
    
      
      
    }//GEN-LAST:event_jButtonNuevaPersonaKeyPressed

    private void jButtonNuevaPersonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonNuevaPersonaMouseClicked
          c = new Contacto(jTextFieldDNI.getText());
        vContacto.add(c);
        listModelGente.removeAllElements();        
        for (int i = 0; i < vContacto.size(); i++) {
            listModelGente.addElement(vContacto.get(i).toString());
        }
        jTextFieldDNI.setText("");
    }//GEN-LAST:event_jButtonNuevaPersonaMouseClicked

    private void jButtonEntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEntrarMouseClicked
      String s = (String) jListVips.getSelectedValue();
      
      
       
       c = new Contacto(s);
       vContacto.add(c);
       listModelGente.removeAllElements();
       
         for (int i = 0; i <  vVips.size(); i++) {
            if (vVips.get(i).equalsIgnoreCase(s)){    
                listModelFiesta.removeElement(vVips.get(i));
               vVips.remove(i);
               
            }
         }
        
        for (int i = 0; i < vContacto.size(); i++) {
            listModelGente.addElement(vContacto.get(i).toString());
        }
       
        
        s=null;
      
    }//GEN-LAST:event_jButtonEntrarMouseClicked

    private void jButtonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalirMouseClicked
         String sdos = (String) jListfiesta.getSelectedValue(); 
         
         vVips.add(sdos);
         
           listModelFiesta.removeAllElements();
         
        for (int i = 0; i <  vVips.size(); i++) {         
          listModelFiesta.addElement(vVips.get(i).toString());           
        }
           
         
       for (int i = 0; i <  vContacto.size(); i++) {
            if (vContacto.get(i).getDni().equalsIgnoreCase(sdos)){
                listModelGente.removeElement(vContacto.get(i));
               vContacto.remove(i);
                
            }
         }
     
       listModelGente.removeAllElements();
        for (int i = 0; i < vContacto.size(); i++) {
            listModelGente.addElement(vContacto.get(i).toString());
        }
       
       
        sdos=null;
    }//GEN-LAST:event_jButtonSalirMouseClicked

    private void jButtonBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarMouseClicked
        
       listModelGente.removeAllElements();       
             
       for (int i = 0; i <  vContacto.size(); i++) {
            if (vContacto.get(i).getDni().equalsIgnoreCase(jTextFieldBuscar.getText())){
                listModelGente.addElement(vContacto.get(i));
                
            }
         }
        jTextFieldBuscar.setText("");
    }//GEN-LAST:event_jButtonBuscarMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEntrar;
    private javax.swing.JButton jButtonNuevaPersona;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelDNItexto;
    private javax.swing.JLabel jLabelLondon;
    private javax.swing.JLabel jLabelVipsTexto;
    private javax.swing.JList<String> jListVips;
    private javax.swing.JList<String> jListfiesta;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldDNI;
    // End of variables declaration//GEN-END:variables
}
