package com.mejorel.remotecontroller;

public class TvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remote remote=new Television();
		remote.changeChannel();
		remote.volumeUp();
		remote.volumeDown();
		remote.switchOn();
		remote.switchOff();
		
	}

}
