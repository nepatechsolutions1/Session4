import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateExample {
	public static void main(String[] args) {
		DateTimeFormatter yearFormatter = DateTimeFormatter.ofPattern("yyyy");
		DateTimeFormatter monthFormatter = DateTimeFormatter.ofPattern("MM");
		LocalDate localDate = LocalDate.now();
		
		String year = yearFormatter.format(localDate);
		String month = monthFormatter.format(localDate);
		
		int yearNumber = Integer.parseInt(year);
		int monthNumber = Integer.parseInt(month);
		
		System.out.println(yearNumber);
		System.out.println(monthNumber);
	}

}
