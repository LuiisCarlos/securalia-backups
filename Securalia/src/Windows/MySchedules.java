package Windows;

import Classes.*;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 * Clase que representa una ventana modal para mostrar y gestionar
 * las programaciones de copias de seguridad.
 * 
 * @author Luis Carlos Caicedo Giraldo
 */
public class MySchedules extends javax.swing.JDialog {
    
    /** Referencia al marco principal de la aplicación, permitiendo la interacción con la ventana principal. */
    private final Main PARENT;

    /**
     * Constructor de la clase MySchedules.
     * Crea una nueva instancia de la ventana MySchedules como una ventana modal.
     * 
     * @param parent el marco padre de la ventana, que debe ser una instancia de {@link Main}
     * @param modal indica si la ventana es modal (true) o no (false).
     */
    public MySchedules(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        PARENT = (Main) parent;
        this.initApp();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backBtn = new javax.swing.JPanel();
        backLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Securalia | Ver mis programaciones");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(246, 236, 234));

        titleLbl.setFont(new java.awt.Font("Reem Kufi", 1, 23)); // NOI18N
        titleLbl.setForeground(new java.awt.Color(119, 70, 61));
        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("MIS  PROGRAMACIONES");

        jTable1.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            },
            new String [] {

            }
        ));
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        backBtn.setBackground(new java.awt.Color(186, 114, 100));

        backLbl.setFont(new java.awt.Font("Rubik", 0, 12)); // NOI18N
        backLbl.setForeground(new java.awt.Color(255, 255, 255));
        backLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backLbl.setText("Atras");
        backLbl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLblMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backLblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backLblMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backLblMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                backLblMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout backBtnLayout = new javax.swing.GroupLayout(backBtn);
        backBtn.setLayout(backBtnLayout);
        backBtnLayout.setHorizontalGroup(
            backBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        backBtnLayout.setVerticalGroup(
            backBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(titleLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jSeparator1))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="Custom Code"> 
    /**
     * Inicializa la configuración de la ventana.
     * Establece el tamaño y la posición de la ventana en función de la ventana padre.
     * También llama a {@link #initTable()} para configurar la tabla de datos.
     */
    private void initApp() {
        this.setSize(550, 550);
        this.setLocation(
                PARENT.getLocation().x + (PARENT.getSize().width / 6),
                PARENT.getLocation().y + (PARENT.getSize().height / 10)
        );
        
        try { 
            this.initTable(); 
        } catch (Exception e) { System.err.println("ERROR: " + e.getMessage() + "\n"); }
    }

    /**
     * Inicializa la tabla para mostrar las programaciones de copias de seguridad.
     * Este método configura un modelo de tabla con columnas específicas y añade
     * las filas correspondientes utilizando los datos almacenados en {@code PARENT.SCHEDULES}.
     * 
     * @throws Exception si ocurre un error al añadir las filas a la tabla.
     */
    private void initTable() throws Exception {
        DefaultTableModel table = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
               return false;
            }
        };
        
        String[] columnsName = {"ID", "Nombre", "Origen", "Destino", "Última copia", "Intervalo"};
        table.setColumnIdentifiers(columnsName);
        
        ArrayList<Backup> schedules = PARENT.SCHEDULES;
        
        for (Backup schedule : schedules) {
            table.addRow(schedule.toArray());
        }
        
        this.jTable1.setModel(table);
        
        TableColumnModel columnModel = jTable1.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(10);
        columnModel.getColumn(4).setPreferredWidth(65);
        columnModel.getColumn(5).setPreferredWidth(40);
    
    }// </editor-fold>
    
    private void backLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseClicked
        this.dispose();
    }//GEN-LAST:event_backLblMouseClicked

    private void backLblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseEntered
        this.backBtn.setBackground( new Color(170, 101, 88) );
    }//GEN-LAST:event_backLblMouseEntered

    private void backLblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseExited
        this.backBtn.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_backLblMouseExited

    private void backLblMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMousePressed
        this.backBtn.setBackground( new Color(142, 83, 71) );
    }//GEN-LAST:event_backLblMousePressed

    private void backLblMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLblMouseReleased
        this.backBtn.setBackground( new Color(186, 114, 100) );
    }//GEN-LAST:event_backLblMouseReleased
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backBtn;
    private javax.swing.JLabel backLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
