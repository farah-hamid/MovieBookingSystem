package com.mycompany.moviebookingsystem;

import java.util.Scanner;



/**
 *
 * @author shad7
 */
public class ComedyMovie implements Movie {
    
    private String[] MovieName= {"the lost city","forever","beast"};
    private double MovieRate;
    private String MovieGenre;
    private String MovieLanguage;
    private String MovieDes;
    private String Name;

      
    /**
     * @author shahad
     * this empty constructor
     * No @param 
     * No @return type
     */
    public ComedyMovie() {
    }

    /**
     * @author shahad
     * this constructor that assign the values
     * @param MovieRate,MovieGenre, MovieLanguage,MovieDes,Name
     * No @return type
     */
    public ComedyMovie(double MovieRate, String MovieGenre, String MovieLanguage, String MovieDes, String Name) {
         this.MovieRate = MovieRate;
        this.MovieGenre = MovieGenre;
        this.MovieLanguage = MovieLanguage;
        this.MovieDes = MovieDes;
        this.Name = Name;
    }
    
    
    /*
    getters
    */
    
  
    /**
     * @author shahad
     * this method that get MovieName
     * No @param 
     * @return array MovieName
     */
    public String[] getMovieName() {
        return MovieName;
    }
    
     /**
     * @author shahad
     * this method that get MovieRate
     * No @param 
     * @return MovieRate
     */
    public double getMovieRate() {
        return MovieRate;
    }

     /**
     * @author shahad
     * this method that get MovieGenre
     * No @param 
     * @return MovieGenre
     */
    public String getMovieGenre() {
        return MovieGenre;
    }

     /**
     * @author shahad
     * this method that set MovieLanguage
     * No @param 
     * @return MovieLanguage
     */
    public String getMovieLanguage() {
        return MovieLanguage;
    }

      /**
     * @author shahad
     * this method that get MovieDes
     * No @param 
     * @return MovieDes
     */
    public String getMovieDes() {
        return MovieDes;
    }

     /**
     * @author shahad
     * this method that get Name
     * No @param 
     * @return Name
     */
    public String getName() {
        return Name;
    }
    
    /*
    setters
    */

      
    /**
     * @author shahad
     * this method that set MovieName
     * @param MovieName
     * No @return type
     */
    public void setMovieName(String[] MovieName) {
        this.MovieName = MovieName;
    }

        
    /**
     * @author shahad
     * this method that set MovieRate
     * @param MovieRate
     * No @return type
     */
    public void setMovieRate(double MovieRate) {
        this.MovieRate = MovieRate;
    }

        
    /**
     * @author shahad
     * this method that set MovieGenre
     * @param MovieGenre
     * No @return type
     */
    public void setMovieGenre(String MovieGenre) {
        this.MovieGenre = MovieGenre;
    }

       
    /**
     * @author shahad
     * this method that set MovieLanguage
     * @param MovieLanguage
     * No @return type
     */
    public void setMovieLanguage(String MovieLanguage) {
        this.MovieLanguage = MovieLanguage;
    }

      
    /**
     * @author shahad
     * this method that set MovieDes
     * @param MovieDes
     * No @return type
     */
    public void setMovieDes(String MovieDes) {
        this.MovieDes = MovieDes;
    }
   
   
    /**
     * @author shahad
     * this method that set Name
     * @param Name
     * No @return type
     */
    public void setName(String Name) {
        this.Name = Name;
    }
    
    /*
    methods
    */
   @Override
     public void type(){
        System.out.println("^^ here is the comedy movies ^^\n");
    }
   

     @Override   
    public void printMovieName(){
       System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
       for(int i=0;i<MovieName.length;i++){
            System.out.println((i+1)+"-"+this.MovieName[i]);
        }
       System.out.print("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^\n");
    }
    
    
    
    @Override
    public void MovieNames() {
       this.printMovieName(); // calling the previus method to print the array of movie names
        Scanner in = new Scanner(System.in);
        System.out.println("Please choose a movie: ");
        int Name1 = in.nextInt();
  
       switch (Name1) {
        case 1:
            this. Name="the lost city";
             this.MovieRate=5.3;
             this.MovieGenre="comedy,fantasy,funney";
             this.MovieLanguage="japanese";
             this.MovieDes="The story revolves around a\n young genius, Sheldon Cooper\n" +
                      "  For nine years he has been attending\n high school in East Texas and trying " +
                      " Dealing with the world around him while\n his family tries to deal with him";
             break;
              
        case 2:
            this.Name="forever";
             this.MovieRate=8.2;
             this.MovieGenre="comedy,funney";
             this.MovieLanguage="English";
             this.MovieDes="A comedy about a skeptic who has to\n work with a believer in a scientist\n" +
                      " Paranormal phenomena and aliens are in a secret\n security department to hunt down " +
                      " They explore paranormal phenomena and unexplained\n incidents in Los Angeles";
             break;
               
        case 3:
            this.Name="beast";
            this.MovieRate=9.1;
            this.MovieGenre="comedy,fantasy,funney";
             this.MovieLanguage="English";
             this.MovieDes="The story of the series, that the character Paul Dirac,\nis going through a difficult phase and he feels very \nlazy\n" +
                      " He tries one of the solutions, \nin order to return again, a person who has activity,\n But this solution, which he will do,\n" +
                      "  It results in a copy of another human being, like him and his likeness, which happens, that person\n" +
                      "  Himself, he has one life\n two copies, living the same life.\n" +"";
             break;
     
            default:
                System.out.println("** THIS MOVIE NOT AVAILABLE **");
                this.MovieNames();
                break;
        }// switch
       
    }
    
    
    @Override
    public void getMovieData() {
        System.out.println("Movie Name : " + this.getName());
        System.out.println("Movie Rate : " + this.getMovieRate());
        System.out.println("Movie Genre : " + this.getMovieGenre());
        System.out.println("Movie Language : " + this.getMovieLanguage());
        System.out.println("Movie Description : " + this.getMovieDes());
        
    }
    
    /**
     * @author shahad
     * this method print object 
     * No @param 
     * @return obj contents
     */
    @Override
    public String toString() {
        return("\n----------------------------------\nMOVIE NAME: "+Name+"\n----------------------------\n MOVIE GENRE: "+MovieGenre+"\n------------------------------\n MOVIE DESCRIPTION: "+MovieDes+"\n----------------------------\n MOVIE LANGUGE: "+MovieLanguage+"\n------------------------------------\n MOVIE RATE: "+MovieRate+"\n----------------------------------------");
    }
       
}





