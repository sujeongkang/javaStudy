package com.bible.ch6.object;

class Tv {//Tv�� ����� ���� ���赵
	//Tv�� �Ӽ�(�������)
	String color;  //����
	boolean power; //��������
	int channel; //ä��
	//Tv�� ���(�޼���)
	void power() {power=!power;} /* TV�� �Ѱų� ���� ����� �ϴ� �޼��� */
	void channelUP() {++channel;}/* TV�� ä�� �� ���̴� ����� �ϴ� �޼� �� */
	void channelDown() {--channel;} /* TV��l ä���� ���ߴ� ����� �ϴ� �޼��� */
	
}