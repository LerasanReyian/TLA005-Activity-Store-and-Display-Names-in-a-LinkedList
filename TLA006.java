package com.mycompany.tla005;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TLA006 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //Baol
            LinkedList<String[]> nm = new LinkedList<>(Arrays.asList());
            boolean tuyok = true;
            while (tuyok) {
                System.out.println();
                System.out.println("===================Locate & Delete=================");
                System.out.println("| 1. Find Someone Here in The List               |");
                System.out.println("| 2. Delete Name, Status, Address                |");
                System.out.println("| 3. Display Credentials From The List           |");
                System.out.println("| 4. Add Credentials                             |");
                System.out.println("| 5. Exit                                        |");
                System.out.println("===================================================\n");
                System.out.print("Choose an option: ");

                // Read integer safely
                int pili = sc.nextInt();
                
                switch (pili) {
                    case 1:
                        System.out.print("Enter name to find: ");
                        String find = sc.nextLine();
                        boolean wala = false;
                        for (String[] entry : nm) {
                            if (entry[0].equalsIgnoreCase(find)) {
                                System.out.println("Found: Name: " + entry[0] + ", Status: " + entry[1] + ", Address: " + entry[2]);
                                wala = true;
                            }
                        }
                        if (!wala) {
                            System.out.println("Name not found in the list.");
                        }
                        break;
                    case 2:
                        System.out.print("Enter name to delete: ");
                        String del = sc.nextLine();
                        Iterator<String[]> it = nm.iterator();
                        boolean iris = false;
                        while (it.hasNext()) {
                            String[] entry = it.next();
                            if (entry[0].equalsIgnoreCase(del)) {
                                it.remove();
                                System.out.println("Deleted: Name: " + entry[0] + ", Status: " + entry[1] + ", Address: " + entry[2]);
                                iris = true;
                            }
                        }
                        if (!iris) {
                            System.out.println("Name entered was not on the list....");
                        }
                        break;
                    case 3:
                        if (nm.isEmpty()) {
                            System.out.println("The list is empty.");
                        } else {
                            System.out.println("Credentials in the List:");
                            for (String[] entry : nm) {
                                System.out.println("Name: " + entry[0] + ", Status: " + entry[1] + ", Address: " + entry[2]);
                            }
                        }
                        break;
                    case 4:
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter status: ");
                        String status = sc.nextLine();
                        System.out.print("Enter address: ");
                        String address = sc.nextLine();
                        nm.add(new String[]{name, status, address});
                        System.out.println("Credentials added successfully.\n");
                        break;
                    case 5:
                        System.out.println("Babye...");
                        tuyok = false;
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            }}}
