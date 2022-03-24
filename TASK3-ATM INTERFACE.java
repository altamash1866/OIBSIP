package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
class data{
    public static String xd1="DEPOSIT : ";
    public static String xw="WITHDRAW : ";

}
class transach{
    JFrame tfx=new JFrame();
    JLabel tfl=new JLabel("TRANSACTION HISTORY ");
    JLabel tfl2=new JLabel("");
    JLabel tfl3=new JLabel("");
    JButton tfb=new JButton("BACK");
    transach(){
        tfx.setSize(500,500);
        tfx.setLayout(null);

        tfl.setBounds(25,30,400,25);
        tfl.setFont(new Font("Serif",Font.BOLD,30));
        tfx.add(tfl);

        tfl2.setBounds(25,90,400,25);
        tfl2.setFont(new Font("Serif",Font.BOLD,30));
        tfl2.setText(data.xd1);
        tfx.add(tfl2);

        tfl3.setBounds(25,140,400,25);
        tfl3.setFont(new Font("Serif",Font.BOLD,30));
        tfl3.setText(data.xw);
        tfx.add(tfl3);

        tfb.setBounds(30,240,100,30);
        ActionListener tfbx=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atml trhal=new atml();
                tfx.dispose();
            }
        };
        tfb.addActionListener(tfbx);
        tfx.add(tfb);

        tfx.setVisible(true);
    }
}
class transfer{
    JFrame tf=new JFrame();
    JLabel tl=new JLabel("ACCOUNT NO OF RECEIVER");
    JTextField tt=new JTextField();
    JLabel tl2=new JLabel("ENTER THE AMOUNT ");
    JTextField tt2=new JTextField();
    JButton tb=new JButton("SEND");
    JLabel tl3=new JLabel("");
    JButton tbc=new JButton("BACK");
    transfer(){
        tf.setSize(500,500);
        tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf.setLayout(null);

        tl.setBounds(90,30,350,25);
        tl.setFont(new Font("Serif",Font.BOLD,20));
        tf.add(tl);

        tt.setBounds(100,80,260,30);
        tf.add(tt);

        tl2.setBounds(120,130,350,25);
        tl2.setFont(new Font("Serif",Font.BOLD,20));
        tf.add(tl2);

        tt2.setBounds(100,180,260,30);
        tf.add(tt2);

        tb.setBounds(150,240,150,30);
        ActionListener tbax=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tl3.setText("AMOUNT SENT SUCCESFULLY !!!");
            }
        };
        tb.addActionListener(tbax);
        tf.add(tb);

        tl3.setBounds(95,300,300,30);
        tl3.setFont(new Font("Serif",Font.BOLD,17));
        tf.add(tl3);

        tbc.setBounds(30,350,100,30);
        ActionListener tbcx=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                atml cvb=new atml();
                tf.dispose();

            }
        };
        tbc.addActionListener(tbcx);
        tf.add(tbc);

        tf.setVisible(true);


    }

}

class deposit{
    JFrame df=new JFrame();
    JLabel dl=new JLabel("ENTER AMOUNT TO DEPOSIT");
    JTextField dt=new JTextField();
    JButton db=new JButton("DEPOSIT");
    JLabel dl2=new JLabel("");
    JButton dbc=new JButton("BACK");
    deposit(){
        df.setSize(500,500);
        df.setLayout(null);
        df.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        dl.setBounds(70,30,350,25);
        dl.setFont(new Font("Serif",Font.BOLD,20));
        df.add(dl);

        dt.setBounds(140,80,200,30);
        df.add(dt);

        db.setBounds(165,120,150,25);
        ActionListener ldb=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dl2.setText("MONEY DEPOSITTED SUCCESSFULLY !!!");
                data.xd1+=dt.getText()+" ";

            }
        };
        db.addActionListener(ldb);
        df.add(db);

        dl2.setBounds(80,170,300,25);
        dl2.setFont(new Font("Serif",Font.BOLD,15));
        df.add(dl2);

        dbc.setBounds(30,250,100,30);
        ActionListener dbcx=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atml cvb=new atml();
                df.dispose();

            }
        };
        dbc.addActionListener(dbcx);
        df.add(dbc);




        df.setVisible(true);
    }
}

