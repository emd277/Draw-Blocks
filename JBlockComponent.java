import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

class JBlockComponent extends JComponent{
  int x;
  int y;
  int rotation;
  public JBlockComponent(int newX, int newY, int newRotation){
    this.x = newX;
    this.y = newY;
    this.rotation = newRotation;
  }

  @Override
  protected void paintComponent(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    g2.translate(this.x, this.y);
    g2.rotate(Math.toRadians(this.rotation));
    Rectangle block_t1 = new Rectangle(20, 0, 20, 60);
    Rectangle block_t2 = new Rectangle(0, 40, 20, 20);
    g2.setColor(Color.BLUE);
    g2.fill(block_t1);
    g2.fill(block_t2);
  }
}
