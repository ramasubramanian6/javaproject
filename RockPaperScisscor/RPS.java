package javaproject;


import java.util.*;
import java.util.Scanner;



public class RPS
{

    public static void Rules(String Rules )
    {
        
        
        String [] word=Rules.split("\\s+");

        for(String s:word)
        {
            System.out.print(s+" ");
            try{
                Thread.sleep(200);
            }
            catch(Exception e)
            {
                System.out.println("");
            }
            
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        
        Scanner scn=new Scanner(System.in);

        while(true)
        {
            System.out.println("Welocme to Rock Paper Scisscor Game");
            String Rules="Rules---> For Rock press 'R' || For Paper press 'P' || For paper Scisscor press 'S'";
            Rules(Rules);
            String letsplay="Let's Play Roocckkk Paaapeerrr Scissorrrr Press 'R','P','S' ";
            Rules(letsplay);
            String user_input="";

            while (true) 
            {
                    user_input=scn.nextLine();
                    if((user_input.equals("P") || user_input.equals("R") || user_input.equals("S"))||user_input.equals("p") || user_input.equals("r") || user_input.equals("s"))
                    {
                        break;
                    }
                    else
                    {
                        String invaild="Please enter Vaild input-->'P','S','R' or Press lowercase also 'p','s','r'";
                        Rules(invaild);
                    }
            }

            String moves[]={"R","S","P"};

            int randonIndex=(int)(Math.random()*3);
            String cs=moves[randonIndex];//cs-->coumputer select

            System.out.println("Coumputer Selection "+cs);

            String coumputerwon="Yes I won the match jollyyyy :)  Try Again";
            String userwon="You Win the Match  :| ";

            if(cs==user_input)
            {
                String tie="Match Tie :)";
                System.out.println(tie);
            }else if(user_input.equals("R")|| (user_input.equals("r"))){
                if(cs.equals("R"))
                {
                    Rules(coumputerwon);
                }
                else
                {
                    Rules(userwon);
                }
            }else if(user_input.equals("P") || user_input.equals("p")){
                if(cs.equals("S"))
                {
                    Rules(coumputerwon);
                }
                else
                {
                    Rules(userwon);
                }
            } else if ((user_input.equals("S"))|| (user_input.equals("s"))){
                if (cs.equals("R"))
                {
                    Rules(coumputerwon);
                }
                else
                {
                    Rules(userwon);
                }
            }

            System.out.println("What to Play Again Press '5' or To End game press any key");
            int userrematch_code=scn.nextInt();
            if(userrematch_code==5)
            {
                
            }
            else{
                System.out.println("Bye Have A Nice Day");
                break;
            }
        
        }
    }
}