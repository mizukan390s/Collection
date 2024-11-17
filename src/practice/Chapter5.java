package practice;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class Chapter5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Task tasks = new Task();
		Map<LocalDate, String> map = new TreeMap<>();

		for (int i = 0; i < tasks.date.length; i++) {
			map.put(tasks.date[i], tasks.content[i]);
		}

		for (Map.Entry<LocalDate, String> task : map.entrySet()) {
			System.out.println(task.getKey() + ":" + task.getValue());
		}

	}

}
