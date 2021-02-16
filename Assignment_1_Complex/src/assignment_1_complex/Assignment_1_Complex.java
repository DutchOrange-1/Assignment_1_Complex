/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_1_complex;

import java.util.Arrays;

/**
 *
 * @author Brandon
 */
public class Assignment_1_Complex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Object [][] company = {
      {"Futuristic", 100000 , 56000}, 
      {"Dimension", 89000 , 61500 },
      {"Mobi Tech", 87000 , 91340 },
      {"Robo Teck", 165000 , 99000 },
      {"Secure IT", 99000 , 115000 },
      {"Info Age", 156500 , 105350 }, 
      {"MobilITy", 62000 , 83500 },
        }; 

        int numberOfCompanies = 7;  //Defining the number of companies. 
        int profit = 0, loss = 0, temp = 0, income, expense; 
 
System.out.print("COMPANY \t INCOME \t EXPENSE \t PROFIT \t LOSS \n≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡≡\n"); //Headings

        for (int i = 0; i < numberOfCompanies; i++) {   //Printing names, Incomes, expenses
            
            System.out.print(company[i][0]    
                            + "     \t R" + company[i][1]  //Printing  the INCOME
                            + "     \t R" + company[i][2]  //Printing the EXPENSES
                            + " ");
            income = Integer.valueOf((int) company[i][1]);
            expense = Integer.valueOf((int) company[i][2]);
            temp = income - expense;   //Caculating if it is a loss or profit. 
            if (temp > 0) {                                    //Profit
                profit++; 
                System.out.println(" \t R" + temp);
            }else{                                              //Loss
                loss++; 
                System.out.println(" \t \t \t R" + (temp*(-1)));
            }  
       }
        System.out.println("\nNumber of companies with profits: " + profit + " \nNumber of companies with losses: " + loss + " \n \n");  
    }
}
  
    


/*
The Integer class has a method valueOf which takes a string as the value and returns a int value,
you can use this. It will throw an NumberFormatException if
the string passed to it is not a valid integer value.
*/
