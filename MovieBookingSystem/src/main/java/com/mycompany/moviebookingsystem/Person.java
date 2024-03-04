
package com.mycompany.moviebookingsystem;

import java.time.LocalDate;




/**
 *
 * @author farah
 */
public abstract class Person{ 
     
    protected String fName;
    protected String lName;
    protected long ID;
    protected LocalDate birthDate; 
    protected String gender;
    protected long phoneNum;

    
    
    /*
    constructors
    */
    
    public Person() {
    }

    /**
     * 
     * @param fName
     * @param lName
     * @param ID
     * @param birthDate
     * @param gender
     * @param phoneNum
     */
    public Person(String fName, String lName, long ID, LocalDate birthDate, String gender, long phoneNum) {
        this.fName = fName;
        this.lName = lName;
        this.ID = ID;
        this.birthDate = birthDate;
        this.gender = gender;
        this.phoneNum = phoneNum;
    }

    /*
    setters
    */

    /**
     *
     * @param fName
     */
    public void setfName(String fName) {
        this.fName = fName;
    }

    /**
     *
     * @param lName
     */
    public void setlName(String lName) {
        this.lName = lName;
    }

    /**
     *
     * @param ID
     */
    public void setID(long ID) {
        this.ID = ID;
    }

    /**
     *
     * @param birthDate
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /**
     *
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     *
     * @param phoneNum
     */
    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }
    
    /*
    getters
    */

    /**
     *
     * @return first name
     */
    public String getfName() {
        return fName;
    }

    /**
     *
     * @return last name
     */
    public String getlName() {
        return lName;
    }

    /**
     *
     * @return ID
     */
    public long getID() {
        return ID;
    }

    /**
     *
     * @return birth date
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     *
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     *
     * @return phone number
     */
    public long getPhoneNum() {
        return phoneNum;
    }
    
    /*
    methods
    */
    
    /**
     * @author farah
     * this method calculate the age from the birthday 
     * @return Age 
     */
    public int getAge(){
       LocalDate birthDay = LocalDate.of(birthDate.getYear(), birthDate.getMonth(), birthDate.getDayOfMonth());
       LocalDate dateNow = LocalDate.now();
       return (dateNow.getYear()-birthDay.getYear());
    
    }
    
    /**
     * @author farah
     * this method return whether the person is an employee or a customer
     * @return Employee or Customer
     */
    public abstract String personKind(); 
    
    /**
     * @author farah
     *  this method returns data person  
     */
    public abstract void getData(); 
    
   
    /**
     * @author farah
     * @return String representation of person object
     */
    @Override
    public String toString() {
        return "Person{" + "fName=" + fName + ", lName=" + lName + ", ID=" + ID + ", birthDate=" + birthDate + ", gender=" + gender + ", phoneNum=" + phoneNum + '}';
    }
    
    
   
    

 
}
    

   
