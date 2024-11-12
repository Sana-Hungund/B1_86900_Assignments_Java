import javax.imageio.ImageTranscoder;

class Date {
	private int month;
	private int day;
	private int year;
	
	public Date(int month, int day, int year) {
		setMonth(month);
		setDay(day);
		setYear(year);
		
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
		
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void displayDate() {
		System.out.println(this.day + "/" + this.month + "/" + this.year);
	}
}
public class Question3 {

	public static void main(String[] args) {
		Date obj1 = new Date(7, 30, 2024);
		
		obj1.displayDate();
		
		obj1.setMonth(12);
		
		System.out.println("\nAfter setting month");
		obj1.displayDate();

	}

}
