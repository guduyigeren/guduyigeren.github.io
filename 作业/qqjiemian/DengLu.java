import javax.swing.*;
public class DengLu extends JFrame{
	public DengLu(){
		this.setLayout(null);
		JLabel jlabel = new JLabel();
		jlabel.setText("QQ");
		jlabel.setBounds(120, 0, 100, 100);
		this.add(jlabel);
		
		JButton jbutton = new JButton();
		jbutton.setText("��¼");
		jbutton.setBounds(50, 180, 150, 30);
		this.add(jbutton);
		
		JTextArea jtextarea = new JTextArea();
		jtextarea.setText("");
		jtextarea.setBounds(30, 80, 200, 30);
		this.add(jtextarea);

		JLabel jlabel2 = new JLabel();
		jlabel2.setText("ע���˺�");
		jlabel2.setBounds(240,80,100,35);
		this.add(jlabel2);

		JTextArea jTextarea = new JTextArea();
		jTextarea.setText("����");
		jTextarea.setBounds( 30, 130, 200, 30);
		this.add(jTextarea);

		JLabel jlabel3 = new JLabel();
		jlabel3.setText("�һ�����");
		jlabel3.setBounds(240,130,100,35);
		this.add(jlabel3);
		
		this.setBounds(100,100,400,400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new DengLu();
	}

}
