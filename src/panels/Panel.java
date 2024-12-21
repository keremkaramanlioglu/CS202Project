package panels;

import entities.Booking;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Objects;

public abstract class Panel extends JPanel {
    public Panel prevCenterPanel = null;
    public JButton prevSelectedButton = null;
    public JTable table;
    public DefaultTableModel model;
    public JComboBox<String> cbFilterColumn;
    public JComboBox<String> cbFilterOption;
    public JTextField tfFilterValue;
    public JTextField tfFilterUpperValue;

    public abstract void addButtonListener(ActionListener al);

    public abstract boolean tfCheck();

    public void setSelectedButton(JButton button) {
        if (prevSelectedButton == button) return;
        if (prevSelectedButton != null) {
            prevSelectedButton.setBackground(MainPanel.sidePanelColor);
        }
        prevSelectedButton = button;
        button.setBackground(MainPanel.centerPanelColor);
    }

    public void setTableRows(ArrayList<Object[]> rowValues) {

        model.setRowCount(0);

        for (Object[] row : rowValues) {
            model.addRow(row);
        }
        table.revalidate();
        table.repaint();
        this.revalidate();
        this.repaint();
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
        } else {
            throw new RuntimeException("No row selected");
        }
        return rowValues;
    }

    public abstract void setFields(Object[] rowValues);

    public abstract Object[] getEntity();

    public String getSelectedFilterOption() {
        return Objects.requireNonNull(cbFilterOption.getSelectedItem()).toString();
    }

    public String getSelectedFilterColumn() {
        return Objects.requireNonNull(cbFilterColumn.getSelectedItem()).toString();
    }

    public String getSelectedFilterValue() {
        return Objects.requireNonNull(tfFilterValue.getText().trim());
    }

    public String getSelectedFilterUpperValue() {
        return Objects.requireNonNull(tfFilterUpperValue.getText()).trim();
    }

    public abstract Panel getPanelByName(String panelName);

    public abstract String getPanelName();
}
