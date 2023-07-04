
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;


public class UserRegistration extends JFrame implements ActionListener {

    UserConnection conn=new UserConnection();
    JTextField  textFieldAccount_Pin, textFieldAccount_Number, textFieldTollFee,textFieldConfirmPasswor, textFieldLicenseNumber,textFieldUser, textFieldPassword;
    JTextField textFieldGender,textFieldEmployeeFathersName,textFieldEmployeeSalary,textFieldEmployeeAdress,textFieldEmployeephoneNumber,textFieldEmployeeEmail;
    JLabel EmployeeID,IDofEmployee ;
    JComboBox textFieldVehicleName,Payment_Gateway_List;
    JButton SaveButton,BackButton;


    Random IdNumber = new Random();
    int Number = IdNumber.nextInt(999999);


    UserRegistration(){
        getContentPane().setBackground(new Color(208, 189, 244));
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Toll Controller");


        //heading
        JLabel heading = new JLabel("Registration New Vehicle");
        add(heading);
        heading.setBounds(330, 20, 900, 60);
        heading.setFont(new Font("serif", Font.BOLD, 40));
        heading.setForeground(Color.BLACK);


        //VahicleName
        JLabel VahicleName = new JLabel("Vehicle Name:");
        VahicleName.setBounds(30, 100, 200, 20 );
        add(VahicleName);
        VahicleName.setFont(new Font("serif", Font.BOLD, 20));

       /* textFieldVehicleName = new JTextField();
        textFieldVehicleName.setBounds(200, 103, 250,20);
        add(textFieldVehicleName);*/

        String Vehicle_Name[] = {"MotorCycle", "Jep|Car","Mini Bus","Medium Bus","Big Bus","Upay","Trust Axiata Pay (Tap)"};
        textFieldVehicleName = new JComboBox(Vehicle_Name);
        textFieldVehicleName.setBounds(200, 103, 250,20);
        add(textFieldVehicleName);

        //LicenseNumber
        JLabel LicenseNumber = new JLabel("License Number:");
        LicenseNumber.setBounds(30, 130, 200, 20 );
        add(LicenseNumber);
        LicenseNumber.setFont(new Font("serif", Font.BOLD, 20));

        textFieldLicenseNumber = new JTextField();
        textFieldLicenseNumber.setBounds(200, 133, 250,20);
        add(textFieldLicenseNumber);

        //TollFee
        JLabel TollFee = new JLabel("Toll Fee:");
        TollFee.setBounds(30, 160, 200, 20 );
        add(TollFee);
        TollFee.setFont(new Font("serif", Font.BOLD, 20));

        textFieldTollFee = new JTextField();
        textFieldTollFee.setBounds(200, 163, 250,20);
        add(textFieldTollFee);

        //
        JButton tollrate = new JButton("Toll Rate ");
        tollrate.setBounds(460, 163, 120, 22);
        add(tollrate);
        tollrate.setFont(new Font("serif", Font.BOLD, 20));
        tollrate.setBackground(new Color(159,126	,219));
        tollrate.setForeground(Color.WHITE);
        tollrate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TollRate();
                setVisible(false);
            }
        });

        //Password
        JLabel Password = new JLabel("Set Password:");
        Password.setBounds(30, 190, 200, 20 );
        add(Password);
        Password.setFont(new Font("serif", Font.BOLD, 20));

        textFieldPassword = new JTextField();
        textFieldPassword.setBounds(200, 193, 250,20);
        add(textFieldPassword);

        JLabel Payment_Gateway = new JLabel("Payment Gateway:");
        Payment_Gateway.setBounds(30, 220, 200, 20 );
        add(Payment_Gateway);
        Payment_Gateway.setFont(new Font("serif", Font.BOLD, 20));

        String gateway_name[] = {"BKash", "Nogod","Rocket","MCash","SureCash","Upay","Trust Axiata Pay (Tap)"};
        Payment_Gateway_List = new JComboBox(gateway_name);
        Payment_Gateway_List.setBounds(200, 223, 250,20);
        add(Payment_Gateway_List);

        //UserName
        JLabel Account_Number = new JLabel("Account Number:");
        Account_Number.setBounds(30, 250, 200, 20 );
        add(Account_Number);
        Account_Number.setFont(new Font("serif", Font.BOLD, 20));

        textFieldAccount_Number = new JTextField();
        textFieldAccount_Number.setBounds(200, 253, 250,20);
        add(textFieldAccount_Number);

        //pin
        JLabel Account_Pin = new JLabel("Account PIN:");
        Account_Pin.setBounds(30, 280, 200, 20 );
        add(Account_Pin);
        Account_Pin.setFont(new Font("serif", Font.BOLD, 20));

        textFieldAccount_Pin = new JTextField();
        textFieldAccount_Pin.setBounds(200, 283, 250,20);
        add(textFieldAccount_Pin);


        JButton c = new JButton("<BG color>");
        c.setBounds(900, 0, 100, 25);
        c.setFont(new Font("Arial", Font.BOLD, 12));
        c.setBackground(new Color(159,126	,219));
        c.setForeground(Color.white);
        c.addActionListener(e -> {
            Color cc = JColorChooser.showDialog(null, "choose a color", Color.green);
            getContentPane().setBackground(cc);
        });
        add(c);



        //Save Button
        SaveButton = new JButton(" SAVE ");
        SaveButton.setBounds(500, 450, 150, 30);
        add(SaveButton);
        SaveButton.setFont(new Font("serif", Font.BOLD, 20));
        SaveButton.setBackground(new Color(159,126	,219));
        SaveButton.setForeground(Color.WHITE);
        SaveButton.addActionListener(this);                  // action


        //Back Button
        BackButton = new JButton(" BACK ");
        BackButton.setBounds(330, 450, 150, 30);
        add(BackButton);
        BackButton.setFont(new Font("serif", Font.BOLD, 20));
        BackButton.setBackground(new Color(159,126	,219));
        BackButton.setForeground(Color.WHITE);
        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new UserSelectionPage();
                setVisible(false);
            }
        });                // action


        //fream
        setSize(1000, 600);
        setLocation(200, 60);
        setVisible(true);

    }


    @Override
    public void actionPerformed (ActionEvent ae) {
        if(ae.getSource() == SaveButton){
           // String vName = textFieldVehicleName.getText();
            String vName = (String)textFieldVehicleName.getSelectedItem();
            int vLicenseNumber = Integer.parseInt(textFieldLicenseNumber.getText());
            int vTollFee = Integer.parseInt(textFieldTollFee.getText());
            String AccountNumber = textFieldAccount_Number.getText();
            String vPassword = textFieldPassword.getText() ;
            String payment_gateway = (String)Payment_Gateway_List.getSelectedItem();
            int pin= Integer.parseInt(textFieldAccount_Pin.getText());


            try {
                String query="insert into userregistration values ('"+vLicenseNumber+"','"+vName+"', '"+vTollFee+"' ,'"+vPassword+"','"+payment_gateway+"','"+AccountNumber+"','"+pin+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Details added successfully");
                setVisible(false);
               // UserLogin userLogin=
                        new UserLogin();
               // userLogin.setVisible(true);
                setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            setVisible(false);
            //   new AdminPanel();
        }
    }


    public static void main(String args[]) {
        new UserRegistration();

    }

}

