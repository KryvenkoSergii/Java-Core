package classwork11.kryvenkosergii_lv44;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App1 {

	public static void main(String[] args) {
		Random ran = new Random();
		ran.ints(0,25).limit(10).forEach(System.out::println);
		System.out.println();
		ran.ints(0,25).limit(10).sorted().forEach(System.out::println);
		System.out.println();
		System.out.println(ran.ints(0,25).limit(10).max().getAsInt());
		System.out.println();
		
		System.out.println(LocalDate.now().getDayOfWeek());
		LocalDate date = LocalDate.now();
		System.out.println(date.with(TemporalAdjusters.firstDayOfMonth()));
		System.out.println();
		
		List<String> str = Arrays.asList("asd", "zxc", "qwe ", "ert", "123");
		String sort = str.stream().sorted().collect(Collectors.joining(", "));
		System.out.println(sort);
		
	}

}
