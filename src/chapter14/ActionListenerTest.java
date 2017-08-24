package chapter14;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerTest {
    JFrame jFrame = new JFrame("使用注解绑定事件");
    @ActionListenerFor(listener = "OkListener")
    JButton  ok = new JButton("确定");
    @ActionListenerFor(listener = "CancelListener")
    JButton cancel = new JButton("取消");

    public static void main(String[] args) throws Exception {
        new ActionListenerTest().init();
    }
    public void init() throws Exception {
        JPanel jPanel= new JPanel();
        jPanel.add(ok);
        jPanel.add(cancel);
        jFrame.add(jPanel);
        ActionListenerInstaller.processAnnotation(this);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
class OkListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"确定");
    }
}
class CancelListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"取消");
    }
}