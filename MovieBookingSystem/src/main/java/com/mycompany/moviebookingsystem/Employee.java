
package com.mycompany.moviebookingsystem;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author dana
 */
public class Employee extends Person{
    
    private double[] workArray;
    private double hourWage;
    private int salary;

    public Employee() {
    }

    public Employee(String fName, String lName, long ID, LocalDate birthDate, String gender, long phoneNum, double hourWage,int salary){
        super(fName, lName, ID, birthDate, gender, phoneNum);
        this.hourWage = hourWage;
        this.salary = salary;
    }
    
    public Employee(double[] workArray, double hourWage, int salary) {
        this.workArray = workArray;
        this.hourWage = hourWage;
        this.salary = salary;
    }

    public double[] getWorkArray() {
        return workArray;
    }

    public double getHourWage() {
        return hourWage;
    }

    public int getSalary() {
        return salary;
    }

    public void setWorkArray(double[] workArray) {
        this.workArray = workArray;
    }

    public void setHourWage(double hourWage) {
        this.hourWage = hourWage;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    /**
     * @author dana 
     * @return
     */
    public double salarycalculation() {
        double workHoursSum = 0;
        for (int i = 0 ; i < workArray.length ; i++) {
             workHoursSum += workArray[i];
        }
        return workHoursSum * hourWage;
    }
    
    /**
     * @author dana 
     */
    public void bonus(){
        
        Scanner in=new Scanner(System.in);
        System.out.println("Entre the current year:");
        int CurrentYear=in.nextInt();
        System.out.println("The year of joining:");
        int joinYear=in.nextInt();
        int TotalYears=CurrentYear-joinYear;
        
        if(TotalYears>3){
             System.out.println("bonus is 3000 Saudi riyals");
        } 
        else{
             System.out.println("no bonus");
        }
    
    
    }
  
    @Override
    public String personKind(){
        return "Employee";
    
    }
   
    @Override
    public void getData(){
        System.out.println("---------------------------------------------");
        System.out.println("The Employee Data is:" );
        System.out.println("ID: "+this.getID());
        System.out.println("First name: "+this.getfName());
        System.out.println("Last name: "+this.getlName());
        System.out.println("Gender: "+this.getGender());
        System.out.println("Age: "+this.getAge());
        System.out.println("Phone number: "+this.getPhoneNum());
        System.out.println("Salary: "+this.getSalary());
        System.out.println("Hour Wage: "+this.getHourWage());
        System.out.println("---------------------------------------------");

        
    }
    
    @Override
    public int getAge(){
       LocalDate birthDay = LocalDate.of(birthDate.getYear(), birthDate.getMonth(), birthDate.getDayOfMonth());
       LocalDate dateNow = LocalDate.now();
       return (dateNow.getYear()-birthDay.getYear());
    
    }
             
    
    @Override
    public String toString() {
        return "Employee{" + "workArray=" + workArray + ", hourWage=" + hourWage + ", salary=" + salary + '}';
    }
    
  
    
            

}
