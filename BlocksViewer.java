import javax.swing.JFrame;
import java.awt.Color;

public class BlocksViewer {
  public static void main(String[] args){
  JFrame frame = new JFrame();
  frame.setSize(10*20, 26*20);
  frame.setTitle("Tetris Snapshot");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setBackground(Color.GRAY);
  }
}
