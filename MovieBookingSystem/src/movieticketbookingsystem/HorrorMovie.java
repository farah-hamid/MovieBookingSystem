
package movieticketbookingsystem;

import java.util.Scanner;


/**
 *
 * @author shad7
 */
public class HorrorMovie implements Movie {
    
    
    private String[] MovieName= {"the killer","running","the matrix"};
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
    public HorrorMovie() {
    }

     /**
     * @author shahad
     * this constructor that assign the values
     * @param MovieRate,MovieGenre, MovieLanguage,MovieDes,Name
     * No @return type
     */
    public HorrorMovie( double MovieRate, String MovieGenre, String MovieLanguage, String MovieDes, String Name) {
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
        System.out.println("^^ here is the horror movies ^^\n");
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
        System.out.println("PLEASE CHOOSE YOUR MOVIE: ");
        int Name1 = in.nextInt();
  
       switch (Name1) {
        case 1:
            this.Name="the killer";
            this.MovieRate=8;
            this.MovieGenre="heror,violence,killing";
            this.MovieLanguage="turkish";
            this.MovieDes="A group of young people whose car breaks down, \nforcing them to take refuge in a house on the way, but they \nare surprised by a man wearing a mask of human skin \nand holding a sword";
            break;
              
        case 2:
            this.Name="running";
            this.MovieRate=5.8;
            this. MovieGenre="heror,violence";
            this.MovieLanguage="spanish";
            this.MovieDes="In the twentieth century, the film tells the real story\n of a fisherman who was attacked by a shark that devoured \nmany of the island's inhabitants, but he faces many obstacles\nduring the period of getting rid of the shark.";
            break;
            
               
        case 3:
            this.Name="the matrix";
            this.MovieRate=10;
            this.MovieGenre="heror,Science fiction";
            this.MovieLanguage="English";
            this.MovieDes="neo is a computer hacker, tries to find out\n what is happening in the world of the Matrix on\n the Internet, so he joins the group after\n taking a red pill, and discovers that a war\n has begun between machines and the human race.";
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


