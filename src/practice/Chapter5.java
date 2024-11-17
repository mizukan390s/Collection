package practice;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class Chapter5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Task task = new Task();
		Map<LocalDate, String> tm = new TreeMap<>();

		for (int i = 0; i < task.ld.length; i++) {
			tm.put(task.ld[i], task.task[i]);
		}

		for (Map.Entry<LocalDate, String> x : tm.entrySet()) {
			System.out.println(x.getKey() + ":" + x.getValue());
		}

	}

}
