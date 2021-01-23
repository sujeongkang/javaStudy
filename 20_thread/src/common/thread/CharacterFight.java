package common.thread;


import com.thread.model.vo.Character;

public class CharacterFight extends Thread {
	
	private Character ch;
	
	public CharacterFight(Character ch) {
		super();
		this.ch=ch;
	}
	
	

	@Override
	public void run() {
		while(true) {
			int attack=(int)(Math.random()*30)+1;
			ch.setHp(ch.getHp()-attack);
			System.out.println(ch.getName()+"���� ������ �޾ҽ��ϴ�.");
			System.out.println(ch.getName()+"ü���� "+attack+"��ŭ �����Ͽ����ϴ�.");
			System.out.println(ch.getName()+"�� ü���� "+ch.getHp()+"����");
			if(ch.getHp()<0) {
				System.out.println(ch.getName()+"���� �����Ͽ����ϴ�!");
				break;
			}
			System.out.println(ch.getName()+"�� ü���� "+ch.getHp()+"����");
			try {
				sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
