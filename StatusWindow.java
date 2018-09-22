import java.awt.*;
import java.applet.*;

/*
<applet code="StatusWindow" width=300 height=200>
</applet> 
*/
public class StatusWindow extends Applet
{
 public void init()
 { 
  setBackground(Color.green);
 }
 public void paint (Graphics g)
 {
  g.drawString("fucled up ",10,30);
  showStatus("THIS FUCVLED UP  " );
 }
}