package Bus_Booking;

import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
String name;
int busNo;
String date;
void booking()
{
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the name....");
	name=scanner.next();
	System.out.println("Enter the busNo....");
	busNo=scanner.nextInt();
	System.out.println("Enter the date dd-mm-yyyy....");
	String data=scanner.next();
	
	
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getBusNo() {
	return busNo;
}
public void setBusNo(int busNo) {
	this.busNo = busNo;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> bus) {
	// TODO Auto-generated method stub
	int capacity=0;
	for(Bus b:bus)
	{
	if(b.getBusNo()==busNo)
		capacity=b.getCapacity();
	}
	int booked=0;
	for(Booking b:bookings)
	{
	if(b.busNo==busNo&& b.date.equals(date))
	{
		booked++;
	}
	}
	return booked<capacity?true:false;
}


}
