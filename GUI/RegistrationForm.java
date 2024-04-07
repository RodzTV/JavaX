import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicComboBoxUI;

class RegistrationForm extends JFrame implements ActionListener {
    JPanel mainFrame = new JPanel();
    JComboBox<String> boxGender, boxCourses;
    JTextField tfFName, tfMName, tfLName, tfStudEmail, tfStudID;
    private JTextArea infoArea;
    JLabel gendertxt, nametxt, emailtxt, studentIDtxt, listofclass;

    public RegistrationForm() {
        JLabel welcomeTxt = new JLabel(" Class Registration Form");
        welcomeTxt.setFont(new Font("Amatic SC", Font.PLAIN, 25));
        welcomeTxt.setForeground(new Color(51, 51, 51));
        welcomeTxt.setBounds(30, 20, 300, 30);

        JLabel genderJLabel = new JLabel("GENDER");
        genderJLabel.setFont(new Font("Amtic SC", Font.PLAIN, 12));
        genderJLabel.setForeground(new Color(51, 51, 51));
        genderJLabel.setBounds(30, 50, 620, 30);

        // Add pink border color to boxGender JComboBox
        boxGender = new JComboBox<>(new String[] { " Male", " Female", " LGBTQ" });
        boxGender.setBounds(30, 80, 620, 35);
        boxGender.setBorder(new LineBorder(Color.LIGHT_GRAY));
        boxGender.setFocusable(false);
        boxGender.setFont(new Font("Amatic SC", Font.PLAIN, 12));
        boxGender.setUI(new BasicComboBoxUI() {
            protected JButton createArrowButton() {
                return new JButton() {
                    @Override
                    public int getWidth() {
                        return 0;
                    }

                    @Override
                    public void setFocusable(boolean focusable) {
                        super.setFocusable(false);
                    }
                };
            }
        });

        JLabel nameJLabel = new JLabel(" STUDENT NAME");
        nameJLabel.setFont(new Font("Amtic SC", Font.PLAIN, 12));
        nameJLabel.setForeground(new Color(51, 51, 51));
        nameJLabel.setBounds(30, 135, 620, 30);

        // Add pink border color to JTextFields
        tfFName = new JTextField("  First");
        tfFName.setBounds(30, 160, 160, 35);
        tfFName.setBorder(new LineBorder(Color.LIGHT_GRAY));
        tfFName.setFont(new Font("Amatic SC", Font.PLAIN, 12));

        tfMName = new JTextField("  Middle");
        tfMName.setBounds(220, 160, 160, 35);
        tfMName.setBorder(new LineBorder(Color.LIGHT_GRAY));
        tfMName.setFont(new Font("Amatic SC", Font.PLAIN, 12));

        tfLName = new JTextField(" Last");
        tfLName.setBounds(410, 160, 240, 35);
        tfLName.setBorder(new LineBorder(Color.LIGHT_GRAY));
        tfLName.setFont(new Font("Amatic SC", Font.PLAIN, 12));

        JLabel emailtxt = new JLabel(" STUDENT EMAIL");
        emailtxt.setFont(new Font("Amtic SC", Font.PLAIN, 12));
        emailtxt.setForeground(new Color(51, 51, 51));
        emailtxt.setBounds(30, 215, 620, 30);

        tfStudEmail = new JTextField("  Email Address");
        tfStudEmail.setBounds(30, 240, 620, 35);
        tfStudEmail.setBorder(new LineBorder(Color.LIGHT_GRAY));
        tfStudEmail.setFont(new Font("Amatic SC", Font.PLAIN, 12));

        JLabel studentIDtxt = new JLabel(" STUDENT ID");
        studentIDtxt.setFont(new Font("Amtic SC", Font.PLAIN, 12));
        studentIDtxt.setForeground(new Color(51, 51, 51));
        studentIDtxt.setBounds(30, 295, 620, 30);

        tfStudID = new JTextField("  ID Number");
        tfStudID.setBounds(30, 320, 620, 35);
        tfStudID.setBorder(new LineBorder(Color.LIGHT_GRAY));
        tfStudID.setFont(new Font("Amatic SC", Font.PLAIN, 12));

        // Add pink border color to boxCourses JComboBox
        boxCourses = new JComboBox<>(
                new String[] { "ENGL 101", "HIST101", "COMRPOG12", "TWRITE12", "ENTREP101", "PE 102", "HUM101" });
        boxCourses.setBounds(30, 400, 620, 35);
        boxCourses.setBorder(new LineBorder(Color.LIGHT_GRAY));
        boxCourses.setFocusable(false);
        boxCourses.setFont(new Font("Amatic SC", Font.PLAIN, 12));
        boxCourses.setBackground(Color.white);
        boxCourses.setForeground(new Color(51, 51, 51));

        JLabel listofclass = new JLabel(" LIST OF CLASSES");
        listofclass.setFont(new Font("Amtic SC", Font.PLAIN, 12));
        listofclass.setForeground(new Color(51, 51, 51));
        listofclass.setBounds(30, 375, 620, 30);


        boxCourses.setUI(new BasicComboBoxUI() {
            protected JButton createArrowButton() {
                return new JButton() {
                    @Override
                    public int getWidth() {
                        return 0;
                    }

                    @Override
                    public void setFocusable(boolean focusable) {
                        super.setFocusable(false);
                    }
                };
            }
        });

        // Register Button
        JButton registerButton = new JButton("Register Class");
        registerButton.setBounds(260, 450, 150, 35);
        registerButton.setFont(new Font("Amatic SC", Font.PLAIN, 20));
        registerButton.setFocusable(false);
        registerButton.addActionListener(this);
        registerButton.setForeground(new Color(234, 23, 143));

        // Info Display Area
        infoArea = new JTextArea();
        JScrollPane infoScroll = new JScrollPane(infoArea);
        mainFrame.add(infoScroll);
        infoScroll.setBounds(30, 500, 620, 150);
        infoScroll.setBorder(new LineBorder(Color.LIGHT_GRAY));
        infoScroll.setRequestFocusEnabled(rootPaneCheckingEnabled);
        infoScroll.setFocusable(false);
        
        this.setVisible(true);
        this.setTitle("Registration Form");
        this.setLayout(null);
        this.setSize(700, 750);

        mainFrame.setBackground(new Color(255, 255, 255));
        mainFrame.setLayout(null);
        mainFrame.setSize(700, 750);
        mainFrame.setVisible(true);
        mainFrame.add(welcomeTxt);
        mainFrame.add(boxGender);
        mainFrame.add(tfFName);
        mainFrame.add(tfMName);
        mainFrame.add(tfLName);
        mainFrame.add(tfStudEmail);
        mainFrame.add(tfStudID);
        mainFrame.add(boxCourses);
        mainFrame.add(registerButton);
        mainFrame.add(infoScroll);
        mainFrame.add(genderJLabel);
        mainFrame.add(nameJLabel);
        mainFrame.add(emailtxt);
        mainFrame.add(studentIDtxt);
        mainFrame.add(listofclass);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(mainFrame);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
        if (e.getActionCommand().equals("Register Class")) {
            
            String gender = (String) boxGender.getSelectedItem();
            String FirstName = tfFName.getText();
            String MiddleName = tfMName.getText();
            String LastName = tfLName.getText();
            String EmailAddress = tfStudEmail.getText();
            String Student_ID = tfStudID.getText();
            String List_OF_The_Class = (String) boxCourses.getSelectedItem();

            String info = " GENDER " + ":" + gender + "\n" + " FIRST NAME " + ":" + FirstName +
                    "\n" + " MIDDLE NAME" + ":" + MiddleName + "\n" + " LAST NAME " + ":" +LastName + "\n" +
                    " EMAIL ADDRESS " + ":" + EmailAddress + "\n" + " STUDENT ID " + ":" + Student_ID +"\n"+
                    " List Of The Class " + List_OF_The_Class;

            // Validation for empty fields and invalid email addresses
            System.out.println(info);
            infoArea.setText(info);
        }
    }

    public static void main(String[] args) {
        RegistrationForm registrationForm = new RegistrationForm();
    }
}