class withdraw{
    JFrame wf=new JFrame();
    JLabel wl=new JLabel("ENTER AMOUNT TO WITHDRAW");
    JTextField wt=new JTextField();
    JButton wb=new JButton("WITHDRAW");
    JLabel wl2=new JLabel("");
    JButton wbc=new JButton("BACK");
    withdraw(){
        wf.setSize(500,500);
        wf.setLayout(null);
        wf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        wl.setBounds(70,30,350,25);
        wl.setFont(new Font("Serif",Font.BOLD,20));
        wf.add(wl);

        wt.setBounds(140,80,200,30);
        wf.add(wt);

        wb.setBounds(165,120,150,25);
        ActionListener lwb=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                wl2.setText("MONEY WITHDRAWN SUCCESSFULLY !!!");
                data.xw+=wt.getText()+",";

            }
        };
        wb.addActionListener(lwb);
        wf.add(wb);

        wl2.setBounds(80,170,300,25);
        wl2.setFont(new Font("Serif",Font.BOLD,15));
        wf.add(wl2);

        wbc.setBounds(30,250,100,30);
        ActionListener dbcx=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atml cvb=new atml();
                wf.dispose();

            }
        };
        wbc.addActionListener(dbcx);
        wf.add(wbc);


        wf.setVisible(true);
    }
}

class atml{
    JFrame fd=new JFrame();
    JLabel ld=new JLabel("LOGIN SUCCESS !!!");
    JLabel ld1=new JLabel("PLEASE SELECT ANY ONE");
    JButton th=new JButton("TRANSACTION HISTORY");
    JButton w=new JButton("WITHDRAW");
    JButton d=new JButton("DEPOSIT");
    JButton tr=new JButton("TRANSFER");
    JButton q=new JButton("QUIT");


    atml(){
        fd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fd.setLayout(null);
        fd.setSize(500,500);

        ld.setBounds(140,20,300,25);
        ld.setFont(new Font("Serif",Font.BOLD,25));
        fd.add(ld);

        ld1.setBounds(75,70,400,25);
        ld1.setFont(new Font("Serif",Font.BOLD,25));
        fd.add(ld1);

        th.setBounds(90,125,300,35);
        th.setFont(new Font("Serif",Font.BOLD,15));
        ActionListener thcx=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    transach trhd=new transach();

            }
        };
        th.addActionListener(thcx);
        fd.add(th);

        w.setBounds(90,165,300,35);
        w.setFont(new Font("Serif",Font.BOLD,15));
        ActionListener lw=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                withdraw wx=new withdraw();
                fd.dispose();
            }
        };
        w.addActionListener(lw);
        fd.add(w);

        d.setBounds(90,205,300,35);
        d.setFont(new Font("Serif",Font.BOLD,15));
        ActionListener dx=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deposit xde=new deposit();
                fd.dispose();
            }
        };
        d.addActionListener(dx);
        fd.add(d);

        tr.setBounds(90,245,300,35);
        tr.setFont(new Font("Serif",Font.BOLD,15));
        ActionListener tx=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                transfer xtr=new transfer();
                fd.dispose();
            }
        };
        tr.addActionListener(tx);
        fd.add(tr);

        q.setBounds(90,285,300,35);
        q.setFont(new Font("Serif",Font.BOLD,15));
        ActionListener quit=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fd.dispose();
            }
        };
        q.addActionListener(quit);
        fd.add(q);

        fd.setVisible(true);
    }
}

public class atmpro {
    public static int xcvb=3;
    public static void main(String[] args) {
        JFrame f=new JFrame();
        f.setSize(500,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        JLabel l=new JLabel("WELCOME TO ATM");
        l.setBounds(80,40,300,25);
        l.setFont(new Font("Serif", Font.BOLD,30));
        f.add(l);

        JLabel l1=new JLabel("USERNAME");
        l1.setBounds(20,100,200,25);
        l1.setFont(new Font("Serif", Font.BOLD,20));
        f.add(l1);

        JTextField t=new JTextField();
        t.setBounds(200,102,200,25);
        f.add(t);

        JLabel l2=new JLabel("PASSWORD");
        l2.setBounds(20,130,200,25);
        l2.setFont(new Font("Serif", Font.BOLD,20));
        f.add(l2);

        JTextField t2=new JTextField();
        t2.setBounds(200,132,200,25);
        f.add(t2);

        JButton b=new JButton("SUBMIT");
        b.setBounds(150,182,150,35);
        ActionListener la=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a=t.getText();
                String b=t2.getText();
                if(a.equals("altamash") && b.equals("123")){
                    System.out.println("login success");
                    atml dd=new atml();
                    f.dispose();
                }
            }
        };
        b.addActionListener(la);
        f.add(b);

        f.setVisible(true);

    }
}
