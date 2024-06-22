/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package energy.efficient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import javax.swing.JOptionPane;
import org.cloudbus.cloudsim.CloudletSchedulerTimeShared;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.Vm;

/**
 *
 * @author EGC
 */
public class VM_Center extends javax.swing.JFrame {

    public static String str,str1;
    int d;
    public int nofVm, nofCloudlets;
    public static ArrayList<Vm> vmlist = new ArrayList<Vm>();
    public static ArrayList cloudletList=new ArrayList();
    public static DatacenterBroker[] broker = Broker_Center.bId;
    public static ArrayList vDetails = new ArrayList();
    public int pesNumber = 1;
    public static  Vm vm1;
    public static ArrayList cloudlet_prty=new ArrayList();
    public static ArrayList cDetails = new ArrayList();
    public static ArrayList vmload=new ArrayList();
    public static ArrayList antpool=new ArrayList();
    public static ArrayList vid = new ArrayList();
    public static ArrayList cid = new ArrayList();
    public static ArrayList vmsLoad1 =new ArrayList();
    public static ArrayList vidl=new ArrayList();
    public static ArrayList vbwl=new ArrayList();
    public static ArrayList vraml=new ArrayList();
    public static ArrayList vmipl=new ArrayList();
    public static ArrayList vl=new ArrayList();
    public static ArrayList vd=new ArrayList();
    public static ArrayList vla=new ArrayList();
    public static ArrayList antpool1=new ArrayList();
    public static ArrayList kk1=new ArrayList();
    private int status;
    public static ArrayList kk=new ArrayList();  
    public static ArrayList clid=new ArrayList();
    public static ArrayList clln=new ArrayList();
    public static ArrayList clfs=new ArrayList();
    public static ArrayList clos=new ArrayList();
    public static ArrayList ft=new ArrayList();
    public static ArrayList at=new ArrayList();
    public static ArrayList wt=new ArrayList();
    public static ArrayList et=new ArrayList();
    public static ArrayList rd=new ArrayList();
    public static ArrayList cl=new ArrayList();
    public static ArrayList pre=new ArrayList();
    public static ArrayList prty=new ArrayList();
        public static ArrayList mip=new ArrayList();
        public static ArrayList bid=new ArrayList();
    public static long startTime; 
        public static long endtime;
        
    public VM_Center() {
        initComponents();
        
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        vmcreation = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel1.setText("Energy-Efficient Many-Objective Virtual Machine Placement Optimization in a Cloud Computing Environment");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 10, 750, 50);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Palatino Linotype", 1, 14))); // NOI18N
        jPanel3.setOpaque(false);
        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jLabel2.setText("Virtual Machine");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(30, 20, 109, 30);

        vmcreation.setEditable(false);
        vmcreation.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jPanel3.add(vmcreation);
        vmcreation.setBounds(180, 20, 158, 30);

