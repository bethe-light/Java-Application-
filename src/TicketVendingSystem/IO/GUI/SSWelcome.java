package TicketVendingSystem.IO.GUI;

import TicketVendingSystem.Entrance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SSWelcome {

    private JFrame SSWelcome;

    /**
     * Launch the application.
     */

    public static void show() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SSWelcome window = new SSWelcome();
                    window.SSWelcome.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public SSWelcome() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */

    private void initialize() {
        System.out.println(Entrance.getDepartureStation() + Entrance.getTotalTicket());

        SSWelcome = new JFrame();
        SSWelcome.getContentPane().setBackground(new Color(60, 63, 65));
        SSWelcome.getContentPane().setLayout(null);
        SSWelcome.setTitle("地铁售票系统");
        SSWelcome.setBounds(100, 100, 800, 500);
        SSWelcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0x2b2b2b));
        panel.setBounds(10, 10, 764, 188);
        SSWelcome.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel label = new JLabel("西安地铁欢迎您");
        label.setForeground(new Color(0xbab8b1));
        label.setFont(new Font("微软雅黑 Light", Font.PLAIN, 80));
        label.setBounds(102, 10, 560, 168);
        panel.add(label);

        JButton button = new JButton("点击购票");
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SSSelectLine1 select1 = new SSSelectLine1();
                select1.show();
                SSWelcome.setVisible(false);
            }
        });
        button.setBackground(new Color(60, 63, 65));
        button.setFocusable(false);
        button.setBorder(null);
        button.setForeground(new Color(0xbab8b1));
        button.setFont(new Font("微软雅黑 Light", Font.PLAIN, 20));
        button.setBounds(10, 208, 764, 243);
        SSWelcome.getContentPane().add(button);
    }

}

