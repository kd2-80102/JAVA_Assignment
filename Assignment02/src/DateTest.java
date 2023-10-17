class Date {
	private int month;
	private int day;
	private int year;
	public Date(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
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
		System.out.println("Date is : " + month + "/" + day + "/" + year);
	}
	
	
	
	
}
public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dt1 = new Date(02,26,2002);
		dt1.displayDate();
		

	}

}
