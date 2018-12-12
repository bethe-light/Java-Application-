package TicketVendingSystem.IO.GUI;

import TicketVendingSystem.Database.DataAPI;
import TicketVendingSystem.Entrance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SSSelectLine2 extends SSSelectLine {

    private JFrame SSSelect2;

    /**
     * Launch the application.
     */
    public static void show() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SSSelectLine2 window = new SSSelectLine2();
                    window.SSSelect2.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public SSSelectLine2() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        SSSelect2 = new JFrame();
        SSSelect2.setBounds(100, 100, 500, 600);
        SSSelect2.getContentPane().setBackground(new Color(60, 63, 65));
        SSSelect2.setTitle("地铁售票系统");
        SSSelect2.setResizable(false);
        SSSelect2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SSSelect2.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(43, 43, 43));
        panel.setBounds(10, 10, 464, 37);
        SSSelect2.getContentPane().add(panel);

        JLabel label = new JLabel("2号线");
        label.setForeground(new Color(186, 184, 177));
        label.setFont(new Font("微软雅黑 Light", Font.PLAIN, 16));
        label.setBounds(10, 10, 454, 17);
        panel.add(label);

        JButton button_1 = new JButton("北客站");
        button_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                destination = "北客站";

                if (Entrance.getTotalTicket() > 0) {
                    SSPayEnoughTicket ssPayEnoughTicket = new SSPayEnoughTicket();
                    ssPayEnoughTicket.show();
                    Entrance.setDestination(destination);
                    setPrice(DataAPI.returnPrice(Entrance.getDepartureStation(), Entrance.getDestination()));
                    ssPayEnoughTicket.set(price, destination);
                } else
                    SSInsufficientTicket.show();

                SSSelect2.setVisible(false);
            }
        });
        button_1.setForeground(new Color(186, 184, 177));
        button_1.setFont(new Font("微软雅黑 Light", Font.PLAIN, 16));
        button_1.setBackground(new Color(43, 43, 43));
        button_1.setBounds(10, 57, 464, 50);
        button_1.setFocusable(false);
        button_1.setBorder(null);
        SSSelect2.getContentPane().add(button_1);

        JButton button_2 = new JButton("北大街（可转1号线）");
        button_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                destination = "北大街";

                if (Entrance.getTotalTicket() > 0) {
                    SSPayEnoughTicket ssPayEnoughTicket = new SSPayEnoughTicket();
                    ssPayEnoughTicket.show();
                    Entrance.setDestination(destination);
                    setPrice(DataAPI.returnPrice(Entrance.getDepartureStation(), Entrance.getDestination()));
                    ssPayEnoughTicket.set(price, destination);
                } else
                    SSInsufficientTicket.show();

                SSSelect2.setVisible(false);
            }
        });
        button_2.setForeground(new Color(186, 184, 177));
        button_2.setFont(new Font("微软雅黑 Light", Font.PLAIN, 16));
        button_2.setFocusable(false);
        button_2.setBorder(null);
        button_2.setBackground(new Color(43, 43, 43));
        button_2.setBounds(10, 117, 464, 50);
        SSSelect2.getContentPane().add(button_2);

        JButton button_3 = new JButton("钟楼");
        button_3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                destination = "钟楼";

                if (Entrance.getTotalTicket() > 0) {
                    SSPayEnoughTicket ssPayEnoughTicket = new SSPayEnoughTicket();
                    ssPayEnoughTicket.show();
                    Entrance.setDestination(destination);
                    setPrice(DataAPI.returnPrice(Entrance.getDepartureStation(), Entrance.getDestination()));
                    ssPayEnoughTicket.set(price, destination);
                } else
                    SSInsufficientTicket.show();

                SSSelect2.setVisible(false);
            }
        });
        button_3.setForeground(new Color(186, 184, 177));
        button_3.setFont(new Font("微软雅黑 Light", Font.PLAIN, 16));
        button_3.setFocusable(false);
        button_3.setBorder(null);
        button_3.setBackground(new Color(43, 43, 43));
        button_3.setBounds(10, 177, 464, 50);
        SSSelect2.getContentPane().add(button_3);

        JButton button_4 = new JButton("小寨（可转3号线）");
        button_4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                destination = "小寨";

                if (Entrance.getTotalTicket() > 0) {
                    SSPayEnoughTicket ssPayEnoughTicket = new SSPayEnoughTicket();
                    ssPayEnoughTicket.show();
                    Entrance.setDestination(destination);
                    setPrice(DataAPI.returnPrice(Entrance.getDepartureStation(), Entrance.getDestination()));
                    ssPayEnoughTicket.set(price, destination);
                } else
                    SSInsufficientTicket.show();

                SSSelect2.setVisible(false);
            }
        });
        button_4.setForeground(new Color(186, 184, 177));
        button_4.setFont(new Font("微软雅黑 Light", Font.PLAIN, 16));
        button_4.setFocusable(false);
        button_4.setBorder(null);
        button_4.setBackground(new Color(43, 43, 43));
        button_4.setBounds(10, 237, 464, 50);
        SSSelect2.getContentPane().add(button_4);

        JButton button_5 = new JButton("航天城");
        button_5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                destination = "航天城";

                if (Entrance.getTotalTicket() > 0) {
                    SSPayEnoughTicket ssPayEnoughTicket = new SSPayEnoughTicket();
                    ssPayEnoughTicket.show();
                    Entrance.setDestination(destination);
                    setPrice(DataAPI.returnPrice(Entrance.getDepartureStation(), Entrance.getDestination()));
                    ssPayEnoughTicket.set(price, destination);
                } else
                    SSInsufficientTicket.show();

                SSSelect2.setVisible(false);
            }
        });
        button_5.setForeground(new Color(186, 184, 177));
        button_5.setFont(new Font("微软雅黑 Light", Font.PLAIN, 16));
        button_5.setFocusable(false);
        button_5.setBorder(null);
        button_5.setBackground(new Color(43, 43, 43));
        button_5.setBounds(10, 297, 464, 50);
        SSSelect2.getContentPane().add(button_5);

        JButton button_6 = new JButton("1号线");
        button_6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SSSelectLine1.show();
                SSSelect2.setVisible(false);
            }
        });
        button_6.setForeground(new Color(186, 184, 177));
        button_6.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
        button_6.setFocusable(false);
        button_6.setBackground(new Color(53, 87, 130));
        button_6.setBounds(10, 528, 106, 23);
        SSSelect2.getContentPane().add(button_6);

        JButton button_7 = new JButton("3号线");
        button_7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SSSelectLine3.show();
                SSSelect2.setVisible(false);
            }
        });
        button_7.setForeground(new Color(186, 184, 177));
        button_7.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
        button_7.setFocusable(false);
        button_7.setBackground(new Color(53, 87, 130));
        button_7.setBounds(368, 528, 106, 23);
        SSSelect2.getContentPane().add(button_7);
    }
}