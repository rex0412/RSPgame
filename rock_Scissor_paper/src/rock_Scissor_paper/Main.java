package rock_Scissor_paper;

import java.util.Random;
import java.util.Scanner;

 

public class Main {

	static int userWinCount = 0;

    static int comWinCount = 0;

public static void main(String[] args) {

	

	Scanner Scanner = new Scanner(System.in);

	Random random = new Random();

	

	while (true) {

		System.out.println("가위바위보를 선택하셈 : ");

		int userSelect = Scanner.nextInt();

		int comSelect = random.nextInt(3)+1;

        switch (userSelect) {

		case 1:

			if(comSelect == 1) {

				System.out.println("결과 : 비겼음");

			}

			if(comSelect == 2) {

				System.out.println("결과 : 졌음");

				comWinCount +=1;

			}

			if(comSelect == 3) {

				System.out.println("결과 : 이겼음");

				userWinCount += 1;

			}

			break;

		case 2:

			

			break;

		case 3:

			

			break;

		}//스위치

        

        if(userWinCount == 10) {

        	break;

        }

		}// while 무한 반복

	System.out.println("사용자가 이긴 횟수 : "+userWinCount);

	System.out.println("컴퓨터가 이긴 횟수 : "+comWinCount);

		

	}

}
