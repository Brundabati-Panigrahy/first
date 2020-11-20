package com.mindtree.fileStream.client;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.mindtree.fileStream.entity.People;
import com.mindtree.fileStream.exception.clientException.serviceException.FileStreamServiceException;
import com.mindtree.fileStream.service.FileStreamService;
import com.mindtree.fileStream.service.serviceImpl.FileStreamServiceImpl;

public class FileStreamApp {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		final FileStreamService fileStream = new FileStreamServiceImpl();
		int choice = 0;
		do {
			choice = displayMenu();
			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.println("Enter People record");
				System.out.println("Enter person name");
				String nameOfPerson = sc.nextLine();
				System.out.println("Enter person age");
				int ageOfPerson = sc.nextInt();
				People people = new People(nameOfPerson, ageOfPerson);
				String message = "Serialization";
				try {
					message = fileStream.fileSerialization(people,
							"D:\\EngeneeringCampAssignments\\FileStream\\people.txt");
				} catch (FileStreamServiceException e2) {
					System.out.println(e2.getMessage());
				}
				System.out.println(message);
				People people1=new People();
				try {
					people1 = fileStream.fileDeserialization("D:\\EngeneeringCampAssignments\\FileStream\\people.txt");
				} catch (FileStreamServiceException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				System.out.println("Deserialized");
				System.out.println(people1.toString());
				break;
			case 2:
				sc.nextLine();
				System.out.println("Enter a string");
				String s = sc.nextLine();
				String info = "Not created";
				try {
					info = fileStream.fileOutputStream(s);
				} catch (FileStreamServiceException e1) {
					System.out.println(e1.getMessage());
				}
				System.out.println(info);
				break;
			case 3:
				System.out.println("Enter the name of the person");
				String name = sc.next();
				System.out.println("Enter the updated age");
				int age = sc.nextInt();
				String msg = "not updated";
				try {
					msg = fileStream.excelFileData("D:\\EngeneeringCampAssignments\\FileStream\\studentData.xlsx", name,
							age);
				} catch (FileStreamServiceException e) {
					System.out.println(e.getMessage());
				}
				System.out.println(msg);
				break;
			case 4:
				System.out.println("Exiting.........");
				sc.close();
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 3);

	}

	private static int displayMenu() {
		int choice = 0;
		System.out.println("Choose.........");
		System.out.println("1.Serializing");
		System.out.println("2.Creating file");
		System.out.println("3.Updating excel file");
		System.out.println("4.Exit");
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		return choice;
	}

}
