package common.thread;

public class InterThread implements Runnable {
	//������� ����� ������ �ϴ� �������̽� Runnable
	@Override
	public void run() {
		for(int i=0;i<10;i++) {//��κ� for�� ���. ����ؼ� ���ư��� ����
			System.out.println("runnable"+i+"��");
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {//�߰� �ߴ�
				e.printStackTrace();
			}
		}
		System.out.println("Runnable������ ��!");
	}

}
