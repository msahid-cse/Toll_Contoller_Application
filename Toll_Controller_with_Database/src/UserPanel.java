import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class UserPanel extends JFrame implements ActionListener  {
    private JLabel label1, label2, label3,label4;
    int serialNumber=0;
    String vehicleName;
    String LicenseNumber;
//    String data_time="hello";
        Date d=new Date();

    private JCheckBox c[];
    private JButton button1, button2, button3, button4,button5, button6, button7,button8;

    private Container c1;
    private JComboBox dropdown;
    private Font f, f2;
    private ButtonGroup group;
    private JTextArea tf;
    private JTextField tf1,tf2;
    String[] drop = {"Bkash", "Nogod", "Rocket"};
    public int totalcar=0;
    public int totalincome=0;

    public JButton getButton5() {
        return button5;
    }

    public void setButton5(JButton button5) {
        this.button5 = button5;
    }

    public UserPanel() {

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setResizable(false);
        setLocation(200, 60);

        c1 = this.getContentPane();
        c1.setBackground(new Color(0,123,200));
        c1.setLayout(null);
        f = new Font("ARIAL", Font.BOLD, 20);
        f2 = new Font("ARIAL", Font.BOLD, 28);
        //

        c = new JCheckBox[13];
        group = new ButtonGroup();
        c[0] = new JCheckBox("1. Motorcycle");
        c[0].setBounds(10, 100, 220, 40);
        c[0].setFont(f);
        c1.add(c[0]);
        group.add(c[0]);
        c[1] = new JCheckBox("2. Car/Jeep");
        c[1].setBounds(10, 160, 220, 40);
        c[1].setFont(f);
        c1.add(c[1]);
        group.add(c[1]);
        c[2] = new JCheckBox("3. Pickup");
        c[2].setBounds(10, 220, 220, 40);
        c[2].setFont(f);
        c1.add(c[2]);
        group.add(c[2]);
        c[3] = new JCheckBox("4. Microbus");
        c[3].setBounds(10, 280, 220, 40);
        c[3].setFont(f);
        c1.add(c[3]);
        group.add(c[3]);
        c[4] = new JCheckBox("5. Minibus");
        c[4].setBounds(10, 340, 220, 40);
        c[4].setFont(f);
        c1.add(c[4]);
        group.add(c[4]);
        c[5] = new JCheckBox("6. Medium bus");
        c[5].setBounds(10, 400, 220, 40);
        c[5].setFont(f);
        c1.add(c[5]);
        group.add(c[5]);
        c[6] = new JCheckBox("7. Big bus");
        c[6].setBounds(250, 100, 220, 40);
        c[6].setFont(f);
        c1.add(c[6]);
        group.add(c[6]);
        c[7] = new JCheckBox("8. Truck (upto 5 tonnes)");
        c[7].setBounds(250, 160, 220, 40);
        c[7].setFont(f);
        c1.add(c[7]);
        group.add(c[7]);
        c[8] = new JCheckBox("9. Truck (5-8 tonnes)");
        c[8].setBounds(250, 220, 220, 40);
        c[8].setFont(f);
        c1.add(c[8]);
        group.add(c[8]);
        c[9] = new JCheckBox("10. Truck (3 axle)");
        c[9].setBounds(250, 280, 220, 40);
        c[9].setFont(f);
        c1.add(c[9]);
        group.add(c[9]);
        c[10] = new JCheckBox("11. Trailer (4 axle)");
        c[10].setBounds(250, 340, 220, 40);
        c[10].setFont(f);
        c1.add(c[10]);
        group.add(c[10]);
        c[11] = new JCheckBox("12. Trailer (above 4 axle)");
        c[11].setBounds(250, 400, 220, 40);
        c[11].setFont(f);
        c1.add(c[11]);
        group.add(c[11]);
//
        tf = new JTextArea();
        tf.setBounds(570, 100, 390, 90);
        tf.setFont(f);
        c1.add(tf);

        tf2=new JTextField();
        tf2.setBounds(570,460,170,50);
        tf2.setFont(f);
        c1.add(tf2);
        tf2.setVisible(false);
        //
        label1 = new JLabel("SELECT YOUR CAR");
        label1.setBounds(400, 20, 280, 40);
        label1.setFont(f2);
        label1.setBackground(Color.green);

        label2 = new JLabel("PAYMENT GATEWAY:");
        label2.setBounds(630, 200, 260, 60);
        label2.setFont(f2);
        label2.setVisible(false);

        label4=new JLabel("ENTER YOUR AMOUNT: ");
        label4.setBounds(570,410,260,50);
        label4.setFont(f);
        label4.setVisible(false);

        label3 = new JLabel("CHOSE YOUR METHOD -->");
        label3.setFont(f);
        label3.setBounds(570, 330, 260, 50);
        label3.setVisible(false);
        c1.add(label3);
        c1.add(label4);
        c1.add(label1);
        c1.add(label2);
        //
        //

        button1 = new JButton("NEXT");
        button1.setBounds(350, 460, 120, 50);
        button1.setFont(f);
        button1.addActionListener(this);
        button3 = new JButton("ONLINE");
        button2 = new JButton("CARD");
        button3.setBounds(570, 265, 120, 50);
        button2.setFont(f);
        button3.setFont(f);
        button2.setBounds(840, 265, 120, 50);

        button4 = new JButton("CLEAR");
        button4.setBounds(180, 460, 120, 50);
        button4.setFont(f);

        button5=new JButton("NEXT");
        button5.setBounds(840,460,120,50);
        button5.setFont(f);

        button6= new JButton("EXIT");
        button6.setBounds(10,460,120,50);
        button6.setFont(f);

        button7= new JButton("BACK");
        button7.setBounds(0,0,70,20);
        c1.add(button7);

        button8= new JButton("<COLOR>");
        button8.setBounds(900,0,90,20);
        c1.add(button8);

        c1.add(button6);
        c1.add(button5);
        button5.setVisible(false);
        button3.setVisible(false);
        button2.setVisible(false);
        button2.addActionListener(this);
        button4.addActionListener(this);
//        button1.addActionListener(this);
        button3.addActionListener(this);
        button5.addActionListener(this);
        button7.addActionListener(this);
        button6.addActionListener(this);
        button8.addActionListener(this);

//        button2.addActionListener(this);
        c1.add(button1);
        c1.add(button4);
        c1.add(button2);
        c1.add(button3);
        //
        for(int i=0;i<12;i++){
            c[i].addActionListener(this);
        }
        //
        dropdown = new JComboBox(drop);
        dropdown.setBounds(840, 330, 120, 50);
        c1.add(dropdown);
        dropdown.setFont(f);
        dropdown.addActionListener(this);
        dropdown.setVisible(false);


//f
    }
    int bill=0;

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button3) {
            dropdown.setVisible(true);
            label3.setVisible(true);
        }
        else    if(e.getSource()==button2){
            JOptionPane.showMessageDialog(null,"WORK IN PROGRESS");

        }
        else if(e.getSource()==button5){
//          int pay= Integer.parseInt(tf2.getText());
            String pay=tf2.getText();
            String bills=String.valueOf(bill);
            if(pay.equals(bills)){

                JOptionPane.showMessageDialog(null,"---->CLEAR<-----","RIGHT",JOptionPane.ERROR_MESSAGE);
        totalincome=totalincome+bill;
        totalcar++;
                try{
                    Conn conn=new Conn();
                    String query="insert into income values(' "+totalincome+" ')";
                    conn.s.executeUpdate(query);
                }
                catch (Exception ee){
                    ee.printStackTrace();
                }

                try{
                    Conn conn=new Conn();
                    String query="insert into car values(' "+totalcar+" ')";
                    conn.s.executeUpdate(query);

                }
                catch (Exception ee){
                    ee.printStackTrace();
                }


                try{
                    Conn conn=new Conn();
                    String query="insert into info2 values(' "+serialNumber+" ', ' "+vehicleName+" ', ' "+LicenseNumber+" ', ' "+d+" ', ' online ', ' "+bill+" ')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Details added successfully");
//    setVisible(false);
//        LoginFrame f=new LoginFrame();
//        f.setVisible(true);
                }
                catch (Exception ee){
                    ee.printStackTrace();
                }
                button2.setVisible(false);
                button3.setVisible(false);
                label2.setVisible(false);
                dropdown.setVisible(false);
                label3.setVisible(false);
                label3.setVisible(false);
                dropdown.setVisible(false);
                label4.setVisible(false);
                tf2.setVisible(false);
                button5.setVisible(false);
                tf2.setText("");
                tf.setText("");
            }
            else if(pay.isEmpty()){
                JOptionPane.showMessageDialog(null,"YOU DIDN'T ENTER AMOUNT YET","ALERT",JOptionPane.ERROR_MESSAGE);

            }
            else{
                JOptionPane.showMessageDialog(null,"OPS...!WRONG INPUT","ALERT",JOptionPane.ERROR_MESSAGE);

            }
        }
        else if(e.getSource()==dropdown){
            label4.setVisible(true);
            tf2.setVisible(true);
            button5.setVisible(true);
        }
        else  if (c[0].isSelected()) {
            tf.setText("");
            bill=100;
            tf.append("             ------>Motorcycle<------     \n\n      Your Toll Fee: 100TK");
            serialNumber++;
            vehicleName="Motorcycle";
            LicenseNumber="gh-24e5";
            button2.setVisible(false);
            button3.setVisible(false);
            label2.setVisible(false);
            dropdown.setVisible(false);
            label3.setVisible(false);
            label3.setVisible(false);
            dropdown.setVisible(false);
            label4.setVisible(false);
            tf2.setVisible(false);
            button5.setVisible(false);
        }

        else if (c[1].isSelected()) {
            tf.setText("");
            bill=750;
            serialNumber++;
            vehicleName="Car/Jeep";
            LicenseNumber="gh-2235";
            tf.append("             ----->Car/Jeep<-----     \n\n          Your Toll Fee: 750TK");
            button2.setVisible(false);
            button3.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            dropdown.setVisible(false);
            label4.setVisible(false);
            tf2.setVisible(false);
            button5.setVisible(false);
        } else if (c[2].isSelected()) {
            tf.setText("");
            bill=1200;
            serialNumber++;
            vehicleName="Pickup";
            LicenseNumber="gh-24e5";
            tf.append("              ----->Pickup<-----     \n\n         Your Toll Fee: 1200TK");
            button2.setVisible(false);
            button3.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            dropdown.setVisible(false);
            label4.setVisible(false);
            tf2.setVisible(false);
            button5.setVisible(false);
        } else if (c[3].isSelected()) {
            bill=1300;
            serialNumber++;
            vehicleName="Microbus";
            LicenseNumber="gh-2ge5";
            tf.setText("");
            tf.append("               ----->Microbus<-----     \n\n         Your Toll Fee: 1300TK");
            button2.setVisible(false);
            button3.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            dropdown.setVisible(false);
            label4.setVisible(false);
            tf2.setVisible(false);
            button5.setVisible(false);
        } else if (c[4].isSelected()) {
            tf.setText("");
            bill=1400;
            serialNumber++;
            vehicleName="Minibus";
            LicenseNumber="gb-20e5";
            tf.append("                ----->Minibus<-----     \n\n         Your Toll Fee: 1400TK");
            button2.setVisible(false);
            button3.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            dropdown.setVisible(false);
            label4.setVisible(false);
            tf2.setVisible(false);
            button5.setVisible(false);
        } else if (c[5].isSelected()) {
            tf.setText("");
            bill=2000;
            serialNumber++;
            vehicleName="Medium bus";
            LicenseNumber="ga-7b4";
            tf.append("             ----->Medium bus<-----     \n\n         Your Toll Fee: 2000TK");
            button2.setVisible(false);
            button3.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            dropdown.setVisible(false);
            label4.setVisible(false);
            tf2.setVisible(false);
            button5.setVisible(false);
        } else if (c[6].isSelected()) {
            tf.setText("");
            bill=2400;
            serialNumber++;
            vehicleName="Big bus";
            LicenseNumber="ah-24t5";
            tf.append("                ----->Big bus<-----     \n\n         Your Toll Fee: 2400TK");
            button2.setVisible(false);
            button3.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            dropdown.setVisible(false);
            label4.setVisible(false);
            tf2.setVisible(false);
            button5.setVisible(false);
        } else if (c[7].isSelected()) {
            tf.setText("");
            bill=1600;
            serialNumber++;
            vehicleName="Truck (upto 5 tonnes)";
            LicenseNumber="gm-54e5";
            tf.append("         ----->Truck (upto 5 tonnes)<-----     \n\n         Your Toll Fee: 1600TK");
            button2.setVisible(false);
            button3.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            dropdown.setVisible(false);
            label4.setVisible(false);
            tf2.setVisible(false);
            button5.setVisible(false);
        } else if (c[8].isSelected()) {
            tf.setText("");
            bill=2100;
            serialNumber++;
            vehicleName="Truck (5-8 tonnes)";
            LicenseNumber="da-9440";
            tf.append("           ----->Truck (5-8 tonnes)<-----     \n\n         Your Toll Fee: 2100TK");
            button2.setVisible(false);
            button3.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            dropdown.setVisible(false);
            label4.setVisible(false);
            tf2.setVisible(false);
            button5.setVisible(false);
        } else if (c[9].isSelected()) {
            tf.setText("");
            bill=5500;
            serialNumber++;
            vehicleName="Truck (3 axle)";
            LicenseNumber="ls-40e5";
            tf.append("             ----->Truck (3 axle)<-----     \n\n        Your Toll Fee: 5500TK");
            button2.setVisible(false);
            button3.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            dropdown.setVisible(false);
            label4.setVisible(false);
            tf2.setVisible(false);
            button5.setVisible(false);
        } else if (c[10].isSelected()) {
            tf.setText("");
            bill=6000;
            serialNumber++;
            vehicleName="Tailer (4 axle)";
            LicenseNumber="gr-24e5";
            tf.append("             ----->Tailer (4 axle)<-----     \n\n         Your Toll Fee: 6000TK");
            button2.setVisible(false);
            button3.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            dropdown.setVisible(false);
            label4.setVisible(false);
            tf2.setVisible(false);
            button5.setVisible(false);
        } else if (c[11].isSelected()) {
            tf.setText("");
            serialNumber++;
            vehicleName="Tailer (above 4 axle)";
            LicenseNumber="th-9a12";
            String axle=JOptionPane.showInputDialog(null,"HOW MANY AXLE :");
            bill=Integer.parseInt(axle)*1500;
            tf.append("             ----->Tailer (above 4 axle)<-----     \n\n          Your Toll Fee: "+bill+"TK");
            button2.setVisible(false);
            button3.setVisible(false);
            label2.setVisible(false);
            label3.setVisible(false);
            dropdown.setVisible(false);
            label4.setVisible(false);
            tf2.setVisible(false);
            button5.setVisible(false);
        }
        if(e.getSource()==button1) {
            boolean isChecked = false;
            for (JCheckBox checkbox : c) {
                if (checkbox.isSelected()) {
                    isChecked = true;
                    break;
                }
            }
            if (isChecked) {
                for (JCheckBox checkbox : c) {
                    if (checkbox.isSelected()) {
                        button2.setVisible(true);
                        button3.setVisible(true);
                        label2.setVisible(true);
                        break;
                    }
                }
            }
            else {
                JOptionPane.showMessageDialog(UserPanel.this, "Please select at least one checkbox.");
            }
        }
        else if(e.getSource()==button4){
            tf.setText("");
            button2.setVisible(false);
            button3.setVisible(false);
            label2.setVisible(false);
            dropdown.setVisible(false);
            label3.setVisible(false);
            label4.setVisible(false);
            tf2.setVisible(false);
            button5.setVisible(false);
        }
        else if(e.getSource()==button6){
            System.exit(0);
        }
        else if (e.getSource()==button7) {
            SelectionPage selectionPage=new SelectionPage();
            //  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            //dispose();
            this.setVisible(false);
            selectionPage.setVisible(true);

        } else if (e.getSource()==button8) {
            Color cc = JColorChooser.showDialog(null, "choose a color", Color.green);
            this.getContentPane().setBackground(cc);

        }
    }
    public static void main(String[] args) {
        UserPanel frame = new UserPanel();
       /* frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setResizable(false);
        frame.setLocation(200, 60);*/
    }

}