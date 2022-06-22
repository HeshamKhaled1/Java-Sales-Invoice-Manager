package sales.invoice.generator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Deebo
 */
public class Controller implements ActionListener{
    
    private SalesInvoiceGenerator frame;
    private InvoiceDialog invoiceDialog;
    private ItemDialog itemDialog;
    
    public Controller(SalesInvoiceGenerator frame) {
        this.frame = frame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "CNI" : invoiceDialog = new InvoiceDialog(this);
                         invoiceDialog.setVisible(true);
                break;
            case "DI" : doDI();
                break;
            case "Save" : itemDialog = new ItemDialog(this);
                          itemDialog.setVisible(true);
                break;
            case "cancel" : System.out.println("Cancel button pressed");
                break;
            case "Load File" : 
                break;
            case "invoice_ok":
                doInvoice_Ok();
                break;
            case "invoice_cancel":
                invoiceDialog.setVisible(false);
                invoiceDialog.dispose();
                invoiceDialog = null;
                break;
        }
    }
    public void doDI(){
        String idStr = JOptionPane.showInputDialog("Enter Invoice id");
                int id = Integer.parseInt(idStr);
                Invoice c = null;
                for (Invoice invoice : frame.getInvoices()) {
                    if (invoice.getId() == id) {
                        c = invoice;
                        break;
                    }
                }
                if (c == null) {
                    JOptionPane.showMessageDialog(frame, "No invoice with id: " + id, "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    frame.getInvoices().remove(c);
                    JOptionPane.showMessageDialog(frame, "Invoice Deleted: " + c.getId() + ", " + c.getName(), "Delete", JOptionPane.INFORMATION_MESSAGE);
                }
    }
    public void doInvoice_Ok(){
        invoiceDialog.setVisible(false);
                String invoiceName = invoiceDialog.getNameField().getText();
                int invoiceId = 0;
                for (Invoice invoice : frame.getInvoices()) {
                    if (invoiceId < invoice.getId())
                        invoiceId = invoice.getId();
                }
                invoiceId++;
                Invoice invoice = new Invoice(invoiceId, invoiceName);
                frame.getInvoices().add(invoice);
                
                invoiceDialog.dispose();
                invoiceDialog = null;
    }
    
}
