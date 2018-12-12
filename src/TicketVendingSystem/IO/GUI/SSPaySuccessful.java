package TicketVendingSystem.IO.GUI;

import TicketVendingSystem.Entrance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SSPaySuccessful {

    private JFrame frame;

    private static int ticketPrice = 2;
    private static int inputMoney = 0;
    private static String destination;
    public void set(int inputMoney, int ticketPrice, String destination){
        this.inputMoney = inputMoney;
        this.ticketPrice = ticketPrice;
        this.destination = destination;
    }

    public void addtoubi(int i) {
        inputMoney = inputMoney + i;
        System.out.println(inputMoney);
    }

    private int change = inputMoney - ticketPrice;

    /**
     * Launch the application.
     */
    public static void show() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SSPaySuccessful window = new SSPaySuccessful();
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
    public SSPaySuccessful() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 500, 600);
        frame.getContentPane().setBackground(new Color(60, 63, 65));
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

        JLabel label_r1 = new JLabel(destination);
        label_r1.setBackground(Color.WHITE);
        label_r1.setForeground(Color.WHITE);
        label_r1.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
        label_r1.setBounds(133, 54, 70, 35);
        panel.add(label_r1);

        JLabel label_l2 = new JLabel("票价：");
        label_l2.setForeground(new Color(186, 184, 177));
        label_l2.setFont(new Font("微软雅黑 Light", Font.PLAIN, 16));
        label_l2.setBounds(36, 115, 57, 35);
        panel.add(label_l2);

        JLabel label_r2 = new JLabel(ticketPrice + "元");
        label_r2.setForeground(Color.WHITE);
        label_r2.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
        label_r2.setBackground(Color.WHITE);
        label_r2.setBounds(85, 115, 70, 35);
        panel.add(label_r2);

        JLabel label_l3 = new JLabel("已投入");
        label_l3.setForeground(new Color(186, 184, 177));
        label_l3.setFont(new Font("微软雅黑 Light", Font.PLAIN, 16));
        label_l3.setBounds(36, 178, 75, 35);
        panel.add(label_l3);

        JLabel label_r3 = new JLabel(inputMoney + "元");
        label_r3.setForeground(Color.WHITE);
        label_r3.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
        label_r3.setBackground(Color.WHITE);
        label_r3.setBounds(106, 176, 70, 35);
        panel.add(label_r3);

        JLabel label_l4 = new JLabel("找零：");
        label_l4.setForeground(new Color(186, 184, 177));
        label_l4.setFont(new Font("微软雅黑 Light", Font.PLAIN, 16));
        label_l4.setBounds(36, 238, 75, 35);
        panel.add(label_l4);

        JLabel label_r4 = new JLabel(change + "元");
        label_r4.setForeground(Color.WHITE);
        label_r4.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
        label_r4.setBackground(Color.WHITE);
        label_r4.setBounds(106, 236, 70, 35);
        panel.add(label_r4);

        JLabel label_5 = new JLabel("出票成功！请收好您的车票与零钱！");
        label_5.setForeground(Color.WHITE);
        label_5.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
        label_5.setBackground(Color.WHITE);
        label_5.setBounds(36, 283, 425, 42);
        panel.add(label_5);


        JButton button = new JButton("退出");
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Entrance.decreaseTotalTicket();
                SSWelcome.show();
                frame.setVisible(false);
            }
        });
        button.setBounds(10, 449, 464, 102);
        frame.getContentPane().add(button);
        button.setForeground(new Color(186, 184, 177));
        button.setFont(new Font("微软雅黑 Light", Font.PLAIN, 20));
        button.setFocusable(false);
        button.setBorder(null);
        button.setBackground(new Color(60, 63, 65));
    }

}