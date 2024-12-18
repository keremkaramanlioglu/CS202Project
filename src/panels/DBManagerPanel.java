/*
 * Created by JFormDesigner on Wed Dec 18 15:04:57 TRT 2024
 */

package panels;

import panels.dbManagerPanels.QueryPanel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 * @author kerem
 */
public class DBManagerPanel extends Panel {
    private final Panel pnlQuery;

    public DBManagerPanel() {
        initComponents();
        pnlQuery = new QueryPanel();
        super.prevSelectedButton = null;
        super.prevCenterPanel = null;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
        panel1 = new JPanel();
        btnQueryPanel = new JButton();
        btnBack = new JButton();
        pnlHeader = new JPanel();
        label1 = new JLabel();

        //======== this ========
        setBackground(new Color(0x666666));
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax .
        swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e" , javax. swing .border
        . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069al\u006fg"
        , java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) , getBorder
        () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java
        . beans. PropertyChangeEvent e) { if( "\u0062or\u0064er" .equals ( e. getPropertyName () ) )throw new RuntimeException
        ( ) ;} } );
        setLayout(new BorderLayout());

        //======== panel1 ========
        {
            panel1.setPreferredSize(new Dimension(120, 0));
            panel1.setBackground(new Color(0x333333));
            panel1.setLayout(new FlowLayout(FlowLayout.LEADING, 0, 0));

            //---- btnQueryPanel ----
            btnQueryPanel.setText("Query Panel");
            btnQueryPanel.setPreferredSize(new Dimension(120, 40));
            btnQueryPanel.setBackground(new Color(0x333333));
            btnQueryPanel.setForeground(Color.white);
            btnQueryPanel.setBorder(null);
            btnQueryPanel.setFocusable(false);
            btnQueryPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            panel1.add(btnQueryPanel);

            //---- btnBack ----
            btnBack.setText("Back");
            btnBack.setBackground(new Color(0x333333));
            btnBack.setForeground(Color.white);
            btnBack.setBorder(null);
            btnBack.setPreferredSize(new Dimension(120, 40));
            btnBack.setFocusable(false);
            btnBack.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            panel1.add(btnBack);
        }
        add(panel1, BorderLayout.WEST);

        //======== pnlHeader ========
        {
            pnlHeader.setPreferredSize(new Dimension(0, 50));
            pnlHeader.setBackground(new Color(0x333333));
            pnlHeader.setForeground(Color.white);
            pnlHeader.setLayout(new BorderLayout());

            //---- label1 ----
            label1.setText("Database Manager Panel");
            label1.setFont(new Font("JetBrains Mono Medium", Font.BOLD, 20));
            label1.setHorizontalAlignment(SwingConstants.CENTER);
            label1.setBackground(Color.white);
            label1.setForeground(Color.white);
            pnlHeader.add(label1, BorderLayout.CENTER);
        }
        add(pnlHeader, BorderLayout.NORTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    @Override
    public void addButtonListener(ActionListener al) {
        btnQueryPanel.addActionListener(al);
        btnBack.addActionListener(al);
        pnlQuery.addButtonListener(al);
    }

    @Override
    public void addMouseListener(MouseListener ml) {

    }

    @Override
    public void reset() {

    }

    @Override
    public Panel getPanelByName(String panelName) {
        return pnlQuery;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Kerem Karamanlıoğlu
    private JPanel panel1;
    private JButton btnQueryPanel;
    private JButton btnBack;
    private JPanel pnlHeader;
    private JLabel label1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
