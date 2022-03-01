package buscollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExampleJava {
    static ArrayList<Workers> arrayList= new ArrayList<Workers>();


    public static void main(String[] args) {
        getEmployee();
        display();

    }

        static void getEmployee () {
            Workers workers = new Workers();
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter how many employee to register");
            n = sc.nextInt();
            for(int i =1; i<=n;i++) {
                System.out.println("Enter your" +i+") employee details");
                System.out.println("Enter your name here:");
                workers.name = sc.next();
                System.out.println("Enter your Address:");
                workers.address = sc.next();
                System.out.println("Enter your Email ID:");
                workers.email = sc.next();
                System.out.println("Floor address:");
                workers.floor = sc.nextInt();
                System.out.println("Age:");
                workers.age = sc.nextInt();
                System.out.println("Enter mobile number:");
                workers.mobile = sc.nextLong();
                System.out.println("Gender:");
                workers.gender = sc.next();
                arrayList.add(workers);
            }



        }

        static void display () {
            int k;
            Scanner sc = new Scanner(System.in);
            int data;
            int choice;

            System.out.println("Enter which employee details you need: ");
                for (int i = 0; i < arrayList.size(); i++) {
                    System.out.print(i + "\t");

                }
                k = sc.nextInt();
                Workers workers = arrayList.get(k);
                System.out.println("Name:" + workers.name);
                System.out.println("Address:" + workers.address);
                System.out.println("Email ID:" + workers.email);
                System.out.println("Floor:" + workers.floor);
                System.out.println("Age:" + workers.age);
                System.out.println("Mobile NO:" + workers.mobile);
                System.out.println("Gender:" + workers.gender);


            System.out.println("Do you want to continue...? \n \t 1 ");
            choice = sc.nextInt();
            if(choice == 1){
            System.out.println("\n \t\t Enter your choice:\n \t  1:: adding employees. \n \t  2:: display employees. \n \t  3:: change name. ") ;
            data = sc.nextInt();
            switch (data){
                case 1:
                    getEmployee();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    change();
                    break;

            }
            }



        }
        static void change(){
            int k;
            Scanner sc = new Scanner(System.in);
            String name;
            int d;
            System.out.println("Enter which employee name you need to change: ");

            k = sc.nextInt();
            Workers workers  = arrayList.get(k);
            System.out.println("Enter which element you need to change: ");
            System.out.println(" 1) Name \t 2) Address \t 3) Mail \n 4) Floor no \t 5) Age \t 6) Mobile \n 7) gender");
            d = sc.nextInt();
            System.out.println("Enter the data to be changed");
            name = sc.next();

            switch(d){
                case 1:
                    workers.name = name;
                    display();
                    break;
                case 2:
                    workers.address = name;
                    display();
                    break;
                case 3:
                    workers.email = name;
                    display();
                    break;
                case 4:
                    workers.floor= Integer.parseInt(name);
                    display();
                    break;
                case 5:
                    workers.age= Integer.parseInt(name);
                    display();
                    break;
                case 6:
                    workers.mobile = Long.parseLong(name);
                    display();
                    break;
                case 7:
                    workers.gender = name;
                    display();
                    break;
            }

        }

    }





