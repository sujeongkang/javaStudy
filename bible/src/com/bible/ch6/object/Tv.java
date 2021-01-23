package com.bible.ch6.object;

class Tv {//Tv를 만들기 위한 설계도
	//Tv의 속성(멤버변수)
	String color;  //색상
	boolean power; //전원상태
	int channel; //채널
	//Tv의 기능(메서드)
	void power() {power=!power;} /* TV를 켜거나 끄는 기능을 하는 메서드 */
	void channelUP() {++channel;}/* TV의 채널 을 높이는 기능을 하는 메서 드 */
	void channelDown() {--channel;} /* TV으l 채널을 낮추는 기능을 하는 메서드 */
	
}