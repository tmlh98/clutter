import java.awt.BorderLayout;  
import java.awt.Color;  
import java.util.Timer;  
import java.util.TimerTask;  
  
import javax.swing.ImageIcon;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  
import javax.swing.JProgressBar;  
import javax.swing.JRootPane;  
  
public class Test extends JFrame{  
      
    JProgressBar progressBar;  
    int value=0;  
      
    public static void main(String[] args){  
        new Test();  
    }  
      
    public Test(){  
        JPanel contentPanel = new JPanel();  
          
        progressBar = new JProgressBar(0,5);  
          
        ImageIcon image=new ImageIcon("E:\\ͼƬ\\cat\\a1.png");  
          
        JLabel label = new JLabel(image);  
        label.setBounds(0,0,284,177);  
  
        this.getLayeredPane().add(label, Integer.MIN_VALUE);  
          
        contentPanel.setOpaque(false);  
        contentPanel.setLayout(new BorderLayout());  
        setContentPane(contentPanel);  
          
        progressBar.setValue(0);  
        progressBar.setBackground(Color.WHITE);  
        progressBar.setForeground(Color.BLACK);  
          
        contentPanel.add(progressBar,BorderLayout.SOUTH);  
          
        Timer timer = new Timer();  
        timer.schedule(new TimerTask() {  
              
            @Override  
            public void run() {  
                progressBar.setValue(value++);  
                if (progressBar.getValue() >= 5) {  
                    System.exit(0);  
                }  
            }  
        }, 0, 1000);  
          
        this.setUndecorated(true);//���û����ô���װ�Σ����Ϊtrue,��Ϊû����������װ�Σ�ֻ���ڴ��ڲ��ɼ�ʱ���ܵ��ã�������׳��쳣  
        this.setVisible(true);  
        this.getRootPane().setWindowDecorationStyle(JRootPane.NONE);//���ò�ʹ�ô���װ��  
        this.setBounds(400, 300, 284, 177);  
    }  
}  