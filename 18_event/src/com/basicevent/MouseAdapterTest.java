package com.basicevent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MouseAdapterTest extends MouseAdapter{//���콺�����ʸ� ����Ʈ������ �� ������ ����
		private JTextField text;
		private JPanel p;
		public MouseAdapterTest(JTextField text,JPanel p) {//�ٸ� Ŭ������ ������Ҹ� �Ű������� �ҷ���.
			this.text=text;
			this.p=p;
		}
		
		
	@Override //�ʿ��� �͸� ���� ����
	public void mouseClicked(MouseEvent e) {
		System.out.println("�̺�Ʈ!�߻�!! ȣȣ!!");
		JButton btn=(JButton)e.getSource();
		text.setText("�ȳ�"+btn.getText());
		JLabel label=new JLabel("�̰� �ܺο��� �߰��� ����");
		p.add(label);
		p.revalidate();//validate(), repaint();//��������� �ٽ� �׷���.
		//��µ��ִ� �����̳ʸ� ���������� �����������.
		
	}
	
	
	
}
