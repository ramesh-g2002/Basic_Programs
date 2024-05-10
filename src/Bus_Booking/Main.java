package Bus_Booking;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		ArrayList<Bus> bus=new ArrayList<Bus>();
		ArrayList<Booking> bookings=new ArrayList<Booking>();
		bus.add(new Bus(4,true,2));
		bus.add(new Bus(5,false,55));
		bus.add(new Bus(2,true,5));
		bus.add(new Bus(1,true,49));
		for(Bus b:bus)
		{
			b.disPlayinfo();
		}
		int userInput=1;
		Scanner scanner=new Scanner(System.in);
		
		while(userInput==1)
		{
			System.out.println("Enter 1 booking enter 2 to exit...........");
			userInput=scanner.nextInt();
			if(userInput==1)
			{
			Booking booking=new Booking();
			if(booking.isAvailable(bookings,bus))
			{
				bookings.add(booking);
				System.out.println("your ticket is confromed....");
			}
			else
			{
				System.out.println("ticket is not available...");
			}
		}
		
		
	}

}}
