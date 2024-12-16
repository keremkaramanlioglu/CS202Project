/*
 * Created by JFormDesigner on Wed Dec 11 17:07:20 TRT 2024
 */

package panels.adminPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author kerem
 */
public class BookingsPanel extends Panel {

    @Override
    public void addButtonListener(ActionListener al) {

    }

    @Override
    public void setSelectedButton(JButton b) {

    }

    @Override
    public void reset() {

    }

    @Override
    public void setCenterPanel(Panel panel) {

    }

    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    public BookingsPanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
        EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax. swing
        . border. TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,12 ),
        java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans. PropertyChangeListener( )
        { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .getPropertyName () ))
        throw new RuntimeException( ); }} );
        setLayout(new BorderLayout());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
