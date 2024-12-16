package panels;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class Panel extends JPanel {
    public abstract void addButtonListener(ActionListener al);
    public abstract void setSelectedButton(JButton b);
    public abstract void reset();
    public abstract void setCenterPanel(Panel panel);
    public abstract Panel getPanelByName(String panelName);
}//shduoawhd
