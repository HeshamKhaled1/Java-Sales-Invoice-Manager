package sales.invoice.generator;

/**
 *
 * @author Deebo
 */

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ItemDialog extends JDialog {
    private JLabel nameLabel;
    private JLabel invoiceIdLabel;
    private JLabel priceLabel;
    private JTextField nameField;
    private JTextField invoiceIdField;
    private JTextField priceField;
    private JButton okBtn;
    private JButton cancelBtn;
    private Controller controller;
    public ItemDialog(Controller controller) {
        this.controller = controller;
        nameLabel = new JLabel("Name");
        priceLabel = new JLabel("price");
        nameField = new JTextField();
        invoiceIdLabel = new JLabel("Invoice Id");
        invoiceIdField = new JTextField();
        priceField = new JTextField();
        okBtn = new JButton("OK");
        okBtn.setActionCommand("cuont_ok");
        cancelBtn = new JButton("Cancel");
        cancelBtn.setActionCommand("cuont_cancel");
        
        setLayout(new GridLayout(4, 2));
        add(nameLabel);
        add(nameField);
        add(invoiceIdLabel);
        add(invoiceIdField);
        add(priceLabel);
        add(priceField);
        add(okBtn);
        add(cancelBtn);
        
        okBtn.addActionListener(controller);
        cancelBtn.addActionListener(controller);
        
        setSize(400, 200);
    }

    public JTextField getNameField() {
        return nameField;
    }

    public JTextField getInvoiceIdField() {
        return invoiceIdField;
    }

    public JTextField getPriceField() {
        return priceField;
    }
    
}
