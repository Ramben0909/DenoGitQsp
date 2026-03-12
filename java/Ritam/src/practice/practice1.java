package practice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class practice1{
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Pattern pattern = Pattern.compile(input);
		Matcher matcher =  pattern.matcher(input);
		System.out.println("The ans is "+matcher.matches());
		sc.close();
	}
}