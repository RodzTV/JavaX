import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration_Form extends JFrame implements ActionListener {
    private JTextField firstNameField, middleNameField, lastNameField, emailField, idField;
    private JComboBox<String> genderComboBox, classComboBox;
    private JTextArea infoArea;

    public Registration_Form() {
        setTitle("Class Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new GridLayout(0, 2)); 
        // Gender
        JLabel genderLabel = new JLabel("Gender");
        add(genderLabel);

        String[] genders = {"Male", "Female"};
        genderComboBox = new JComboBox<>(genders);
        add(genderComboBox);

        // Student Name
        JLabel nameLabel = new JLabel("Student Name");
        add(nameLabel);

        firstNameField = new JTextField(10);
        middleNameField = new JTextField(10);
        lastNameField = new JTextField(10);
        add(firstNameField);
        add(middleNameField);
        add(lastNameField);

        // Student Email
        JLabel emailLabel = new JLabel("Student Email");
        add(emailLabel);

        emailField = new JTextField(30);
        add(emailField);

        // Student ID
        JLabel idLabel = new JLabel("Student ID");
        add(idLabel);

        idField = new JTextField(10);
        add(idField);

        // List of Classes
        JLabel classLabel = new JLabel("List of Classes");
        add(classLabel);

        String[] classes = {"English 101", "Mathematics 201"};
        classComboBox = new JComboBox<>(classes);
        add(classComboBox);

        // Register Button
        JButton registerButton = new JButton("Register Class");
        registerButton.addActionListener(this);
        add(registerButton);

        // Info Display Area
        infoArea = new JTextArea();
        JScrollPane infoScroll = new JScrollPane(infoArea);
        add(infoScroll);

        setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Register Class")) {
            String gender = (String) genderComboBox.getSelectedItem();
            String firstName = firstNameField.getText();
            String middleName = middleNameField.getText();
            String lastName = lastNameField.getText();
            String email = emailField.getText();
            String id = idField.getText();
            String selectedClass = (String) classComboBox.getSelectedItem();

            String info = "Gender: " + gender + "\n" +
                    "Name: " + firstName + " " + middleName + " " + lastName + "\n" +
                    "Email: " + email + "\n" +
                    "Student ID: " + id + "\n" +
                    "Class: " + selectedClass;

            infoArea.setText(info);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Registration_Form());
    }
}
