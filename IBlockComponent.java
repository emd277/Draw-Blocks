import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

class IBlockComponent extends JComponent{
  int x;
  int y;
  int rotation;
  public IBlockComponent(int newX, int newY, int newRotation){
    this.x = newX;
    this.y = newY;
    this.rotation = newRotation;
  }

  @Override
  protected void paintComponent(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    g2.translate(this.x, this.y);
    g2.rotate(Math.toRadians(this.rotation));
    Rectangle block_t1 = new Rectangle(0, 0, 20, 80);
    g2.setColor(Color.CYAN);
    g2.fill(block_t1);
  }
}
