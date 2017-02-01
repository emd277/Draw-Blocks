import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

class TBlockComponent extends JComponent{

  @Override
  protected void paintComponent(Graphics g){
    Graphics2D g2 = (Graphics2D) g;

    Rectangle block_t1 = new Rectangle(0, 0, 60, 20);
    Rectangle block_t2 = new Rectangle(20, 20, 20, 20);
    g2.setColor(Color.MAGENTA);
    g2.fill(block_t1);
    g2.fill(block_t2);
  }
}
