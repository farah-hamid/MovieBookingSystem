package movieticketbookingsystem;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Date;

/**
 *
 * @author ghala
 */
public class Customer extends Person {
    
     private Ticket ticket = new Ticket();
     private Payment payment = new Payment();
     private AdventureMovie adventureMovie = new AdventureMovie() ;
     private HorrorMovie horrorMovie = new HorrorMovie();
     private ComedyMovie comedyMovie = new ComedyMovie();
     private double popcornPrice;
     private String popSize;
     private String popFlav;
     private String movieName = null; // عشان اقدر اجيب اسم الفلم للتيكت
     private String movieLanguage = null; // عشان اقدراجيب لغه الفلم للتيكت
    
    /*
     constructors
     */
    public Customer() {
    }

    public Customer(String fName, String lName, long ID, LocalDate birthDate, String gender, long phoneNum) {
        super(fName, lName, ID, birthDate, gender, phoneNum);
    }
    
     /*
     getters
     */

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public long getID() {
        return ID;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public Payment getPayment() {
        return payment;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieLanguage() {
        return movieLanguage;
    }

    public double getPopcornPrice() {
        return popcornPrice;
    }

    public String getPopSize() {
        return popSize;
    }

    public String getPopFlav() {
        return popFlav;
    }



     /*
     setters
     */

    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieLanguage(String movieLanguage) {
        this.movieLanguage = movieLanguage;
    }
    
      public void setPopcornPrice(double popcornPrice) {
        this.popcornPrice = popcornPrice;
    }

    public void setPopSize(String popSize) {
        this.popSize = popSize;
    }

    public void setPopFlav(String popFlav) {
        this.popFlav = popFlav;
    }

     /*
     methods
     */
    
     /**
     * @author farah
     * @return String Customer
     */
    @Override
    public String personKind() {
        return "Customer";
    }

    /**
     * @author farah
     *  this method returns customer data
     */
    @Override
    public void getData(){
        System.out.println("---------------------------------------------");
        System.out.println("The Customer Data is:" );
        System.out.println("ID: "+this.getID());
        System.out.println("First name: "+this.getfName());
        System.out.println("Last name: "+this.getlName());
        System.out.println("Gender: "+this.getGender());
        System.out.println("Age: "+ this.getAge());
        System.out.println("Phone number: "+this.getPhoneNum());
        System.out.println("---------------------------------------------");
        
    }
  
     /**
     * @author farah
     * this method calculate the age from the birthday 
     * @return Age 
     */
    @Override
    public int getAge(){
        LocalDate birthDay = LocalDate.of(birthDate.getYear(), birthDate.getMonth(), birthDate.getDayOfMonth());
        LocalDate dateNow = LocalDate.now();
        return (dateNow.getYear()-birthDay.getYear());

    }
    
    /**
     * @author farah 
     * this method prints the list of movies to the customer
     * using the method from the class movie
     */
    public void viewMovie(){
        Scanner in = new Scanner(System.in);
        System.out.println("PLEASE CHOOSE THE GENRE OF THE MOVIE: ");
        System.out.println("1- ADVENTURE MOVIES");
        System.out.println("2- HORROR MOVIES");
        System.out.println("3- COMDEY MOVIES");
        int movieChocie = in.nextInt();
        switch(movieChocie){
            case 1 :
                this.adventureMovie.MovieNames(); // method from movie class to print the movies available
                this.adventureMovie.getMovieData(); // display the movie info
                this.movieName= adventureMovie.getName();
                this.movieLanguage = adventureMovie.getMovieLanguage();
                break;
            case 2 : 
                if(this.isUnderAge()==false){ // check age for horror movies 
                    this.horrorMovie.MovieNames();
                    this.horrorMovie.getMovieData();
                    this.movieName= horrorMovie.getName();
                    this.movieLanguage = horrorMovie.getMovieLanguage();
                    break;
                }
                else{
                    System.out.println("YOU ARE UNDER AGE PLEASE CHOOSE ANOTHER GENRE");
                    this.viewMovie();
                    break;
                } 
            case 3 : 
                this.comedyMovie.MovieNames();
                this.comedyMovie.getMovieData();
                this.movieName= comedyMovie.getName();
                this.movieLanguage = comedyMovie.getMovieLanguage();
                break;
            default:
                System.out.println("INVALID INPUT TRY AGAIN") ;
                this.viewMovie();
                break;
          }
    }
    
    /**
     * @author farah 
     * this method get the credit card data from the customer and check if it is expired or not 
     * using the method isExpired from the class Payment
     */
    public void makePayment(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("PLEASE ENTER THE CREDIT CARD NUMBER: ");
        this.payment.setCreditCardNumber(in.nextLong());
  
        System.out.println("PLEASE ENTER THE NAME ON THE CARD: ");
        this.payment.setCardHolderName(in.next());
        
        System.out.println("PLEASE ENTER THE CREDIT CARD EXPIRY DATE: YYYY/MM ");
        this.payment.setExpiryDate(new Date((in.nextInt()),(in.nextInt()),0)); // YEAR - 1900 , MONTH - 1 
        
        System.out.println("PLEASE ENTER THE CVV ON THE CARD: ");
        this.payment.setCVV(in.nextInt());
        
        if(this.payment.isExpired()){
            System.out.println("YOUR CARD IS EXPIRED! PLEASE TRY AGAIN");
            this.makePayment();
        
        }
   
        
    }

    
    /**
     * @author ghala 
     * this method asks the customer to choose the popcorn size and flavour
     */
    public void PopcornSelection() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose popcorn size Between \n 1 : SMALL \n 2 : MEDIUM \n 3 : LARGE");
        int size = input.nextInt();
        System.out.println("Choose popcorn flavour Between \n 1 : Regular \n 2 : Caramel \n 3 : Cheese");
        int flavour = input.nextInt();
       
            if (size == 1) {
                popSize = "SMALL";
                popcornPrice = 10;
            } else if (size == 2) {
                popSize = "MEDIUM";
                popcornPrice = 15;
            } else if (size == 3) {
                popSize = "LARGE";
                popcornPrice = 20;
            } else {
                System.out.println("INVALID INPUT");
                this.PopcornSelection();
            }
            
      
        if (flavour == 1) {
            popFlav = "Regular";
        } else if (flavour == 2) {
            popFlav = "Caramel";
        } else if (flavour == 3) {
            popFlav = "Cheese";
        } else {
            System.out.println("INVALID INPUT");
            this.PopcornSelection();
        }
        System.out.println("Your order is Popcorn with\nSize: "+ this.popSize + "\nFlavour: "+ this.popFlav);
        }
     
             
   
    /**
     * @author farah 
     * this method check if the user is under age or not 
     * @return  true if the customer is under age, false if the customer is not under age
     */    
    public boolean isUnderAge(){
        if (this.getAge() > 6 && this.getAge() < 21)
           return true;
      
        return false;
   }

    @Override
    public String toString() {
        return "Customer{" + "ticket=" + ticket + ", movieName=" + movieName + ", movieLanguage=" + movieLanguage + ", popcornPrice=" + popcornPrice + ", popSize=" + popSize + ", popFlav=" + popFlav + '}';
    }

    
}
    
 