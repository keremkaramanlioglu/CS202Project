package panels;

import entities.Booking;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public abstract class Panel extends JPanel {
    public Panel prevCenterPanel;
    public JButton prevSelectedButton;
    public JTable table = null;
    public JComboBox<String> cbFilterColumn;
    public JComboBox<String> cbFilterOption;
    public JTextField tfFilterValue;
    public JTextField tfFilterUpperValue;

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
        if (table == null) return null;
        int rowIndex = table.getSelectedRow();
        int columnCount = table.getColumnCount();
        Object[] rowValues = new Object[columnCount];

        if (rowIndex != -1) {
            for (int col = 0; col < columnCount; col++) {
                rowValues[col] = table.getValueAt(rowIndex, col);
            }
        } else JOptionPane.showMessageDialog(null, "No row selected!");
        return rowValues;
    }

    public String getSelectedFilterOption() {
        return (String) cbFilterOption.getSelectedItem();
    }

    public String getSelectedFilterColumn() {
        return (String) cbFilterColumn.getSelectedItem();
    }

    public String getSelectedFilterValue() {
        return (String) tfFilterValue.getText();
    }

    public abstract Panel getPanelByName(String panelName);
}
