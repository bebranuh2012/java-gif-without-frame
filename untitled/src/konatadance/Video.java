package konatadance;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.net.URL;

public class Video  {
    JFrame frame=new JFrame();

    MouseAdapter m = new MouseAdapter() {
        int y;
        int x;

        public void mousePressed(MouseEvent e) {
            // запоминаем координаты клика
            x = e.getX();
            y = e.getY();
        }

        public void mouseDragged(MouseEvent e) {
            // двигаем окно
            frame.setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
        }
    };
    public Video() {
        URL url = getClass().getClassLoader().getResource("konatadance/konata-dance.gif");
        Icon icon = new ImageIcon(url);
        JLabel gif = new JLabel(icon);
        frame.setUndecorated(true);
        frame.setBounds(10,10,498,299);
        frame.setBackground(new Color(0x0000000, true));
        frame.add(gif);
        frame.addMouseMotionListener(m);
        frame.addMouseListener(m);
        frame.setVisible(true);

    }


}
