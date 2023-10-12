package practice;

public class PracticeSwitch {

	public static void main(String[] args) {
		
		int[] jobCode = { 1, 2, 4, 1, 5, 5, 2, 1, 3, 1 };

		for (int i = 0; i < 10; i++) {

			switch (jobCode[i]) {
			case 1:
				System.out.println(jobCode[i] + "：勇者");
			break;
			case 2:
				System.out.println(jobCode[i] + "：バトルマスター");
			break;
			case 3:
				System.out.println(jobCode[i] + "：パラディン");
			break;
			case 4:
				System.out.println(jobCode[i] + "：海賊");
			break;
			case 5:
				System.out.println(jobCode[i] + "：魔法剣士");
			break;
			}
		}
	}

}
