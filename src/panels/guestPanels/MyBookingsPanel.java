/*
 * Created by JFormDesigner on Wed Dec 11 20:10:49 TRT 2024
 */

package panels.guestPanels;

import panels.Panel;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * @author kerem
 */
public class MyBookingsPanel extends Panel {
    public MyBookingsPanel() {
        initComponents();
    }


    @Override
    public void addButtonListener(ActionListener al) {
        // TODO add button listeners to components
    }

    @Override
    public void reset() {
        // TODO reset the components
    }

    @Override
    public Panel getPanelByName(String panelName) {
        return null;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu

        //======== this ========
        setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
        . EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder. CENTER, javax
        . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,
        12 ), java. awt. Color. red) , getBorder( )) );  addPropertyChangeListener (new java. beans
        . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("bord\u0065r" .equals (e .
        getPropertyName () )) throw new RuntimeException( ); }} );
        setLayout(new BorderLayout());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
