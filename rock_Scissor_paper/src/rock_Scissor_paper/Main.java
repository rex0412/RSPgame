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

		System.out.println("������������ �����ϼ� : ");

		int userSelect = Scanner.nextInt();

		int comSelect = random.nextInt(3)+1;

        switch (userSelect) {

		case 1:

			if(comSelect == 1) {

				System.out.println("��� : �����");

			}

			if(comSelect == 2) {

				System.out.println("��� : ����");

				comWinCount +=1;

			}

			if(comSelect == 3) {

				System.out.println("��� : �̰���");

				userWinCount += 1;

			}

			break;

		case 2:

			

			break;

		case 3:

			

			break;

		}//����ġ

        

        if(userWinCount == 10) {

        	break;

        }

		}// while ���� �ݺ�

	System.out.println("����ڰ� �̱� Ƚ�� : "+userWinCount);

	System.out.println("��ǻ�Ͱ� �̱� Ƚ�� : "+comWinCount);

		

	}

}
