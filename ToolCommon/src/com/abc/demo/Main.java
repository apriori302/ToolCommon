package com.abc.demo;
 
public class Main {
	public static void main(String[] args) {
		showMessage();
		MessageBox mb = new MessageBox();
		mb.alert();
	}
	public static void showMessage(){
		System.out.println("This Message 1");
		System.out.println("This Message 2");
		System.out.println("This Message 3");
		System.out.println("This Message 4");
	}
}
