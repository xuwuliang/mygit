package edu.test1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;
public class App {
	private static String path = "a.txt";
    public static void main(String[] args) throws IOException {
    	Scanner input=new Scanner(System.in);
    	File file = new File(path);
		FileInputStream in = new FileInputStream(file);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String account=br.readLine();
		String password=br.readLine();
		br.close();
		in.close();
		System.out.println("请输入账号:");
		String a = input.nextLine();
		System.out.println("请输入密码:");
		String p = input.nextLine();
    //	System.out.println(sha256hex("123456"));
		if(a.equals(account)&&password.equals(sha256hex(p))) {
			System.out.println("登录成功");
		}else {
			System.out.println("账号或密码错误");
		}
    }
    public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }
}
