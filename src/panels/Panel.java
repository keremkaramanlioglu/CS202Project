package panels;

import javax.swing.*;
import java.awt.event.ActionListener;

public abstract class Panel extends JPanel {
    public abstract void addButtonListener(ActionListener al);
    public abstract void setSelectedButton(JButton b);
    public abstract void reset();
<<<<<<< HEAD
    public abstract void setCenterPanel(Panel panel);
    public abstract Panel getPanelByName(String panelName);
}//shduoawhd
=======
    public abstract void setCenterPanel(JPanel panel);
    public abstract JPanel getPanelByName(String panelName);
}
>>>>>>> ad1d9581c527bdcc54f455edb6a1381d2215fcff
