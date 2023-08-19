package medimart;
import java.awt.Toolkit;

public class About extends javax.swing.JFrame {

    public About() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/medimartIcon.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutPanel = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        title1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        phoneIcon = new javax.swing.JLabel();
        mailIcon = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MediMart");
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 600));

        aboutPanel.setBackground(new java.awt.Color(0, 102, 102));
        aboutPanel.setLayout(null);

        backButton.setBackground(new java.awt.Color(255, 102, 0));
        backButton.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/back.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.setMaximumSize(new java.awt.Dimension(30, 30));
        backButton.setMinimumSize(new java.awt.Dimension(30, 30));
        backButton.setOpaque(false);
        backButton.setPreferredSize(new java.awt.Dimension(30, 30));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        aboutPanel.add(backButton);
        backButton.setBounds(10, 10, 30, 30);

        title1.setBackground(new java.awt.Color(255, 255, 255));
        title1.setFont(new java.awt.Font("Maiandra GD", 1, 48)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("About us");
        title1.setToolTipText("");
        title1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aboutPanel.add(title1);
        title1.setBounds(50, 20, 900, 40);

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("This software can be used in a medical shop or pharmacy to keep track of medicines");
        aboutPanel.add(jLabel3);
        jLabel3.setBounds(-10, 440, 1000, 40);

        jLabel30.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Softwares");
        aboutPanel.add(jLabel30);
        jLabel30.setBounds(200, 290, 80, 30);

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 255));
        jLabel10.setText("Abdur Rahim");
        aboutPanel.add(jLabel10);
        jLabel10.setBounds(310, 90, 260, 30);

        jLabel26.setBackground(new java.awt.Color(255, 153, 153));
        jLabel26.setOpaque(true);
        aboutPanel.add(jLabel26);
        jLabel26.setBounds(290, 250, 10, 130);

        jLabel31.setBackground(new java.awt.Color(153, 255, 255));
        jLabel31.setForeground(new java.awt.Color(102, 255, 255));
        jLabel31.setOpaque(true);
        aboutPanel.add(jLabel31);
        jLabel31.setBounds(290, 90, 10, 110);

        jLabel27.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("190104019");
        aboutPanel.add(jLabel27);
        jLabel27.setBounds(620, 90, 140, 30);

        jLabel28.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("190104024");
        aboutPanel.add(jLabel28);
        jLabel28.setBounds(620, 130, 140, 30);

        jLabel29.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("190104046");
        aboutPanel.add(jLabel29);
        jLabel29.setBounds(620, 170, 140, 30);

        jLabel8.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 255, 255));
        jLabel8.setText("Aurunave Mollik Ruddra");
        aboutPanel.add(jLabel8);
        jLabel8.setBounds(310, 170, 290, 30);

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 255, 255));
        jLabel9.setText("Abdullah Al Mamun");
        aboutPanel.add(jLabel9);
        jLabel9.setBounds(310, 130, 260, 30);

        jLabel15.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("medimart@gmail.com");
        aboutPanel.add(jLabel15);
        jLabel15.setBounds(270, 500, 270, 40);

        phoneIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phoneIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/phoneicon.png"))); // NOI18N
        aboutPanel.add(phoneIcon);
        phoneIcon.setBounds(530, 500, 40, 40);

        mailIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mailIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mailicon.png"))); // NOI18N
        aboutPanel.add(mailIcon);
        mailIcon.setBounds(220, 500, 40, 40);

        jLabel17.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("+8890400123");
        aboutPanel.add(jLabel17);
        jLabel17.setBounds(580, 500, 200, 40);

        jLabel22.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("as IDE");
        aboutPanel.add(jLabel22);
        jLabel22.setBounds(420, 310, 340, 40);

        jLabel19.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 153, 153));
        jLabel19.setText("Netbeans");
        aboutPanel.add(jLabel19);
        jLabel19.setBounds(310, 310, 110, 40);

        jLabel32.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Project members");
        aboutPanel.add(jLabel32);
        jLabel32.setBounds(150, 130, 140, 30);

        jLabel21.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 153, 153));
        jLabel21.setText("JAVA Swing");
        aboutPanel.add(jLabel21);
        jLabel21.setBounds(310, 350, 150, 40);

        jLabel24.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("as GUI");
        aboutPanel.add(jLabel24);
        jLabel24.setBounds(450, 350, 340, 40);

        jLabel25.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 153, 153));
        jLabel25.setText("JAVA");
        aboutPanel.add(jLabel25);
        jLabel25.setBounds(310, 240, 70, 40);

        jLabel33.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("as programming language");
        aboutPanel.add(jLabel33);
        jLabel33.setBounds(380, 240, 340, 40);

        jLabel20.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 153, 153));
        jLabel20.setText("MS sql");
        aboutPanel.add(jLabel20);
        jLabel20.setBounds(310, 280, 80, 40);

        jLabel23.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("as database server");
        aboutPanel.add(jLabel23);
        jLabel23.setBounds(390, 280, 340, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(aboutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        Welcome welcomeObj = new Welcome();
        welcomeObj.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aboutPanel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mailIcon;
    private javax.swing.JLabel phoneIcon;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
