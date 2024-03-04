package com.mycompany.moviebookingsystem;

import java.text.SimpleDateFormat;
import java.util.Calendar; // abstract class in java
import java.util.Scanner;

/**
 *
 * @author farah
 */
public class Ticket   {

    private static int ticketsAvailable = 100;
    private int ticketID;
    private double ticketPrice;
    private int numOfTicket; // Numbers of ticket the customer booked 
    private Customer customer;
    

    /*
    constructors
     */

    public Ticket() {
    }

    /**
     * @param ticketID
     * @param customer
     */
    public Ticket(int ticketID, Customer customer) {
        this.ticketID = ticketID;
        this.customer = customer;
    }

    /*
    setters
     */

    /**
     * 
     * @param ticketsAvailable
     */
    public static void setTicketsAvailable(int ticketsAvailable) {
        Ticket.ticketsAvailable = ticketsAvailable;
    }

    /**
     *
     * @param ticketID
     */
    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    /**
     *
     * @param ticketPrice
     */
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    /**
     *
     * @param numOfTicket
     */
    public void setNumOfTicket(int numOfTicket) {
        this.numOfTicket = numOfTicket;
    }
    

    /*
    getters
     */

    /**
     *
     * @return the ticket available
     */
    public static int getTicketsAvailable() {
        return ticketsAvailable;
    }

    /**
     *
     * @return ticket ID
     */
    public int getTicketID() {
        return ticketID;
    }

    /**
     *
     * @return ticket price 
     */
    public double getTicketPrice() {
        return ticketPrice;
    }

    /**
     *
     * @return number of ticket reserved 
     */
    public int getNumOfTicket() {
        return numOfTicket;
    }
    
    
    
    /*
    methods
     */
    
    /**
     * @author farah 
     * this method gets from the customer whether he wants vip or standard ticket
     * and by that we get the price of the ticket he choose 
     */
    public void ticketKind(){
        Scanner in = new Scanner(System.in);
        System.out.println("DEAR "+ customer.getfName().toUpperCase() +" PLEASE CHOOSE YOUR TIKCET FOR THE " + customer.getMovieName().toUpperCase() +": (Standard or VIP) ");
        String ticketKind = in.next();
        switch(ticketKind) {
            case "Standard":
            case "standard":  
                this.ticketPrice = 50;
                break;
            case "VIP":
            case "vip":  
                this.ticketPrice = 100;
                break;
            default:   
                System.out.println("INVALID INPUT TRY AGAIN"); 
                this.ticketKind(); // recursion
        } //switch
    }
    
   
    /** 
     * @author farah 
     * This method gets the current date and time
     * so we can use it when we print the booking info to show when did the customer book their ticket.
     * we used Calendar class to create a date from it
     * and used simpleDateFormat class to format the date
     * @return String of the current date and time
     */
    public String getCurrentDateAndTime() {
        Calendar calendar = Calendar.getInstance();   //creates a date from Calendar class                                        
        SimpleDateFormat dateFormat = new SimpleDateFormat("h:mma D MMMM YYYY "); // MMM to get the month shortcut              
        return dateFormat.format(calendar.getTime());                             // MMMM to get the full month 
    }                                                                             // h for hour
                                                                                  // mm for minute
                                                                                  // a for AM/PM                                               

    /**
     * @author farah 
     * this method calculate the VAT  
     * @param ticketPrice
     * @return VAT
     */    
    public double calculateVAT(double ticketPrice){
        return((this.numOfTicket*this.ticketPrice)*15)/100.0;
    }
       
    
    /**
     * @author farah 
     * this method book the number of ticket giving by the customer
     */
    public void bookTicket(){
        Scanner in = new Scanner(System.in);
        System.out.println("DEAR "+ customer.getfName().toUpperCase() +" PLEASE ENTER THE NUMBER OF TICKET FOR THE MOVIE " + customer.getMovieName().toUpperCase() +": ");
        this.numOfTicket = in.nextInt();
        this.ticketsAvailable = this.ticketsAvailable - this.numOfTicket;
        
        if(this.ticketsAvailable<=0){
           System.out.println("Sorry there are no ticket available for this movie");
           this.numOfTicket = 0; // احتياط عشان اذا نبى نطبع 
        }
    
    }
    
    /**
     * @author farah 
     * this method prints the booking details to the user 
     * using the preveios methods to get the time, number of booked ticket
     * and the getters to get the information that are needed
     */
    public void printBookingDetails(){
        System.out.println("---------------------------------------------");
        System.out.println("DEAR " + customer.getfName().toUpperCase() + " HERE IS YOUR BOOKING DETAILS: ");
        System.out.println("MOVIE: " + customer.getMovieName().toUpperCase());
        System.out.println("LANGUAGE: " + customer.getMovieLanguage().toUpperCase());
        System.out.println("TICKET BEFORE VAT: " +( this.numOfTicket*this.getTicketPrice()) + " FOR " + this.numOfTicket +" TICKET/S" );
        System.out.println("VAT: " + this.calculateVAT(ticketPrice) );
        System.out.println("TICKET PRICE AFTER VAT: " + (( this.numOfTicket * this.getTicketPrice())+this.calculateVAT(ticketPrice)));
        System.out.println("BOOKED AT: " + this.getCurrentDateAndTime());
        System.out.println("------------------THANK YOU------------------");
    }

    /**
     * @author farah
     * @return String representation of person object
     */
    @Override
    public String toString() {
        return "Ticket{" + "ticketID=" + ticketID + ", ticketPrice=" + ticketPrice + ", , customer=" + customer + '}';
    }

    
 
} //class


 //Calendar calendar = new GregorianCalendar(year, month-1, day); // -1   0 عشان تعداد الاشهر يبدا من  
//  System.out.println("The Current Date is:" + c.getTime());




  
//    /**
//     * this method only return the current date using the LocalDate class
//     */
//    public LocalDate getCurrentDate() {
//        return LocalDate.now() ;                   
//    }   



