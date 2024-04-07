import javax.swing.JPanel;

class SampleForm {
    JPanel panel = new JPanel();

    SampleForm(){
          setTitle("HAHAA");
          this.setVisible(true);
          this.setSize(700, 700);
          
          panel.setVisible(true);
          panel.setSize(700, 700);

          this.add(panel);
    }
     public static void main(String[] args) {
        SampleForm form = new SampleForm();
     }
}