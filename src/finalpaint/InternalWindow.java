/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpaint;

import sm.ata.ui.ImageCanvass2D;

/**
 *
 * @author Darth-ATA
 */
public class InternalWindow extends javax.swing.JInternalFrame {

    private MainJFrame myMainJFrame;
    private boolean inside = false;

    /**
     * Create new form InternalWindow by default
     */
    public InternalWindow(){
        initComponents();
        this.myMainJFrame = new MainJFrame();
    }
    /**
     * Creates new form InternalWindow
     * @param myMainJFrame
     */
    public InternalWindow(MainJFrame myMainJFrame) {
        initComponents();
        this.myMainJFrame = myMainJFrame;
    }

    /**
     * This method provides teh canvass in the internal frame
     * @return is the canvass in the internal frame
     */
    public ImageCanvass2D getCanvass2D() {
        return imageCanvass2D;
    }

    /**
     * This method changes the canvass in the internal frame
     * @param imageCanvass2D to change the internal frame canvass
     */
    public void setCanvass2D(ImageCanvass2D imageCanvass2D) {
        this.imageCanvass2D = imageCanvass2D;
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
        imageCanvass2D = new sm.ata.ui.ImageCanvass2D();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                internalWindowFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout imageCanvass2DLayout = new javax.swing.GroupLayout(imageCanvass2D);
        imageCanvass2D.setLayout(imageCanvass2DLayout);
        imageCanvass2DLayout.setHorizontalGroup(
            imageCanvass2DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );
        imageCanvass2DLayout.setVerticalGroup(
            imageCanvass2DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(imageCanvass2D);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method take the event of activation of the frame and change the
     * buttons state in the main frame
     * @param evt action event
     */
    private void internalWindowFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_internalWindowFrameActivated
        myMainJFrame.updateEverything();
    }//GEN-LAST:event_internalWindowFrameActivated

    private void imageCanvass2DMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageCanvass2DMouseEntered
        // TODO add your handling code here:
        this.inside = true;
    }//GEN-LAST:event_imageCanvass2DMouseEntered

    private void imageCanvass2DMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageCanvass2DMouseMoved
        // TODO add your handling code here:
        if(this.inside){
            int rgb = imageCanvass2D.getImg().getRGB(evt.getX(), evt.getY());
            this.myMainJFrame.setPixelStatus(evt.getPoint(),rgb);
        }
    }//GEN-LAST:event_imageCanvass2DMouseMoved

    private void imageCanvass2DMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageCanvass2DMouseExited
        // TODO add your handling code here:
        this.inside = false;
        this.myMainJFrame.setPixelStatus(null ,0);
    }//GEN-LAST:event_imageCanvass2DMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sm.ata.ui.ImageCanvass2D imageCanvass2D;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
