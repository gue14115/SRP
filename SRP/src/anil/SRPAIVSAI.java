package anil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class SRPAIVSAI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char compPlay1=0;
		char compPlay2=0;
		int compScore1=0;
		int compScore2=0;
		Random r1 = new Random();
		Random r2 = new Random();
		for (int i = 0; i < 10; i++) {
			switch (r1.nextInt(3)) {
			case 0:
				compPlay1 = 's';
				break;
			case 1:
				compPlay1 = 'r';
				break;
			case 2:
				compPlay1 = 'p';
				break;
			}
			switch (r2.nextInt(3)) {
			case 0:
				compPlay2 = 's';
				break;
			case 1:
				compPlay2 = 'r';
				break;
			case 2:
				compPlay2 = 'p';
				break;
			}
			
			switch(compPlay1){
			case 's': 
				switch(compPlay2){
				case 's': break;
				case 'r': compScore2+=1; break;
				case 'p': compScore1+=1; break;
				}
				break;
			case 'r': 
				switch(compPlay2){
				case 's': compScore1+=1; break;
				case 'r': break;
				case 'p': compScore2+=1 ;break;
				}
				break;
			case 'p': 
				switch(compPlay2){
				case 's': compScore2+=1; break;
				case 'r': compScore1+=1; break;
				case 'p': break;
				}
				break;
			}	
		}
		System.out.println("Comp1:"+compScore1+"\nComp2:"+compScore2);
	}

}