        jButton1.setFont(new java.awt.Font("Palatino Linotype", 1, 14)); // NOI18N
        jButton1.setText("Virtual Machine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(360, 20, 150, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(160, 120, 530, 70);

        jScrollPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        textarea1.setEditable(false);
        textarea1.setColumns(20);
        textarea1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        textarea1.setRows(5);
        textarea1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Virtual Machine", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 14))); // NOI18N
        jScrollPane1.setViewportView(textarea1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(130, 230, 550, 250);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/NextButton2.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(680, 390, 100, 110);

        jPanel4.setBackground(new java.awt.Color(240, 157, 234));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 790, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Azure_virtual_machines_icon.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 90, 160, 130);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int allload = 0;
        try {
            startTime = new Date().getTime();
            str = JOptionPane.showInputDialog(this, "Enter Number Of Virtual Machines");
            nofVm = Integer.parseInt(str);
            vmcreation.setText(nofVm + " ");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aco?zeroDateTimeBehavior=convertToNull","root","");
            Statement stmt=con.createStatement();

            stmt.executeUpdate("DROP TABLE IF EXISTS vmsize");
            String create="create table vmsize(vm_id int(50),vmsize int(50))";

            stmt.execute(create);

            for(int k=0;k<nofVm;k++)
            {
                int vmsid=k;
                str1 = JOptionPane.showInputDialog(this, "Enter size for Virtual machine");

                String sql1="insert into vmsize(vm_id,vmsize)values('"+k+"','"+str1+"')";
                stmt.executeUpdate(sql1);
            }
            Random r=new Random();
            Random r1=new Random();
            Random r2=new Random();
            ArrayList<Vm> vbList=new ArrayList<Vm>();
            int vmid,mips,ram,brokerId;
            long size,bw;
            long[] sizes={10000,15000,20000,250000};
            int[] rams={512,1024,2048,3072};
            int[] bws={1000,2000,1500,3000,5000};
            String vmm;
            Vm vm1;
            DatacenterBroker sBroker;
            int b;//=r.nextInt(broker.length);
            for(int i=0;i<nofVm;i++)
            //        for(int i=0;i<nofVm;i++)
            {
                b=r.nextInt(broker.length);
                vmid = i;
                mips = r.nextInt(1000);

                size = sizes[r1.nextInt(4)]; //image size (MB)
                ram = rams[r2.nextInt(4)]; //vm memory (MB)
                bw = bws[r.nextInt(5)];
                pesNumber = 2; //number of cpus
                vmm = "Xen"; //VMM name
                brokerId=broker[b].getId();
                vm1 = new Vm(vmid, brokerId, mips, pesNumber, ram, bw, size, vmm, new CloudletSchedulerTimeShared());
                vmlist.add(vm1);
                startTime= System.nanoTime();
                ////            System.out.println("**********************");
                kk.add(vmid);
                vmload.add(vm1.getId()+"\t"+vm1.getBw()+"\t"+vm1.getRam()+"\t"+vm1.getMips()+"\t"+vm1.getNumberOfPes());
                mip.add(vm1.getMips());
                d=(int) (vm1.getBw()+vm1.getRam()+vm1.getMips());
                allload+=d;
                vl.add(vm1.getId()+"\t"+allload);
                antpool.add("ant_"+i);
                vla.add(vm1.getId());
                //
                antpool1.add("ant_"+i+"\t"+vm1.getId());

                //     v

                vDetails.add(vmid+"\t"+brokerId+"\t"+mips+"\t"+ram+"\t"+bw+"\n\n");

                System.out.println("**********************");
                vid.add(vmid);
                //            vDetails.add(vmid+"\t"+brokerId+"\t"+mips+"\t"+ram+"\t"+bw+"\n\n");
                bid.add(brokerId);
                sBroker=broker[b];
                vbList.add(vm1);
                sBroker.submitVmList(vbList);
                vbList.clear();
                kk1.add(vm1.getMips());

            }
            //        for(int e=0;e<vmlist.size();e++)
            //        {
                //            System.out.println(vmlist.get(e).toString()+"\n");
                //        }
            //
            //            JOptionPane.showMessageDialog(this, nofVm + " Virtual Machines Created Successfully");
            //            textarea1.append("VM Id" + "\t" + "Broker Id" + "\t" + "Mips" + " \t" + "RAM" + "\t" + "BW\n\n");
            //            textarea1.append("================================================================\n\n");
            //            for (int i = 0; i < vDetails.size(); i++)
            //            {
                //                textarea1.append(vDetails.get(i).toString() + "\n");
                //            }

            //        {
                //            b=r.nextInt(broker.length);
                //            vmid = i;
                //            mips = r.nextInt(1000);
                //
                //            size = sizes[r1.nextInt(4)]; //image size (MB)
                //            ram = rams[r2.nextInt(4)]; //vm memory (MB)
                //            bw = bws[r.nextInt(5)];
                //            pesNumber = 2; //number of cpus
                //            vmm = "Xen"; //VMM name
                //            brokerId=broker[b].getId();
                //            vm1 = new Vm(vmid, brokerId, mips, pesNumber, ram, bw, size, vmm, new CloudletSchedulerTimeShared());
                //            vmlist.add(vm1);
                //
                //            vDetails.add(vmid+"\t"+brokerId+"\t"+mips+"\t"+ram+"\t"+bw+"\n\n");
                //            sBroker=broker[b];
                //            vbList.add(vm1);
                //            sBroker.submitVmList(vbList);
                //            vbList.clear();
                //        }

            JOptionPane.showMessageDialog(null,nofVm+" Virtual Machines created successfully");
            textarea1.append("VM Id"+"\t"+"Broker Id"+"\t"+"Mips"+" \t"+"RAM"+"\t"+"BW\n\n");
            textarea1.append("================================================================\n\n");
            for(int i=0;i<vDetails.size();i++) {
                textarea1.append(vDetails.get(i).toString()+"\n");
            }
            JOptionPane.showMessageDialog(null," Virtual Machines submitted to respective Brokers successfully");
            //            JOptionPane.showMessageDialog(this, " Virtual Machines submitted to respective Brokers successfully");
        }
        catch (Exception e)
        {
           e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        new Cloudlet_Create().setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(VM_Center.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VM_Center.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VM_Center.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VM_Center.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VM_Center().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textarea1;
    private javax.swing.JTextField vmcreation;
    // End of variables declaration//GEN-END:variables
}
