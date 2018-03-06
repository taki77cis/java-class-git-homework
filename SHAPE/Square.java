
import java.awt.*;
import java.awt.geom.GeneralPath;

public class Square extends CanvasShape{

public Square(int topLeftX, int topLeftY, int width, int height) {
    super(topLeftX, topLeftY, width, height);
  }
  
  public void render(Graphics2D graphics) {
    graphics.setColor(Color.WHITE);
GeneralPath path = new GeneralPath();
    path.moveTo(getTopLeftX() , getTopLeftY()); 
    path.lineTo(getTopLeftX() + getWidth(), getTopLeftY()); // bottom right
    path.lineTo(getTopLeftX()+ getWidth(), getTopLeftY() + getHeight());
    path.lineTo(getTopLeftX() , getTopLeftY() + getHeight());
    path.lineTo(getTopLeftX(), getTopLeftY());
    path.closePath();
    graphics.fill(path);
  }
}
