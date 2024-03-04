
package movieticketbookingsystem;


import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author jumanah
 */
public class Payment {
    
    private long CreditCardNumber;
    private String CardHolderName;
    private Date ExpiryDate;
    private int CVV;
 
    /*
    constructors
     */
    public Payment() {
    }

    public Payment(long CreditCardNumber, String CardHolderName, Date ExpiryDate, int CVV) {
        this.CreditCardNumber = CreditCardNumber;
        this.CardHolderName = CardHolderName;
        this.ExpiryDate = ExpiryDate;
        this.CVV = CVV;
      
    }
    
    /*
    getters
     */

    public long getCreditCardNumber() {
        return CreditCardNumber;
    }

    public String getCardHolderName() {
        return CardHolderName;
    }

    public Date getExpiryDate() {
        return ExpiryDate;
    }

    public int getCVV() {
        return CVV;
    }

    
    /*
    setters
     */
    
    public void setCreditCardNumber(long CreditCardNumber) {
        this.CreditCardNumber = CreditCardNumber;
    }

    public void setCardHolderName(String CardHolderName) {
        this.CardHolderName = CardHolderName;
    }

    public void setExpiryDate(Date ExpiryDate) {
        this.ExpiryDate = ExpiryDate;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    
    /*
    methods
     */
    
     /**
     * @author farah
     * this method returns whether the credit card is expired or not using the class Date to get the current date
     * and the date entered from the customer
     * and we check both Date using the method before();
     * @return true if it is expired and false if it is not expired
     */ 
    public boolean isExpired(){

        Date now = new Date(); // returns the current date and time
        Date end = new Date( this.ExpiryDate.getYear()-1900,this.ExpiryDate.getMonth()-1,0); //sub 1900 from year and sub 1 from month because index start from 0 

        return now.after(end);//The method returns true if the time represented by now is after the time represented by end
                              // if true -> expired 
                              // if false -> not expired
         
    }
    
   /**
 *
 * @author jomanh
 */
     /**
     * This method checks if the card is valid or not, based on the first digit, first 2 digit, or first 4 digits, and based on the card type
       whether it is a Visa, MasterCard, or American Express
       * using Scanner method to enter a number, and select from a list "switch", String.ValueOf to Convert the number to string and
       * String.substring to get only the first number to see if it is equal to one of the values each case has or not.
     * @param validity
     * @return 
     */

           public String isValid(String validity ) {
    
           Scanner in=new Scanner(System.in);
           System.out.println("Select your Card type:\n(1) Visa Card\n(2) MasterCard\n(3) American Experess\n(4) JCB");
           int cardType=in.nextInt();
           
           
           switch(cardType){
               
               //For Visa Cards
               case 1:
               {
                       int validn=4;
                       String validns=String.valueOf(validn);
                       String validnsi=validns.substring(0, 1);
    
                       long ccn= CreditCardNumber;
                       String ccns=String.valueOf(ccn);
                       String ccnsi=ccns.substring(0, 1);
                       
                       
                       if (ccnsi.equals(validnsi))
                       {validity= "Valid";}
                       else
                       {validity= "Invalid";}
               }
                   break;
                   
               //For MasterCard Cards
               case 2:
               {
                       int validn=55;
                       String validns=String.valueOf(validn);
                       String validnsi=validns.substring(0, 2);
    
                       long ccn= CreditCardNumber;
                       String ccns=String.valueOf(ccn);
                       String ccnsi=ccns.substring(0, 2);
                       
                       
                       if (ccnsi.equals(validnsi))
                       {validity= "Valid";}
                       else
                       {validity= "Invalid";}
               
               }
                   break;
               
               //For America Express Cards
               case 3:
               {
                       int validn=37;
                       String validns=String.valueOf(validn);
                       String validnsi=validns.substring(0, 2);
    
                       long ccn= CreditCardNumber;
                       String ccns=String.valueOf(ccn);
                       String ccnsi=ccns.substring(0, 2);
                       
                       
                       if (ccnsi.equals(validnsi))
                       {validity= "Valid";}
                       else
                       {validity= "Invalid";}
               }
                 break;
                 //For JCB Cards
               case 4:
               {
                       int validn=1800;
                       String validns=String.valueOf(validn);
                       String validnsi=validns.substring(0, 4);
    
                       long ccn= CreditCardNumber;
                       String ccns=String.valueOf(ccn);
                       String ccnsi=ccns.substring(0, 4);
                       
                       
                       if (ccnsi.equals(validnsi))
                       {validity= "Valid";}
                       else
                       {validity= "Invalid";}
               }
              
           }
    

    return validity;
    }

       /**
     * this method will replace the card number digits from the 1st digit to the 12th digit with stars, using the Strin.ValueOf to convert from long to string
     * String.substring to it to 2 halfs, and replace the half with the indexes from 0 to 11 with stars, then link it with String.concat.
     * @param Covercc
     * @return 
     */
      
       public String CoverCC(String Covercc){
       
       long cover = CreditCardNumber;
       
                       String covers=String.valueOf(cover);
                       String Coverssub1=covers.substring(0, 11);
                       String Coversnsub2=covers.substring(12, 16);
                       String Coversn=Coverssub1.replace(Coverssub1, "**** **** **** ");
                       Covercc=Coversn.concat(Coversnsub2);
                       
       return Covercc;
       }

       
    @Override
    public String toString() {
        
        String validity="";
        String Coverer="";

        return "Payment{" + "CreditCardNumber=" + CoverCC(Coverer) + ", CardHolderName=" + CardHolderName + ", ExpiryDate=" + ExpiryDate + ", CVV=" + CVV + "\nIs the number Valid? " + isValid(validity) + "\nIs the card Expired? " + isExpired()+ '}';
    }
   
    
    
}



//  public boolean isExpired(Date ExpiryDate ) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("mm/yy");
//        Date date = new Date();
//        String date1 = dateFormat.format(date);
//        String ExpiryDate1 = dateFormat.format(ExpiryDate);
//          
//        if(date1.compareTo(ExpiryDate1)>=0)
//            return true;
//        else
//            return false;
//               
//    }
//    public boolean isExpired2(Date ExpiryDate) {
//        Calendar now = Calendar.getInstance(); 
//        now.setTime(new Date()); // takes Date as a parameter
//
//        
//        Calendar Expiry = Calendar.getInstance(); 
//        Expiry.setTime(ExpiryDate); // takes Date as a parameter
//
//           
//        return (Expiry.after(now)); //The method returns true if the time represented by Expiry is before the time represented by now object
//       
//   
//               
//    }
//    
// 
//    public boolean isExpired3(Date x) {
//        Date now = new Date();
//        Date end = x;
//        int r = now.compareTo(end);
//        if (r<=0)
//            return true;
//        else
//            return false;}


//
//
//if (now.before(end)) //The method returns true if the time represented by now is before the time represented by end
//           return false;
//        else
//            return true;