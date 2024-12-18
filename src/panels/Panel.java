package panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public abstract class Panel extends JPanel {
    public Panel prevCenterPanel;
    public JButton prevSelectedButton;
    public JTable dataTable = null;
    public abstract void addButtonListener(ActionListener al);
    public void setSelectedButton(JButton button) {
        if (prevSelectedButton == button) return;
        if (prevSelectedButton != null) {
            prevSelectedButton.setBackground(MainPanel.sidePanelColor);
        }
        prevSelectedButton = button;
        button.setBackground(MainPanel.centerPanelColor);
    }
    public abstract void addMouseListener(MouseListener ml);
    public abstract void reset();
    public void setCenterPanel(Panel panel) {
        if (prevCenterPanel == panel) return;
        if (prevCenterPanel != null) {
            prevCenterPanel.reset();
            this.remove(prevCenterPanel);
        }
        this.add(panel, BorderLayout.CENTER);
        prevCenterPanel = panel;
        this.revalidate();
        this.repaint();
    }
    public Panel getCenterPanel() {
        return prevCenterPanel;
    }
    public Object[] getSelectedRow() {
        if (dataTable == null) return null;
        int rowIndex = dataTable.getSelectedRow();
        int columnCount = dataTable.getColumnCount();
        Object[] rowValues = new Object[columnCount];

        if (rowIndex != -1) {
            for (int col = 0; col < columnCount; col++) {
                rowValues[col] = dataTable.getValueAt(rowIndex, col);
            }
        } else JOptionPane.showMessageDialog(null, "No row selected!");
        return rowValues;
    }
    public abstract Panel getPanelByName(String panelName);
}
