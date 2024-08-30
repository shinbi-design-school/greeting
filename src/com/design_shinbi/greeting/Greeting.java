package com.design_shinbi.greeting;

import java.util.Scanner;

public class Greeting {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("誰に挨拶して欲しいですか?");
		System.out.println("[太郎、次郎、三郎、四郎、夏菜子、詩織、彩夏、れに]");
		
		String name = scanner.nextLine();
		
		if(name.equals("太郎")) {
			System.out.println("こんにちは。私の名前は太郎です。");
		}
		else if(name.equals("次郎")) {
			System.out.println("こんにちは。私の名前は次郎です。");
		}
		else if(name.equals("三郎")) {
			System.out.println("こんにちは。私の名前は三郎です。プログラマーで言語はJavaを使っています。");
		}
		else if(name.equals("四郎")) {
			System.out.println("こんにちは。私の名前は四郎です。プログラマーで言語はJavaScriptを使っています。");
		}
		else if(name.equals("夏菜子")) {
			System.out.println("こんにちは。私の名前は夏菜子です。イメージカラーは赤です。");
		}
		else if(name.equals("詩織")) {
			System.out.println("こんにちは。私の名前は詩織です。イメージカラーは黄色です。");
		}
		else if(name.equals("彩夏")) {
			System.out.println("こんにちは。私の名前は彩夏です。イメージカラーはピンクです。");
		}
		else if(name.equals("れに")) {
			System.out.println("こんにちは。私の名前はれにです。イメージカラーは紫です。");
		}
		else {
			System.out.println(name + "さんはここにはいません。");
		}

		scanner.close();
	}
}
