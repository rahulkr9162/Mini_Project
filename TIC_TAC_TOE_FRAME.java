/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TIC_TAC_TOE_FRAME;

import java.awt.Color;
import static java.awt.Color.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Rahul kumar
 */
public class TIC_TAC_TOE_FRAME extends javax.swing.JFrame {

    /**
     * Creates new form TIC_TAC_TOE_FRAME
     */
    private  String turn = "X";
    private  int xCount = 0;
    private  int oCount = 0; 
    public TIC_TAC_TOE_FRAME() {
        initComponents();
    }
    public  void choosePlayer(){
        if(turn.equalsIgnoreCase("x")){
            turn = "O";
     
        }
        else{
            turn = "X";
        }
    }
    public  void setScore(){
        x_Score.setText(String.valueOf(xCount));
        o_Score.setText(String.valueOf(oCount));
    }
    public void chooseWinner(){
        String b1 = Button1.getText();
        String b2 = Button2.getText();
        String b3 = Button3.getText();
        String b4 = Button4.getText();
        String b5 = Button5.getText();
        String b6 = Button6.getText();
        String b7 = Button7.getText();
        String b8 = Button8.getText();
        String b9 = Button9.getText();
        if(b1 == "X" && b2 == "X" && b3 == "X"){
            JOptionPane.showMessageDialog(this, "player x wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            
            Button1.setBackground(orange);
            Button2.setBackground(orange);
            Button3.setBackground(orange);
        }
        else if(b4 == "X" && b5 == "X" && b6 == "X"){
            JOptionPane.showMessageDialog(this, "player x wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            
            Button4.setBackground(orange);
            Button5.setBackground(orange);
            Button6.setBackground(orange);
        }
        else if(b7 == "X" && b8 == "X" && b9 == "X"){
            JOptionPane.showMessageDialog(this, "player x wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            
            Button7.setBackground(orange);
            Button8.setBackground(orange);
            Button9.setBackground(orange);
        }
        else if(b1 == "X" && b4 == "X" && b7 == "X"){
            JOptionPane.showMessageDialog(this, "player x wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            
            Button1.setBackground(orange);
            Button4.setBackground(orange);
            Button7.setBackground(orange);
        }
        else if(b2 == "X" && b5 == "X" && b8 == "X"){
            JOptionPane.showMessageDialog(this, "player x wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            
            Button2.setBackground(orange);
            Button5.setBackground(orange);
            Button8.setBackground(orange);
        }
        else if(b3 == "X" && b6 == "X" && b9 == "X"){
            JOptionPane.showMessageDialog(this, "player x wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            
            Button3.setBackground(orange);
            Button6.setBackground(orange);
            Button9.setBackground(orange);
        }
        else if(b1 == "X" && b5 == "X" && b9 == "X"){
            JOptionPane.showMessageDialog(this, "player x wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            
            Button1.setBackground(orange);
            Button5.setBackground(orange);
            Button9.setBackground(orange);
        }
        else if(b3 == "X" && b5 == "X" && b7 == "X"){
            JOptionPane.showMessageDialog(this, "player x wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            setScore();
            
            Button3.setBackground(orange);
            Button5.setBackground(orange);
            Button7.setBackground(orange);
        }
        
        // player y condition
        
        else if(b1 == "O" && b2 == "O" && b3 == "O"){
            JOptionPane.showMessageDialog(this, "player o wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            
            Button1.setBackground(orange);
            Button2.setBackground(orange);
            Button3.setBackground(orange);
        }
         else if(b4 == "O" && b5 == "O" && b6 == "O"){
            JOptionPane.showMessageDialog(this, "player o wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            
            Button4.setBackground(orange);
            Button5.setBackground(orange);
            Button6.setBackground(orange);
        }
         else if(b7 == "O" && b8 == "O" && b9 == "O"){
            JOptionPane.showMessageDialog(this, "player o wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            
            Button7.setBackground(orange);
            Button8.setBackground(orange);
            Button9.setBackground(orange);
        }
         else if(b1 == "O" && b4 == "O" && b7 == "O"){
            JOptionPane.showMessageDialog(this, "player o wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            
            Button1.setBackground(orange);
            Button4.setBackground(orange);
            Button7.setBackground(orange);
        }
         else if(b2 == "O" && b5 == "O" && b8 == "O"){
            JOptionPane.showMessageDialog(this, "player o wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            
            Button2.setBackground(orange);
            Button5.setBackground(orange);
            Button8.setBackground(orange);
        }
         else if(b3 == "O" && b6 == "O" && b9 == "O"){
            JOptionPane.showMessageDialog(this, "player o wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            
            Button3.setBackground(orange);
            Button6.setBackground(orange);
            Button9.setBackground(orange);
        }
         else if(b1 == "O" && b5 == "O" && b9 == "O"){
            JOptionPane.showMessageDialog(this, "player o wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            
            Button1.setBackground(orange);
            Button5.setBackground(orange);
            Button9.setBackground(orange);
        }
         else if(b3== "O" && b5 == "O" && b7 == "O"){
            JOptionPane.showMessageDialog(this, "player o wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            setScore();
            
            Button3.setBackground(orange);
            Button5.setBackground(orange);
            Button7.setBackground(orange);
         }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Button2 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        x_Score = new javax.swing.JLabel();
        o_Score = new javax.swing.JLabel();
        WhooseTurn = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC  TAC  TOE  GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Button2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(255, 51, 0));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton10.setText("EXIT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        Button9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(0, 102, 102));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jButton12.setText("RESET");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Player O :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Player X :");

        x_Score.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        x_Score.setForeground(new java.awt.Color(0, 51, 255));
        x_Score.setText("----------");

        o_Score.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        o_Score.setForeground(new java.awt.Color(0, 51, 255));
        o_Score.setText("----------");

        WhooseTurn.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        WhooseTurn.setForeground(new java.awt.Color(255, 0, 204));
        WhooseTurn.setText("START");
        WhooseTurn.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                WhooseTurnAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 204));
        jLabel5.setText("TURN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(o_Score, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(WhooseTurn)
                                .addGap(33, 33, 33)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x_Score, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WhooseTurn)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x_Score, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(o_Score, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Button3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 33, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        // TODO add your handling code here:
        Button3.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            WhooseTurn.setText(turn);
            Button3.setForeground(Color.red);
        }
        else{
            WhooseTurn.setText(turn);
            Button3.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        Button1.setText(null);
        Button2.setText(null);
        Button3.setText(null);
        Button4.setText(null);
        Button5.setText(null);
        Button6.setText(null);
        Button7.setText(null);
        Button8.setText(null);
        Button9.setText(null);
        
        Button1.setBackground(white);
        Button2.setBackground(white);
        Button3.setBackground(white);
        Button4.setBackground(white);
        Button5.setBackground(white);
        Button6.setBackground(white);
        Button7.setBackground(white);
        Button8.setBackground(white);
        Button9.setBackground(white);
        
        WhooseTurn.setText("Begin Game");
        
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("EXIT");
        if(JOptionPane.showConfirmDialog(frame,"Do you want to exit",
                "Tic Tac Toe",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        // TODO add your handling code here:
        Button1.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            Button1.setForeground(Color.red);
            WhooseTurn.setText(turn);
        }
        else{
            WhooseTurn.setText(turn);
            Button1.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        // TODO add your handling code here:
        Button2.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            WhooseTurn.setText(turn);
            Button2.setForeground(Color.red);
        }
        else{
            WhooseTurn.setText(turn);
            Button2.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        // TODO add your handling code here:
        Button4.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            WhooseTurn.setText(turn);
            Button4.setForeground(Color.red);
        }
        else{
            WhooseTurn.setText(turn);
            Button4.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        // TODO add your handling code hereButton1.setText(turn);
        Button5.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            WhooseTurn.setText(turn);
            Button5.setForeground(Color.red);
        }
        else{
            WhooseTurn.setText(turn);
            Button5.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        // TODO add your handling code here:
        Button7.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            WhooseTurn.setText(turn);
            Button7.setForeground(Color.red);
        }
        else{
            WhooseTurn.setText(turn);
            Button7.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        // TODO add your handling code here:
        Button8.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            WhooseTurn.setText(turn);
            Button8.setForeground(Color.red);
        }
        else{
            WhooseTurn.setText(turn);
            Button8.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        // TODO add your handling code here:
        Button9.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            WhooseTurn.setText(turn);
            Button9.setForeground(Color.red);
        }
        else{
            WhooseTurn.setText(turn);
            Button9.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button9ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        // TODO add your handling code here:
        Button6.setText(turn);
        if(turn.equalsIgnoreCase("X")){
            WhooseTurn.setText(turn);
            Button6.setForeground(Color.red);
        }
        else{
            WhooseTurn.setText(turn);
            Button6.setForeground(blue);
        }
        choosePlayer();
        chooseWinner();
    }//GEN-LAST:event_Button6ActionPerformed

    private void WhooseTurnAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_WhooseTurnAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_WhooseTurnAncestorAdded

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_FRAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_FRAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JLabel WhooseTurn;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel o_Score;
    private javax.swing.JLabel x_Score;
    // End of variables declaration//GEN-END:variables
}
