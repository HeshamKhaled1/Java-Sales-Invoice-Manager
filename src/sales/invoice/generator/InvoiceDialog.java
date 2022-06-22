package sales.invoice.generator;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Deebo
 */
public class InvoiceDialog extends JDialog{
    private JLabel nameLabel;
    private JTextField nameField;
    private JButton okBtn;
    private JButton cancelBtn;
    private Controller controller;   
    
    public InvoiceDialog(Controller controller) {
        this.controller = controller;
        nameLabel = new JLabel("Name");
        nameField = new JTextField();
        okBtn = new JButton("OK");
        okBtn.setActionCommand("invoice_ok");
        cancelBtn = new JButton("Cancel");
        cancelBtn.setActionCommand("invoice_cancel");
        setLayout(new GridLayout(2, 2));
        
        add(nameLabel);
        add(nameField);
        add(okBtn);
        add(cancelBtn);
        
        okBtn.addActionListener(controller);
        cancelBtn.addActionListener(controller);
        
        setSize(400, 100);
    }

    public JTextField getNameField() {
        return nameField;
    }
}
