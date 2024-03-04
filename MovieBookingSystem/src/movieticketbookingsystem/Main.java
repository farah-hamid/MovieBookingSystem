
package movieticketbookingsystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author farah
 */
public class Main{

    
    public static void main(String args[]){
   
      new GUI(); 
      
       System.out.println("WELCOME");
       System.out.println("PLEASE CHOOSE A NUMBER: \n1- CUSTOMER  \n2- EMPLOYEE ");
       Scanner in = new Scanner(System.in);
       int choice = in.nextInt();
       ArrayList<Person> person = new  ArrayList<Person>();
   
       switch(choice){
           case 1:{
                    
        Customer customer = new Customer();
        System.out.println("PLEASE ENTER YOUR FIRST NAME:");
        customer.setfName(in.next());
        System.out.println("PLEASE ENTER YOUR LAST NAME:");
        customer.setlName(in.next());
        System.out.println("PLEASE ENTER YOUR ID:");
        customer.setID(in.nextInt());
        System.out.println("PLEASE ENTER YOUR BIRTH DAY: (YEAR , MONTH , DAY)");
        customer.setBirthDate(LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt()));
        System.out.println("PLEASE ENTER YOUR GENDER: ");
        customer.setGender(in.next());
        System.out.println("PLEASE ENTER YOUR PHONE NUMBER:");
        customer.setPhoneNum(in.nextInt());
        Ticket ticket = new Ticket(1,customer);
     
        customer.viewMovie();         
        // نسوي هنا شيك اذا يبى يكمل لا لا؟
        ticket.ticketKind();
        
        ticket.bookTicket();
     
        customer.PopcornSelection(); 
        
        customer.makePayment();
                
        ticket.printBookingDetails();
            
        person.add(customer);// add the customer to the array list
  
        break;
           }
           case 2: {
        Employee employee = new Employee();
        System.out.println("PLEASE ENTER YOUR FIRST NAME:");
        employee.setfName(in.next());
        System.out.println("PLEASE ENTER YOUR LAST NAME:");
        employee.setlName(in.next());
        System.out.println("PLEASE ENTER YOUR ID:");
        employee.setID(in.nextInt());
        System.out.println("PLEASE ENTER YOUR BIRTH DAY: (YEAR - MONTH - DAY)");
        employee.setBirthDate(LocalDate.of(in.nextInt(),in.nextInt(),in.nextInt()));
        System.out.println("PLEASE ENTER YOUR GENDER: ");
        employee.setGender(in.next());
        System.out.println("PLEASE ENTER YOUR PHONE NUMBER:");
        employee.setPhoneNum(in.nextInt());
        System.out.println("PLEASE ENTER YOUR HOUR WAGE :");
        employee.setHourWage(in.nextInt());
        System.out.println("PLEASE ENTER YOUR SALARY:");
        employee.setSalary(in.nextInt());
        
        employee.bonus();
        
        person.add(employee); //add the employee to the array list
        
        break;

      
           }
       
       
       }//switch
       
     //Customer object  
    Customer customer2 = new Customer("lena","alhazmi",112567, LocalDate.of(2001, 6, 2),"Female",05554331);
    Customer customer3 = new Customer("ahamd","ahamd",124678, LocalDate.of(2004, 9, 1),"Male",05543217);
   
    // Employee obhect 
    Employee employee4 = new Employee("lena","hamad",112567, LocalDate.of(2002, 3, 2),"Female",05554331,2,1000);
    Employee employee5 = new Employee("lala","haha",112567, LocalDate.of(2006, 6, 9),"Female",05554331,2,3000);
     
    
    // Add object to person ArrayList
    person.add(customer2);
    person.add(customer3);
    person.add(employee4);
    person.add(employee5);
    
     
    System.out.println("do you want to print customers and employees data?");
    String ansewr = in.next();
    if(ansewr.equalsIgnoreCase("yes"))
    for(Person p: person) // print all users data
        p.getData();






  
        }//main
        
  

}   //class
        
        
