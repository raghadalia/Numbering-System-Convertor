/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author mac
 */
public class Gui1 extends JFrame implements ActionListener , ItemListener{
    private javax.swing.JRadioButton b;
    private javax.swing.JLabel bLabel;
    private javax.swing.JLabel bans;
        private javax.swing.JRadioButton d;
    private javax.swing.JLabel dLabel;
    private javax.swing.JLabel dans;
    private javax.swing.JTextField f;
    private javax.swing.JRadioButton h;
    private javax.swing.JLabel hLabel;
    private javax.swing.JLabel hans;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel numlabel;
    private javax.swing.JRadioButton o;
    private javax.swing.JLabel oLabel;
    private javax.swing.JLabel oans;
public Gui1(){
 initComponents();
        ButtonGroup g=new ButtonGroup();
g.add(d);
g.add(b);
g.add(o);
g.add(h);
f.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
              if(f.getText().isEmpty()){
                  dans.setText("");
                  bans.setText("");
                  oans.setText("");
                  hans.setText("");
              }
              if(d.isSelected()){
                       if(!((e.getKeyChar()>='0'&&e.getKeyChar()<='9')))
                            e.consume();
              }
              else if(o.isSelected()){
                   if(!((e.getKeyChar()>='0'&&e.getKeyChar()<='7')))
                          e.consume();
              }
              else  if(b.isSelected()){
                   if(!((e.getKeyChar()=='0'||e.getKeyChar()<='1')))
                        e.consume();
               }
              else  if(h.isSelected()){
                   if(!((e.getKeyChar()>='0' && e.getKeyChar()<='9') || (e.getKeyChar()>='A' && e.getKeyChar()<='F') 
                                || (e.getKeyChar()>='a' && e.getKeyChar()<='f') ))
                           e.consume();
              }
        
            }
    
});
d.addActionListener(this);
b.addActionListener(this);
o.addActionListener(this);
h.addActionListener(this);
d.addItemListener(this);
o.addItemListener(this);
b.addItemListener(this);
h.addItemListener(this);

f.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
              if(d.isSelected())
                    d.doClick();
                else if(b.isSelected())
                    b.doClick();
                else if(o.isSelected())
                    o.doClick();
                else if(h.isSelected())
                    h.doClick(); 
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
               if(d.isSelected())
                    d.doClick();
                else if(b.isSelected())
                    b.doClick();
                else if(o.isSelected())
                    o.doClick();
                else if(h.isSelected())
                    h.doClick(); }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        setTitle("Numbering System Converter");
        
        setVisible(true);
        
       
    }
 public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        new Gui1();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui1().setVisible(true);
            }
        });
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents() {

       // buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        numlabel = new javax.swing.JLabel();
        f = new javax.swing.JTextField("10",30);
        jPanel2 = new javax.swing.JPanel();
        bLabel = new javax.swing.JLabel();
        oLabel = new javax.swing.JLabel();
        hLabel = new javax.swing.JLabel();
        dLabel = new javax.swing.JLabel();
        dans = new javax.swing.JLabel();
        bans = new javax.swing.JLabel();
        oans = new javax.swing.JLabel();
        hans = new javax.swing.JLabel();
        d = new javax.swing.JRadioButton();
        b = new javax.swing.JRadioButton();
        o = new javax.swing.JRadioButton();
        h = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Number to Convarte"));

        numlabel.setText("Number :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(f, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Other numbering System :"));

        bLabel.setText("Binary :");

        oLabel.setText("Octal :");

        hLabel.setText("HexaDecimal :");

        dLabel.setText("Decimal :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(113, 113, 113)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(oans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(hans, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dans, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bans, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oans, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(hans, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        d.setText("Decimal");
        d.setSelected(true);
        b.setText("Binary");

        o.setText("Octal");

        h.setText("HexaDecimal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(d)
                .addGap(34, 34, 34)
                .addComponent(b)
                .addGap(29, 29, 29)
                .addComponent(o)
                .addGap(18, 18, 18)
                .addComponent(h)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d)
                    .addComponent(b)
                    .addComponent(o)
                    .addComponent(h))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
    
      //  f.setText("10");
     //   b.setSelected(true);
        pack();
       
    }// </editor-fold>                        

    @Override
    public void actionPerformed(ActionEvent e) {
       Object choice=e.getSource();
      
       String ss=f.getText();
       if ( ss.isEmpty())
          ss="0";
 
       int N=0;
       if ( choice==d)
          N=Integer.parseInt(ss,10);
       else if ( choice==b)
               N=Integer.parseInt(ss,2);
         else if ( choice==o)
               N=Integer.parseInt(ss,8);
         else if ( choice==h)
               N=Integer.parseInt(ss,16);
       
        dans.setText(Integer.toString(N));
        bans.setText(Integer.toBinaryString(N));
        oans.setText(Integer.toOctalString(N));
        hans.setText(Integer.toHexString(N).toUpperCase());
       
               }

    private int CurrentNumber=0;
    @Override
    public void itemStateChanged(ItemEvent ie) {
        
        if (ie.getStateChange()==ItemEvent.DESELECTED)
        {
             String ss=f.getText();
                 if ( ss.isEmpty())
                      ss="0";
            /*  if ( ie.getItem()==d){
                 CurrentNumber=Integer.parseInt(ss,10);
                  System.out.println("gui1.Gui1.itemStateChanged()"+CurrentNumber);
                  
              
              }
              else if (ie.getItem()==b){
                CurrentNumber=Integer.parseInt(ss,2); 
                System.out.println("gui1.Gui1.itemStateChanged()"+CurrentNumber);
              }
              else if ( ie.getItem()==o){
               CurrentNumber=Integer.parseInt(ss,8);
               System.out.println("gui1.Gui1.itemStateChanged()"+CurrentNumber);
              }
              else if ( ie.getItem()==h){
                CurrentNumber=Integer.parseInt(ss,16); 
                System.out.println("gui1.Gui1.itemStateChanged()"+CurrentNumber);
              }
              */
         }
        else if  (ie.getStateChange()==ItemEvent.SELECTED)
        {
              if ( ie.getItem()==d)
                 f.setText(Integer.toString(CurrentNumber));
              else if (ie.getItem()==b)
                  f.setText(Integer.toBinaryString(CurrentNumber));
              else if ( ie.getItem()==o)
               f.setText(Integer.toOctalString(CurrentNumber));
              else if ( ie.getItem()==h)
                f.setText(Integer.toHexString(CurrentNumber));
              
              }
    }
    
  
        }