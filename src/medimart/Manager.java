package medimart;

import database.DBconnection;
import java.awt.Color;
import java.awt.Component;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;

public class Manager extends javax.swing.JFrame {
    private DBconnection dbconnect;
    private ResultSet resultset;

    public String userName, userRole;
    String rowSelected = "";
    String medicineRowSelected = "";
    private JTable table;
    DefaultTableModel model;

    Date date = new Date();
    
    public Manager() {
    }

    public Manager(String usrName, String usrRole) {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/medimartIcon.png")));

        mexpirydate.setMinSelectableDate(date);
        mexpirydate.setDate(date);
            
        myprofilePanel.setVisible(true);
        medicinePanel.setVisible(false);
        sellerPanel.setVisible(false);
        customerPanel.setVisible(false);
        invoicePanel.setVisible(false);
        
        userName = usrName;
        userRole = usrRole;
        usernameShow();
        userProfileInfo(userName, userRole);
        sellerShow();
        customerShow();
        medicineShow();
        expiredMedicineAlert();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        managerPanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        myprofileButton = new javax.swing.JButton();
        medicineButton = new javax.swing.JButton();
        sellerButton = new javax.swing.JButton();
        customerButton = new javax.swing.JButton();
        invoiceButton = new javax.swing.JButton();
        myprofilePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        profilepassword = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        profilefullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        profilenid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        profileaddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        profileemail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        profilephone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        profilerole = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        profileusername = new javax.swing.JTextField();
        profileupdatebutton = new javax.swing.JButton();
        medicinePanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        medicineshowTable = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        mgenericname = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        mcompanyname = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        mpriceperunit = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        mexpirydate = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        mquantity = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        mmedicinename = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        mcategory = new javax.swing.JComboBox<>();
        medicinesavebutton = new javax.swing.JButton();
        medicineeditbutton = new javax.swing.JButton();
        medicinecancelbutton = new javax.swing.JButton();
        medicinedeletebutton = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        title1 = new javax.swing.JLabel();
        medicineSearchText = new javax.swing.JTextField();
        medicineSearchButton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        mbatchno = new javax.swing.JTextField();
        sellerPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sellerusername = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        sellernid = new javax.swing.JTextField();
        sellerfullname = new javax.swing.JTextField();
        sellerpassword = new javax.swing.JTextField();
        selleraddress = new javax.swing.JTextField();
        selleremail = new javax.swing.JTextField();
        sellerphone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sellersavebutton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        sellereditbutton = new javax.swing.JButton();
        sellercancelbutton = new javax.swing.JButton();
        sellerdeletebutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        customerPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        invoicePanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();
        title6 = new javax.swing.JLabel();
        searchInvoice = new javax.swing.JTextField();
        searchButton4 = new javax.swing.JButton();
        warningButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MediMart");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        managerPanel.setBackground(new java.awt.Color(102, 102, 102));
        managerPanel.setMinimumSize(new java.awt.Dimension(1000, 600));
        managerPanel.setPreferredSize(new java.awt.Dimension(1000, 600));
        managerPanel.setLayout(null);

        title.setBackground(new java.awt.Color(255, 255, 255));
        title.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Manager Name");
        title.setToolTipText("");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        title.setPreferredSize(new java.awt.Dimension(490, 57));
        managerPanel.add(title);
        title.setBounds(50, 0, 900, 60);

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
        managerPanel.add(logoutButton);
        logoutButton.setBounds(960, 10, 30, 30);

        myprofileButton.setBackground(new java.awt.Color(216, 226, 220));
        myprofileButton.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        myprofileButton.setText("My Profile");
        myprofileButton.setBorder(null);
        myprofileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myprofileButtonActionPerformed(evt);
            }
        });
        managerPanel.add(myprofileButton);
        myprofileButton.setBounds(25, 70, 170, 40);

        medicineButton.setBackground(new java.awt.Color(255, 229, 217));
        medicineButton.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        medicineButton.setText("Medicine");
        medicineButton.setBorder(null);
        medicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineButtonActionPerformed(evt);
            }
        });
        managerPanel.add(medicineButton);
        medicineButton.setBounds(220, 70, 170, 40);

        sellerButton.setBackground(new java.awt.Color(199, 249, 204));
        sellerButton.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        sellerButton.setText("Seller");
        sellerButton.setBorder(null);
        sellerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerButtonActionPerformed(evt);
            }
        });
        managerPanel.add(sellerButton);
        sellerButton.setBounds(415, 70, 170, 40);

        customerButton.setBackground(new java.awt.Color(255, 214, 165));
        customerButton.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        customerButton.setText("Customer");
        customerButton.setBorder(null);
        customerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerButtonActionPerformed(evt);
            }
        });
        managerPanel.add(customerButton);
        customerButton.setBounds(610, 70, 170, 40);

        invoiceButton.setBackground(new java.awt.Color(255, 255, 204));
        invoiceButton.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        invoiceButton.setText("Invoice");
        invoiceButton.setBorder(null);
        invoiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoiceButtonActionPerformed(evt);
            }
        });
        managerPanel.add(invoiceButton);
        invoiceButton.setBounds(805, 70, 170, 40);

        myprofilePanel.setBackground(new java.awt.Color(216, 226, 220));
        myprofilePanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel1.setText("Password:");
        myprofilePanel.add(jLabel1);
        jLabel1.setBounds(90, 150, 110, 30);

        profilepassword.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        myprofilePanel.add(profilepassword);
        profilepassword.setBounds(220, 150, 700, 30);

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel2.setText("Full name:");
        myprofilePanel.add(jLabel2);
        jLabel2.setBounds(90, 100, 110, 30);

        profilefullname.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        myprofilePanel.add(profilefullname);
        profilefullname.setBounds(220, 100, 700, 30);

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel3.setText("NID:");
        myprofilePanel.add(jLabel3);
        jLabel3.setBounds(330, 20, 50, 30);

        profilenid.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        profilenid.setEnabled(false);
        myprofilePanel.add(profilenid);
        profilenid.setBounds(380, 20, 310, 30);

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel4.setText("Address:");
        myprofilePanel.add(jLabel4);
        jLabel4.setBounds(90, 200, 110, 30);

        profileaddress.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        myprofilePanel.add(profileaddress);
        profileaddress.setBounds(220, 200, 700, 30);

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel5.setText("Email:");
        myprofilePanel.add(jLabel5);
        jLabel5.setBounds(90, 250, 110, 30);

        profileemail.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        myprofilePanel.add(profileemail);
        profileemail.setBounds(220, 250, 700, 30);

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel6.setText("Phone:");
        myprofilePanel.add(jLabel6);
        jLabel6.setBounds(90, 300, 110, 30);

        profilephone.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        myprofilePanel.add(profilephone);
        profilephone.setBounds(220, 300, 700, 30);

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel7.setText("Role:");
        myprofilePanel.add(jLabel7);
        jLabel7.setBounds(760, 20, 50, 30);

        profilerole.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        profilerole.setEnabled(false);
        myprofilePanel.add(profilerole);
        profilerole.setBounds(810, 20, 150, 30);

        jLabel8.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jLabel8.setText("Username:");
        myprofilePanel.add(jLabel8);
        jLabel8.setBounds(40, 20, 90, 30);

        profileusername.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        profileusername.setEnabled(false);
        myprofilePanel.add(profileusername);
        profileusername.setBounds(130, 20, 150, 30);

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
        profileupdatebutton.setBounds(410, 400, 150, 40);

        managerPanel.add(myprofilePanel);
        myprofilePanel.setBounds(0, 110, 1000, 490);

        medicinePanel.setBackground(new java.awt.Color(255, 229, 217));
        medicinePanel.setLayout(null);

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

        jLabel19.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel19.setText("Generic Name:*");
        jLabel19.setMaximumSize(new java.awt.Dimension(94, 23));
        jLabel19.setMinimumSize(new java.awt.Dimension(94, 23));
        jLabel19.setPreferredSize(new java.awt.Dimension(94, 23));
        medicinePanel.add(jLabel19);
        jLabel19.setBounds(10, 10, 130, 30);

        mgenericname.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        mgenericname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgenericnameActionPerformed(evt);
            }
        });
        medicinePanel.add(mgenericname);
        mgenericname.setBounds(160, 10, 250, 30);

        jLabel21.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel21.setText("Company Name:*");
        jLabel21.setMaximumSize(new java.awt.Dimension(94, 23));
        jLabel21.setMinimumSize(new java.awt.Dimension(94, 23));
        jLabel21.setPreferredSize(new java.awt.Dimension(94, 23));
        medicinePanel.add(jLabel21);
        jLabel21.setBounds(10, 90, 150, 30);

        mcompanyname.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        mcompanyname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mcompanynameActionPerformed(evt);
            }
        });
        medicinePanel.add(mcompanyname);
        mcompanyname.setBounds(160, 90, 250, 30);

        jLabel24.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel24.setText("Price per unit:");
        jLabel24.setMaximumSize(new java.awt.Dimension(94, 23));
        jLabel24.setMinimumSize(new java.awt.Dimension(94, 23));
        jLabel24.setPreferredSize(new java.awt.Dimension(94, 23));
        medicinePanel.add(jLabel24);
        jLabel24.setBounds(10, 130, 120, 30);

        mpriceperunit.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        mpriceperunit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mpriceperunitActionPerformed(evt);
            }
        });
        medicinePanel.add(mpriceperunit);
        mpriceperunit.setBounds(160, 130, 250, 30);

        jLabel22.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel22.setText("Expiry Date:*");
        jLabel22.setMaximumSize(new java.awt.Dimension(94, 23));
        jLabel22.setMinimumSize(new java.awt.Dimension(94, 23));
        jLabel22.setPreferredSize(new java.awt.Dimension(94, 23));
        medicinePanel.add(jLabel22);
        jLabel22.setBounds(440, 90, 110, 30);

        mexpirydate.setDate(date);
        medicinePanel.add(mexpirydate);
        mexpirydate.setBounds(550, 90, 210, 30);

        jLabel23.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel23.setText("Quantity:");
        jLabel23.setMaximumSize(new java.awt.Dimension(94, 23));
        jLabel23.setMinimumSize(new java.awt.Dimension(94, 23));
        jLabel23.setPreferredSize(new java.awt.Dimension(94, 23));
        medicinePanel.add(jLabel23);
        jLabel23.setBounds(440, 130, 80, 30);

        mquantity.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        mquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mquantityActionPerformed(evt);
            }
        });
        medicinePanel.add(mquantity);
        mquantity.setBounds(550, 130, 210, 30);

        jLabel20.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel20.setText("Medicine Name:*");
        jLabel20.setMaximumSize(new java.awt.Dimension(94, 23));
        jLabel20.setMinimumSize(new java.awt.Dimension(94, 23));
        jLabel20.setPreferredSize(new java.awt.Dimension(94, 23));
        medicinePanel.add(jLabel20);
        jLabel20.setBounds(10, 50, 140, 30);

        mmedicinename.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        mmedicinename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmedicinenameActionPerformed(evt);
            }
        });
        medicinePanel.add(mmedicinename);
        mmedicinename.setBounds(160, 50, 250, 30);

        jLabel25.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel25.setText("Category:");
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

        medicinesavebutton.setBackground(new java.awt.Color(170, 224, 251));
        medicinesavebutton.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        medicinesavebutton.setText("Save");
        medicinesavebutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        medicinesavebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicinesavebuttonActionPerformed(evt);
            }
        });
        medicinePanel.add(medicinesavebutton);
        medicinesavebutton.setBounds(840, 60, 100, 50);

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

        jLabel26.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 51, 0));
        jLabel26.setText("* marked fields can't be changed later");
        medicinePanel.add(jLabel26);
        jLabel26.setBounds(300, 160, 303, 23);

        title1.setBackground(new java.awt.Color(255, 255, 255));
        title1.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(0, 0, 116));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title1.setText("Find Medicine:");
        title1.setToolTipText("");
        title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        medicinePanel.add(title1);
        title1.setBounds(300, 200, 120, 30);

        medicineSearchText.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        medicineSearchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineSearchTextActionPerformed(evt);
            }
        });
        medicineSearchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                medicineSearchTextKeyReleased(evt);
            }
        });
        medicinePanel.add(medicineSearchText);
        medicineSearchText.setBounds(430, 200, 340, 30);

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

        jLabel18.setBackground(new java.awt.Color(255, 255, 204));
        jLabel18.setOpaque(true);
        medicinePanel.add(jLabel18);
        jLabel18.setBounds(280, 190, 540, 50);

        jLabel27.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel27.setText("Batch No:");
        jLabel27.setMaximumSize(new java.awt.Dimension(94, 23));
        jLabel27.setMinimumSize(new java.awt.Dimension(94, 23));
        jLabel27.setPreferredSize(new java.awt.Dimension(94, 23));
        medicinePanel.add(jLabel27);
        jLabel27.setBounds(440, 10, 90, 30);

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

        managerPanel.add(medicinePanel);
        medicinePanel.setBounds(0, 110, 1000, 490);

        sellerPanel.setBackground(new java.awt.Color(199, 249, 204));
        sellerPanel.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel9.setText("Full name:");
        sellerPanel.add(jLabel9);
        jLabel9.setBounds(20, 90, 100, 30);

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("s-");
        jLabel10.setOpaque(true);
        sellerPanel.add(jLabel10);
        jLabel10.setBounds(120, 10, 20, 30);

        sellerusername.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        sellerPanel.add(sellerusername);
        sellerusername.setBounds(140, 10, 290, 30);

        jLabel11.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel11.setText("NID:*");
        sellerPanel.add(jLabel11);
        jLabel11.setBounds(470, 10, 80, 30);

        sellernid.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        sellerPanel.add(sellernid);
        sellernid.setBounds(550, 10, 310, 30);

        sellerfullname.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        sellerPanel.add(sellerfullname);
        sellerfullname.setBounds(120, 90, 310, 30);

        sellerpassword.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        sellerPanel.add(sellerpassword);
        sellerpassword.setBounds(120, 50, 310, 30);

        selleraddress.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        sellerPanel.add(selleraddress);
        selleraddress.setBounds(120, 130, 740, 30);

        selleremail.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        sellerPanel.add(selleremail);
        selleremail.setBounds(550, 50, 310, 30);

        sellerphone.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        sellerPanel.add(sellerphone);
        sellerphone.setBounds(550, 90, 310, 30);

        jLabel13.setFont(new java.awt.Font("Book Antiqua", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 0));
        jLabel13.setText("* marked fields can't be changed later");
        sellerPanel.add(jLabel13);
        jLabel13.setBounds(340, 170, 310, 20);

        jLabel14.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel14.setText("Email:");
        sellerPanel.add(jLabel14);
        jLabel14.setBounds(470, 50, 80, 30);

        jLabel15.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel15.setText("Address:");
        sellerPanel.add(jLabel15);
        jLabel15.setBounds(20, 130, 80, 30);

        jLabel16.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel16.setText("Password:");
        sellerPanel.add(jLabel16);
        jLabel16.setBounds(20, 50, 100, 30);

        sellersavebutton.setBackground(new java.awt.Color(255, 255, 255));
        sellersavebutton.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        sellersavebutton.setText("Save");
        sellersavebutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sellersavebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellersavebuttonActionPerformed(evt);
            }
        });
        sellerPanel.add(sellersavebutton);
        sellersavebutton.setBounds(880, 60, 100, 50);

        jLabel17.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel17.setText("Phone:");
        sellerPanel.add(jLabel17);
        jLabel17.setBounds(470, 90, 80, 30);

        sellereditbutton.setBackground(new java.awt.Color(0, 255, 255));
        sellereditbutton.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        sellereditbutton.setText("Edit");
        sellereditbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sellereditbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellereditbuttonActionPerformed(evt);
            }
        });
        sellerPanel.add(sellereditbutton);
        sellereditbutton.setBounds(10, 210, 100, 30);

        sellercancelbutton.setBackground(new java.awt.Color(204, 204, 204));
        sellercancelbutton.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        sellercancelbutton.setText("Cancel");
        sellercancelbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sellercancelbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellercancelbuttonActionPerformed(evt);
            }
        });
        sellerPanel.add(sellercancelbutton);
        sellercancelbutton.setBounds(140, 210, 100, 30);

        sellerdeletebutton.setBackground(new java.awt.Color(255, 102, 102));
        sellerdeletebutton.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        sellerdeletebutton.setText("Delete");
        sellerdeletebutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sellerdeletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerdeletebuttonActionPerformed(evt);
            }
        });
        sellerPanel.add(sellerdeletebutton);
        sellerdeletebutton.setBounds(890, 210, 100, 30);

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Password", "Full Name", "Phone", "NID", "Email", "Address"
            }
        ));
        jScrollPane1.setViewportView(userTable);

        sellerPanel.add(jScrollPane1);
        jScrollPane1.setBounds(0, 240, 1000, 250);

        jLabel12.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel12.setText("Username:*");
        sellerPanel.add(jLabel12);
        jLabel12.setBounds(20, 10, 100, 30);

        managerPanel.add(sellerPanel);
        sellerPanel.setBounds(0, 110, 1000, 490);

        customerPanel.setBackground(new java.awt.Color(255, 214, 165));
        customerPanel.setLayout(null);

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
        jScrollPane3.setBounds(0, 30, 1000, 460);

        managerPanel.add(customerPanel);
        customerPanel.setBounds(0, 110, 1000, 490);

        invoicePanel.setBackground(new java.awt.Color(255, 255, 204));
        invoicePanel.setLayout(null);

        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
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
        invoiceTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane6.setViewportView(invoiceTable);

        invoicePanel.add(jScrollPane6);
        jScrollPane6.setBounds(0, 80, 1000, 410);

        title6.setBackground(new java.awt.Color(255, 255, 255));
        title6.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        title6.setForeground(new java.awt.Color(0, 0, 116));
        title6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        title6.setText("Check Invoice:");
        title6.setToolTipText("");
        title6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        invoicePanel.add(title6);
        title6.setBounds(230, 30, 120, 30);

        searchInvoice.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        searchInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInvoiceActionPerformed(evt);
            }
        });
        searchInvoice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchInvoiceKeyReleased(evt);
            }
        });
        invoicePanel.add(searchInvoice);
        searchInvoice.setBounds(360, 30, 350, 30);

        searchButton4.setBackground(new java.awt.Color(255, 102, 102));
        searchButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/find_1.png"))); // NOI18N
        searchButton4.setBorder(null);
        searchButton4.setOpaque(false);
        searchButton4.setPreferredSize(new java.awt.Dimension(30, 30));
        searchButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton4ActionPerformed(evt);
            }
        });
        invoicePanel.add(searchButton4);
        searchButton4.setBounds(720, 30, 30, 30);

        managerPanel.add(invoicePanel);
        invoicePanel.setBounds(0, 110, 1000, 490);

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
        managerPanel.add(warningButton);
        warningButton.setBounds(10, 10, 50, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(managerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(managerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        dispose();        
        Welcome welcomeObj = new Welcome();
        welcomeObj.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void customerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerButtonActionPerformed
        myprofilePanel.setVisible(false);
        medicinePanel.setVisible(false);
        sellerPanel.setVisible(false);
        customerPanel.setVisible(true);
        invoicePanel.setVisible(false);
    }//GEN-LAST:event_customerButtonActionPerformed

    private void myprofileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myprofileButtonActionPerformed
        myprofilePanel.setVisible(true);
        medicinePanel.setVisible(false);
        sellerPanel.setVisible(false);
        customerPanel.setVisible(false);
        invoicePanel.setVisible(false);

        userProfileInfo(userName, userRole);  
    }//GEN-LAST:event_myprofileButtonActionPerformed

    private void sellerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerButtonActionPerformed
        myprofilePanel.setVisible(false);
        medicinePanel.setVisible(false);
        sellerPanel.setVisible(true);
        customerPanel.setVisible(false);
        invoicePanel.setVisible(false);
    }//GEN-LAST:event_sellerButtonActionPerformed

    private void medicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineButtonActionPerformed
        myprofilePanel.setVisible(false);
        medicinePanel.setVisible(true);
        sellerPanel.setVisible(false);
        customerPanel.setVisible(false);
        invoicePanel.setVisible(false);
        
        medicineShow();
    }//GEN-LAST:event_medicineButtonActionPerformed

    private void profileupdatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profileupdatebuttonActionPerformed
        String pUsername    = profileusername.getText();
        String pPassword    = profilepassword.getText();
        String pNID         = profilenid.getText();
        String pEmail       = profileemail.getText();        
        String pFullName    = profilefullname.getText();
        String pPhone       = profilephone.getText();
        String pAddress     = profileaddress.getText();

        if(pPassword.isEmpty() || pEmail.isEmpty() || pFullName.isEmpty() || pPhone.isEmpty() || pAddress.isEmpty()) {
            infoMsg("You have to fill up all the fields", "Alert!!");
        }
        else if(!numberCheck(pPhone)) {
            infoMsg("Invalid contact. It must be 11 digit and start with 01...","Alert!!");
        }
        else if(!emailCheck(pEmail)) {
            infoMsg("Invalid email. It must end with ...@gmail.com","Alert!!");
        }
        else {
            try {
                dbconnect = new DBconnection();
                dbconnect.connectToDB();

                dbconnect.UpdateIntoDB("UPDATE MediMartUser SET userPassword ='"+pPassword+"', userEmail ='"+pEmail+"', userFullName ='"+pFullName+"', userPhone ='"+pPhone+"', userAddress ='"+pAddress+"' WHERE userName= '"+pUsername+"' AND userRole = 'Manager'");
                userProfileInfo(userName, userRole);
                usernameShow();
                infoMsg("Information updated successfully","Confirmation");
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
                dbconnect.disconnectFromDB();
            }
        }
        myprofilePanel.setVisible(true);
        medicinePanel.setVisible(false);
        sellerPanel.setVisible(false);
        customerPanel.setVisible(false);
        invoicePanel.setVisible(false);
    }//GEN-LAST:event_profileupdatebuttonActionPerformed

    private void sellersavebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellersavebuttonActionPerformed
        String sUsername    = sellerusername.getText();
        String sPassword    = sellerpassword.getText();
        String sNID         = sellernid.getText();
        String sEmail       = selleremail.getText();        
        String sFullName    = sellerfullname.getText();
        String sPhone       = sellerphone.getText();
        String sAddress     = selleraddress.getText();

        if(sUsername.isEmpty() || sPassword.isEmpty() || sNID.isEmpty() || sEmail.isEmpty() || sFullName.isEmpty() || sPhone.isEmpty() || sAddress.isEmpty()) {
            infoMsg("You have to fill up all the fields", "Attention!!");
        }
        else if(!numberCheck(sPhone)) {
            infoMsg("Invalid seller's contact. It must be 11 digit and start with 01...","Alert!!");
        }
        else if(!emailCheck(sEmail)) {
            infoMsg("Invalid seller's email. It must end with ...@gmail.com","Alert!!");
        }
        else if(sNID.length() != 17) {
            infoMsg("Invalid seller NID. It must be 17 digit","Alert!!");
        }
        else {
            try {
                dbconnect = new DBconnection();
                dbconnect.connectToDB();
                ResultSet usernameresult = dbconnect.queryIntoDB("SELECT * FROM MediMartUser WHERE userName = '"+sUsername+"'");
                ResultSet emailresult = dbconnect.queryIntoDB("SELECT * FROM MediMartUser WHERE userEmail = '"+sEmail+"'");
                ResultSet nidresult = dbconnect.queryIntoDB("SELECT * FROM MediMartUser WHERE userNID = '"+sNID+"'");
                ResultSet phoneresult = dbconnect.queryIntoDB("SELECT * FROM MediMartUser WHERE userPhone = '"+sPhone+"'");

                if(rowSelected != "") {
                    dbconnect.UpdateIntoDB("UPDATE MediMartUser SET userPassword ='"+sPassword+"', userEmail ='"+sEmail+"', userFullName ='"+sFullName+"', userPhone ='"+sPhone+"', userAddress ='"+sAddress+"' WHERE userName= '"+rowSelected+"'");
                    sellerShow();
                    sellerusername.setEditable(true);
                    sellernid.setEditable(true);
                    rowSelected = "";
                    
                    sellerusername.setText("");
                    sellerpassword.setText("");
                    sellerfullname.setText("");
                    sellerphone.setText("");
                    sellernid.setText("");
                    selleremail.setText("");
                    selleraddress.setText("");
                    infoMsg("Information updated successfully", "Confirmation");
                }
                else if(rowSelected == "") {
                    if(usernameresult.next()) {
                        infoMsg("Username already exists.","Error!!");
                    }
                    else if(nidresult.next())
                    {
                        infoMsg("NID already exists.","Error!!");
                    }
                    else if(emailresult.next())
                    {
                        infoMsg("Email already exists.","Error!!");
                    }
                    else if(phoneresult.next())
                    {
                        infoMsg("Phone number already exists.","Error!!");
                    }
                    else {
                        dbconnect.insertIntoDB("INSERT INTO MediMartUser(userName, userPassword, userFullName, userNID, userAddress, userEmail, userPhone, userRole)"
                            + "VALUES('"+"s-"+sUsername+"', "+sPassword+", '"+sFullName+"', '"+sNID+"', '"+sAddress+"', '"+sEmail+"', '"+sPhone+"', 'Seller')");
                        infoMsg("New seller added successfully","Confirmation");
                        
                        sellerShow();
                        
                        sellerusername.setText("");
                        sellerpassword.setText("");
                        sellerfullname.setText("");
                        sellerphone.setText("");
                        sellernid.setText("");
                        selleremail.setText("");
                        selleraddress.setText("");
                    }
                }
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(Seller.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                dbconnect.disconnectFromDB();
            }
        }
    }//GEN-LAST:event_sellersavebuttonActionPerformed

    private void sellereditbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellereditbuttonActionPerformed
        TableModel tablemodel = userTable.getModel();
        int row = userTable.getSelectedRow();

        if(row!=-1)
        {
            sellerusername.setText((String) tablemodel.getValueAt(row, 0));
            sellerpassword.setText((String) tablemodel.getValueAt(row, 1));
            sellerfullname.setText((String) tablemodel.getValueAt(row, 2));
            sellerphone.setText((String) tablemodel.getValueAt(row, 3));
            sellernid.setText((String) tablemodel.getValueAt(row, 4));
            selleremail.setText((String) tablemodel.getValueAt(row, 5));
            selleraddress.setText((String) tablemodel.getValueAt(row, 6));
            
            sellerusername.setEditable(false);
            sellernid.setEditable(false);

            rowSelected = (String) userTable.getValueAt(row, 0);
        }
        else 
        {
            infoMsg("Please select a row", "Notification");
        }
    }//GEN-LAST:event_sellereditbuttonActionPerformed

    private void sellercancelbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellercancelbuttonActionPerformed
        sellerusername.setText("");
        sellerpassword.setText("");
        sellerfullname.setText("");
        sellerphone.setText("");
        sellernid.setText("");
        selleremail.setText("");
        selleraddress.setText("");

        sellerusername.setEditable(true);
        sellernid.setEditable(true);
        rowSelected = "";
    }//GEN-LAST:event_sellercancelbuttonActionPerformed

    private void sellerdeletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerdeletebuttonActionPerformed
        try{
            TableModel tablemodel = userTable.getModel();
            int row = userTable.getSelectedRow();
            
            if(row != -1)
            {
                String sellerUsername = (String) userTable.getValueAt(row, 0);

                dbconnect = new DBconnection();
                dbconnect.connectToDB();   
                dbconnect.deleteFromDB("DELETE FROM MediMartUser WHERE userName = '"+sellerUsername+"'");
                infoMsg("Successfully Deleted", "Confirmation");
                sellerShow();
                dbconnect.disconnectFromDB(); 
            }
            else 
            {
                infoMsg("Please select a row", "Notification");
            }   
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }//GEN-LAST:event_sellerdeletebuttonActionPerformed

    private void mcompanynameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcompanynameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcompanynameActionPerformed

    private void mmedicinenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmedicinenameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mmedicinenameActionPerformed

    private void mcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mcategoryActionPerformed

    private void mgenericnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgenericnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mgenericnameActionPerformed

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
                    medicineRowSelected = "";
                    
                    infoMsg("Medicine info updated", "Confirmation");
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            dbconnect.disconnectFromDB();
        }
    }//GEN-LAST:event_medicinesavebuttonActionPerformed

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

    private void mpriceperunitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mpriceperunitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mpriceperunitActionPerformed

    private void mquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mquantityActionPerformed

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

    private void mbatchnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbatchnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbatchnoActionPerformed

    private void medicineSearchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineSearchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineSearchTextActionPerformed

    private void invoiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoiceButtonActionPerformed
        myprofilePanel.setVisible(false);
        medicinePanel.setVisible(false);
        sellerPanel.setVisible(false);
        customerPanel.setVisible(false);
        invoicePanel.setVisible(true);

        invoiceShow();
    }//GEN-LAST:event_invoiceButtonActionPerformed

    private void searchButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButton4ActionPerformed

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

    private void searchInvoiceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInvoiceKeyReleased
       String searchedString = searchInvoice.getText();
        
        try{
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            
            model = (DefaultTableModel) invoiceTable.getModel();
            model.setRowCount(0);
            
            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartInvoice "
                    + "WHERE SellerUsername Like '%"+searchedString+"%' OR Invoiceid Like '%"+searchedString+"%'");
                        
            while(resultset.next()) {
                String invoiceId = String.valueOf(resultset.getString("Invoiceid"));
                String sellerUsername = String.valueOf(resultset.getString("SellerUsername"));
                String customerName = resultset.getString("CustomerName");
                String customerPhone = resultset.getString("CustomerPhone");
                String sellAmount = resultset.getString("SellAmount");
                String dateTime = resultset.getString("DateTime");
                                
                String medicineshowTableData[] = {invoiceId, sellerUsername, customerName, customerPhone, sellAmount, dateTime};              
                model.addRow(medicineshowTableData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
 
    }//GEN-LAST:event_searchInvoiceKeyReleased

    private void warningButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warningButtonActionPerformed
        Toolkit.getDefaultToolkit().beep();
        infoMsg("You have expired medicine in stock. You need to dispose them properly", "Caution!!!");
        
    }//GEN-LAST:event_warningButtonActionPerformed

    private void searchInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInvoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchInvoiceActionPerformed

    public void infoMsg(String message, String title)
    {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
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
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }
    
    private void expiredMedicineAlert() {
        int rowCount = medicineshowTable.getRowCount();
                
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

        String presentDate = sdf.format(new Date());

        int expiredMedicineCounter = 0;
        for(int i=0; i<rowCount; i++)
        {
            String dateString = (String) medicineshowTable.getValueAt(i, 7);
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
            //medicineshowTable.setBackground(Color.red);
        }
        else
        {
            warningButton.setVisible(false);
        }
    }
    
    private void invoiceShow(){
        try{
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            
            model = (DefaultTableModel) invoiceTable.getModel();
            model.setRowCount(0);
            
            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartInvoice");
                        
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
    
    private void medicineShow(){
        
        
        
        try{
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            
            model = (DefaultTableModel) medicineshowTable.getModel();
            model.setRowCount(0);
            //
            
            //
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
                                
                String medicineshowTableData[] = {mbatchno, mgenericname, mmedicinename, mcategory, mcompanyname, mquantity, mprice, mexpirydate};              
                model.addRow(medicineshowTableData);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }
    
    private void sellerShow(){
        try{
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            
            model = (DefaultTableModel) userTable.getModel();
            model.setRowCount(0);
            
            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartUser WHERE userRole = 'Seller'");
                        
            while(resultset.next()) {
                String sUsername    = resultset.getString("userName");
                String sPassword    = resultset.getString("userPassword");
                String sNID         = resultset.getString("userNID");
                String sEmail       = resultset.getString("userEmail");
                String sFullName    = resultset.getString("userFullName");
                String sPhone       = resultset.getString("userPhone");
                String sAddress     = resultset.getString("userAddress");
                
                String sellerTableData[] = {sUsername, sPassword, sFullName, sPhone, sNID, sEmail, sAddress};              
                model.addRow(sellerTableData);
            }
        
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(Manager.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            dbconnect.disconnectFromDB();
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Manager().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton customerButton;
    private javax.swing.JPanel customerPanel;
    private javax.swing.JTable customerTable;
    private javax.swing.JButton invoiceButton;
    private javax.swing.JPanel invoicePanel;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel managerPanel;
    private javax.swing.JTextField mbatchno;
    private javax.swing.JComboBox<String> mcategory;
    private javax.swing.JTextField mcompanyname;
    private javax.swing.JButton medicineButton;
    private javax.swing.JPanel medicinePanel;
    private javax.swing.JButton medicineSearchButton;
    private javax.swing.JTextField medicineSearchText;
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
    private javax.swing.JButton searchButton4;
    private javax.swing.JTextField searchInvoice;
    private javax.swing.JButton sellerButton;
    private javax.swing.JPanel sellerPanel;
    private javax.swing.JTextField selleraddress;
    private javax.swing.JButton sellercancelbutton;
    private javax.swing.JButton sellerdeletebutton;
    private javax.swing.JButton sellereditbutton;
    private javax.swing.JTextField selleremail;
    private javax.swing.JTextField sellerfullname;
    private javax.swing.JTextField sellernid;
    private javax.swing.JTextField sellerpassword;
    private javax.swing.JTextField sellerphone;
    private javax.swing.JButton sellersavebutton;
    private javax.swing.JTextField sellerusername;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel title6;
    private javax.swing.JTable userTable;
    private javax.swing.JButton warningButton;
    // End of variables declaration//GEN-END:variables
}
