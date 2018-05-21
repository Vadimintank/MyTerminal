import java.util.Scanner;

public class Bank extends NamePeople {




   public  void   perewirka(){
       int size =2;
       Scanner scn = new Scanner(System.in);
       Scanner scn2 = new Scanner(System.in);
       System.out.println("Please Enter Your Account Number:");
      String code=scn.next();
       System.out.println("Enter Your Password:");
       String password=scn2.next();

      for (int i=0;i<size;i++){


     if( code.equals(personalNumber[i])  && mypass[i].equals(password)) {
         System.out.println("Hello, "+name[i]);
         System.out.println("My pas: "+ mypass[i]);
         getBalanse(i);
     return;
     }
     else if (i==(size-1)){
         System.out.println("ERROR: ACCOUNT NUMBER AND PASSWORD DON'T MATCH");
         perewirka();

     }


     }



   }
   public void getBalanse(int numberArray){
       System.out.println("Please Choose From the Following Options:");
       System.out.println("1.Display Balance");
       System.out.println("2.Withdraw");
       System.out.println("3. Log Out");
       System.out.println();
       Scanner scn = new Scanner(System.in);
       Scanner moneyGet = new Scanner(System.in);

       int komand=scn.nextInt();
       switch(komand){
           case 1:

               try {
                   System.out.println("Your balanse is "+people(numberArray)+"$");

               } catch (Exception e) {
                   e.printStackTrace();
               }
               getBalanse(numberArray);
               break;
           case 2:
               for(int j=0;;j++) {
                   System.out.println("Enter Amount You Wish to Withdraw:");
                   int suma = moneyGet.nextInt();
                   try {
                       if (suma >balanse() && suma<=people(numberArray)) {
                           System.out.println("ERROR: THE MAXIMUM AMOUNT AVAILABLE IN THIS ATM IS ₴337. PLEASE ENTER A DIFFERENT AMOUNT:");
                           getBalanse(numberArray);
                       }
                       else if(suma>people(numberArray)){
                           System.out.println("ERROR: INSUFFICIENT FUNDS!! PLEASE ENTER A DIFFERENT AMOUNT:");
                           getBalanse(numberArray);
                       }
                       else {
                        int suma2=people(numberArray);
                        int suma3=suma2-suma;
                        int balanse = balanse();
                           System.out.println("Your New Balance is "+ (suma2-suma));
                           writeData(numberArray,(suma3));
                           writeBalanse(balanse-suma);
                           getBalanse(numberArray);

                       }
                   } catch (Exception e) {
                       e.printStackTrace();
                   }
                   break;
                   }
           case 3:
               System.out.println( name[numberArray]+", Thank You For Using Our ATM. Good-Bye!");
               perewirka();
       }


   }



}
