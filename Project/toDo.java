import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.EmptyStackException;

public class toDo{
   public static void main(String args[]){
    Scanner input=new Scanner(System.in);
     int choice=0;
    int MAX=10;
    ArrayList<String> list=new ArrayList<String>();
    System.out.println("WELCOME TO MY TODO LIST");
    System.out.println("hit 1 to add items to the list");
    System.out.println("hit 2 to see the lists items");
    System.out.println("hit 3 to remove items from list");
    System.out.println(" hit 4 to clear list");
    System.out.println("hit 5 to exit program");
    
    choice=input.nextInt();


    while(choice!=3){
    System.out.println("Choose an Option");++01
    
    switch(choice){
        //adding items to list
        case 1:
        
         System.out.println("keep hitting enter as you enter all items.if you wanna stop,type stop");
         for(int count=0;count<=MAX;count++){
            String data=input.nextLine();
                      if(data.equals("stop"))
            {
                break;
            }
                
              

            else{
                list.add(data);
                System.out.printf("list now contains:%s\n",list);
              }
             
             
           }
         break;

        case 2:

     //display list items

        System.out.printf("list contains:");
            for(String item:list){
                System.out.printf("%d\n",item);

                 }
                 
            break;
        case 3:    
     //removing items from list
         
         while(!list.isEmpty()){
             
             System.out.println("keep hitting enter as you remove elements and enter 0  if you want to end");
             System.out.println("Enter the index of the element you want to remove");
             for( int count=0;count<=MAX;count++){
                int i=input.nextInt();
              if(i==0){
                  break;
              }
              else{
                System.out.printf("%s was removed from list",list.get(i));
                list.remove(list.get(i));
                System.out.printf("list now contains:%s",list);
             }
             }

         }
         break;
         //clearing list
        case 4:
        while(!list.isEmpty()){
            int c=0;
            list.remove(list.get(c));
            System.out.printf("list now contains:%s",list);
        }
        break;
    
        default:
        break;
    }
    }

}
    }


    













   










