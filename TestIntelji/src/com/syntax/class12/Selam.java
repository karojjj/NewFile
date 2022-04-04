package com.syntax.class12;

public class Selam {
	void merhaba(String name) {
		System.out.println("Merhaba " + name);
	}
	void manytimes(String name) {
		for (int i=0; i<5; i ++) {
			System.out.println("Merhaba "+name+", How are you ?");
		}
	}
 void merhabasayisi(String name, int times) {
	 for (int i=0; i<times; i++) {
		 System.out.println("Merhaba "+name+" you are my fav baby and cat, love you more than anything :)");
	 }
 }
	public static void main(String[] args) {
		
		Selam as = new Selam();
		as.merhaba("Medine");
		as.manytimes("Berfin");
		as.merhabasayisi("Arin", 2);
	}

}
