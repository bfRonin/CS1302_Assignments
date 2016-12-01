package assignment4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CitySortDemo {
	
	public static ArrayList<String> setCityList() throws FileNotFoundException{
		ArrayList<String> list = new ArrayList<String>();
		File inputFile = new File("/home/michael/CSCI/1302/Assignments/Answers/Assignment4/Cities.txt");
		Scanner in = new Scanner(inputFile);
		while (in.hasNext()){list.add(in.next());}
		in.close();
		return list;
	}
	
	public static void main(String[] args) throws FileNotFoundException
	{
		ArrayList<String> cities = setCityList();
		Collections.sort(cities);
		System.out.println(cities);
	}
}
