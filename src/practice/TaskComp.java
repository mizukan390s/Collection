package practice;

import java.util.Comparator;

public class TaskComp implements Comparator<Task> {
	public int compare(Task c1, Task c2) {
		if (c1.getDate().isBefore(c2.getDate())) {
			return -1;
		} else if (c1.getDate().isAfter(c2.getDate())) {
			return 1;
		} else {
			return c1.getContent().compareTo(c2.getContent());
		}
	}

}
