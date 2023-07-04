import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class CashPayment extends JFrame implements ActionListener {
    private JLabel label1,label4;
    String vehicleName, LicenseNumber;
    int serialNumber=0;
    //  private JCheckBox c[];
Date date=new Date();
    private JButton next, clear, confirmButton, exitButton, back, colorButton;

    private Container c1;
    private Font f, f2;
    private JTextArea showBillTextArea;
    private JTextField EnterPaymentTextField;
    private JButton motorCycle, car_jeep, Pickup, microBus, mediumBus, bigBus, Truck_upto_5_tonnes, Truck_5_8_tonnes, Truck_3_axle, Trailer_4_axle, Tailer_above_4_axle;

    String[] drop = {"Bkash", "Nogod", "Rocket"};

    public JButton getButton5() {
        return confirmButton;
    }

    public void setButton5(JButton button5) {
        this.confirmButton = button5;
    }

    public CashPayment() {

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setResizable(false);
        setLocation(200, 60);

        c1 = this.getContentPane();
        c1.setBackground(Color.cyan);
        c1.setLayout(null);
        f = new Font("serif", Font.BOLD, 15);
        f2 = new Font("serif", Font.BOLD, 25);
        //
//
        showBillTextArea = new JTextArea();
        showBillTextArea.setBounds(550, 100, 390, 110);
        showBillTextArea.setFont(f);
        c1.add(showBillTextArea);

        EnterPaymentTextField =new JTextField();
        EnterPaymentTextField.setBounds(550, 280, 390, 50);
        EnterPaymentTextField.setFont(f);
        c1.add(EnterPaymentTextField);
        EnterPaymentTextField.setVisible(false);
        //
        label1 = new JLabel("SELECT YOUR VEHICLE");
        label1.setBounds(380, 20, 300, 40);
        label1.setFont(f2);
        label1.setBackground(Color.green);
        label1.setVisible(true);


        label4=new JLabel("ENTER YOUR AMOUNT: ");
        label4.setBounds(570,410,260,50);
        label4.setFont(f);
        label4.setVisible(false);


        c1.add(label4);
        c1.add(label1);
        //
        //


        next = new JButton("NEXT>");
        next.setBounds(700, 220, 120, 50);
        next.setBackground(new Color(0,139,139));
        next.setMnemonic('n');
        next.setFont(f2);


        clear = new JButton("CLEAR");
        clear.setBounds(150, 400, 105, 50);
        clear.setFont(f);

        confirmButton =new JButton("Confirm");
        confirmButton.setBounds(660, 340, 200, 50);
        confirmButton.setBackground(new Color(0,139,139));
        confirmButton.setMnemonic('z');
        confirmButton.setFont(f2);

        exitButton = new JButton("EXIT");
        exitButton.setBounds(55,400,80,50);
        exitButton.setFont(f);

        back = new JButton("BACK");
        back.setBounds(0,0,70,30);
        back.setBackground(new Color(0,139,139));
        c1.add(back);

        colorButton = new JButton("<COLOR>");
        colorButton.setBounds(900,0,90,30);
        colorButton.setBackground(new Color(0,139,139));
        c1.add(colorButton);

        c1.add(exitButton);
        c1.add(confirmButton);
        confirmButton.setVisible(false);
        next.setVisible(false);


        clear.addActionListener(this);
//        button1.addActionListener(this);
        next.addActionListener(this);
        confirmButton.addActionListener(this);
        back.addActionListener(this);
        exitButton.addActionListener(this);
        colorButton.addActionListener(this);

//        button2.addActionListener(this);

        c1.add(clear);
        c1.add(next);
        //
       /* for(int i=0;i<12;i++){
            c[i].addActionListener(this);
        }*/
        //
        //
        /*dropdown = new JComboBox(drop);
        dropdown.setBounds(840, 330, 120, 50);
        c1.add(dropdown);
        dropdown.setFont(f);
        dropdown.addActionListener(this);
        dropdown.setVisible(false);*/


//
        //add button
        //button Motorcycle
        motorCycle = new JButton("[A] MotorCycle");
        c1.add(motorCycle);
        motorCycle.setBounds(55, 100, 200, 50);
        motorCycle.setBackground(new Color(0,139,139));
        motorCycle.setForeground(Color.white);
        motorCycle.addActionListener(this);
        motorCycle.setFont(f);
        motorCycle.setMnemonic('A');

        //button Car/Jeep
        car_jeep = new JButton("[B] Car/Jeep");
        c1.add(car_jeep);
        car_jeep.setBounds(260, 100, 200, 50);
        car_jeep.setBackground(new Color(0,139,139));
        car_jeep.setForeground(Color.white);
        car_jeep.setFont(f);
        car_jeep.setMnemonic('b');
        car_jeep.addActionListener(this);

        //button Pickup
        Pickup = new JButton("[C] Pickup");
        c1.add(Pickup);
        Pickup.setBounds(55, 160, 200, 50);
        Pickup.setBackground(new Color(0,139,139));
        Pickup.setFont(f);
        Pickup.setForeground(Color.white);
        Pickup.setMnemonic('c');
        Pickup.addActionListener(this);

        //button microBus
        microBus = new JButton("[D] MicroBus");
        c1.add(microBus);
        microBus.setBounds(260, 160, 200, 50);
        microBus.setBackground(new Color(0,139,139));
        microBus.setForeground(Color.white);
        microBus.setFont(f);
        microBus.setMnemonic('d');
        microBus.addActionListener(this);

        //button mediumBus
        mediumBus = new JButton("[E] MediumBus");
        c1.add(mediumBus);
        mediumBus.setBounds(55, 220, 200, 50);
        mediumBus.setBackground(new Color(0,139,139));
        mediumBus.setForeground(Color.white);
        mediumBus.setFont(f);
        mediumBus.setMnemonic('e');
        mediumBus.addActionListener(this);

        //button bigBus
        bigBus = new JButton("[F] bigBus");
        c1.add(bigBus);
        bigBus.setBounds(260, 220, 200, 50);
        bigBus.setBackground(new Color(0,139,139));
        bigBus.setFont(f);
        bigBus.setMnemonic('f');
        bigBus.setForeground(Color.white);
        bigBus.addActionListener(this);

        //button Truck (upto 5 tonnes)
        Truck_upto_5_tonnes = new JButton("[G] TruckUpto5Tonnes");
        c1.add(Truck_upto_5_tonnes);
        Truck_upto_5_tonnes.setBounds(55, 280, 200, 50);
        Truck_upto_5_tonnes.setBackground(new Color(0,139,139));
        Truck_upto_5_tonnes.setForeground(Color.white);
        Truck_upto_5_tonnes.setFont(f);
        Truck_upto_5_tonnes.setMnemonic('g');
        Truck_upto_5_tonnes.addActionListener(this);

        //button Truck (5-8 tonnes)
        Truck_5_8_tonnes = new JButton("[H] Truck_5_8_tonnes");
        c1.add(Truck_5_8_tonnes);
        Truck_5_8_tonnes.setBounds(260, 280, 200, 50);
        Truck_5_8_tonnes.setBackground(new Color(0,139,139));
        Truck_5_8_tonnes.setForeground(Color.white);
        Truck_5_8_tonnes.setFont(f);
        Truck_5_8_tonnes.setMnemonic('h');
        Truck_5_8_tonnes.addActionListener(this);

        //button Truck (3 axle)
        Truck_3_axle = new JButton("[I] Truck (3 axle)");
        c1.add(Truck_3_axle);
        Truck_3_axle.setBounds(55, 340, 200, 50);
        Truck_3_axle.setBackground(new Color(0,139,139));
        Truck_3_axle.setForeground(Color.white);
        Truck_3_axle.setFont(f);
        Truck_3_axle.setMnemonic('i');
        Truck_3_axle.addActionListener(this);

        //button Trailer (4 axle)
        Trailer_4_axle = new JButton("[J] Trailer (4 axle)");
        c1.add(Trailer_4_axle);
        Trailer_4_axle.setBounds(260, 340, 200, 50);
        Trailer_4_axle.setBackground(new Color(0,139,139));
        Trailer_4_axle.setForeground(Color.white);
        Trailer_4_axle.setFont(f);
        Trailer_4_axle.setMnemonic('j');
        Trailer_4_axle.addActionListener(this);

        //button Tailer (above 4 axle)
        Tailer_above_4_axle = new JButton("[K] Tailer(4+ axle)");
        c1.add(Tailer_above_4_axle);
        Tailer_above_4_axle.setBounds(260, 400, 200, 50);
        Tailer_above_4_axle.setBackground(new Color(0,139,139));
        Tailer_above_4_axle.setForeground(Color.white);
        Tailer_above_4_axle.setFont(f);
        Tailer_above_4_axle.setMnemonic('k');
        Tailer_above_4_axle.addActionListener(this);

    }
    int bill=0;

    @Override
    public void actionPerformed(ActionEvent e) {

        //online
        if (e.getSource() == next) {
            // dropdown.setVisible(true);
            EnterPaymentTextField.setVisible(true);
            confirmButton.setVisible(true);

        }
        //color
        else if (e.getSource()== colorButton) {
            Color cc = JColorChooser.showDialog(null, "choose a color", Color.green);
            this.getContentPane().setBackground(cc);

        }

        //clear
        else if(e.getSource()== clear){
            showBillTextArea.setText("");
            next.setVisible(false);
            label4.setVisible(false);
            EnterPaymentTextField.setText("");
            EnterPaymentTextField.setVisible(false);
            confirmButton.setVisible(false);
        }
        //back
        else if (e.getSource()== back) {
            //AdminPanel admin=
                    new AdminPanel();
            //  this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            //dispose();
            this.setVisible(false);
            //admin.setVisible(true);

        }
        //exit
        else if(e.getSource()== exitButton){
            System.exit(0);
        }
        //final next
        else if(e.getSource()== confirmButton){
            //int pay= Integer.parseInt(EnterPaymentTextField.getText());
            String pay;
//
            pay = EnterPaymentTextField.getText();
            String bills= String.valueOf(bill);

            if(pay.equals(bills)){
                JOptionPane.showMessageDialog(null,"---->CLEAR<-----","RIGHT",-1);

//                String pay1=EnterPaymentTextField.getText();


                    try{
                        Conn conn=new Conn();
                        String query="insert into info2 values( ' "+vehicleName+" ', ' "+LicenseNumber+" ', ' "+date+" ', ' Cash ', ' "+bill+" ')";
                        conn.s.executeUpdate(query);
                        JOptionPane.showMessageDialog(null,"Details added successfully");
                    }
                    catch (Exception ee){
                        ee.printStackTrace();
                    }
                //  next.setVisible(false);
                label4.setVisible(false);
                EnterPaymentTextField.setVisible(false);
                confirmButton.setVisible(false);
                EnterPaymentTextField.setText("");
                showBillTextArea.setText("");
                next.setVisible(false);




            }
//            else if(bill<a){
//                JOptionPane.showMessageDialog(null,"Driver will get refund :"+(a-bill)+"TK","ALERT",JOptionPane.ERROR_MESSAGE);
//
//            }
//            else if(bill>a){
//                JOptionPane.showMessageDialog(null,"NOT ACCEPTED","ALERT",JOptionPane.ERROR_MESSAGE);
//
//            }
            else if(pay.isEmpty()){
                JOptionPane.showMessageDialog(null,"YOU DIDN'T ENTER AMOUNT YET","ALERT",JOptionPane.ERROR_MESSAGE);

            }
            else{
                JOptionPane.showMessageDialog(null,"OPS...!WRONG INPUT","ALERT",JOptionPane.ERROR_MESSAGE);

            }
        }
        else  if (e.getSource()==motorCycle) {
            vehicleName="motorCYcle";
            serialNumber++;
            LicenseNumber="Dhaka-2baa";
            showBillTextArea.setText("");
            bill=100;
            showBillTextArea.append("           ------>Motorcycle<------     \n\n      Your Toll Fee: 100TK");

            next.setVisible(true);
            label4.setVisible(false);
            EnterPaymentTextField.setVisible(false);
            confirmButton.setVisible(false);
        }

        else if (e.getSource()==car_jeep) {
            vehicleName="car_jeep";
            LicenseNumber="dhaka-metro220";
            serialNumber++;
            showBillTextArea.setText("");
            bill=750;
            showBillTextArea.append("             ----->Car/Jeep<-----     \n\n          Your Toll Fee: 750TK");

            next.setVisible(true);
            label4.setVisible(false);
            EnterPaymentTextField.setVisible(false);
            confirmButton.setVisible(false);
        } else if (e.getSource()==Pickup) {
            vehicleName="Pickup";
            LicenseNumber="px-9200";
            serialNumber++;
            showBillTextArea.setText("");
            bill=1200;
            showBillTextArea.append("              ----->Pickup<-----     \n\n         Your Toll Fee: 1200TK");
            next.setVisible(true);
            label4.setVisible(false);
            EnterPaymentTextField.setVisible(false);
            confirmButton.setVisible(false);
        } else if (e.getSource()==microBus) {
            vehicleName="microBus";
            serialNumber++;
            LicenseNumber="Gh-4404";
            bill=1300;
            showBillTextArea.setText("");
            showBillTextArea.append("               ----->Microbus<-----     \n\n         Your Toll Fee: 1300TK");
            next.setVisible(true);
            label4.setVisible(false);
            EnterPaymentTextField.setVisible(false);
            confirmButton.setVisible(false);
        } /*else if (e.getSource()==mediumBus) {
            vehicleName="mediumBus";
            serialNumber++;
            LicenseNumber="yt-2290";
            showBillTextArea.setText("");
            bill=1400;
            showBillTextArea.append("                ----->Minibus<-----     \n\n         Your Toll Fee: 1400TK");
            next.setVisible(true);
            label4.setVisible(false);
            EnterPaymentTextField.setVisible(false);
            confirmButton.setVisible(false);
        }*/ else if (e.getSource()==mediumBus) {
            vehicleName="mediumBus";
            serialNumber++;
            LicenseNumber="Ah-9110";
            showBillTextArea.setText("");
            bill=2000;
            showBillTextArea.append("             ----->Medium bus<-----     \n\n         Your Toll Fee: 2000TK");
            next.setVisible(true);
            label4.setVisible(false);
            EnterPaymentTextField.setVisible(false);
            confirmButton.setVisible(false);
        } else if (e.getSource()==bigBus) {
            vehicleName="bigBus";
            LicenseNumber="400b-a2";
            serialNumber++;
            showBillTextArea.setText("");
            bill=2400;
            showBillTextArea.append("                ----->Big bus<-----     \n\n         Your Toll Fee: 2400TK");
            next.setVisible(true);
            label4.setVisible(false);
            EnterPaymentTextField.setVisible(false);
            confirmButton.setVisible(false);
        } else if (e.getSource()==Truck_upto_5_tonnes) {
            vehicleName="Truck_upto_5_tonnes";
            showBillTextArea.setText("");
            serialNumber++;
            LicenseNumber="9a-ab40";
            bill=1600;
            showBillTextArea.append("         ----->Truck (upto 5 tonnes)<-----     \n\n         Your Toll Fee: 1600TK");
            next.setVisible(true);
            label4.setVisible(false);
            EnterPaymentTextField.setVisible(false);
            confirmButton.setVisible(false);
        } else if (e.getSource()==Truck_5_8_tonnes) {
            vehicleName="Truck_5_8_tonnes";
            showBillTextArea.setText("");
            serialNumber++;
            LicenseNumber="5b-202b";
            bill=2100;
            showBillTextArea.append("           ----->Truck (5-8 tonnes)<-----     \n\n         Your Toll Fee: 2100TK");
            next.setVisible(true);
            label4.setVisible(false);
            EnterPaymentTextField.setVisible(false);
            confirmButton.setVisible(false);
        } else if (e.getSource()==Truck_3_axle) {
            vehicleName="Truck_3_axle";
            serialNumber++;
            LicenseNumber="2b-2349";
            showBillTextArea.setText("");
            bill=5500;
            showBillTextArea.append("             ----->Truck (3 axle)<-----     \n\n        Your Toll Fee: 5500TK");
            next.setVisible(true);
            label4.setVisible(false);
            EnterPaymentTextField.setVisible(false);
            confirmButton.setVisible(false);
        } else if (e.getSource()==Trailer_4_axle) {
            vehicleName="Trailer_4_axle";
            LicenseNumber="Gh-20049";
            serialNumber++;
            showBillTextArea.setText("");
            bill=6000;
            showBillTextArea.append("             ----->Tailer (4 axle)<-----     \n\n         Your Toll Fee: 6000TK");
            next.setVisible(true);
            label4.setVisible(false);
            EnterPaymentTextField.setVisible(false);
            confirmButton.setVisible(false);
        } else if (e.getSource()==Tailer_above_4_axle) {
            vehicleName="Tailer_above_4_axle";
            LicenseNumber="Gh-2349";
            serialNumber++;
            showBillTextArea.setText("");
            serialNumber++;
            String axle=JOptionPane.showInputDialog(null,"HOW MANY AXLE :");
            bill=Integer.parseInt(axle)*1500;
            showBillTextArea.append("             ----->Tailer (above 4 axle)<-----     \n\n          Your Toll Fee: "+bill+"TK");
            next.setVisible(true);
            label4.setVisible(false);
            EnterPaymentTextField.setVisible(false);
            confirmButton.setVisible(false);
        }

    }
    public static void main(String[] args) {
        CashPayment frame =new CashPayment();
        frame.setTitle("Toll Controller");
      /* frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 600);
        frame.setResizable(false);
        frame.setLocation(200, 60);*/
    }

}
