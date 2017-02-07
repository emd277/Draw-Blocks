import javax.swing.JFrame;
import java.awt.Color;

public class BlocksViewer {
  public static void main(String[] args){
  JFrame frame = new JFrame();
  frame.setSize(220, 520);
  frame.setTitle("Tetris Snapshot");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setBackground(Color.GRAY);
  frame.setVisible(true);

  IBlockComponent snapshot = new IBlockComponent(80,80,90);
  frame.add(snapshot);
  frame.setVisible(true);
  IBlockComponent snapshot1 = new IBlockComponent(0, 0, 0);
  frame.add(snapshot1);
  frame.setVisible(true);
  JBlockComponent snapshot2 = new JBlockComponent(80, 100, 0);
  frame.add(snapshot2);
  frame.setVisible(true);
  }
}
