package exploit;

import java.util.Scanner;

public class KeithLikesToTroll2 {
	public static void main2(String[] args){
		int key;
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter key: ");
		key = scn.nextInt();
		scn.close();
		
		if(24.0 / key * key != 24.0 && key > 0){
			System.out.println("Login succesful. The flag is the smallest key which will let you log in.");
		}else{
			System.out.println("Login rejected.");
		}
	}
}
