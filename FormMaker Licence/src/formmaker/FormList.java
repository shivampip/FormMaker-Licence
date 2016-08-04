
package formmaker;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.StringTokenizer;


public class FormList extends java.awt.Frame implements ActionListener{

    public FormList() {
        initComponents();
        flist();
        
    }
    
   
    
    /*-----------------------------Read FormList-----------------------------*/
    void flist()
    {
        for(int i=0;i<10;i++)
        {
            newpa[i]=new Panel();
            formname[i]=new Label();
            for(int ii=0;ii<10;ii++)
             acno[i]=1;
        }
        
        
        try{
            FileInputStream fin=new FileInputStream("formlist.txt");
            int i;
            String ss="";
            while((i=fin.read())!=-1)
            {
                ss=ss+(char)i;
            }
            StringTokenizer st=new StringTokenizer(ss,"@");
            while(st.hasMoreTokens())
            {
                newButtonn(st.nextToken());
            }
            
        }catch(Exception e){}
    }        
    
    
    
    /*------------------------------Create FormList--------------------------*/
     int ibb=0;
     int locc=0;
    Button bb[]=new Button[10];
    void newButtonn(String bnm)
    {
        String name=bnm;
        bb[ibb]=new Button(name);
        bb[ibb].setBounds(100,150+locc*40,80,30); 
        createForm(bb[ibb].getLabel());
        add(bb[ibb]);
        bb[ibb].addActionListener(this);
        ibb++;
        locc++;
    }
    
    
    /*---------------------------------Create Forms in Background---------------------*/
    void createForm(String nm)
    {
        makeForm(nm);
        hm.put(nm,is-1);
    }
    
    int is=0;
    SaveForm sv[]=new SaveForm[10];
    Panel newpa[]=new Panel[10];
    Label formname[]=new Label[10];
    HashMap hm=new HashMap();
    HashMap hmac=new HashMap();
    
    void makeForm(String fnm)
    {
         formname[is].setText(fnm);
        formname[is].setBounds(0,0,400,50);
        
        formname[is].setAlignment(java.awt.Label.CENTER);
        formname[is].setBackground(new java.awt.Color(51,0,51));
        formname[is].setForeground(new java.awt.Color(255,255,0));
        formname[is].setFont(new java.awt.Font("Dialog", 1, 24)); 
        
         newpa[is].add(formname[is]);
        
        System.out.println("Button name is "+fnm);
        try{
            FileInputStream fin=new FileInputStream(fnm+"\\"+"0ProgramData.txt");                        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            int i;
            String ss="";
            while((i=fin.read())!=-1)
            {
                ss=ss+(char)i;
            }
            StringTokenizer st=new StringTokenizer(ss,"@");
            
            //NewFormGUI nfg=new NewFormGUI();
            while(st.hasMoreTokens())
            {
            String type=st.nextToken();
            String name,ac;
            
            if(!type.equals("b"))
            name=st.nextToken();
            else{
                StringTokenizer sst=new StringTokenizer(st.nextToken(),"#");
                name=sst.nextToken();
                ac=sst.nextToken();
                hmac.put(name,ac);
                System.out.println("HashMap key is "+name+" and value is "+ac);
            }
            
            switch(type)
            {
                case "b":
                    newButton(name);
                    break;
                case "f":
                    newField(name);
                    break;
                case "c":
                    newCheckBox(name);
                    break;
                case "l":
                    newLabel(name);
                    break;
            }
            }
            
             newpa[is].setSize(400,150+loc*40);
             newpa[is].setBackground(new java.awt.Color(153, 153, 255));
             newpa[is].setLayout(null);
             newpa[is].setName(fnm);

        sv[is]=new SaveForm(newpa[is],fnm,is);
        sv[is].setBounds(0,0,400,150+loc*40);
        //sv.pack();
        //sv[is].setVisible(true);
        //newp.removeAll();
        is++;
        loc=0;
        
        it=0;
        ib=0;
        ic=0;
        il=0;
        
        System.out.println("Location is Reset");
        }catch(Exception e){System.out.println("Exception name is "+e);}
        
    }
    /*-----------------------------------------------------------------------------------------------*/
    
    
    /*--------------------------------------ActionPerformed on Button pressed--------------*/
    @Override
    public void actionPerformed(ActionEvent evt)
    {
        if(hm.get(((Button)evt.getSource()).getLabel())!=null)
        {
        String fnm=((Button)evt.getSource()).getLabel();
        sv[(int)hm.get(fnm)].setVisible(true);
        }
        else
        {
            String nm=((Button)evt.getSource()).getParent().getName();
            int vis=(int)hm.get(nm);
            String bnm=((Button)evt.getSource()).getLabel();
            
            if(((String)hmac.get(bnm))!=null)
            {
            String ac=(String)hmac.get(bnm);
            
                switch (ac) {
                    case "Submit":
                        saveUForm(nm); 
                        break;
                    case "Reset":
                        resetForm(nm);
                        break;
                    case "Exit":
                        System.exit(0);
                    default:
                        break;
                }
            }
        }
       
   }
    
    
    /*--------------------------------------Reset UserForm----------------------------*/
    void resetForm(String nm)
    {
        int vis=(int)hm.get(nm);
        try{
            for(TextField tt:t[vis])
            tt.setText("");
            }catch(Exception e){System.out.println("Reset Ex "+e);}
        try{
            for(Checkbox cc:c[vis])
            cc.setState(false);
            }catch(Exception e){System.out.println("Reset Ex "+e);}
    }
    /*---------------------------------------Writing UserFormData----------------------*/
    int acno[]=new int[10];
    
