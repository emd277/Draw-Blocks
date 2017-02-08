import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Color;

class OBlockComponent extends JComponent{
  int x;
  int y;
  int rotation;
  public OBlockComponent(int newX, int newY, int newRotation){
    this.x = newX;
    this.y = newY;
    this.rotation = newRotation;
  }

  @Override
  protected void paintComponent(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    //moves the origin to the input coordinates
    g2.translate(this.x, this.y);
    // Draws the block then colors it Yellow
    Rectangle block_t1 = new Rectangle(0, 0, 40, 40);
    g2.setColor(Color.YELLOW);
    g2.fill(block_t1);
  }
}
