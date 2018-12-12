package TicketVendingSystem.IO.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SSPayEnoughTicket {

    private JFrame frame;

    private int inputMoney = 0;
    private static int ticketPrice;
    private static String destination;

    public void set(int ticketPrice, String destination) {
        this.destination = destination;
        this.ticketPrice = ticketPrice;
    }

    /**
     * Launch the application.
     */
    public static void show() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SSPayEnoughTicket window = new SSPayEnoughTicket();
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
    public SSPayEnoughTicket() {
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

        JLabel label_l2 = new JLabel("已投入");
        label_l2.setForeground(new Color(186, 184, 177));
        label_l2.setFont(new Font("微软雅黑 Light", Font.PLAIN, 16));
        label_l2.setBounds(36, 150, 75, 35);
        panel.add(label_l2);

        JLabel label_r2 = new JLabel("0元");
        label_r2.setForeground(Color.WHITE);
        label_r2.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
        label_r2.setBackground(Color.WHITE);
        label_r2.setBounds(106, 150, 70, 35);
        panel.add(label_r2);

        JLabel label_l3 = new JLabel("票价：");
        label_l3.setForeground(new Color(186, 184, 177));
        label_l3.setFont(new Font("微软雅黑 Light", Font.PLAIN, 16));
        label_l3.setBounds(36, 195, 57, 35);
        panel.add(label_l3);

        JLabel label_r3 = new JLabel(ticketPrice + "元");

        label_r3.setForeground(Color.WHITE);
        label_r3.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
        label_r3.setBackground(Color.WHITE);
        label_r3.setBounds(85, 195, 70, 35);
        panel.add(label_r3);

        JLabel label_4 = new JLabel("请投币！本机仅支持1、5、10及20元纸币");
        label_4.setForeground(Color.WHITE);
        label_4.setFont(new Font("微软雅黑 Light", Font.BOLD, 20));
        label_4.setBackground(Color.WHITE);
        label_4.setBounds(36, 283, 425, 42);
        panel.add(label_4);

        JButton button = new JButton("投币");
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFrame newframe = new JFrame();
                newframe.setBounds(200, 300, 300, 200);
                newframe.getContentPane().setBackground(new Color(60, 63, 65));
                newframe.getContentPane().setLayout(null);

                JButton newbutton = new JButton("返回");
                newbutton.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        newframe.setVisible(false);
                    }
                });
                newbutton.setForeground(new Color(186, 184, 177));
                newbutton.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
                newbutton.setFocusable(false);
                newbutton.setBackground(new Color(53, 87, 130));
                newbutton.setBounds(200, 100, 66, 23);
                newframe.getContentPane().add(newbutton);

                JButton newbutton_5 = new JButton("5元");
                newbutton_5.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        inputMoney = inputMoney + 5;
                        label_r2.setText(inputMoney + "元");
                        newframe.setVisible(false);
                    }
                });
                newbutton_5.setForeground(new Color(186, 184, 177));
                newbutton_5.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
                newbutton_5.setFocusable(false);
                newbutton_5.setBackground(new Color(53, 87, 130));
                newbutton_5.setBounds(10, 70, 66, 23);
                newframe.getContentPane().add(newbutton_5);

                JButton newbutton_10 = new JButton("10元");
                newbutton_10.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        inputMoney = inputMoney + 10;
                        label_r2.setText(inputMoney + "元");
                        newframe.setVisible(false);
                    }
                });
                newbutton_10.setForeground(new Color(186, 184, 177));
                newbutton_10.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
                newbutton_10.setFocusable(false);
                newbutton_10.setBackground(new Color(53, 87, 130));
                newbutton_10.setBounds(100, 10, 66, 23);
                newframe.getContentPane().add(newbutton_10);

                JButton newbutton_20 = new JButton("20元");
                newbutton_20.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        inputMoney = inputMoney + 20;
                        label_r2.setText(inputMoney + "元");
                        newframe.setVisible(false);
                    }
                });
                newbutton_20.setForeground(new Color(186, 184, 177));
                newbutton_20.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
                newbutton_20.setFocusable(false);
                newbutton_20.setBackground(new Color(53, 87, 130));
                newbutton_20.setBounds(100, 70, 66, 23);
                newframe.getContentPane().add(newbutton_20);

                JButton newbutton_1 = new JButton("1元");
                newbutton_1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        inputMoney = inputMoney + 1;
                        label_r2.setText(inputMoney + "元");
                        System.out.println(inputMoney);
                        newframe.setVisible(false);
                    }
                });
                newbutton_1.setForeground(new Color(186, 184, 177));
                newbutton_1.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
                newbutton_1.setFocusable(false);
                newbutton_1.setBackground(new Color(53, 87, 130));
                newbutton_1.setBounds(10, 10, 66, 23);
                newframe.getContentPane().add(newbutton_1);

                newframe.setVisible(true);
            }
        });
        button.setForeground(new Color(186, 184, 177));
        button.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
        button.setFocusable(false);
        button.setBackground(Color.DARK_GRAY);
        button.setBounds(10, 467, 106, 23);
        frame.getContentPane().add(button);

        JButton button_1 = new JButton("确定");
        button_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (ticketPrice > inputMoney) {
                    SSPayFail ssPayFail = new SSPayFail();
                    ssPayFail.show();
                    ssPayFail.set(inputMoney, ticketPrice, destination);
                    System.out.println(inputMoney);
                    frame.setVisible(false);
                } else {
                    SSPaySuccessful ssPaySuccessful = new SSPaySuccessful();
                    ssPaySuccessful.show();
                    ssPaySuccessful.set(inputMoney, ticketPrice, destination);
                    System.out.println(inputMoney);
                    frame.setVisible(false);
                }
            }
        });
        button_1.setForeground(new Color(186, 184, 177));
        button_1.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
        button_1.setFocusable(false);
        button_1.setBackground(new Color(53, 87, 130));
        button_1.setBounds(328, 528, 66, 23);
        frame.getContentPane().add(button_1);

        JButton button_2 = new JButton("取消");
        button_2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                SSSelectLine1.show();
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
