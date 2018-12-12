package TicketVendingSystem.IO.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SSInsufficientTicket {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void show() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SSInsufficientTicket window = new SSInsufficientTicket();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public SSInsufficientTicket() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 600);
        frame.getContentPane().setBackground(new Color(60,63,65));
        frame.setTitle("地铁售票系统");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(43, 43, 43));
        panel.setBounds(10, 20, 464, 419);
        frame.getContentPane().add(panel);

        JLabel label_l1 = new JLabel("您确定选择：");
        label_l1.setForeground(new Color(186, 184, 177));
        label_l1.setFont(new Font("微软雅黑 Light", Font.PLAIN, 16));
        label_l1.setBounds(36, 56, 109, 35);
        panel.add(label_l1);

        JLabel label_r1 = new JLabel("航天城");
        label_r1.setBackground(Color.WHITE);
        label_r1.setForeground(Color.WHITE);
        label_r1.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
        label_r1.setBounds(133, 54, 70, 35);
        panel.add(label_r1);


        JLabel label_3 = new JLabel("票已售完");
        label_3.setForeground(Color.RED);
        label_3.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
        label_3.setBounds(36, 195, 167, 35);
        panel.add(label_3);

        JButton button_2 = new JButton("取消");
        button_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SSWelcome.show();
                frame.setVisible(false);
            }
        });
        button_2.setForeground(Color.BLACK);
        button_2.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
        button_2.setFocusable(false);
        button_2.setBackground(new Color(186, 59, 55));
        button_2.setBounds(408, 528, 66, 23);
        frame.getContentPane().add(button_2);
    }

}
