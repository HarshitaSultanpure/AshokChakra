import java.awt.*;
class FDemo extends Frame 
{
FDemo()
{
}
public void paint(Graphics g)
{      
int i,sa=0,ma=5;
for(i=1;i<=24;i++)
{
	g.fillArc(100,100,200,200,sa,ma);
	sa=sa+15;
}
}

}
class Ashokchakra
{
	public static void main(String ar[])
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(400,400);
        f.setBackground(Color.GRAY);		
	}
}