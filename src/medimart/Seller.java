package medimart;

import database.DBconnection;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class Seller extends javax.swing.JFrame {
    private DBconnection dbconnect;
    private ResultSet resultset;
 
    public String userName, userRole;
    String rowSelected = "none";
    String medicineRowSelected = "";
    private JTable table;
    DefaultTableModel model, model2, model3;
    
    Date date = new Date();

    public Seller() {
    }

    public Seller(String usrName, String usrRole){
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/medimartIcon.png")));
        
        mexpirydate.setMinSelectableDate(date);
        mexpirydate.setDate(date);
        
        userName = usrName;
        userRole = usrRole;
        
        myprofilePanel.setVisible(true);
        medicinePanel.setVisible(false);
        sellPanel.setVisible(false);
        customerPanel.setVisible(false);
        invoicePanel.setVisible(false);

        usernameShow();
        userProfileInfo(userName, userRole);
        medicineShow();
        expiredMedicineAlert();
        totalAmount.setDisabledTextColor(Color.BLACK);
    }
    
    public Seller(JTable medicineselectTable, String usrName, String usrRole){
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/medimartIcon.png")));
        
        medicineSelectTable.setModel(medicineselectTable.getModel());
        
        mexpirydate.setMinSelectableDate(date);
        mexpirydate.setDate(date);
        
        userName = usrName;
        userRole = usrRole;
        
        myprofilePanel.setVisible(false);
        medicinePanel.setVisible(false);
        sellPanel.setVisible(true);
        customerPanel.setVisible(false);
        invoicePanel.setVisible(false);

        usernameShow();
        userProfileInfo(userName, userRole);
        medicineShow();
        expiredMedicineAlert();
        totalAmount.setDisabledTextColor(Color.BLACK);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sellerPanel = new javax.swing.JPanel();
        warningButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        myprofileButton = new javax.swing.JButton();
        medicineButton = new javax.swing.JButton();
        sellerButton = new javax.swing.JButton();
        customerButton = new javax.swing.JButton();
        invoiceButton = new javax.swing.JButton();
        myprofilePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        profileusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        profilenid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        profilerole = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        profilephone = new javax.swing.JTextField();
        profileemail = new javax.swing.JTextField();
        profileaddress = new javax.swing.JTextField();
        profilepassword = new javax.swing.JTextField();
        profilefullname = new javax.swing.JTextField();
        profileupdatebutton = new javax.swing.JButton();
        medicinePanel = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        mpriceperunit = new javax.swing.JTextField();
        mcompanyname = new javax.swing.JTextField();
        mmedicinename = new javax.swing.JTextField();
        mgenericname = new javax.swing.JTextField();
        mbatchno = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        mcategory = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        mexpirydate = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        mquantity = new javax.swing.JTextField();
        medicinesavebutton = new javax.swing.JButton();
        medicinedeletebutton = new javax.swing.JButton();
        medicineSearchText = new javax.swing.JTextField();
        title3 = new javax.swing.JLabel();
        medicineSearchButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        medicineshowTable = new javax.swing.JTable();
        medicineeditbutton = new javax.swing.JButton();
        medicinecancelbutton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        sellPanel = new javax.swing.JPanel();
        sellSearchButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        medicineSelectTable = new javax.swing.JTable();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        sellerconfirmbutton = new javax.swing.JButton();
        title4 = new javax.swing.JLabel();
        title5 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        sellSearchText = new javax.swing.JTextField();
        title2 = new javax.swing.JLabel();
        totalAmount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        medicineShowTable = new javax.swing.JTable();
        customerPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        customername = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        customeraddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        customeremail = new javax.swing.JTextField();
        customersavebutton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        customercontact = new javax.swing.JTextField();
        customereditbutton = new javax.swing.JButton();
        customercancelbutton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        customerdeletebutton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        invoicePanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        invoiceShowTable = new javax.swing.JTable();
        invoiceSearchButton = new javax.swing.JButton();
        invoiceSearchText = new javax.swing.JTextField();
        title6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MediMart");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        sellerPanel.setBackground(new java.awt.Color(204, 204, 255));
        sellerPanel.setMinimumSize(new java.awt.Dimension(1000, 600));
        sellerPanel.setPreferredSize(new java.awt.Dimension(1000, 600));
        sellerPanel.setLayout(null);

        warningButton.setBackground(new java.awt.Color(255, 102, 102));
        warningButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/warning.png"))); // NOI18N
        warningButton.setBorder(null);
        warningButton.setOpaque(false);
        warningButton.setPreferredSize(new java.awt.Dimension(30, 30));
        warningButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warningButtonActionPerformed(evt);
            }
        });
        sellerPanel.add(warningButton);
        warningButton.setBounds(10, 10, 50, 50);

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 116));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Seller Name");
        title.setToolTipText("");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sellerPanel.add(title);
        title.setBounds(60, 10, 890, 40);

        logoutButton.setBackground(new java.awt.Color(255, 102, 102));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logoutButton.setBorder(null);
        logoutButton.setOpaque(false);
        logoutButton.setPreferredSize(new java.awt.Dimension(30, 30));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        sellerPanel.add(logoutButton);
        logoutButton.setBounds(960, 10, 30, 30);

        myprofileButton.setBackground(new java.awt.Color(216, 226, 220));
        myprofileButton.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        myprofileButton.setText("My Profile");
        myprofileButton.setBorder(null);
        myprofileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myprofileButtonActionPerformed(evt);
            }
        });
        sellerPanel.add(myprofileButton);
        myprofileButton.setBounds(25, 70, 170, 40);

        medicineButton.setBackground(new java.awt.Color(255, 229, 217));
        medicineButton.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        medicineButton.setText("Medicine");
        medicineButton.setBorder(null);
        medicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineButtonActionPerformed(evt);
            }
        });
        sellerPanel.add(medicineButton);
        medicineButton.setBounds(220, 70, 170, 40);

        sellerButton.setBackground(new java.awt.Color(199, 249, 204));
        sellerButton.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        sellerButton.setText("Sell");
        sellerButton.setBorder(null);
        sellerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerButtonActionPerformed(evt);
            }
        });
        sellerPanel.add(sellerButton);
        sellerButton.setBounds(415, 70, 170, 40);

        customerButton.setBackground(new java.awt.Color(255, 214, 165));
        customerButton.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        customerButton.setText("Customer");
        customerButton.setBorder(null);
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });
        sellerPanel.add(customerButton);
        customerButton.setBounds(610, 70, 170, 40);

        invoiceButton.setBackground(new java.awt.Color(255, 255, 204));
        invoiceButton.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        invoiceButton.setText("Invoice");
        invoiceButton.setBorder(null);
        invoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceButtonActionPerformed(evt);
            }
        });
        sellerPanel.add(invoiceButton);
        invoiceButton.setBounds(805, 70, 170, 40);

        myprofilePanel.setBackground(new java.awt.Color(216, 226, 220));
        myprofilePanel.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel9.setText("Username:");
        myprofilePanel.add(jLabel9);
        jLabel9.setBounds(40, 20, 90, 30);

        profileusername.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        profileusername.setEnabled(false);
        myprofilePanel.add(profileusername);
        profileusername.setBounds(130, 20, 150, 30);

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel3.setText("NID:");
        myprofilePanel.add(jLabel3);
        jLabel3.setBounds(330, 20, 50, 30);

        profilenid.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        profilenid.setEnabled(false);
        myprofilePanel.add(profilenid);
        profilenid.setBounds(380, 20, 310, 30);

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel7.setText("Role:");
        myprofilePanel.add(jLabel7);
        jLabel7.setBounds(760, 20, 50, 30);

        profilerole.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        profilerole.setEnabled(false);
        myprofilePanel.add(profilerole);
        profilerole.setBounds(810, 20, 150, 30);

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel2.setText("Full name:");
        myprofilePanel.add(jLabel2);
        jLabel2.setBounds(90, 100, 110, 30);

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel4.setText("Password:");
        myprofilePanel.add(jLabel4);
        jLabel4.setBounds(90, 150, 110, 30);

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel5.setText("Address:");
        myprofilePanel.add(jLabel5);
        jLabel5.setBounds(90, 200, 110, 30);

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel6.setText("Email:");
        myprofilePanel.add(jLabel6);
        jLabel6.setBounds(90, 250, 110, 30);

        jLabel11.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel11.setText("Phone:");
        myprofilePanel.add(jLabel11);
        jLabel11.setBounds(90, 300, 110, 30);

        profilephone.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        myprofilePanel.add(profilephone);
        profilephone.setBounds(220, 300, 700, 30);

        profileemail.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        myprofilePanel.add(profileemail);
        profileemail.setBounds(220, 250, 700, 30);

        profileaddress.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        myprofilePanel.add(profileaddress);
        profileaddress.setBounds(220, 200, 700, 30);

        profilepassword.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        myprofilePanel.add(profilepassword);
        profilepassword.setBounds(220, 150, 700, 30);

        profilefullname.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        myprofilePanel.add(profilefullname);
        profilefullname.setBounds(220, 100, 700, 30);

        profileupdatebutton.setBackground(new java.awt.Color(0, 255, 255));
        profileupdatebutton.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        profileupdatebutton.setText("UPDATE");
        profileupdatebutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        profileupdatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profileupdatebuttonActionPerformed(evt);
            }
        });
        myprofilePanel.add(profileupdatebutton);
        profileupdatebutton.setBounds(410, 400, 150, 50);

        sellerPanel.add(myprofilePanel);
        myprofilePanel.setBounds(0, 110, 1000, 490);

        medicinePanel.setBackground(new java.awt.Color(255, 229, 217));
        medicinePanel.setLayout(null);

        jLabel20.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel20.setText("Generic Name:*");
        jLabel20.setMaximumSize(new java.awt.Dimension(94, 23));
        jLabel20.setMinimumSize(new java.awt.Dimension(94, 23));
        jLabel20.setPreferredSize(new java.awt.Dimension(94, 23));
        medicinePanel.add(jLabel20);
        jLabel20.setBounds(10, 10, 130, 30);

        jLabel21.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel21.setText("Medicine Name:*");
        jLabel21.setMaximumSize(new java.awt.Dimension(94, 23));
        jLabel21.setMinimumSize(new java.awt.Dimension(94, 23));
        jLabel21.setPreferredSize(new java.awt.Dimension(94, 23));
        medicinePanel.add(jLabel21);
        jLabel21.setBounds(10, 50, 140, 30);

        jLabel22.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel22.setText("Company Name:*");
        jLabel22.setMaximumSize(new java.awt.Dimension(94, 23));
        jLabel22.setMinimumSize(new java.awt.Dimension(94, 23));
        jLabel22.setPreferredSize(new java.awt.Dimension(94, 23));
        medicinePanel.add(jLabel22);
        jLabel22.setBounds(10, 90, 150, 30);

        jLabel24.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel24.setText("Price per unit:");
        jLabel24.setMaximumSize(new java.awt.Dimension(94, 23));
        jLabel24.setMinimumSize(new java.awt.Dimension(94, 23));
        jLabel24.setPreferredSize(new java.awt.Dimension(94, 23));
        medicinePanel.add(jLabel24);
        jLabel24.setBounds(10, 130, 120, 30);

        mpriceperunit.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        mpriceperunit.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        mpriceperunit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpriceperunitActionPerformed(evt);
            }
        });
        medicinePanel.add(mpriceperunit);
        mpriceperunit.setBounds(160, 130, 250, 30);

        mcompanyname.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        mcompanyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcompanynameActionPerformed(evt);
            }
        });
        medicinePanel.add(mcompanyname);
        mcompanyname.setBounds(160, 90, 250, 30);

        mmedicinename.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        mmedicinename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmedicinenameActionPerformed(evt);
            }
        });
        medicinePanel.add(mmedicinename);
        mmedicinename.setBounds(160, 50, 250, 30);

        mgenericname.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        mgenericname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgenericnameActionPerformed(evt);
            }
        });
        medicinePanel.add(mgenericname);
        mgenericname.setBounds(160, 10, 250, 30);

        mbatchno.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        mbatchno.setToolTipText("Batch no will be auto generated for new medicine");
        mbatchno.setEnabled(false);
        mbatchno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbatchnoActionPerformed(evt);
            }
        });
        medicinePanel.add(mbatchno);
        mbatchno.setBounds(550, 10, 210, 30);

        jLabel27.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel27.setText("Batch No:");
        jLabel27.setMaximumSize(new java.awt.Dimension(94, 23));
        jLabel27.setMinimumSize(new java.awt.Dimension(94, 23));
        jLabel27.setPreferredSize(new java.awt.Dimension(94, 23));
        medicinePanel.add(jLabel27);
        jLabel27.setBounds(440, 10, 90, 30);

        jLabel25.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel25.setText("Category:*");
        jLabel25.setMaximumSize(new java.awt.Dimension(94, 23));
        jLabel25.setMinimumSize(new java.awt.Dimension(94, 23));
        jLabel25.setPreferredSize(new java.awt.Dimension(94, 23));
        medicinePanel.add(jLabel25);
        jLabel25.setBounds(440, 50, 100, 30);

        mcategory.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        mcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tablet", "Capsule", "Syrup", "Suspension" }));
        mcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcategoryActionPerformed(evt);
            }
        });
        medicinePanel.add(mcategory);
        mcategory.setBounds(550, 50, 210, 30);

        jLabel23.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel23.setText("Expiry Date:*");
        jLabel23.setMaximumSize(new java.awt.Dimension(94, 23));
        jLabel23.setMinimumSize(new java.awt.Dimension(94, 23));
        jLabel23.setPreferredSize(new java.awt.Dimension(94, 23));
        medicinePanel.add(jLabel23);
        jLabel23.setBounds(440, 90, 110, 30);

        mexpirydate.setDate(date);
        medicinePanel.add(mexpirydate);
        mexpirydate.setBounds(550, 90, 210, 30);

        jLabel26.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel26.setText("Quantity:");
        jLabel26.setMaximumSize(new java.awt.Dimension(94, 23));
        jLabel26.setMinimumSize(new java.awt.Dimension(94, 23));
        jLabel26.setPreferredSize(new java.awt.Dimension(94, 23));
        medicinePanel.add(jLabel26);
        jLabel26.setBounds(440, 130, 80, 30);

        mquantity.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        mquantity.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        mquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mquantityActionPerformed(evt);
            }
        });
        medicinePanel.add(mquantity);
        mquantity.setBounds(550, 130, 210, 30);

        medicinesavebutton.setBackground(new java.awt.Color(170, 224, 251));
        medicinesavebutton.setFont(new java.awt.Font("Book Antiqua", 1, 24)); // NOI18N
        medicinesavebutton.setText("Save");
        medicinesavebutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        medicinesavebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicinesavebuttonActionPerformed(evt);
            }
        });
        medicinePanel.add(medicinesavebutton);
        medicinesavebutton.setBounds(840, 60, 100, 50);

        medicinedeletebutton.setBackground(new java.awt.Color(255, 102, 102));
        medicinedeletebutton.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        medicinedeletebutton.setText("Delete");
        medicinedeletebutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        medicinedeletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicinedeletebuttonActionPerformed(evt);
            }
        });
        medicinePanel.add(medicinedeletebutton);
        medicinedeletebutton.setBounds(890, 210, 100, 30);

        medicineSearchText.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        medicineSearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                medicineSearchTextKeyReleased(evt);
            }
        });
        medicinePanel.add(medicineSearchText);
        medicineSearchText.setBounds(430, 200, 340, 30);

        title3.setBackground(new java.awt.Color(255, 255, 255));
        title3.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        title3.setForeground(new java.awt.Color(0, 0, 116));
        title3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title3.setText("Find Medicine:");
        title3.setToolTipText("");
        title3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        medicinePanel.add(title3);
        title3.setBounds(300, 200, 120, 30);

        medicineSearchButton.setBackground(new java.awt.Color(255, 102, 102));
        medicineSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find_1.png"))); // NOI18N
        medicineSearchButton.setBorder(null);
        medicineSearchButton.setOpaque(false);
        medicineSearchButton.setPreferredSize(new java.awt.Dimension(30, 30));
        medicineSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineSearchButtonActionPerformed(evt);
            }
        });
        medicinePanel.add(medicineSearchButton);
        medicineSearchButton.setBounds(780, 200, 30, 30);

        medicineshowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Batch No", "Generic Name", "Medicine Name", "Category", "Company Name", "Quantity", "Price", "Expiry Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(medicineshowTable);

        medicinePanel.add(jScrollPane4);
        jScrollPane4.setBounds(0, 240, 1000, 250);

        medicineeditbutton.setBackground(new java.awt.Color(0, 255, 255));
        medicineeditbutton.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        medicineeditbutton.setText("Edit");
        medicineeditbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        medicineeditbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineeditbuttonActionPerformed(evt);
            }
        });
        medicinePanel.add(medicineeditbutton);
        medicineeditbutton.setBounds(10, 210, 100, 30);

        medicinecancelbutton.setBackground(new java.awt.Color(204, 204, 204));
        medicinecancelbutton.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        medicinecancelbutton.setText("Cancel");
        medicinecancelbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        medicinecancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicinecancelbuttonActionPerformed(evt);
            }
        });
        medicinePanel.add(medicinecancelbutton);
        medicinecancelbutton.setBounds(130, 210, 100, 30);

        jLabel18.setBackground(new java.awt.Color(255, 255, 204));
        jLabel18.setOpaque(true);
        medicinePanel.add(jLabel18);
        jLabel18.setBounds(280, 190, 540, 50);

        jLabel28.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 51, 0));
        jLabel28.setText("* marked fields can't be changed later");
        medicinePanel.add(jLabel28);
        jLabel28.setBounds(310, 160, 303, 20);

        sellerPanel.add(medicinePanel);
        medicinePanel.setBounds(0, 110, 1000, 490);

        sellPanel.setBackground(new java.awt.Color(199, 249, 204));
        sellPanel.setLayout(null);

        sellSearchButton.setBackground(new java.awt.Color(255, 102, 102));
        sellSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find_1.png"))); // NOI18N
        sellSearchButton.setBorder(null);
        sellSearchButton.setOpaque(false);
        sellSearchButton.setPreferredSize(new java.awt.Dimension(30, 30));
        sellSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellSearchButtonActionPerformed(evt);
            }
        });
        sellPanel.add(sellSearchButton);
        sellSearchButton.setBounds(510, 20, 30, 30);

        medicineSelectTable.setModel(new javax.swing.table.DefaultTableModel(
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
        medicineSelectTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(medicineSelectTable);

        sellPanel.add(jScrollPane2);
        jScrollPane2.setBounds(550, 60, 450, 380);

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rightarrow.png"))); // NOI18N
        addButton.setOpaque(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        sellPanel.add(addButton);
        addButton.setBounds(500, 210, 50, 50);

        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/leftarrow.png"))); // NOI18N
        removeButton.setOpaque(false);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        sellPanel.add(removeButton);
        removeButton.setBounds(500, 310, 50, 50);

        sellerconfirmbutton.setBackground(new java.awt.Color(0, 255, 255));
        sellerconfirmbutton.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        sellerconfirmbutton.setText("Confirm");
        sellerconfirmbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sellerconfirmbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerconfirmbuttonActionPerformed(evt);
            }
        });
        sellPanel.add(sellerconfirmbutton);
        sellerconfirmbutton.setBounds(890, 450, 100, 30);

        title4.setBackground(new java.awt.Color(255, 255, 255));
        title4.setFont(new java.awt.Font("Book Antiqua", 2, 24)); // NOI18N
        title4.setForeground(new java.awt.Color(0, 0, 116));
        title4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title4.setText("Invoice info");
        title4.setToolTipText("");
        title4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sellPanel.add(title4);
        title4.setBounds(720, 20, 130, 30);

        title5.setBackground(new java.awt.Color(255, 255, 255));
        title5.setFont(new java.awt.Font("Book Antiqua", 2, 24)); // NOI18N
        title5.setForeground(new java.awt.Color(0, 0, 116));
        title5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title5.setText("Medicine Stock");
        title5.setToolTipText("");
        title5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sellPanel.add(title5);
        title5.setBounds(140, 70, 180, 30);

        title1.setBackground(new java.awt.Color(255, 255, 255));
        title1.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 116));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title1.setText("Find Medicine:");
        title1.setToolTipText("");
        title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sellPanel.add(title1);
        title1.setBounds(20, 20, 120, 30);

        sellSearchText.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        sellSearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sellSearchTextKeyReleased(evt);
            }
        });
        sellPanel.add(sellSearchText);
        sellSearchText.setBounds(150, 20, 350, 30);

        title2.setBackground(new java.awt.Color(255, 255, 255));
        title2.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        title2.setForeground(new java.awt.Color(0, 0, 116));
        title2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title2.setText("Total Amount:");
        title2.setToolTipText("");
        title2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sellPanel.add(title2);
        title2.setBounds(550, 450, 120, 30);

        totalAmount.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        totalAmount.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        totalAmount.setEnabled(false);
        sellPanel.add(totalAmount);
        totalAmount.setBounds(670, 450, 190, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setOpaque(true);
        sellPanel.add(jLabel1);
        jLabel1.setBounds(0, 10, 550, 50);

        medicineShowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Batch No", "Generic Name", "Medicine Name", "Category", "Company Name", "Quantity", "Price", "Expiry Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        medicineShowTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane5.setViewportView(medicineShowTable);

        sellPanel.add(jScrollPane5);
        jScrollPane5.setBounds(0, 100, 500, 340);

        sellerPanel.add(sellPanel);
        sellPanel.setBounds(0, 110, 1000, 490);

        customerPanel.setBackground(new java.awt.Color(255, 214, 165));
        customerPanel.setLayout(null);

        jLabel8.setBackground(java.awt.Color.white);
        jLabel8.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel8.setText("Name:");
        customerPanel.add(jLabel8);
        jLabel8.setBounds(50, 10, 90, 30);

        customername.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        customername.setForeground(new java.awt.Color(51, 51, 51));
        customername.setToolTipText("");
        customername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        customerPanel.add(customername);
        customername.setBounds(140, 10, 340, 30);

        jLabel19.setBackground(java.awt.Color.white);
        jLabel19.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel19.setText("Contact*:");
        customerPanel.add(jLabel19);
        jLabel19.setBounds(510, 10, 80, 30);

        customeraddress.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        customeraddress.setForeground(new java.awt.Color(51, 51, 51));
        customeraddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        customeraddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customeraddressActionPerformed(evt);
            }
        });
        customerPanel.add(customeraddress);
        customeraddress.setBounds(140, 50, 680, 30);

        jLabel10.setBackground(java.awt.Color.white);
        jLabel10.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel10.setText("Email:");
        customerPanel.add(jLabel10);
        jLabel10.setBounds(50, 90, 90, 30);

        customeremail.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        customeremail.setForeground(new java.awt.Color(51, 51, 51));
        customeremail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        customeremail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customeremailActionPerformed(evt);
            }
        });
        customerPanel.add(customeremail);
        customeremail.setBounds(140, 90, 340, 30);

        customersavebutton.setBackground(new java.awt.Color(170, 224, 251));
        customersavebutton.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        customersavebutton.setText("Save");
        customersavebutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customersavebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customersavebuttonActionPerformed(evt);
            }
        });
        customerPanel.add(customersavebutton);
        customersavebutton.setBounds(860, 20, 100, 50);

        jLabel16.setBackground(java.awt.Color.white);
        jLabel16.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel16.setText("Address:");
        customerPanel.add(jLabel16);
        jLabel16.setBounds(50, 50, 80, 30);

        customercontact.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        customercontact.setForeground(new java.awt.Color(51, 51, 51));
        customercontact.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        customerPanel.add(customercontact);
        customercontact.setBounds(590, 10, 230, 30);

        customereditbutton.setBackground(new java.awt.Color(0, 255, 255));
        customereditbutton.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        customereditbutton.setText("Edit");
        customereditbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customereditbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customereditbuttonActionPerformed(evt);
            }
        });
        customerPanel.add(customereditbutton);
        customereditbutton.setBounds(10, 210, 100, 30);

        customercancelbutton.setBackground(new java.awt.Color(204, 204, 204));
        customercancelbutton.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        customercancelbutton.setText("Cancel");
        customercancelbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customercancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customercancelbuttonActionPerformed(evt);
            }
        });
        customerPanel.add(customercancelbutton);
        customercancelbutton.setBounds(130, 210, 100, 30);

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

        customerPanel.add(jScrollPane3);
        jScrollPane3.setBounds(0, 240, 1000, 250);

        customerdeletebutton.setBackground(new java.awt.Color(255, 102, 102));
        customerdeletebutton.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        customerdeletebutton.setText("Delete");
        customerdeletebutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        customerdeletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerdeletebuttonActionPerformed(evt);
            }
        });
        customerPanel.add(customerdeletebutton);
        customerdeletebutton.setBounds(890, 210, 100, 30);

        jLabel13.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 0));
        jLabel13.setText("* marked fields can't be changed later");
        customerPanel.add(jLabel13);
        jLabel13.setBounds(510, 90, 310, 30);

        sellerPanel.add(customerPanel);
        customerPanel.setBounds(0, 110, 1000, 490);

        invoicePanel.setBackground(new java.awt.Color(255, 255, 204));
        invoicePanel.setLayout(null);

        invoiceShowTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Invoice ID", "Seller username", "Customer name", "Customer contact", "Sell amount", "Date & Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        invoiceShowTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(invoiceShowTable);

        invoicePanel.add(jScrollPane6);
        jScrollPane6.setBounds(0, 80, 1000, 410);

        invoiceSearchButton.setBackground(new java.awt.Color(255, 102, 102));
        invoiceSearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find_1.png"))); // NOI18N
        invoiceSearchButton.setBorder(null);
        invoiceSearchButton.setOpaque(false);
        invoiceSearchButton.setPreferredSize(new java.awt.Dimension(30, 30));
        invoiceSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceSearchButtonActionPerformed(evt);
            }
        });
        invoicePanel.add(invoiceSearchButton);
        invoiceSearchButton.setBounds(720, 30, 30, 30);

        invoiceSearchText.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        invoiceSearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceSearchTextActionPerformed(evt);
            }
        });
        invoiceSearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                invoiceSearchTextKeyReleased(evt);
            }
        });
        invoicePanel.add(invoiceSearchText);
        invoiceSearchText.setBounds(360, 30, 350, 30);

        title6.setBackground(new java.awt.Color(255, 255, 255));
        title6.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        title6.setForeground(new java.awt.Color(0, 0, 116));
        title6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title6.setText("Check Invoice:");
        title6.setToolTipText("");
        title6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        invoicePanel.add(title6);
        title6.setBounds(230, 30, 120, 30);

        sellerPanel.add(invoicePanel);
        invoicePanel.setBounds(0, 110, 1000, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sellerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sellerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();
        Welcome welcomeObj = new Welcome();
        welcomeObj.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void myprofileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myprofileButtonActionPerformed
        myprofilePanel.setVisible(true);
        medicinePanel.setVisible(false);
        sellPanel.setVisible(false);
        customerPanel.setVisible(false);
        invoicePanel.setVisible(false);
    }//GEN-LAST:event_myprofileButtonActionPerformed

    private void medicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineButtonActionPerformed
        myprofilePanel.setVisible(false);
        medicinePanel.setVisible(true);
        sellPanel.setVisible(false);
        customerPanel.setVisible(false);
        invoicePanel.setVisible(false);
    }//GEN-LAST:event_medicineButtonActionPerformed

    private void sellerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerButtonActionPerformed
        myprofilePanel.setVisible(false);
        medicinePanel.setVisible(false);
        sellPanel.setVisible(true);
        customerPanel.setVisible(false);
        invoicePanel.setVisible(false);
        
        medicineShow();
    }//GEN-LAST:event_sellerButtonActionPerformed

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButtonActionPerformed
        myprofilePanel.setVisible(false);
        medicinePanel.setVisible(false);
        sellPanel.setVisible(false);
        customerPanel.setVisible(true);
        invoicePanel.setVisible(false);

        customerShow();
    }//GEN-LAST:event_customerButtonActionPerformed

    private void customeraddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customeraddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customeraddressActionPerformed

    private void customeremailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customeremailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customeremailActionPerformed

    private void customersavebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customersavebuttonActionPerformed
        int customerPoints = 0;
        String customerName    = customername.getText();
        String customerContact = customercontact.getText();
        String customerEmail   = customeremail.getText();
        String customerAddress = customeraddress.getText();

        if(customerName.isEmpty() || customerContact.isEmpty() || customerEmail.isEmpty() || customerAddress.isEmpty()) {
            infoMsg("You have to fill up all the fields", "Alert!!");
        }
        else if(!numberCheck(customerContact)) {
            infoMsg("Invalid contact. It must be 11 digit and start with 01...","Alert!!");
        }
        else if(!emailCheck(customerEmail)) {
            infoMsg("Invalid email. It must end with ...@gmail.com","Alert!!");
        }
        else {
            try {
                dbconnect = new DBconnection();
                dbconnect.connectToDB();
                ResultSet resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartCustomer WHERE CustomerContact = '"+customerContact+"'");

                if(rowSelected != "none")
                {
                    dbconnect.UpdateIntoDB("UPDATE MediMartCustomer SET CustomerName ='"+customerName+"', CustomerEmail ='"+customerEmail+"', CustomerAddress ='"+customerAddress+"' WHERE CustomerContact= '"+customerContact+"'");
                    customerShow();
                    
                    infoMsg("Customer info updated", "Confirmation");
                    
                    customeremail.setText("");
                    customername.setText("");
                    customercontact.setText("");
                    customeremail.setText("");
                    customeraddress.setText("");
                    customercontact.setEnabled(true);
                    rowSelected = "none";
                }
                else if(rowSelected == "none") {
                     if(resultset.next()) {
                        infoMsg("Customer contact already exists.","Error!!");
                    }
                    else {
                        dbconnect.insertIntoDB("INSERT INTO MediMartCustomer(CustomerContact, CustomerName, CustomerPoints, CustomerEmail, CustomerAddress)"
                            + "VALUES('"+customerContact+"', '"+customerName+"', "+customerPoints+", '"+customerEmail+"', '"+customerAddress+"')");
                        infoMsg("New customer added successfully","Confirmation");

                        customerShow(); 
                        customeremail.setText("");
                        customername.setText("");
                        customercontact.setText("");
                        customeremail.setText("");
                        customeraddress.setText("");
                    }
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                dbconnect.disconnectFromDB();
            }
        }
    }//GEN-LAST:event_customersavebuttonActionPerformed

    private void customereditbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customereditbuttonActionPerformed
        TableModel tablemodel=customerTable.getModel();
        int row = customerTable.getSelectedRow();

        if(row!=-1)
        {
            customercontact.setText((String) tablemodel.getValueAt(row, 0));
            customername.setText((String) tablemodel.getValueAt(row, 1));
            customeremail.setText((String) tablemodel.getValueAt(row, 3));
            customeraddress.setText((String) tablemodel.getValueAt(row, 4));
            customercontact.setEnabled(false);
            rowSelected = (String) customerTable.getValueAt(row, 0);
        }
        else 
        {
            infoMsg("You have to select a row", "Notification");
        }
    }//GEN-LAST:event_customereditbuttonActionPerformed

    private void customercancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customercancelbuttonActionPerformed
        customercontact.setEnabled(true);
        customername.setText("");
        customercontact.setText("");
        customeremail.setText("");
        customeraddress.setText("");
        rowSelected = "none";
    }//GEN-LAST:event_customercancelbuttonActionPerformed

    private void customerdeletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerdeletebuttonActionPerformed
        try{
            TableModel tablemodel = customerTable.getModel();
            int row = customerTable.getSelectedRow();
            if(row != -1)
            {
                String CustomerContact = (String) customerTable.getValueAt(row, 0);

                dbconnect = new DBconnection();
                dbconnect.connectToDB();   
                dbconnect.deleteFromDB("DELETE FROM MediMartCustomer WHERE CustomerContact = '"+CustomerContact+"'");
                infoMsg("Successfully Deleted", "Confirmation");
                customerShow();
                dbconnect.disconnectFromDB(); 
                
                customercontact.setEnabled(true);
                customername.setText("");
                customercontact.setText("");
                customeremail.setText("");
                customeraddress.setText("");
                rowSelected = "none";
            }
            else 
            {
                infoMsg("Please select a row", "Notification");
            }   
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }//GEN-LAST:event_customerdeletebuttonActionPerformed

    private void sellerconfirmbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerconfirmbuttonActionPerformed
        if(medicineSelectTable.getRowCount() == 0)
        {
            infoMsg("No medicine listed to sell", "Warning");
        }
        else
        {
            dispose();
            Invoice invoiceObj = new Invoice(medicineSelectTable, userName, userRole);
            invoiceObj.setVisible(true); 
        }
    }//GEN-LAST:event_sellerconfirmbuttonActionPerformed

    private void sellSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellSearchButtonActionPerformed
        String searchedString = sellSearchText.getText();
        
        try{
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            
            model = (DefaultTableModel) medicineShowTable.getModel();
            model.setRowCount(0);
            
            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartMedicine "
                    + "WHERE MedicineName LIKE '%"+searchedString+"%' OR GenericName LIKE '%"+searchedString+"%' OR CompanyName LIKE '%"+searchedString+"%' OR BatchNo LIKE '%"+searchedString+"%'");
                        
            while(resultset.next()) {
                String mbatchno = String.valueOf(resultset.getString("BatchNo"));
                String mgenericname = String.valueOf(resultset.getString("GenericName"));
                String mmedicinename = resultset.getString("MedicineName");
                String mcategory = resultset.getString("Category");
                String mcompanyname = resultset.getString("CompanyName");
                String mquantity = resultset.getString("Quantity");
                String mprice = resultset.getString("PricePerUnit");
                String mexpirydate = String.valueOf(resultset.getDate("ExpiryDate"));
                                
                String medicineshowTableData[] = {mbatchno, mgenericname, mmedicinename, mcategory, mcompanyname, mquantity, mprice, mexpirydate};              
                model.addRow(medicineshowTableData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }//GEN-LAST:event_sellSearchButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        model2 = (DefaultTableModel) medicineSelectTable.getModel();
        model3 = (DefaultTableModel) medicineShowTable.getModel();
        int row = medicineSelectTable.getSelectedRow();
        
        if(row == -1)
        {
            infoMsg("Please select a row from RIGHT table", "Alert!!");
        }
        else
        {
            String restoreBatchNo = (String)medicineSelectTable.getValueAt(row, 0);
            int restoreQuantity = Integer.parseInt((String)medicineSelectTable.getValueAt(row, 2));
            
            try {
                dbconnect = new DBconnection();
                dbconnect.connectToDB();
                resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartMedicine WHERE BatchNo = '"+restoreBatchNo+"'");

                while(resultset.next())
                {
                    String mQuantity = String.valueOf(resultset.getString("Quantity"));
                    dbconnect.UpdateIntoDB("UPDATE MediMartMedicine SET Quantity = "+(Integer.parseInt(mQuantity)+restoreQuantity)+" WHERE BatchNo = '"+restoreBatchNo+"'");
                    model2.removeRow(row);
                }
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
                dbconnect.disconnectFromDB();
                medicineShow();
            }
            
            float totalAmountToPay = 0;
            int mTotalSelected = medicineSelectTable.getRowCount();
            for(int i=0; i<mTotalSelected; i++)
            {
                String totalToPay = (String)medicineSelectTable.getValueAt(i, 4);
                totalAmountToPay += Float.parseFloat(totalToPay);
            }
            totalAmount.setText(String.valueOf(totalAmountToPay));
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        model2 = (DefaultTableModel) medicineSelectTable.getModel();
        model3 = (DefaultTableModel) medicineShowTable.getModel();
        int row = medicineShowTable.getSelectedRow();
        
        if(row == -1)
        {
            infoMsg("Please select a row from LEFT table", "Alert");
        }
        else
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
       
            String dateString = (String) medicineShowTable.getValueAt(row, 7);
            String expireDate = dateString.replace("-", ""); 

            String presentDate = sdf.format(new Date());
            
            if (Integer.parseInt(expireDate)<Integer.parseInt(presentDate))
            {
                infoMsg("Medicine with date expired can't be sold. Please dispose it properly.", "Alert");
            }
            else
            {
                String medicineQuantity = JOptionPane.showInputDialog(this, "Quantity");
                int stockQuantity = Integer.parseInt((String) medicineShowTable.getValueAt(row, 5));

                if(!integerCheck(medicineQuantity) || medicineQuantity.length() == 0)
                {
                    infoMsg("Invalid quantity", "Caution!!");
                }
                else
                {
                    int sellQuantity = Integer.parseInt(medicineQuantity);

                    if(sellQuantity>stockQuantity || sellQuantity == 0)
                    {
                        infoMsg("Insufficient quantity", "Caution!!");
                    }
                    else
                    {
                        String selectedBatchNo = (String) medicineShowTable.getValueAt(row, 0);
                        boolean mAlreadySelected = false;
                        int mAlreadiInRow = -1;

                        int mSelectTableRow = medicineSelectTable.getRowCount();
                        for(int i=0; i<mSelectTableRow; i++)
                        {
                            if(selectedBatchNo.equals(medicineSelectTable.getValueAt(i, 0)))
                            {
                                mAlreadySelected = true;
                                mAlreadiInRow = i;
                                break;
                            }
                        }

                        try {
                            dbconnect = new DBconnection();
                            dbconnect.connectToDB();
                            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartMedicine WHERE BatchNo = '"+selectedBatchNo+"'");


                            while(resultset.next())
                            {
                                String mBatchNo = String.valueOf(resultset.getString("BatchNo"));
                                String mMedicineName = resultset.getString("MedicineName");
                                String mQuantity = String.valueOf(resultset.getString("Quantity"));
                                String mPricePerUnit = String.valueOf(resultset.getString("PricePerUnit"));

                                if(mBatchNo.equals(selectedBatchNo) && mAlreadySelected == false)
                                {
                                    int quantity = Integer.parseInt(medicineQuantity);
                                    float priceperunit = Float.parseFloat(mPricePerUnit);
                                    float amount = quantity*priceperunit;
                                    String sellingQuantity = String.valueOf(quantity);
                                    String totalAmount = String.valueOf(amount);

                                    String tableData[]= {mBatchNo, mMedicineName, sellingQuantity, mPricePerUnit, totalAmount};
                                    model2.addRow(tableData);

                                    dbconnect.UpdateIntoDB("UPDATE MediMartMedicine SET Quantity = "+(Integer.parseInt(mQuantity)-sellQuantity)+" WHERE BatchNo = '"+selectedBatchNo+"'");
                                    medicineShow();
                                    break;
                                }
                                else if(mBatchNo.equals(selectedBatchNo) && mAlreadySelected == true)
                                {
                                    int quantity = Integer.parseInt(medicineQuantity);
                                    float priceperunit = Float.parseFloat(mPricePerUnit);
                                    float amount = quantity*priceperunit;
                                    String sellingQuantity = String.valueOf(quantity);
                                    String totalAmount = String.valueOf(amount);

                                    String prevQuantity = (String) medicineSelectTable.getValueAt(mAlreadiInRow, 2);
                                    String prevAmount = (String) medicineSelectTable.getValueAt(mAlreadiInRow, 4);

                                    model2.setValueAt(String.valueOf(quantity+(Integer.parseInt(prevQuantity))), mAlreadiInRow, 2);
                                    model2.setValueAt(String.valueOf(amount+(Float.parseFloat(prevAmount))), mAlreadiInRow, 4);

                                    dbconnect.UpdateIntoDB("UPDATE MediMartMedicine SET Quantity = "+(Integer.parseInt(mQuantity)-sellQuantity)+" WHERE BatchNo = '"+selectedBatchNo+"'");
                                    medicineShow();
                                    break;
                                }
                            }

                            float totalAmountToPay = 0;
                            int mTotalSelected = medicineSelectTable.getRowCount();
                            for(int i=0; i<mTotalSelected; i++)
                            {
                                String totalToPay = (String)medicineSelectTable.getValueAt(i, 4);
                                totalAmountToPay += Float.parseFloat(totalToPay);
                            }
                            totalAmount.setText(String.valueOf(totalAmountToPay));

                        } catch (ClassNotFoundException | SQLException ex) {
                            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
                        }finally {
                            dbconnect.disconnectFromDB();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void profileupdatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileupdatebuttonActionPerformed
        String pUsername    = profileusername.getText();
        String pPassword    = profilepassword.getText();
        String pNID         = profilenid.getText();
        String pEmail       = profileemail.getText();
        String pFullName    = profilefullname.getText();
        String pPhone       = profilephone.getText();
        String pAddress     = profileaddress.getText();

        if(pPassword.isEmpty() || pEmail.isEmpty() || pFullName.isEmpty() || pPhone.isEmpty() || pAddress.isEmpty()) {
            infoMsg("You have to fill up all the fields", "Invalid info");
        }
        else if(!numberCheck(pPhone)) {
            infoMsg("Contact must be 11 digit and start with 01...","Invalid contact");
        }
        else if(!emailCheck(pEmail)) {
            infoMsg("Gmail must end with ...@gmail.com","Invalid gmail");
        }
        else {
            try {
                dbconnect = new DBconnection();
                dbconnect.connectToDB();

                dbconnect.UpdateIntoDB("UPDATE MediMartUser SET userPassword ='"+pPassword+"', userEmail ='"+pEmail+"', userFullName ='"+pFullName+"', userPhone ='"+pPhone+"', userAddress ='"+pAddress+"' WHERE userName= '"+pUsername+"' AND userRole = 'Seller'");
                userProfileInfo(userName, userRole);
                usernameShow();
                infoMsg("Information updated successfully","Confirmation");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
                dbconnect.disconnectFromDB();
            }
        }
        myprofilePanel.setVisible(true);
        medicinePanel.setVisible(false);
        sellPanel.setVisible(false);
        customerPanel.setVisible(false);
        invoicePanel.setVisible(false);
    }//GEN-LAST:event_profileupdatebuttonActionPerformed

    private void mpriceperunitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpriceperunitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mpriceperunitActionPerformed

    private void mcompanynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcompanynameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcompanynameActionPerformed

    private void mmedicinenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmedicinenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mmedicinenameActionPerformed

    private void mgenericnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgenericnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mgenericnameActionPerformed

    private void mbatchnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbatchnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbatchnoActionPerformed

    private void mcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcategoryActionPerformed

    private void mquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mquantityActionPerformed

    private void medicinesavebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicinesavebuttonActionPerformed
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HHmmssSS");
        LocalDateTime now = LocalDateTime.now();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String expdate = (String) sdf.format(mexpirydate.getDate());

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

        String mBatchNo = expdate+dtf.format(now);
        String mGenericName = mgenericname.getText();
        String mMedicineName = mmedicinename.getText();
        String mCompanyName = mcompanyname.getText();
        String mCategory = mcategory.getSelectedItem().toString();
        String mExpiryDate = sdf2.format(mexpirydate.getDate());     //mexpirydate.getDateFormatString();
        String mQuantity = mquantity.getText();
        String mPricePerUnit = mpriceperunit.getText();

        try {
            dbconnect = new DBconnection();
            dbconnect.connectToDB();

            if(mGenericName.isEmpty() || mMedicineName.isEmpty() || mCompanyName.isEmpty() || mQuantity.isEmpty() || mPricePerUnit.isEmpty())
            {
                infoMsg("You have to fill up all the fields", "Alert!!");
            }
            else if(!integerCheck(mQuantity))
            {
                infoMsg("Invalid quantity", "Alert!!");
            }
            else if(!floatCheck(mPricePerUnit))
            {
                infoMsg("Invalid price per unit", "Alert!!");
            }
            else
            {
                if(medicineRowSelected == "")
                {
                    dbconnect.insertIntoDB("INSERT INTO MediMartMedicine(BatchNo, GenericName, MedicineName, Category, CompanyName, Quantity, PricePerUnit, ExpiryDate)"
                        + "VALUES ('"+mBatchNo+"', '"+mGenericName+"', '"+mMedicineName+"', '"+mCategory+"', '"+mCompanyName+"', "+Integer.parseInt(mQuantity)+", "+Math.round(Float.parseFloat(mPricePerUnit)*Math.pow(10,2))/Math.pow(10,2)+", '"+mExpiryDate+"')");

                    medicineShow();

                    mbatchno.setText("");
                    mgenericname.setText("");
                    mmedicinename.setText("");
                    mcompanyname.setText("");
                    mpriceperunit.setText("");
                    mquantity.setText("");

                    infoMsg("New medicine added", "Confirmation");
                }
                else if(medicineRowSelected != "")
                {
                    dbconnect.UpdateIntoDB("UPDATE MediMartMedicine SET Category = '"+mCategory+"', Quantity = "+Integer.parseInt(mQuantity)+", PricePerUnit = "+Math.round(Float.parseFloat(mPricePerUnit)*Math.pow(10,2))/Math.pow(10,2)+" WHERE BatchNo = '"+medicineRowSelected+"'");
                    medicineShow();

                    mbatchno.setText("");
                    mgenericname.setText("");
                    mmedicinename.setText("");
                    mcompanyname.setText("");
                    mpriceperunit.setText("");
                    mquantity.setText("");
                    mgenericname.setEnabled(true);
                    mmedicinename.setEnabled(true);
                    mcompanyname.setEnabled(true);
                    mexpirydate.setEnabled(true);
                    mcategory.setEnabled(true);
                    medicineRowSelected = "";

                    infoMsg("Medicine info updated", "Confirmation");
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            dbconnect.disconnectFromDB();
        }
    }//GEN-LAST:event_medicinesavebuttonActionPerformed

    private void medicinedeletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicinedeletebuttonActionPerformed
        try{
            TableModel tablemodel = medicineshowTable.getModel();
            int row = medicineshowTable.getSelectedRow();

            if(row != -1)
            {
                String medicineBatchNo = (String) medicineshowTable.getValueAt(row, 0);

                dbconnect = new DBconnection();
                dbconnect.connectToDB();
                dbconnect.deleteFromDB("DELETE FROM MediMartMedicine WHERE BatchNo = '"+medicineBatchNo+"'");
                infoMsg("Successfully Deleted", "Confirmation");
                medicineShow();
                expiredMedicineAlert();
            }
            else
            {
                infoMsg("Please select a row", "Notification");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }//GEN-LAST:event_medicinedeletebuttonActionPerformed

    private void medicineSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineSearchButtonActionPerformed
        String searchedString = medicineSearchText.getText();
        
        try{
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            
            model = (DefaultTableModel) medicineshowTable.getModel();
            model.setRowCount(0);
            
            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartMedicine "
                    + "WHERE MedicineName LIKE '%"+searchedString+"%' OR GenericName LIKE '%"+searchedString+"%' OR CompanyName LIKE '%"+searchedString+"%' OR BatchNo LIKE '%"+searchedString+"%'");
                        
            while(resultset.next()) {
                String mbatchno = String.valueOf(resultset.getString("BatchNo"));
                String mgenericname = String.valueOf(resultset.getString("GenericName"));
                String mmedicinename = resultset.getString("MedicineName");
                String mcategory = resultset.getString("Category");
                String mcompanyname = resultset.getString("CompanyName");
                String mquantity = resultset.getString("Quantity");
                String mprice = resultset.getString("PricePerUnit");
                String mexpirydate = String.valueOf(resultset.getDate("ExpiryDate"));
                                
                String medicineshowTableData[] = {mbatchno, mgenericname, mmedicinename, mcategory, mcompanyname, mquantity, mprice, mexpirydate};              
                model.addRow(medicineshowTableData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }//GEN-LAST:event_medicineSearchButtonActionPerformed

    private void medicineeditbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineeditbuttonActionPerformed
        TableModel tablemodel=medicineshowTable.getModel();
        int row = medicineshowTable.getSelectedRow();

        if(row!=-1)
        {
            mbatchno.setText((String) tablemodel.getValueAt(row, 0));
            mgenericname.setText((String) tablemodel.getValueAt(row, 1));
            mmedicinename.setText((String) tablemodel.getValueAt(row, 2));
            mcategory.setSelectedItem((String) tablemodel.getValueAt(row, 3));
            mcompanyname.setText((String) tablemodel.getValueAt(row, 4));
            mquantity.setText((String) tablemodel.getValueAt(row, 5));
            mpriceperunit.setText((String) tablemodel.getValueAt(row, 6));

            mgenericname.setEnabled(false);
            mmedicinename.setEnabled(false);
            mcompanyname.setEnabled(false);
            mexpirydate.setEnabled(false);
            mcategory.setEnabled(false);

            medicineRowSelected = (String) medicineshowTable.getValueAt(row, 0);
        }
        else
        {
            infoMsg("You have to select a row", "Notification");
        }
    }//GEN-LAST:event_medicineeditbuttonActionPerformed

    private void medicinecancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicinecancelbuttonActionPerformed
        mbatchno.setText("");
        mgenericname.setText("");
        mmedicinename.setText("");
        mcompanyname.setText("");
        mpriceperunit.setText("");
        mquantity.setText("");
        mgenericname.setEnabled(true);
        mmedicinename.setEnabled(true);
        mcompanyname.setEnabled(true);
        mexpirydate.setEnabled(true);
        mcategory.setEnabled(true);

        medicineRowSelected = "";
    }//GEN-LAST:event_medicinecancelbuttonActionPerformed

    private void invoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceButtonActionPerformed
        myprofilePanel.setVisible(false);
        medicinePanel.setVisible(false);
        sellPanel.setVisible(false);
        customerPanel.setVisible(false);
        invoicePanel.setVisible(true);

        invoiceShow();
    }//GEN-LAST:event_invoiceButtonActionPerformed

    private void invoiceSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceSearchButtonActionPerformed
        String searchedString = invoiceSearchText.getText();
        
                try{
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            
            model = (DefaultTableModel) invoiceShowTable.getModel();
            model.setRowCount(0);
            
            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartInvoice WHERE SellerUsername='"+userName+"' AND InvoiceId LIKE '%"+searchedString+"%' OR CustomerName LIKE '%"+searchedString+"%' OR CustomerPhone LIKE '%"+searchedString+"%' OR DateTime LIKE '%"+searchedString+"%'");
                                    
            while(resultset.next()) {
                String InvoiceID = resultset.getString("InvoiceId");
                String SellerUsername = resultset.getString("SellerUsername");
                String CustomerName = resultset.getString("CustomerName");
                String CustomerPhone = resultset.getString("CustomerPhone");
                String SellAmount = (String) resultset.getString("SellAmount");
                String DateTime = resultset.getString("DateTime");
                
                String invoiceTableData[] = {InvoiceID, SellerUsername, CustomerName, CustomerPhone, SellAmount, DateTime};              
                model.addRow(invoiceTableData);
            }
           
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }//GEN-LAST:event_invoiceSearchButtonActionPerformed

    private void sellSearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellSearchTextKeyReleased
        String searchedString = sellSearchText.getText();
        
        try{
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            
            model = (DefaultTableModel) medicineShowTable.getModel();
            model.setRowCount(0);
            
            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartMedicine "
                    + "WHERE MedicineName LIKE '%"+searchedString+"%' OR GenericName LIKE '%"+searchedString+"%' OR CompanyName LIKE '%"+searchedString+"%' OR BatchNo LIKE '%"+searchedString+"%'");
                        
            while(resultset.next()) {
                String mbatchno = String.valueOf(resultset.getString("BatchNo"));
                String mgenericname = String.valueOf(resultset.getString("GenericName"));
                String mmedicinename = resultset.getString("MedicineName");
                String mcategory = resultset.getString("Category");
                String mcompanyname = resultset.getString("CompanyName");
                String mquantity = resultset.getString("Quantity");
                String mprice = resultset.getString("PricePerUnit");
                String mexpirydate = String.valueOf(resultset.getDate("ExpiryDate"));
                                
                String medicineshowTableData[] = {mbatchno, mgenericname, mmedicinename, mcategory, mcompanyname, mquantity, mprice, mexpirydate};              
                model.addRow(medicineshowTableData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }//GEN-LAST:event_sellSearchTextKeyReleased

    private void medicineSearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_medicineSearchTextKeyReleased
        String searchedString = medicineSearchText.getText();
        
        try{
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            
            model = (DefaultTableModel) medicineshowTable.getModel();
            model.setRowCount(0);
            
            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartMedicine "
                    + "WHERE MedicineName LIKE '%"+searchedString+"%' OR GenericName LIKE '%"+searchedString+"%' OR CompanyName LIKE '%"+searchedString+"%' OR BatchNo LIKE '%"+searchedString+"%'");
                        
            while(resultset.next()) {
                String mbatchno = String.valueOf(resultset.getString("BatchNo"));
                String mgenericname = String.valueOf(resultset.getString("GenericName"));
                String mmedicinename = resultset.getString("MedicineName");
                String mcategory = resultset.getString("Category");
                String mcompanyname = resultset.getString("CompanyName");
                String mquantity = resultset.getString("Quantity");
                String mprice = resultset.getString("PricePerUnit");
                String mexpirydate = String.valueOf(resultset.getDate("ExpiryDate"));
                                
                String medicineshowTableData[] = {mbatchno, mgenericname, mmedicinename, mcategory, mcompanyname, mquantity, mprice, mexpirydate};              
                model.addRow(medicineshowTableData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }//GEN-LAST:event_medicineSearchTextKeyReleased

    private void invoiceSearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceSearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_invoiceSearchTextActionPerformed

    private void invoiceSearchTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invoiceSearchTextKeyReleased
        String searchedString = invoiceSearchText.getText();
        
                try{
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            
            model = (DefaultTableModel) invoiceShowTable.getModel();
            model.setRowCount(0);
            
            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartInvoice WHERE (SellerUsername='"+userName+"') AND (InvoiceId LIKE '%"+searchedString+"%' OR CustomerName LIKE '%"+searchedString+"%' OR CustomerPhone LIKE '%"+searchedString+"%' OR DateTime LIKE '%"+searchedString+"%')");
                                    
            while(resultset.next()) {
                String InvoiceID = resultset.getString("InvoiceId");
                String SellerUsername = resultset.getString("SellerUsername");
                String CustomerName = resultset.getString("CustomerName");
                String CustomerPhone = resultset.getString("CustomerPhone");
                String SellAmount = (String) resultset.getString("SellAmount");
                String DateTime = resultset.getString("DateTime");
                
                String invoiceTableData[] = {InvoiceID, SellerUsername, CustomerName, CustomerPhone, SellAmount, DateTime};              
                model.addRow(invoiceTableData);
            }
           
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }//GEN-LAST:event_invoiceSearchTextKeyReleased

    private void warningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warningButtonActionPerformed
        Toolkit.getDefaultToolkit().beep();
        infoMsg("You have expired medicine in stock. You need to dispose them properly", "Caution!!!");
    }//GEN-LAST:event_warningButtonActionPerformed

    public void infoMsg(String message, String title)
    {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    private void expiredMedicineAlert() {
        int rowCount = medicineShowTable.getRowCount();
                
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        String presentDate = sdf.format(new Date());

        int expiredMedicineCounter = 0;
        for(int i=0; i<rowCount; i++)
        {
            String dateString = (String) medicineShowTable.getValueAt(i, 7);
            String expireDate = dateString.replace("-", ""); 
            
            
                    
            if (Integer.parseInt(expireDate)<Integer.parseInt(presentDate))
            { 
                expiredMedicineCounter++;
            }
            else
            {
                warningButton.setVisible(false);
            }
        }
        
        if(expiredMedicineCounter != 0)
        {
            warningButton.setVisible(true);
        }
        else
        {
            warningButton.setVisible(false);
        }
    }

    boolean numberCheck(String number) {
        int numberLength = number.length();

        if(numberLength != 11) {
            return false;
        }
        else if(number.charAt(0) != '0' || number.charAt(1) != '1') {
            return false;
        }
        else {
            for(int i=0; i<numberLength; i++)
            {
                if(!(number.charAt(i)>='0' && number.charAt(i)<='9'))
                {
                   return false;
                }
            }
        }
        return true;
    }

    boolean emailCheck(String email) {
        int emailLength = email.length();

        if(emailLength <= 10) {
            return false;
        }
        else if(!(email.substring(emailLength - 10).equals("@gmail.com"))) {
            return false;
        }
        return true;
    }

    public void userProfileInfo(String userName, String userRole)
    {
        try{
            dbconnect = new DBconnection();
            dbconnect.connectToDB();

            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartUser WHERE userName = '"+userName+"' AND userRole = '"+userRole+"'");

            while(resultset.next()) {
                profileusername.setText(resultset.getString("userName"));
                profilenid.setText(resultset.getString("userNID"));
                profilerole.setText(resultset.getString("userRole"));
                profilefullname.setText(resultset.getString("userFullName"));
                profilepassword.setText(resultset.getString("userPassword"));
                profileaddress.setText(resultset.getString("userAddress"));
                profileemail.setText(resultset.getString("userEmail"));
                profilephone.setText(resultset.getString("userPhone"));
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }    
    
    private void customerShow(){
        try{
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            
            model = (DefaultTableModel) customerTable.getModel();
            model.setRowCount(0);
            
            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartCustomer");
                        
            while(resultset.next()) {
                String CustomerPoints = resultset.getString("CustomerPoints");
                String CustomerName = resultset.getString("CustomerName");
                String CustomerContact = resultset.getString("CustomerContact");
                String CustomerEmail = resultset.getString("CustomerEmail");
                String CustomerAddress = resultset.getString("CustomerAddress");
                
                String customerTableData[] = {CustomerContact, CustomerName, CustomerPoints, CustomerEmail, CustomerAddress};              
                model.addRow(customerTableData);
            }
           
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }
    
    private void invoiceShow(){
        try{
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            
            model = (DefaultTableModel) invoiceShowTable.getModel();
            model.setRowCount(0);
            
            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartInvoice WHERE SellerUsername='"+userName+"'");
                        
            while(resultset.next()) {
                String InvoiceID = resultset.getString("InvoiceId");
                String SellerUsername = resultset.getString("SellerUsername");
                String CustomerName = resultset.getString("CustomerName");
                String CustomerPhone = resultset.getString("CustomerPhone");
                String SellAmount = (String) resultset.getString("SellAmount");
                String DateTime = resultset.getString("DateTime");
                
                String invoiceTableData[] = {InvoiceID, SellerUsername, CustomerName, CustomerPhone, SellAmount, DateTime};              
                model.addRow(invoiceTableData);
            }
           
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }

    private void usernameShow(){
        try {
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartUser WHERE userName = '"+userName+"'");

            while(resultset.next())
            {
                title.setText(resultset.getString("userFullName"));
            }
        }catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }
    
    private void medicineShow(){
        try{
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            
            model = (DefaultTableModel) medicineshowTable.getModel();
            model.setRowCount(0);
            
            model2 = (DefaultTableModel) medicineShowTable.getModel();
            model2.setRowCount(0);
            
            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartMedicine");
                        
            while(resultset.next()) {
                String mbatchno = String.valueOf(resultset.getString("BatchNo"));
                String mgenericname = String.valueOf(resultset.getString("GenericName"));
                String mmedicinename = resultset.getString("MedicineName");
                String mcategory = resultset.getString("Category");
                String mcompanyname = resultset.getString("CompanyName");
                String mquantity = resultset.getString("Quantity");
                String mprice = resultset.getString("PricePerUnit");
                String mexpirydate = String.valueOf(resultset.getDate("ExpiryDate"));
                                
                String medicineShowTableData[] = {mbatchno, mgenericname, mmedicinename, mcategory, mcompanyname, mquantity, mprice, mexpirydate};              
                model.addRow(medicineShowTableData);
                
                String medicineshowTableData[] = {mbatchno, mgenericname, mmedicinename, mcategory, mcompanyname, mquantity, mprice, mexpirydate};              
                model2.addRow(medicineshowTableData);
                
//               SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//
//                String presentDate = sdf.format(new Date());
//                
//                int i=Integer.parseInt(mexpirydate); 
//                int j=Integer.parseInt(presentDate); 
//                if(i>j)
//                {
//                    model.setSelectionBackground(Color.blue);
//                }
                
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }
    
    boolean floatCheck(String floatnumber) {
        int floatnumberLength = floatnumber.length();

        for(int i=0; i<floatnumberLength; i++)
        {
            if(!(floatnumber.charAt(i)>='0' && floatnumber.charAt(i)<='9') && floatnumber.charAt(i)!='.')
            {
               return false;
            }
        }
        return true;
    }
    
    boolean integerCheck(String integer) {
        int integerLength = integer.length();

        for(int i=0; i<integerLength; i++)
        {
            if(!(integer.charAt(i)>='0' && integer.charAt(i)<='9'))
            {
               return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton customerButton;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JTable customerTable;
    private javax.swing.JTextField customeraddress;
    private javax.swing.JButton customercancelbutton;
    private javax.swing.JTextField customercontact;
    private javax.swing.JButton customerdeletebutton;
    private javax.swing.JButton customereditbutton;
    private javax.swing.JTextField customeremail;
    private javax.swing.JTextField customername;
    private javax.swing.JButton customersavebutton;
    private javax.swing.JButton invoiceButton;
    private javax.swing.JPanel invoicePanel;
    private javax.swing.JButton invoiceSearchButton;
    private javax.swing.JTextField invoiceSearchText;
    private javax.swing.JTable invoiceShowTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton logoutButton;
    private javax.swing.JTextField mbatchno;
    private javax.swing.JComboBox<String> mcategory;
    private javax.swing.JTextField mcompanyname;
    private javax.swing.JButton medicineButton;
    private javax.swing.JPanel medicinePanel;
    private javax.swing.JButton medicineSearchButton;
    private javax.swing.JTextField medicineSearchText;
    private javax.swing.JTable medicineSelectTable;
    private javax.swing.JTable medicineShowTable;
    private javax.swing.JButton medicinecancelbutton;
    private javax.swing.JButton medicinedeletebutton;
    private javax.swing.JButton medicineeditbutton;
    private javax.swing.JButton medicinesavebutton;
    private javax.swing.JTable medicineshowTable;
    private com.toedter.calendar.JDateChooser mexpirydate;
    private javax.swing.JTextField mgenericname;
    private javax.swing.JTextField mmedicinename;
    private javax.swing.JTextField mpriceperunit;
    private javax.swing.JTextField mquantity;
    private javax.swing.JButton myprofileButton;
    private javax.swing.JPanel myprofilePanel;
    private javax.swing.JTextField profileaddress;
    private javax.swing.JTextField profileemail;
    private javax.swing.JTextField profilefullname;
    private javax.swing.JTextField profilenid;
    private javax.swing.JTextField profilepassword;
    private javax.swing.JTextField profilephone;
    private javax.swing.JTextField profilerole;
    private javax.swing.JButton profileupdatebutton;
    private javax.swing.JTextField profileusername;
    private javax.swing.JButton removeButton;
    private javax.swing.JPanel sellPanel;
    private javax.swing.JButton sellSearchButton;
    private javax.swing.JTextField sellSearchText;
    private javax.swing.JButton sellerButton;
    private javax.swing.JPanel sellerPanel;
    private javax.swing.JButton sellerconfirmbutton;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel title3;
    private javax.swing.JLabel title4;
    private javax.swing.JLabel title5;
    private javax.swing.JLabel title6;
    private javax.swing.JTextField totalAmount;
    private javax.swing.JButton warningButton;
    // End of variables declaration//GEN-END:variables

}
