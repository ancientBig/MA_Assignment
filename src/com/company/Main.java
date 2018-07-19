package com.company;

//java libraries
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //variables
        String UserName="";
        String GreetingMessage="";
        int appAge=0;
        int UserAge=0;

        //get user name
        Scanner inUserinput = new Scanner(System.in);
        System.out.println("please enter your name : ");

        UserName=inUserinput.next();



        //generate App Age
        Random randomGen = new Random();
        appAge= randomGen.nextInt((90 - 18) + 1) + 18;//generate random numbers between 18 and 90

        //setting greeting message
        /*
             morning (12am-12pm)
             after noon (12pm -4pm)
             evening (4pm to 9pm)
             night ( 9pm to 6am)
         */
        Calendar caLendJava = Calendar.getInstance();
        int CurrentTime = caLendJava.get(Calendar.HOUR_OF_DAY);

        if(CurrentTime >= 0 && CurrentTime < 12)
        {
            GreetingMessage= "Good Morning";
        }
        else if(CurrentTime >= 12 && CurrentTime < 16)
        {
            GreetingMessage= "Good Afternoon";
        }
        else if(CurrentTime >= 16 && CurrentTime < 21)
        {
            GreetingMessage="Good Evening";
        }
        else if(CurrentTime >= 21 && CurrentTime < 24)
        {
            GreetingMessage= "Good Night";
        }


        //greeting the user
        System.out.println(GreetingMessage+" "+UserName+".");

        //get the user age
        System.out.println("please enter your age : ");

        //exception
        boolean isTrueInputName=false;

        if(inUserinput.hasNextInt())
        {
            //System.out.println("user name ");
            UserAge= inUserinput.nextInt();
        }
        else

        {


            while (isTrueInputName == false) {

                System.out.println("please your enter age (integer) : ");
                if (inUserinput.hasNextInt())
                {
                    UserAge= inUserinput.nextInt();
                    isTrueInputName = true;
                }
                else {
                    String dummy = inUserinput.next();

                }
            }

        }



        //determine App age
        int ageDifference=0;

        if(appAge>UserAge)
        {
            ageDifference=appAge-UserAge;
            System.out.println("I am "+appAge+" years old,which is "+ageDifference+" years older than you.");
        }
        else if(appAge<UserAge)
        {
            ageDifference=UserAge-appAge;
            System.out.println("I am "+appAge+" years old,which is "+ageDifference+" years younger than you.");
        }
        else if(appAge==UserAge)
        {
            System.out.println("I am "+appAge+" years old,we are same age!!");
        }

        //display twice the age
        int twiceAge=appAge*2;
        System.out.println("twice my age will be "+twiceAge+" years");

        //determine if Age is even or odd
        if(appAge % 2==0)//even
        {
            System.out.println("my age is even ");
        }
        else//odd
        {
            System.out.println("My age is odd ");
        }


    }
}
