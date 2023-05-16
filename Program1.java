// Write a program to reverse a String without using reverse().

import java.io.*;

class reverseDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str = br.readLine();
		char arr[]=new char[str.length()];
		for(int i=0;i<str.length();i++){
			arr[i]=str.charAt(i);
		}
		int a=arr.length-1;
		char arr2[]=new char[arr.length];
		int n=0;
		for(int i=a;i>=0;i--){
			arr2[n]=arr[i];
			n++;
		}
		String str2=new String(arr2);
		System.out.println(str2);
	}
}

