package TicketVendingSystem.IO.GUI;

import TicketVendingSystem.Entrance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 为管理员页面，需要导出始发站和总票数。
 */

public class SSInitialize {

    private JFrame initiateFrame;
    private String departure;//始发站
    private int totalTicket;//存票数量

    /**
     * Launch the application.
     */
    public static void showInitialize() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    SSInitialize window = new SSInitialize();
                    window.initiateFrame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    private SSInitialize() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        initiateFrame = new JFrame();
        initiateFrame.getContentPane().setBackground(new Color(60, 63, 65));
        initiateFrame.setTitle("地铁售票系统初始化");
        initiateFrame.setResizable(false);
        initiateFrame.setBounds(100, 100, 500, 600);
        initiateFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initiateFrame.getContentPane().setLayout(null);

        JPanel uppanel = new JPanel();
        uppanel.setBackground(new Color(0x2b2b2b));
        uppanel.setBounds(10, 35, 464, 50);
        initiateFrame.getContentPane().add(uppanel);
        uppanel.setLayout(null);

        JLabel select = new JLabel("始发站选择");
        select.setForeground(new Color(0xbab8b1));
        select.setFont(new Font("微软雅黑 Light", Font.PLAIN, 16));
        select.setBounds(10, 10, 454, 30);
        uppanel.add(select);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setForeground(new Color(0xbab8b1));
        comboBox.setFont(new Font("微软雅黑 Light", Font.BOLD, 16));
        comboBox.setModel(new DefaultComboBoxModel<>(
                new String[]{
                        "后卫寨", "五路口", "纺织城",
                        "北客站", "钟楼", "航天城",
                        "保税区", "大雁塔", "鱼化寨",
                        "北大街", "通化门", "小寨"
                }
        ));
        comboBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    departure = (String) e.getItem();
                }
            }
        });

        comboBox.setBackground(new Color(0x2b2b2b));
        comboBox.setBounds(10, 95, 464, 28);
        initiateFrame.getContentPane().add(comboBox);

        JPanel downPanel = new JPanel();
        downPanel.setBackground(new Color(0x2b2b2b));
        downPanel.setLayout(null);
        downPanel.setBounds(10, 356, 464, 50);
        initiateFrame.getContentPane().add(downPanel);

        JLabel date = new JLabel("存票数量");
        date.setForeground(new Color(0xbab8b1));
        date.setFont(new Font("微软雅黑 Light", Font.PLAIN, 16));
        date.setBounds(10, 10, 454, 30);
        downPanel.add(date);

        JTextField textField = new JTextField();
        textField.setCaretColor(Color.WHITE);
        textField.setBorder(null);
        textField.setBackground(new Color(0x2b2b2b));
        textField.setForeground(new Color(0xbab8b1));
        textField.setFont(new Font("微软雅黑 Light", Font.PLAIN, 16));
        textField.setText("1000");
        textField.setBounds(10, 416, 464, 28);
        initiateFrame.getContentPane().add(textField);

        JButton button = new JButton("初始化完成");
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                totalTicket = Integer.parseInt(textField.getText());

                Entrance.setTotalTicket(totalTicket);
                Entrance.setDepartureStation(departure);

                SSWelcome.show();

                initiateFrame.setVisible(false);
            }
        });
        button.setBackground(new Color(0x355782));
        button.setFocusable(false);
        button.setFont(new Font("微软雅黑 Light", Font.PLAIN, 12));
        button.setForeground(new Color(0xbab8b1));
        button.setBounds(351, 519, 106, 23);
        initiateFrame.getContentPane().add(button);
    }
}