    void saveUForm(String nnm)
    {
        int vis=(int)hm.get(nnm);
        try{
                                                                                                                                  //!!!!!!!!!!!
            FileOutputStream fout=new FileOutputStream(nnm+"\\"+"Acno-------"+(acno[vis]++)+".txt"); 
            String con="";
            int i=0;
            try{
            for(TextField t:t[vis])
            {
                con=con+l[vis][i++].getText()+"\t\t"+t.getText()+nn;
            }}catch(Exception e){}
            
            try{
            for(Checkbox c:c[vis])
            {
               con=con+c.getLabel()+"\t\t"+c.getState()+nn;
            }}catch(Exception e){}
            
            byte bbb[]=con.getBytes();
            fout.write(bbb);
            System.out.println("Successfully Written");
            
        }catch(Exception e){System.out.println("While saving userform "+e);}
        
    }
    
    
    
    
     /*---------------------------------------Create Components------------------------------------------*/
    final static String nn=System.getProperty("line.separator");
    Font font=new Font("Arial",0,20);
    int loc=0;
   
    
    
    /*-----------------------------------New TextField-----------------------------------*/
     int it=0;
    Label l[][]=new Label[10][10];
    TextField t[][]=new TextField[10][10];
     void newField(String nm)
    {
         String name=nm;
         l[is][it]=new Label(name);
         t[is][it]=new TextField();
         l[is][it].setFont(font);
         t[is][it].setFont(font);
         l[is][it].setBounds(25,100+loc*40,100,30);
         t[is][it].setBounds(200,100+loc*40,100,30);
         newpa[is].add(l[is][it]);
         newpa[is].add(t[is][it]);
         it++;
         loc++;
    }
     
    
     /*----------------------------------New Button--------------------------------------*/
     int ib=0;
    Button b[][]=new Button[10][10];
    void newButton(String nm)
    {
        String name=nm;
        b[is][ib]=new Button(name);
        b[is][ib].addActionListener(this);
        b[is][ib].setBounds(100,100+loc*40,80,30); 
        newpa[is].add(b[is][ib]);
        ib++;
        loc++;
    }
    
    
    /*---------------------------------New Checkbox-----------------------------------*/
    int ic=0;
    Checkbox c[][]=new Checkbox[10][10];
    void newCheckBox(String nm)
    {
        String name=nm;
        c[is][ic]=new Checkbox();
        c[is][ic].setLabel(name);
        c[is][ic].setBounds(25,100+loc*40,300,30);
        newpa[is].add(c[is][ic]);
        ic++;
        loc++;
    }
    
    
    /*----------------------------------New Label--------------------------------------*/
    int il=0;
    Label la[][]=new Label[10][10];
    void newLabel(String nm)
    {
        String name=nm;
        la[is][il]=new Label(name);
        la[is][il].setFont(font);
        la[is][il].setBounds(25,100+loc*40,300,30); 
        newpa[is].add(la[is][il]);
        il++;
        loc++;
    }
    
    /*-------------------------------------------------------------------------------------*/

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        newp = new java.awt.Panel();

        setBackground(new java.awt.Color(0, 204, 204));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(51, 0, 51));
        label1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 0));
        label1.setText("Form List");

        newp.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout newpLayout = new javax.swing.GroupLayout(newp);
        newp.setLayout(newpLayout);
        newpLayout.setHorizontalGroup(
            newpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        newpLayout.setVerticalGroup(
            newpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(newp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(377, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        setVisible(false);
    }//GEN-LAST:event_exitForm

  
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormList().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label label1;
    private java.awt.Panel newp;
    // End of variables declaration//GEN-END:variables
}
