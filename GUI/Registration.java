import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;


class Registration extends JFrame implements ActionListener{
    JTextField tfFname, tfMname, tfLname, tfBirthYear;
    JFrame frame = new JFrame("Registration");
    JComboBox genderBox, bMonthBox, bDayBox;
    JComboBox coursesBox;
    TextField display;
    JButton Register, Reset;
    String[] courses = {"HIST101","ENGL101","PE101","POGI101","MATH101","CC-TWRITE12"};

    Registration(){
        super("Registration");
        frame.getContentPane().setBackground(Color.white);
        
        JLabel lbFname = new JLabel("<html>Full Name<font color=red>*</html>");
        lbFname.setBounds(20,30,150,30);
        tfFname = new JTextField();
        tfFname.setBounds(20,60,200,30);
        tfFname.setMargin(new Insets(5,5,5,5));
        tfFname.setText("First Name");
        tfFname.setFont(new Font(null,Font.ITALIC,12));
        tfFname.setForeground(Color.LIGHT_GRAY);
        tfFname.setBorder(new LineBorder(Color.BLACK));
        addPadding(tfFname,5,5,5,5);
        tfFname.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                if(tfFname.getText().equals("First Name")){
                    tfFname.setText("");
                    tfFname.setFont(null);
                    tfFname.setForeground(null);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(tfFname.getText().equals("")){
                    tfFname.setText("First Name");
                    tfFname.setFont(new Font(null,Font.ITALIC,15));
                    tfFname.setForeground(Color.LIGHT_GRAY);
                }
            }
        });

        
        tfMname = new JTextField();
        tfMname.setBounds(240,60,200,30);
        tfMname.setMargin(new Insets(5,5,5,5));
        tfMname.setText("Middle Name");
        tfMname.setFont(new Font(null,Font.ITALIC,15));
        tfMname.setForeground(Color.LIGHT_GRAY);
        tfMname.setBorder(new LineBorder(Color.BLACK));
        addPadding(tfMname, 5, 5, 5, 5);
        tfMname.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                if(tfMname.getText().equals("Middle Name")){
                    tfMname.setText("");
                    tfMname.setFont(null);
                    tfMname.setForeground(null);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(tfMname.getText().equals("")){
                    tfMname.setText("Middle Name");
                    tfMname.setFont(new Font(null,Font.ITALIC,15));
                    tfMname.setForeground(Color.LIGHT_GRAY);
                }
            }
        });

        tfLname = new JTextField();
        tfLname.setBounds(460,60,200,30);
        tfLname.setMargin(new Insets(5,5,5,5));
        tfLname.setText("Last Name");
        tfLname.setFont(new Font(null,Font.ITALIC,15));
        tfLname.setForeground(Color.LIGHT_GRAY);
        tfLname.setBorder(new LineBorder(Color.BLACK));
        addPadding(tfLname, 5, 5, 5, 5);
        tfLname.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                if(tfLname.getText().equals("Last Name")){
                    tfLname.setText("");
                    tfLname.setFont(null);
                    tfLname.setForeground(null);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(tfLname.getText().equals("")){
                    tfLname.setText("Last Name");
                    tfLname.setFont(new Font(null,Font.ITALIC,15));
                    tfLname.setForeground(Color.LIGHT_GRAY);
                }
            }
        });

        JLabel lbgender = new JLabel("<html>Gender<font color=red>*</html>");
        lbgender.setBounds(20,90,150,30);
        String[] gender = {"Male", "Female","Others","Prefer not to say"};
        genderBox = new JComboBox<>(gender);
        genderBox.setBounds(20,120,200,30);
        genderBox.setBackground(Color.white);
        genderBox.setOpaque(true);
        genderBox.setEditable(true);
        genderBox.setSelectedItem("<html><i><font color=#D3D3D3>Gender</html>");
        genderBox.setEditable(false);
        genderBox.setBorder(new LineBorder(Color.BLACK));
        genderBox.setFocusable(false);
        addPadding(genderBox, 5, 5, 5, 5);
        genderBox.setMaximumRowCount(4);
        genderBox.setUI(new BasicComboBoxUI(){
            @Override
            protected JButton createArrowButton() {
                JButton btn = new JButton("\u25BC");
                btn.setFont(new Font("Arial", Font.BOLD, 10));
                btn.setForeground(new Color(176, 172, 172));
                btn.setContentAreaFilled(false);
                btn.setFocusPainted(false);
                btn.setBorder(BorderFactory.createEmptyBorder());
                return btn;
            }
        });
        
        

        JLabel lbBday = new JLabel("<html> Birth Date<font color=red>*</html>");
        lbBday.setBounds(240,90,150,30);

        String[] months = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        Integer[] day = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28};
        bMonthBox = new JComboBox<>(months);
        bMonthBox.setBounds(240, 120, 200, 30);
        bMonthBox.setBackground(Color.WHITE);
        bMonthBox.setOpaque(false);
        bMonthBox.setEditable(true);
        bMonthBox.setSelectedItem("<html><i><font color=#D3D3D3> Month</html>");
        bMonthBox.setEditable(false);
        bMonthBox.setFocusable(false);
        bMonthBox.addActionListener(this);
        bMonthBox.setBorder(new LineBorder(Color.BLACK));
        addPadding(bMonthBox, 5, 5, 5, 5);
        bMonthBox.setMaximumRowCount(30);
        bMonthBox.setUI(new BasicComboBoxUI(){
            @Override
            protected JButton createArrowButton() {
                JButton btn = new JButton("\u25BC");
                btn.setFont(new Font("Arial", Font.BOLD, 10));
                btn.setForeground(new Color(176, 172, 172));
                btn.setContentAreaFilled(false);
                btn.setFocusPainted(false);
                btn.setBorder(BorderFactory.createEmptyBorder());
                return btn;
            }
        });
        
        
        bDayBox = new JComboBox<>(day);
        bDayBox.setBounds(460,120,95,30);
        bDayBox.setBackground(Color.white);
        bDayBox.setEditable(true);
        bDayBox.setSelectedItem("<html><i><font color=#D3D3D3> Days</html>");
        bDayBox.setEditable(false);
        bDayBox.setFocusable(false);
        bDayBox.setBorder(new LineBorder(Color.BLACK));
        bDayBox.setMaximumRowCount(31);
        addPadding(bDayBox, 5, 5, 5, 5);
        bDayBox.setUI(new BasicComboBoxUI(){
            @Override
            protected JButton createArrowButton() {
                JButton btn = new JButton("\u25BC");
                btn.setFont(new Font("Arial", Font.BOLD, 10));
                btn.setForeground(new Color(176, 172, 172));
                btn.setContentAreaFilled(false);
                btn.setFocusPainted(false);
                btn.setBorder(BorderFactory.createEmptyBorder());
                return btn;
            }
        });
        

        tfBirthYear = new JTextField();
        tfBirthYear.setBounds(570,120,90,30);
        tfBirthYear.setText("Year");
        tfBirthYear.setFont(new Font(null,Font.ITALIC,12));
        tfBirthYear.setForeground(Color.LIGHT_GRAY);
        tfBirthYear.setMargin(new Insets(5,5,5,5));
        tfBirthYear.setBorder(new LineBorder(Color.BLACK));
        addPadding(tfBirthYear, 5, 5, 5, 5);
        tfBirthYear.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char caracter = e.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    e.consume();
                }
            }
        });
        tfBirthYear.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e) {
                if(tfBirthYear.getText().equals("Year")){
                    tfBirthYear.setText("");
                    tfBirthYear.setFont(null);
                    tfBirthYear.setForeground(null);
                }
            }
            @Override
            public void focusLost(FocusEvent e) {
                if(tfBirthYear.getText().equals("")){
                    tfBirthYear.setText("Year");
                    tfBirthYear.setFont(new Font(null,Font.ITALIC,15));
                    tfBirthYear.setForeground(Color.LIGHT_GRAY);
                }
            }
        });
        
        JLabel jcourse = new JLabel("<html>Course<font color=red>*</html>");
        jcourse.setBounds(20,210,150,30);
        coursesBox =  new JComboBox<>(courses);
        coursesBox.setEditable(true);
        coursesBox.setSelectedItem("<html><i><font color=#D3D3D3>Courses</html>");
        coursesBox.setEditable(false);
        coursesBox.setMaximumRowCount(30);
        coursesBox.setBounds(20,240,200,30);
        coursesBox.setBackground(Color.white);
        coursesBox.setFocusable(false);
        coursesBox.setBorder(new LineBorder(Color.black));
        addPadding(coursesBox, 5, 5, 5, 5);
        coursesBox.setUI(new BasicComboBoxUI(){
            @Override
            protected JButton createArrowButton() {
                JButton btn = new JButton("\u25BC");
                btn.setFont(new Font("Arial", Font.BOLD, 10));
                btn.setForeground(new Color(176, 172, 172));
                btn.setContentAreaFilled(false);
                btn.setFocusPainted(false);
                btn.setBorder(BorderFactory.createEmptyBorder());
                return btn;
            }
        });
        
        
        Register = new JButton("Register");
        Register.setBounds(150,600,150,30);
        Register.setContentAreaFilled(false);
        Register.addActionListener(this);
        Register.setFocusable(false);

        Reset = new JButton("Reset");
        Reset.setBounds(400,600,150,30);
        Reset.setContentAreaFilled(false);
        Reset.setFocusable(false);
        Reset.addActionListener(this);

        

        frame.add(lbFname);
        frame.add(tfFname);
        frame.add(tfMname);
        frame.add(tfLname);
        frame.add(lbgender);
        frame.add(genderBox);
        frame.add(lbBday);
        frame.add(bMonthBox);
        frame.add(bDayBox);
        frame.add(tfBirthYear);
        frame.add(jcourse);
        frame.add(coursesBox);
        frame.add(Register);
        frame.add(Reset);
        frame.setSize(700,800);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    public static void addPadding(JComponent component, int l, int r, int t, int b){
        Border paddingBorder = BorderFactory.createEmptyBorder(l,r,t,b);
        Border compoundBorder = BorderFactory.createCompoundBorder(component.getBorder(), paddingBorder);
        component.setBorder(compoundBorder);
    }
    
    public void actionPerformed(ActionEvent e){
        Object s = bMonthBox.getSelectedItem();
        if(e.getSource() == Register){

        }
        if(e.getSource()== Reset){
            new Registration();
        }
        if(s== "April" || s== "June" || s == "September" ||s == "November"){
            bDayBox.addItem(29);
            bDayBox.addItem(30);
        } else if(s == "January" || s == "March" || s == "May" || s == "July" || s == "August" || s == "October" || s == "December"){
            addPadding(tfMname, 5, 5, 5, 5);
            bDayBox.addItem(29);
            bDayBox.addItem(30);
            bDayBox.addItem(31);
        } else {
            addPadding(tfMname, 5, 5, 5, 5);
            bDayBox.removeItem(29);
            bDayBox.removeItem(30);
            bDayBox.removeItem(31);
        }
    }
    public static void main(String args[]) {
        Registration reg = new Registration();
    }
}
class ColorArrowUI extends BasicComboBoxUI {

    public static ComboBoxUI createUI(JComponent c) {
        return new ColorArrowUI();
    }

    @Override protected JButton createArrowButton() {
        return new BasicArrowButton(
            BasicArrowButton.WEST,
            Color.white, Color.white,
            Color.LIGHT_GRAY, Color.white);
    }
}