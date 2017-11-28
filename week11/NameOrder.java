package week11;

import java.util.Scanner;


public class NameOrder {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str;
		String[] s=new String[10];
		for(int j=0;j<10;j++){
			s[j]=in.nextLine();
		}
		for(int k=0;k<10;k++){
			for(int l=k;l<10;l++){
				if(s[k].compareToIgnoreCase(s[l])>0){
					str=s[k];
					s[k]=s[l];
					s[l]=str;
				}
			}
		}
		for(int j=0;j<10;j++){
			System.out.println(s[j]);
		}
			
		
	}

}
