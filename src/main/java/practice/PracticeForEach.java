package practice;

public class PracticeForEach {

	public static void main(String[] args) {

		String[] employeeNames = {
				"田原", "福尾", "倉成", "濱野", "前村", "重永", "富田", "本間", "小野田", "阿部"
		};

		for (String name : employeeNames) {
			System.out.println(name);
		}

	}
}