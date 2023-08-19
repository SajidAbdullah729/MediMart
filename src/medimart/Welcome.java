package medimart;
import database.DBconnection;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Welcome extends javax.swing.JFrame{
    private DBconnection dbconnect;
    private ResultSet resultset;
    private boolean managerSelected = false, sellerSelected = false;

    public Welcome() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/medimartIcon.png"))); 
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomePanel = new javax.swing.JPanel();
        aboutbutton = new javax.swing.JButton();
        useridinput = new javax.swing.JTextField();
        userpassinput = new javax.swing.JPasswordField();
        lockicon = new javax.swing.JLabel();
        usericon = new javax.swing.JLabel();
        signInButton = new javax.swing.JButton();
        BGlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MediMart");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        welcomePanel.setBackground(new java.awt.Color(255, 255, 255));
        welcomePanel.setMinimumSize(new java.awt.Dimension(1000, 600));
        welcomePanel.setPreferredSize(new java.awt.Dimension(1000, 600));
        welcomePanel.setLayout(null);

        aboutbutton.setBackground(new java.awt.Color(255, 102, 0));
        aboutbutton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        aboutbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/info.png"))); // NOI18N
        aboutbutton.setBorder(null);
        aboutbutton.setOpaque(false);
        aboutbutton.setPreferredSize(new java.awt.Dimension(30, 30));
        aboutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutbuttonActionPerformed(evt);
            }
        });
        welcomePanel.add(aboutbutton);
        aboutbutton.setBounds(960, 10, 30, 30);

        useridinput.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        useridinput.setToolTipText("Enter username");
        useridinput.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 11))); // NOI18N
        useridinput.setOpaque(false);
        welcomePanel.add(useridinput);
        useridinput.setBounds(700, 370, 250, 50);

        userpassinput.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        userpassinput.setToolTipText("Enter password");
        userpassinput.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Trebuchet MS", 1, 11))); // NOI18N
        userpassinput.setMinimumSize(new java.awt.Dimension(20, 70));
        userpassinput.setOpaque(false);
        userpassinput.setPreferredSize(new java.awt.Dimension(20, 70));
        welcomePanel.add(userpassinput);
        userpassinput.setBounds(700, 440, 250, 50);

        lockicon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lockicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lock.png"))); // NOI18N
        welcomePanel.add(lockicon);
        lockicon.setBounds(650, 440, 50, 50);

        usericon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usericon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/user.png"))); // NOI18N
        welcomePanel.add(usericon);
        usericon.setBounds(650, 370, 50, 50);

        signInButton.setBackground(new java.awt.Color(170, 224, 251));
        signInButton.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        signInButton.setText("Sign In");
        signInButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        signInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInButtonActionPerformed(evt);
            }
        });
        welcomePanel.add(signInButton);
        signInButton.setBounds(750, 500, 140, 50);

        BGlabel.setBackground(new java.awt.Color(233, 248, 230));
        BGlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bgwelcome.jpg"))); // NOI18N
        welcomePanel.add(BGlabel);
        BGlabel.setBounds(0, 0, 1000, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(welcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(welcomePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void aboutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutbuttonActionPerformed
        dispose();
        About aboutObj = new About();
        aboutObj.setVisible(true);
    }//GEN-LAST:event_aboutbuttonActionPerformed

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        boolean managerFound = false;
        boolean sellerFound  = false;

        try {
            dbconnect = new DBconnection();
            dbconnect.connectToDB();
            resultset = dbconnect.queryIntoDB("SELECT * FROM MediMartUser");

            while(resultset.next())
            {
                String userName = resultset.getString("userName");
                String userPassword = resultset.getString("userPassword");
                String userRole = resultset.getString("userRole");

                if(userName.equals(useridinput.getText()) && userPassword.equals(userpassinput.getText()) && userRole.equals("Manager")) 
                {
                    managerFound = true;
                    sellerFound = false;
                }
                else if(userName.equals(useridinput.getText()) && userPassword.equals(userpassinput.getText()) && userRole.equals("Seller")) 
                {
                    managerFound = false;
                    sellerFound = true;
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Welcome.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            dbconnect.disconnectFromDB();
        }

        if(managerFound && !sellerFound){
            dispose();
            Manager managerObj = new Manager(useridinput.getText(), "Manager");
            managerObj.setVisible(true);
        }else if(!managerFound && sellerFound){
            dispose();
            Seller sellerObj = new Seller(useridinput.getText(), "Seller");
            sellerObj.setVisible(true);
        } else if(!managerFound && !sellerFound){
            infoMsg("Incorrect username or password.", "Invalid info");
        }     
    }//GEN-LAST:event_signInButtonActionPerformed
    
    public void infoMsg(String message, String title)
    {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGlabel;
    private javax.swing.JButton aboutbutton;
    private javax.swing.JLabel lockicon;
    private javax.swing.JButton signInButton;
    private javax.swing.JLabel usericon;
    private javax.swing.JTextField useridinput;
    private javax.swing.JPasswordField userpassinput;
    private javax.swing.JPanel welcomePanel;
    // End of variables declaration//GEN-END:variables
}
