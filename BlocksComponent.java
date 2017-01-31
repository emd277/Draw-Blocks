class BlocksComponent extends JComponent{

  @override
  protected void paintComponent(Graphics g){
    Grapics2D g2 = (Graphics2D) g;

    Rectangle block_t1 = new Rectangle(20, 0, 80, 20);
    Rectangle block_t2 = new Rectangle(0, 20, 60, 20);
    
    g2.fill(block_t1);
    g2.fill(block_t2);
  }

}
