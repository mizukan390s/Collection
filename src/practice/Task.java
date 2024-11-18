package practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task {

	private LocalDate date;
	private String content;

	public Task(String task) {
		String[] str = task.split(" ");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy年M月d日");
		date = LocalDate.parse(str[0], f);
		content = str[1];
	}

	public LocalDate getDate() {
		return date;
	}

	public String getContent() {
		return content;
	}

}
