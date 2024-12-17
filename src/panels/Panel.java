package panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

public abstract class Panel extends JPanel {
    public Panel prevCenterPanel;
    public JButton prevSelectedButton;
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
    public abstract Panel getPanelByName(String panelName);
}
