package formmaker;

import java.io.FileInputStream;
import java.util.Date;
import java.util.StringTokenizer;

public class TWin extends java.awt.Frame {
    public TWin() {
        initComponents();
        starting();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        dl = new java.awt.Label();
        conti = new java.awt.Button();
        button2 = new java.awt.Button();
        label2 = new java.awt.Label();

        setBackground(new java.awt.Color(0, 255, 153));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(51, 0, 51));
        label1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Trial Version");

        dl.setAlignment(java.awt.Label.CENTER);
        dl.setBackground(new java.awt.Color(0, 0, 102));
        dl.setFont(new java.awt.Font("DialogInput", 1, 30)); // NOI18N
        dl.setForeground(new java.awt.Color(255, 255, 0));
        dl.setText("days left.");

        conti.setBackground(new java.awt.Color(0, 102, 51));
        conti.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        conti.setForeground(new java.awt.Color(153, 255, 255));
        conti.setLabel("Continue");
        conti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contiActionPerformed(evt);
            }
        });

        button2.setBackground(new java.awt.Color(0, 102, 51));
        button2.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        button2.setForeground(new java.awt.Color(153, 255, 255));
        button2.setLabel("Buy Licence");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        label2.setBackground(new java.awt.Color(51, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                            .addComponent(dl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(conti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(label2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dl, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(conti, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    int dayleft=-1;
    void starting()
    {
        Date d=new Date();
        long l=d.getTime();
        
        try{
            FileInputStream fin=new FileInputStream("C:\\ProgramData\\trial\\date.txt");
            int a;
            String data="";
            while((a=fin.read())!=-1)
                data=data+(char)a;
            
            StringTokenizer st=new StringTokenizer(data,"@");
            while(st.hasMoreTokens())
            {
                long ll=Long.parseLong(st.nextToken());
                if(l<ll)
                {
                    dayleft=Integer.parseInt(st.nextToken());
                    break;
                }
                st.nextToken();
            }
            if(dayleft==-1)
            {
                dl.setText("Trial version Expired");
                conti.setEnabled(false);
            }
            else
            dl.setText(dayleft+" days left!!");
                  
        }catch(Exception e){}
    }
    
    
    


    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        setVisible(false);
        new BuyLi().setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed

    private void contiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contiActionPerformed
        setVisible(false);
        new FormMakerGUI().setVisible(true);
    }//GEN-LAST:event_contiActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TWin().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private java.awt.Button conti;
    private java.awt.Label dl;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables
}
