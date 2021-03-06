//package converter; // NetBEans IDE

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 * NEWPEKGUI. GUI for the NEWPEK Inventory Manager.
 * @author Phillip N, Emilio E, Kai W.
 * @version 21.October.2018
 */
public class NEWPEKGUI extends javax.swing.JFrame {

    private final JFileChooser openFileChooser;
    File donorF, doneeF;
    private volatile boolean ready, startReady, chartReady, reset, exit;
    double start;
    
    /**
     * Creates new form NEWPEKGUI
     */
    public NEWPEKGUI() {
        ready = false;
        startReady = false;
        chartReady = false;
        reset = false;
        exit = false;
        initComponents();
        // Allows us to run on any OS
        final String home = System.getProperty("user.home");
        final String folderLocation = home + File.separator + "Documents" + File.separator + "NEWPEK";
        openFileChooser = new JFileChooser();
        openFileChooser.setCurrentDirectory(new File(folderLocation));
        openFileChooser.setFileFilter(new FileNameExtensionFilter("CSV", "csv"));
        txtField.setEditable(false);
        confirmBt.setEnabled(false);
    }

    public boolean getReady()
    {
        
        return ready;
        
    }
    
    public boolean getCharts()
    {
        
        return chartReady;
        
    }
    
    public boolean getReset()
    {
        
        return reset;
        
    }
    
    public boolean getExit()
    {
        
        return exit;
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        donorFileBt = new javax.swing.JButton();
        doneeFileBt = new javax.swing.JButton();
        donorLabel = new javax.swing.JLabel();
        doneeLabel = new javax.swing.JLabel();
        createTXTBt = new javax.swing.JButton();
        txtLabel = new javax.swing.JLabel();
        txtField = new javax.swing.JTextField();
        confirmBt = new javax.swing.JButton();
        createChartsBt = new javax.swing.JButton();
        chartsLabel = new javax.swing.JLabel();
        resetBt = new javax.swing.JButton();
        exitBt = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        donorFileBt.setText("Open Donor CSV File...");
        donorFileBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorFileBtActionPerformed(evt);
            }
        });

        doneeFileBt.setText("Open Donee CSV File...");
        doneeFileBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneeFileBtActionPerformed(evt);
            }
        });

        donorLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        donorLabel.setText("...");

        doneeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doneeLabel.setText("...");

        createTXTBt.setText("Create TXT File");
        createTXTBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTXTBtActionPerformed(evt);
            }
        });

        txtLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtLabel.setText("...");

        txtField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        confirmBt.setText("Confirm");
        confirmBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtActionPerformed(evt);
            }
        });

        createChartsBt.setText("Create Pie Charts");
        createChartsBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createChartsBtActionPerformed(evt);
            }
        });

        chartsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chartsLabel.setText("...");

        resetBt.setText("Reset");
        resetBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtActionPerformed(evt);
            }
        });

        exitBt.setText("Exit");
        exitBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(chartsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createChartsBt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmBt))
                    .addComponent(createTXTBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(donorFileBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(doneeFileBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doneeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                            .addComponent(donorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(txtLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(resetBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitBt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(donorFileBt)
                    .addComponent(donorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doneeFileBt)
                    .addComponent(doneeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(createTXTBt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmBt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(createChartsBt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chartsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resetBt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBt)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void donorFileBtActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int returnValue = openFileChooser.showOpenDialog(this);
        if(returnValue == JFileChooser.APPROVE_OPTION)
        {
            donorF = openFileChooser.getSelectedFile();
            donorLabel.setText(donorF.getName() + " successfully loaded.");
        }
        else
        {
            donorLabel.setText("No file chosen.");
        }
    }                                           

    private void doneeFileBtActionPerformed(java.awt.event.ActionEvent evt) {                                            
        int returnValue = openFileChooser.showOpenDialog(this);
        if(returnValue == JFileChooser.APPROVE_OPTION)
        {
            doneeF = openFileChooser.getSelectedFile();
            doneeLabel.setText(doneeF.getName() + " successfully loaded.");
        }
        else
        {
            doneeLabel.setText("No file chosen.");
        }
    }                                           

    private void createTXTBtActionPerformed(java.awt.event.ActionEvent evt) {                                            
        ready = true;
    }                                           

    private void confirmBtActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if(txtField.getText().matches("[0-9]+"))
        {
            startReady = true;
            txtField.setEditable(false);
            confirmBt.setEnabled(false);
        }
        else
        {
            txtLabel.setText("Invalid Input");
        }
    }                                         

    private void createChartsBtActionPerformed(java.awt.event.ActionEvent evt) {                                               
        chartReady = true;
        chartsLabel.setText("Charts successfully downloaded.");
    }                                              

    private void exitBtActionPerformed(java.awt.event.ActionEvent evt) {                                       
        exit = true;
        System.exit(0);
    }                                      

    private void resetBtActionPerformed(java.awt.event.ActionEvent evt) {                                        
        reset = true;
        this.dispose();
    }                                       

    public void changeLabel(String txtName)
    {
        txtLabel.setText(txtName + " successfully downloaded.");
    }
    
    public boolean checkPrevFile(File prevMonth)
    {
     
        try
        {
            Scanner inputStream = new Scanner(prevMonth);
            String firstLine = inputStream.nextLine();
            inputStream.close();
            return true;
        }
        catch(FileNotFoundException ex)
        {
            txtLabel.setText("Please input starting inventory (lbs): ");
            txtField.setEditable(true);
            confirmBt.setEnabled(true);
            
            while(!startReady) {}
            
            start = Double.parseDouble(txtField.getText());
            
            return false;
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(NEWPEKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NEWPEKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NEWPEKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NEWPEKGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NEWPEKGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel chartsLabel;
    private javax.swing.JButton confirmBt;
    private javax.swing.JButton createChartsBt;
    private javax.swing.JButton createTXTBt;
    private javax.swing.JButton doneeFileBt;
    private javax.swing.JLabel doneeLabel;
    private javax.swing.JButton donorFileBt;
    private javax.swing.JLabel donorLabel;
    private javax.swing.JButton exitBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton resetBt;
    private javax.swing.JTextField txtField;
    private javax.swing.JLabel txtLabel;
    // End of variables declaration                   
}
