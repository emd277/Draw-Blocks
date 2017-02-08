import javax.swing.JFrame;
import java.awt.Color;

public class BlocksViewer {
  public static void main(String[] args){
  //sets up the JFrame
  JFrame frame = new JFrame();
  frame.setSize(220, 520);
  frame.setTitle("Tetris Snapshot");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setBackground(Color.GRAY);
  frame.setVisible(true);

  //adds the differnt blocks at the desired locations
  LBlockComponent lBlock1 = new LBlockComponent(0, 420, 0);
  frame.add(lBlock1);
  frame.setVisible(true);
  OBlockComponent oBlock1 = new OBlockComponent(40, 440, 0);
  frame.add(oBlock1);
  frame.setVisible(true);
  JBlockComponent jBlock1 = new JBlockComponent(140, 440, 90);
  frame.add(jBlock1);
  frame.setVisible(true);
  ZBlockComponent zBlock1 = new ZBlockComponent(140, 420, 0);
  frame.add(zBlock1);
  frame.setVisible(true);
  IBlockComponent iBlock1 = new IBlockComponent(180, 400, 0);
  frame.add(iBlock1);
  frame.setVisible(true);
  LBlockComponent lBlock2 = new LBlockComponent(160, 420, 90);
  frame.add(lBlock2);
  frame.setVisible(true);
  SBlockComponent sBlock1 = new SBlockComponent(60, 380, 0);
  frame.add(sBlock1);
  frame.setVisible(true);
  OBlockComponent oBlock2 = new OBlockComponent(20, 400, 0);
  frame.add(oBlock2);
  frame.setVisible(true);
  IBlockComponent iBlock2 = new IBlockComponent(180, 400, 90);
  frame.add(iBlock2);
  frame.setVisible(true);
  TBlockComponent tBlock1 = new TBlockComponent(200, 400, 180);
  frame.add(tBlock1);
  frame.setVisible(true);
  TBlockComponent tBlock2 = new TBlockComponent(100, 340, 90);
  frame.add(tBlock2);
  frame.setVisible(true);
  ZBlockComponent zBlock2 = new ZBlockComponent(160, 340, 90);
  frame.add(zBlock2);
  frame.setVisible(true);
  JBlockComponent jBlock2 = new JBlockComponent(60, 360, 90);
  frame.add(jBlock2);
  frame.setVisible(true);
  SBlockComponent sBlock2 = new SBlockComponent(80, 340, 90);
  frame.add(sBlock2);
  frame.setVisible(true);
  }
}
