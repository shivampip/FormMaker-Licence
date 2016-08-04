
package formmaker;

import java.awt.Button;
import java.awt.Font;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.Checkbox;
import java.awt.Panel;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class NewFormGUI extends java.awt.Frame {

    public NewFormGUI() {
        
        initComponents();
        newname.setText(FormNameGUI.fnm);
        ch1.add("Submit");
        ch1.add("Reset");
        ch1.add("Exit");
        
        
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newp = new java.awt.Panel();
        newname = new java.awt.Label();
        panel1 = new java.awt.Panel();
        button2 = new java.awt.Button();
        tb = new java.awt.TextField();
        label3 = new java.awt.Label();
        tt = new java.awt.TextField();
        button1 = new java.awt.Button();
        label2 = new java.awt.Label();
        label4 = new java.awt.Label();
        tc = new java.awt.TextField();
        button3 = new java.awt.Button();
        button4 = new java.awt.Button();
        tl = new java.awt.TextField();
        label5 = new java.awt.Label();
        button5 = new java.awt.Button();
        ch1 = new java.awt.Choice();
        label6 = new java.awt.Label();

        setBackground(new java.awt.Color(204, 255, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        newp.setBackground(new java.awt.Color(51, 255, 153));

        newname.setAlignment(java.awt.Label.CENTER);
        newname.setBackground(new java.awt.Color(0, 204, 204));
        newname.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        newname.setText("New Form");

        javax.swing.GroupLayout newpLayout = new javax.swing.GroupLayout(newp);
        newp.setLayout(newpLayout);
        newpLayout.setHorizontalGroup(
            newpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        );
        newpLayout.setVerticalGroup(
            newpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newpLayout.createSequentialGroup()
                .addComponent(newname, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 364, Short.MAX_VALUE))
        );

        panel1.setBackground(new java.awt.Color(153, 153, 255));

        button2.setBackground(new java.awt.Color(0, 51, 153));
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button2.setForeground(new java.awt.Color(204, 255, 255));
        button2.setLabel("Create");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        tb.setBackground(new java.awt.Color(255, 255, 255));
        tb.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbKeyPressed(evt);
            }
        });

        label3.setBackground(new java.awt.Color(153, 153, 255));
        label3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 51, 51));
        label3.setText("Button");

        tt.setBackground(new java.awt.Color(255, 255, 255));
        tt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ttKeyPressed(evt);
            }
        });

        button1.setBackground(new java.awt.Color(0, 51, 153));
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(204, 255, 255));
        button1.setLabel("Create");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        label2.setBackground(new java.awt.Color(153, 153, 255));
        label2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 51, 51));
        label2.setText("Text Field");

        label4.setBackground(new java.awt.Color(153, 153, 255));
        label4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 51, 51));
        label4.setText("CheckBox");

        tc.setBackground(new java.awt.Color(255, 255, 255));
        tc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tcKeyPressed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(0, 51, 153));
        button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button3.setForeground(new java.awt.Color(204, 255, 255));
        button3.setLabel("Create");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(0, 51, 153));
        button4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        button4.setForeground(new java.awt.Color(204, 255, 255));
        button4.setLabel("Create");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        tl.setBackground(new java.awt.Color(255, 255, 255));
        tl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tl.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tlKeyPressed(evt);
            }
        });

        label5.setBackground(new java.awt.Color(153, 153, 255));
        label5.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 51, 51));
        label5.setText("Label");

        button5.setBackground(new java.awt.Color(0, 0, 153));
        button5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        button5.setForeground(new java.awt.Color(153, 255, 255));
        button5.setLabel("Save Form");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        label6.setBackground(new java.awt.Color(153, 153, 255));
        label6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 51, 51));
        label6.setText("Button Action");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addComponent(tt, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(tc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(tl, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ch1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tb, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tc, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tb, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ch1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(newp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        setVisible(false);
    }//GEN-LAST:event_exitForm

    Font font=new Font("Arial",0,20);
    int it=0;
    int loc=0;
    Label l[]=new Label[10];
    TextField t[]=new TextField[10];
    
    //For Saving the Form
    String fs[]=new String[50];
    int fsi=0;
    void formSave()
    {
        try{
            File ff=new File(FormNameGUI.fnm);
            ff.mkdirs();         
        FileOutputStream fout=new FileOutputStream(FormNameGUI.fnm+"\\"+"0ProgramData.txt");             //!!!!!!!!!!!!!!!!!!!!!!!!!
        FileOutputStream flist=new FileOutputStream("formlist.txt",true);
        flist.write(("@"+FormNameGUI.fnm).getBytes());
        flist.close();
        for(int i=0;i<fsi;i++)
        {
            byte b[]=fs[i].getBytes();
            fout.write(b);
        }
        System.out.println("Object Written Successfully");
        fout.close();
        }catch(Exception e){System.out.println("This Exception came "+e);}
    }
    
    
    
    void newField()
    {
         String name=tt.getText();
         tt.setText("");
         l[it]=new Label(name);
         t[it]=new TextField();
         l[it].setFont(font);
         t[it].setFont(font);
         l[it].setBounds(25,100+loc*40,100,30);
         t[it].setBounds(200,100+loc*40,100,30);
         newp.add(l[it]);
         newp.add(t[it]);
         fs[fsi]="@f@"+name;
         fsi++;
         it++;
         loc++;
    }
    
   
    
    int ib=0;
    Button b[]=new Button[10];
    void newButton(String ac)
    {
        String name=tb.getText();
        tb.setText("");
        b[ib]=new Button(name);
        b[ib].setBounds(100,100+loc*40,80,30); 
        newp.add(b[ib]);
        fs[fsi]="@b@"+name+"#"+ac;
         fsi++;
        ib++;
        loc++;
    }
    
    int ic=0;
    Checkbox c[]=new Checkbox[10];
    void newCheckBox()
    {
        String name=tc.getText();
        tc.setText("");
        c[ic]=new Checkbox();
        c[ic].setLabel(name);
        c[ic].setBounds(25,100+loc*40,300,30);
        newp.add(c[ic]);
        fs[fsi]="@c@"+name;
         fsi++;
        ic++;
        loc++;
    }
    
    int il=0;
    Label la[]=new Label[10];
    void newLabel()
    {
        String name=tl.getText();
        tl.setText("");
        la[il]=new Label(name);
        la[il].setFont(font);
        la[il].setBounds(25,100+loc*40,300,30); 
        newp.add(la[il]);
        fs[fsi]="@l@"+name;
         fsi++;
        il++;
        loc++;
    }
    
    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
            newField();
    }//GEN-LAST:event_button1ActionPerformed

    private void ttKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ttKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            newField();
        }
    }//GEN-LAST:event_ttKeyPressed

    private void tbKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            String ac=ch1.getSelectedItem();
            newButton(ac);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_tbKeyPressed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        String ac=ch1.getSelectedItem();
        newButton(ac);
        
        
    }//GEN-LAST:event_button2ActionPerformed

    private void tcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tcKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tcKeyPressed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        newCheckBox();        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        newLabel();        // TODO add your handling code here:
    }//GEN-LAST:event_button4ActionPerformed

    private void tlKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tlKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tlKeyPressed

    int is=0;
    SaveForm sv[]=new SaveForm[10];
    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        newp.setSize(400,150+loc*40);
        sv[is]=new SaveForm(newp);
        sv[is].setBounds(0,0,400,150+loc*40);
        //sv.pack();
        sv[is].setVisible(true);
        formSave();
        is++;
    }//GEN-LAST:event_button5ActionPerformed

    
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewFormGUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Button button4;
    private java.awt.Button button5;
    private java.awt.Choice ch1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label newname;
    private java.awt.Panel newp;
    private java.awt.Panel panel1;
    private java.awt.TextField tb;
    private java.awt.TextField tc;
    private java.awt.TextField tl;
    private java.awt.TextField tt;
    // End of variables declaration//GEN-END:variables
}
