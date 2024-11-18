package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 以下のタスクを生成
		Task task1 = new Task("2021年10月21日 牛乳を買う。");
		Task task2 = new Task("2021年9月15日 ○○社面談。");
		Task task3 = new Task("2021年12月4日 手帳を買う。");
		Task task4 = new Task("2021年8月10日 散髪に行く。");
		Task task5 = new Task("2021年11月9日 スクールの課題を解く。");

		// リストに格納
		List<String> list = new ArrayList<>();
		list.add(task1.getDate() + ":" + task1.getContent());
		list.add(task2.getDate() + ":" + task2.getContent());
		list.add(task3.getDate() + ":" + task3.getContent());
		list.add(task4.getDate() + ":" + task4.getContent());
		list.add(task5.getDate() + ":" + task5.getContent());

		Collections.sort(list);

		for (String x : list) {
			System.out.println(x);
		}

	}

}
