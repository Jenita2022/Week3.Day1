package org.system;

public class Desktop extends Computer{
	public void desktopsize() {
		System.out.println("Desktop size height width");
	}

	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.desktopsize();
		desk.computerModel();

	}

}
