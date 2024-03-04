
package com.mycompany.moviebookingsystem;

import java.util.Scanner;



/**
 *
 * @author shad7
 */
public class AdventureMovie implements Movie {
    
     
    private String[] MovieName = {"jungle cruise","sea","cast away"};  
    private double MovieRate;
    private String MovieGenre;
    private String MovieLanguage;
    private String MovieDes;
    private String Name;

    /*
    constructors
    */
    
    /**
     * @author shahad
     * this empty constructor
     * No @param 
     * No @return type
     */
    public AdventureMovie() {
    }
    
    /**
     * @author shahad
     * this constructor that assign the values
     * @param MovieRate,MovieGenre, MovieLanguage,MovieDes,Name
     * No @return type
     */
    public AdventureMovie( double MovieRate, String MovieGenre, String MovieLanguage, String MovieDes, String Name) {
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
        System.out.println("^^ here is the adventure movies ^^\n");
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
    this.printMovieName();
        Scanner in = new Scanner(System.in);
        System.out.println("Please choose a movie: ");
        int Name1 = in.nextInt();
  
       switch (Name1) {
       case 1:
             this.Name="jungle cruise";
             this.MovieRate=4.7;
             this.MovieGenre="adventure,Science fiction";
             this.MovieLanguage="Spanish";
             this.MovieDes="The duo, Jess and Leslie, find an abandoned house above\na tree in the forest, so they decide to make this\nplace a new world for them to escape from reality, and\nthe duo begins to frequent it over and over again\nbut events quickly develop.";
             break;
              
        case 2:
            this.Name="sea";
             this.MovieRate=10;
             this.MovieGenre="adventure,Science fiction";
             this.MovieLanguage="English";
             this.MovieDes="The movie tells the story of an American submarine\nthat sinks in the depths of the ocean due to a mysterious defect \nso the US Navy sends a group of divers who are \nstationed at an oil station near the accident site, in order\nto find the submarine, and the movie is considered one of the best \nscience fiction adventure films ever.";
                break;
               
        case 3:
           this. Name="cast away";
           this.MovieRate=7.9;
           this.MovieGenre="adventure,Science fiction";
           this.MovieLanguage="English";
           this.MovieDes="Student Christopher decides to donate everything he\nowns to charities, and embarks on an adventure across\ncountries in search of himself, and along the way he meets\nmany people who will help him shape his life.";
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
