package com.mejorel.remotecontroller;

public class Television implements Remote{

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("volume up");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("volume down");

		
	}

	@Override
	public void changeChannel() {
		// TODO Auto-generated method stub
		System.out.println("channel change");
		
	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("switch on");
		
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.print("switch off");
	}
	

}
