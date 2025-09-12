package Day15;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MyFrame extends Frame implements MouseListener{



     public static void main(String[] args) {
        MyFrame f = new MyFrame();
        f.setTitle("frame");
        f.setSize(400,500);
        f.setVisible(true);
        f.setBackground(Color.GREEN);
        f.setLayout(null);


        Button bt = new Button("Test");
        bt.setBounds(50, 50, 100, 30);
        bt.setVisible(true);
        f.add(bt);

        bt.addMouseListener(f);
        
    }

     @Override
     public void mouseClicked(MouseEvent e) {
        System.out.println("Hi");
        // TODO Auto-generated method stub
      //  throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
     }

     @Override
     public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
      //  throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
     }

     @Override
     public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
     }

     @Override
     public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
     }

     @Override
     public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
      //  throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
     }

}
class Driver{
   
}
