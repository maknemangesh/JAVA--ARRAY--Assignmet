//  Write a program to count number of words in a string


import java.io.*;
class countDemo{
	public static void main(String []args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		String str=br.readLine();
		int count=0;
		char arr[]=new char[str.length()];
		System.out.println("Enter the no.of Characters");
		for(int i=0;i<str.length();i++){
			arr[i]=str.charAt(i);
			count++;
		}
		System.out.println(count);
	}
}

	
