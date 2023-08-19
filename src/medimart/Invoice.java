package medimart;

import database.DBconnection;
import java.awt.Color;
import java.time.LocalDateTime; 
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.print.PageFormat;
import static java.awt.print.PageFormat.LANDSCAPE;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Invoice extends javax.swing.JFrame {
    private DBconnection dbconnect;
    private ResultSet resultset;

    public String userName, userRole;
        
    Date date = new Date();
    DefaultTableModel model;
       
    public Invoice() {}

    public Invoice(JTable medicineSelectTable, String usrName, String usrRole) {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/medimartIcon.png")));
        infoShow();
        
        userName = usrName;
        userRole = usrRole;
                
        medicineShowTable.setModel(medicineSelectTable.getModel());
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSS");
        LocalDateTime now = LocalDateTime.now();
        invoiceidshow.setText(dtf.format(now));

        float totalAmountToPay = 0;
        int mTotalSelected = medicineSelectTable.getRowCount();
        for(int i=0; i<mTotalSelected; i++)
        {
            String totalToPay = (String)medicineSelectTable.getValueAt(i, 4);
            totalAmountToPay += Float.parseFloat(totalToPay);
        }
        totalAmount.setText(String.valueOf(totalAmountToPay)); 
        totalAmounttoPay.setText(String.valueOf(totalAmountToPay-Integer.parseInt(discountPrice.getText())));
        
        giveDiscountButton.setEnabled(false);
        
        totalAmount.setDisabledTextColor(Color.BLACK);
        discountPrice.setDisabledTextColor(Color.BLACK);
        totalAmounttoPay.setDisabledTextColor(Color.BLACK);
        customerphoneshow.setDisabledTextColor(Color.BLACK);
        invoiceidshow.setDisabledTextColor(Color.BLACK);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invoicePanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        dateshow = new com.toedter.calendar.JDateChooser();
        title = new javax.swing.JLabel();
        customerphoneshow = new javax.swing.JTextField();
        invoiceidshow = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        totalAmounttoPay = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        medicineShowTable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        totalAmount = new javax.swing.JTextField();
        discountPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        customerSearchButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        searchCustomerPhone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        giveDiscountButton = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MediMart");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        invoicePanel.setBackground(new java.awt.Color(255, 204, 102));
        invoicePanel.setMinimumSize(new java.awt.Dimension(1000, 600));
        invoicePanel.setPreferredSize(new java.awt.Dimension(1000, 600));
        invoicePanel.setLayout(null);

        topPanel.setBackground(new java.awt.Color(255, 255, 255));
        topPanel.setPreferredSize(new java.awt.Dimension(1000, 600));
        topPanel.setLayout(null);

        dateshow.setBackground(new java.awt.Color(255, 255, 255));
        dateshow.setDate(date);
        dateshow.setDateFormatString("dd/MM/yyyy");
        dateshow.setEnabled(false);
        dateshow.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        dateshow.setIcon(null);
        dateshow.setPreferredSize(new java.awt.Dimension(74, 30));
        topPanel.add(dateshow);
        dateshow.setBounds(330, 30, 160, 20);

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/medimarticonsmall.png"))); // NOI18N
        title.setPreferredSize(new java.awt.Dimension(30, 30));
        title.setRequestFocusEnabled(false);
        topPanel.add(title);
        title.setBounds(10, 10, 180, 100);

        customerphoneshow.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        customerphoneshow.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        customerphoneshow.setEnabled(false);
        topPanel.add(customerphoneshow);
        customerphoneshow.setBounds(330, 80, 160, 20);

        invoiceidshow.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        invoiceidshow.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        invoiceidshow.setEnabled(false);
        topPanel.add(invoiceidshow);
        invoiceidshow.setBounds(330, 55, 160, 20);

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jLabel2.setText("Customer:");
        topPanel.add(jLabel2);
        jLabel2.setBounds(260, 80, 70, 20);

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jLabel3.setText("Date:");
        topPanel.add(jLabel3);
        jLabel3.setBounds(290, 30, 40, 20);

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jLabel5.setText("Total price:");
        topPanel.add(jLabel5);
        jLabel5.setBounds(280, 530, 90, 20);

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jLabel6.setText("Invoice ID:");
        topPanel.add(jLabel6);
        jLabel6.setBounds(260, 60, 80, 20);

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jLabel10.setText("Total to pay:");
        topPanel.add(jLabel10);
        jLabel10.setBounds(280, 570, 90, 20);

        totalAmounttoPay.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        totalAmounttoPay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalAmounttoPay.setText("0");
        totalAmounttoPay.setEnabled(false);
        topPanel.add(totalAmounttoPay);
        totalAmounttoPay.setBounds(370, 570, 120, 20);

        medicineShowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Batch", "Medicine", "Qty", "Rate", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medicineShowTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(medicineShowTable);
        if (medicineShowTable.getColumnModel().getColumnCount() > 0) {
            medicineShowTable.getColumnModel().getColumn(0).setResizable(false);
            medicineShowTable.getColumnModel().getColumn(0).setPreferredWidth(90);
            medicineShowTable.getColumnModel().getColumn(1).setResizable(false);
            medicineShowTable.getColumnModel().getColumn(1).setPreferredWidth(215);
            medicineShowTable.getColumnModel().getColumn(2).setResizable(false);
            medicineShowTable.getColumnModel().getColumn(2).setPreferredWidth(15);
            medicineShowTable.getColumnModel().getColumn(3).setResizable(false);
            medicineShowTable.getColumnModel().getColumn(3).setPreferredWidth(30);
            medicineShowTable.getColumnModel().getColumn(4).setResizable(false);
        }

        topPanel.add(jScrollPane1);
        jScrollPane1.setBounds(0, 120, 500, 400);

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jLabel7.setText("Discount:");
        topPanel.add(jLabel7);
        jLabel7.setBounds(280, 550, 90, 20);

        totalAmount.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        totalAmount.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totalAmount.setText("0");
        totalAmount.setEnabled(false);
        topPanel.add(totalAmount);
        totalAmount.setBounds(370, 530, 120, 20);

        discountPrice.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        discountPrice.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        discountPrice.setText("0");
        discountPrice.setEnabled(false);
        topPanel.add(discountPrice);
        discountPrice.setBounds(370, 550, 120, 20);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel8.setOpaque(true);
        topPanel.add(jLabel8);
        jLabel8.setBounds(0, 520, 500, 80);

        invoicePanel.add(topPanel);
        topPanel.setBounds(500, 0, 500, 600);

        customerSearchButton.setBackground(new java.awt.Color(255, 102, 102));
        customerSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find_1.png"))); // NOI18N
        customerSearchButton.setBorder(null);
        customerSearchButton.setOpaque(false);
        customerSearchButton.setPreferredSize(new java.awt.Dimension(30, 30));
        customerSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerSearchButtonActionPerformed(evt);
            }
        });
        invoicePanel.add(customerSearchButton);
        customerSearchButton.setBounds(460, 60, 30, 30);

        cancelButton.setBackground(new java.awt.Color(255, 102, 102));
        cancelButton.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        invoicePanel.add(cancelButton);
        cancelButton.setBounds(10, 550, 90, 30);

        printButton.setBackground(new java.awt.Color(102, 255, 102));
        printButton.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        printButton.setText("Print Invoice");
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });
        invoicePanel.add(printButton);
        printButton.setBounds(340, 550, 150, 30);

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jLabel4.setText("Registered customer check");
        invoicePanel.add(jLabel4);
        jLabel4.setBounds(100, 10, 290, 30);

        searchCustomerPhone.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        searchCustomerPhone.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        invoicePanel.add(searchCustomerPhone);
        searchCustomerPhone.setBounds(280, 60, 170, 30);

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel9.setText("Enter customer's phone number:");
        invoicePanel.add(jLabel9);
        jLabel9.setBounds(10, 60, 254, 30);

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Contact", "Name", "Points", "Email", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(customerTable);

        invoicePanel.add(jScrollPane3);
        jScrollPane3.setBounds(0, 120, 500, 90);

        giveDiscountButton.setBackground(new java.awt.Color(0, 255, 255));
        giveDiscountButton.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        giveDiscountButton.setText("Give Discount");
        giveDiscountButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        giveDiscountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giveDiscountButtonActionPerformed(evt);
            }
        });
        invoicePanel.add(giveDiscountButton);
        giveDiscountButton.setBounds(170, 240, 130, 30);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel12.setOpaque(true);
        invoicePanel.add(jLabel12);
        jLabel12.setBounds(0, 290, 500, 310);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invoicePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();
        Seller sellerObj = new Seller(medicineShowTable, userName, userRole);
        sellerObj.setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        String invoiceIdForInvoice = invoiceidshow.getText();
	String sellerUsernameForInvoice = userName;
	String customerNameForInvoice = "";
	String customerPhoneForInvoice = "";
	String sellAmountForInvoice = "";
	String dateTimeForInvoice = "";
        
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now2 = LocalDateTime.now();
        dateTimeForInvoice = dtf2.format(now2);
        
        if(customerTable.getRowCount() != 0)
        {
            customerPhoneForInvoice = (String) customerTable.getValueAt(0, 0);
            customerNameForInvoice  = (String) customerTable.getValueAt(0, 1);
            
            try {
                dbconnect = new DBconnection();
                dbconnect.connectToDB();

                float calculatedPoint = Float.parseFloat(String.valueOf(customerTable.getValueAt(0, 2))) + ((Float.parseFloat(String.valueOf(totalAmounttoPay.getText()))/100)*2) - (Float.parseFloat(String.valueOf(discountPrice.getText())));
                dbconnect.UpdateIntoDB("UPDATE MediMartCustomer SET CustomerPoints = "+(int)calculatedPoint+" WHERE CustomerContact = '"+customerTable.getValueAt(0, 0)+"'");

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
        
        sellAmountForInvoice = (String)totalAmounttoPay.getText();

        try {
           dbconnect = new DBconnection();
           dbconnect.connectToDB();

           dbconnect.insertIntoDB("INSERT INTO MediMartInvoice(InvoiceId, SellerUsername, CustomerName, CustomerPhone, SellAmount, DateTime)"
           + "VALUES ('"+invoiceIdForInvoice+"', '"+sellerUsernameForInvoice+"', '"+customerNameForInvoice+"', '"+customerPhoneForInvoice+"', "+Float.parseFloat(sellAmountForInvoice)+", '"+dateTimeForInvoice+"')");

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            dbconnect.disconnectFromDB();
        }

        
        //print starts
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("MediMart Invoice "+invoiceIdForInvoice);

        job.setPrintable(new Printable()
        {
            public int print(Graphics pg, PageFormat pf, int pageNum)
            {
                pf.setOrientation(LANDSCAPE);                

                if(pageNum>0)
                {
                    return Printable.NO_SUCH_PAGE;
                }

                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(1,1);
                topPanel.paint(g2);
                return Printable.PAGE_EXISTS;
            }
        });

        boolean ok = job.printDialog();

        if(ok)
        {
            try {
                job.print();
            } catch (PrinterException ex) {
                Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //print ends
        
        dispose();
        Seller sellerObj = new Seller(userName, userRole);
        sellerObj.setVisible(true);
    }//GEN-LAST:event_printButtonActionPerformed

    private void customerSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerSearchButtonActionPerformed
        String searchedString = searchCustomerPhone.getText().toString();
        
        try{
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            
            model = (DefaultTableModel) customerTable.getModel();
            model.setRowCount(0);
            
            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartCustomer WHERE CustomerContact='"+searchedString+"'");
                        
            if(resultset.next()) {
                String CustomerPoints = resultset.getString("CustomerPoints");
                String CustomerName = resultset.getString("CustomerName");
                String CustomerContact = resultset.getString("CustomerContact");
                String CustomerEmail = resultset.getString("CustomerEmail");
                String CustomerAddress = resultset.getString("CustomerAddress");
                
                String customerTableData[] = {CustomerContact, CustomerName, CustomerPoints, CustomerEmail, CustomerAddress};              
                model.addRow(customerTableData);
                
                customerphoneshow.setText((String) customerTable.getValueAt(0, 0));
                giveDiscountButton.setEnabled(true);
            }
            else
            {
                infoMsg("No registered customer with this contact number", "Notification");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }//GEN-LAST:event_customerSearchButtonActionPerformed

    private void giveDiscountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giveDiscountButtonActionPerformed
        if(customerTable.getRowCount() != 0)
        {
            try {
                dbconnect = new DBconnection();
                dbconnect.connectToDB();
                
                String calculatedDiscount = String.valueOf(customerTable.getValueAt(0, 2));
                
                if(Float.parseFloat(totalAmount.getText()) >=100 && Float.parseFloat(totalAmount.getText())>Float.parseFloat(calculatedDiscount)){
                
                    discountPrice.setText(calculatedDiscount);
                    totalAmounttoPay.setText(String.valueOf(Float.parseFloat(totalAmount.getText())-Float.parseFloat(discountPrice.getText())));
            
                    customerphoneshow.setText((String) customerTable.getValueAt(0, 0));
                }
                else
                {
                    
                    infoMsg("Discount not available at this moment!", "Notification");
                   
                    
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Invoice.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
    }//GEN-LAST:event_giveDiscountButtonActionPerformed

    public void infoMsg(String message, String title)
    {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    private void infoShow()
    {

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton customerSearchButton;
    private javax.swing.JTable customerTable;
    private javax.swing.JTextField customerphoneshow;
    private com.toedter.calendar.JDateChooser dateshow;
    private javax.swing.JTextField discountPrice;
    private javax.swing.JButton giveDiscountButton;
    private javax.swing.JPanel invoicePanel;
    private javax.swing.JTextField invoiceidshow;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable medicineShowTable;
    private javax.swing.JButton printButton;
    private javax.swing.JTextField searchCustomerPhone;
    private javax.swing.JLabel title;
    private javax.swing.JPanel topPanel;
    private javax.swing.JTextField totalAmount;
    private javax.swing.JTextField totalAmounttoPay;
    // End of variables declaration//GEN-END:variables
}
