/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo3.Vistas;

/**
 *
 * @author PC
 */
public class MateriasView extends javax.swing.JInternalFrame {

    /**
     * Creates new form MateriasView
     */
    public MateriasView() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtAnio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jchEstado = new javax.swing.JCheckBox();
        jbGuardar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("MATERIAS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("ID");

        jbBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbBuscar.setText("BUSCAR");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("NOMBRE");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("AÑO");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("ESTADO");

        jbGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbGuardar.setText("GUARDAR");

        jbBorrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbBorrar.setText("BORRAR");

        jbActualizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbActualizar.setText("ACTUALIZAR");

        jbLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbLimpiar.setText("LIMPIAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(51, 51, 51)
                .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbBuscar)
                .addGap(53, 53, 53))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(jtAnio)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbGuardar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jchEstado)))
                                .addGap(18, 18, 18)
                                .addComponent(jbBorrar)
                                .addGap(18, 18, 18)
                                .addComponent(jbActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(jbLimpiar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jchEstado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscar))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbBorrar)
                    .addComponent(jbActualizar)
                    .addComponent(jbLimpiar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JCheckBox jchEstado;
    private javax.swing.JTextField jtAnio;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
