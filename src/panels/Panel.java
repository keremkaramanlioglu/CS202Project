package panels;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class Panel extends JPanel {
    public abstract void addButtonListener(ActionListener al);
    public abstract void setSelectedButton(JButton b);
    public abstract void resetPanel();
    public abstract void setCenterPanel(JPanel panel);
    public abstract JPanel getPanelByName(String panelName);
}
