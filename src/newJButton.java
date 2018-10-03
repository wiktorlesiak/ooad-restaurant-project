import javax.swing.*;

public class newJButton extends JButton implements CommSet {
        private Executor btnExecutor;
        private JFrame frame;

  public newJButton(String name, JFrame fr) {
     super(name);
     frame = fr;
  }
  public void setCommand(Executor comd) {
      btnExecutor = comd;
   }
   public Executor getCommand() {
      return btnExecutor;
   }


}
