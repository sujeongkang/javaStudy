package common.thread;

public class InterThread implements Runnable {
	//쓰레드와 비슷한 역할을 하는 인터페이스 Runnable
	@Override
	public void run() {
		for(int i=0;i<10;i++) {//대부분 for문 사용. 계속해서 돌아가기 때문
			System.out.println("runnable"+i+"번");
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {//중간 중단
				e.printStackTrace();
			}
		}
		System.out.println("Runnable쓰레드 끝!");
	}

}
