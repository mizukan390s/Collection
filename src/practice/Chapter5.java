package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Task task1 = new Task(LocalDate.of(2021, 10, 21), "牛乳を買う。");
		Task task2 = new Task(LocalDate.of(2021, 9, 15), "○○社面談。");
		Task task3 = new Task(LocalDate.of(2021, 12, 4), "手帳を買う。");
		Task task4 = new Task(LocalDate.of(2021, 8, 10), "散髪に行く。");
		Task task5 = new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く。");

		List<Task> list = new ArrayList<>();
		list.add(task1);
		list.add(task2);
		list.add(task3);
		list.add(task4);
		list.add(task5);

		Collections.sort(list, new TaskComp());

		for (Task x : list) {
			System.out.println(x.getDate() + ":" + x.getContent());
		}

	}

}
