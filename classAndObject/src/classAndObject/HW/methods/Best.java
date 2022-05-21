package classAndObject.HW.methods;

import java.util.Scanner;

public class Best {

String custName;
long phoneNo;
int callsCount;
float tax,bill=0,finalBill=0;
public static void main(String[] args){
Scanner input = new Scanner(System.in);
char c;
do{
  Best obj = new Best();
  obj.accept();
  obj.billing();
  obj.display();
  
  System.out.println("Do you want to continue ? (y/n)");
     c = input.next().charAt(0);
  }
  while(c=='y' || c== 'Y');
  }


  public void accept(){
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter your name, Phone num, and calls :");
      custName = sc.nextLine();
      phoneNo = sc.nextLong();
      callsCount = sc.nextInt();
//      sc.close();
 }
 public void billing(){
   if(callsCount > 0 && callsCount < 100){
     bill = callsCount ;
   }
   else if(callsCount >= 100 && callsCount < 300){
     bill = callsCount+(0.80f*callsCount);
   }
   else if(callsCount >=300 && callsCount <500){
     bill = (1.25f * callsCount);
   }
   else if(callsCount >= 500){
     bill = (2.50f * callsCount);
   }
   tax= 0.12f*bill;
   finalBill = bill+tax;
 }
 public void display(){
 System.out.println("+++++++++++++++++++++Generated Bill+++++++++++++++++++++\n");
   System.out.println("Name :"+custName);
   System.out.println("Phone No :"+phoneNo);
   System.out.println("No. of calls :"+callsCount);
   System.out.println("bill :"+bill);
   System.out.println("(12% of total bill)Tax :"+tax);
   System.out.println("Final Bill =("+bill+"+"+tax+") = "+finalBill);
   
   System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
 }
}