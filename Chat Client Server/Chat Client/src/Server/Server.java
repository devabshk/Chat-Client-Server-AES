/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.*;
import java.awt.*;
import java.net.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Abhishek
 */
class servergui extends javax.swing.JFrame {

    /**
     * Creates new form servergui
     */
    public servergui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        password = new javax.swing.JTextField();
        userlabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        chatWindow = new javax.swing.JTextArea();
        passlabel = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        send = new javax.swing.JButton();
        login = new javax.swing.JButton();
        userText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        password.setText("Enter your Password");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        userlabel.setText("    USERNAME");

        chatWindow.setColumns(20);
        chatWindow.setRows(5);
        jScrollPane1.setViewportView(chatWindow);

        passlabel.setText("   PASSWORD");

        username.setText("Enter your username.");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        send.setText("SEND");

        login.setText("LOG IN");

        userText.setText("What's in your mind?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(login)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(userText)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(send)
                    .addComponent(login))
                .addGap(7, 7, 7)
                .addComponent(userText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    /**
     * @param args the command line arguments
     */
   /* public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       /* try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(servergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(servergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(servergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(servergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
   // }

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea chatWindow;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton login;
    private javax.swing.JLabel passlabel;
    private javax.swing.JTextField password;
    private javax.swing.JButton send;
    private javax.swing.JTextField userText;
    private javax.swing.JLabel userlabel;
    private javax.swing.JTextField username;
    // End of variables declaration                   
}



public class Server extends JFrame {
    
    private JTextField uT; 
    private JTextArea cW;
    
    private ObjectOutputStream outStream;
    private ObjectInputStream inpStream;
    
    private ServerSocket ssocket;
    private Socket conct;
    
    public Server() {
        super("Abhishek Server ");
        uT = new JTextField();
        uT.setEditable(true);
        
        uT.addActionListener(
            
            new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    sendMessage(event.getActionCommand()); 
                 
                    uT.setText("");
                }
            }
        );
        
        add(uT, BorderLayout.NORTH);
        cW = new JTextArea();
        add(new JScrollPane(cW));
        setSize(400, 300);
        setVisible(true);
        getContentPane().setBackground(Color.BLACK); 
    }
    
    public void startRunning() {
        try {
            ssocket = new ServerSocket(6789, 100);
            while(true) {
                try {
                    showMessage("Ready to connect\n");
                    conct = ssocket.accept();
                    showMessage("Client connected" + conct.getInetAddress().getHostName());
                    
                    setUpStream();
                    
                    whileChatting();
                }catch(EOFException e) {
                    showMessage("\n connection closed by socket ");
                }finally {
                    showMessage("\n Closing connection");
                    
                    try {
                        outStream.close();
                        inpStream.close();
                        conct.close();
                    }
                    catch(IOException ioException) {
                    }
                }
            }
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    public void setUpStream() throws IOException {
        outStream = new ObjectOutputStream(conct.getOutputStream());
        outStream.flush();
        inpStream = new ObjectInputStream(conct.getInputStream());
        showMessage("\nstream set up complete");
    }
    
    public void whileChatting() throws IOException {
        String message = "Connection Established";
        uT.setEditable(true);
        do {
            try {
                message = (String) inpStream.readObject(); // reads message from inpStream stream sent by user
                showMessage("\n" + message); // prints this message to ssocket text area       
            }catch (ClassNotFoundException classNotFoundException) { 
                showMessage("dont know what user send");
            }
        }while(!message.equals("CLIENT-END"));
    }
        
        // closing crap
       
    public void closeCrap() {
        
    }
        
    private void sendMessage(String message) {
        try {
            outStream.writeObject("SERVER- "+ message); // displays our send text on client screen
            outStream.flush();
            showMessage("\nSERVER " + message); // shows message sent by us on our screen
        
        }catch(IOException ioException) {
            cW.append("\n ERROR: cant send that message ");
        }     
    }
    
    private void showMessage(final String text) {
        SwingUtilities.invokeLater( // we are just updating a portion of gui so we use this method to just update the existing gui by appending the text in chat window
            new Runnable() {
                public void run(){
                    cW.append(text);
                }
            }
        
        );
    } 
    
    
        
}