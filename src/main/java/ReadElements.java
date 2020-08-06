import java.util.ArrayList;
import java.util.Scanner;

public class ReadElements
{
    ArrayList<Integer> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public void read()
    {
        System.out.print("Enter the number of elements to add into the list:");
        int number_of_elements = sc.nextInt();
        System.out.print("Enter the elements:");
        for(int iterator=0; iterator<number_of_elements; iterator++)
        {
            int number = sc.nextInt();
            list.add(number);
        }
        prompt();
    }
    void prompt()
    {
        System.out.println("Menu");
        System.out.println("1.Searching");
        System.out.println("2.Sorting");
        System.out.print("Please enter your choice:");
        int choice = sc.nextInt();
        if(choice==1)
        {
            Searching search = new Searching();
            search.searching(list);
        }
        if(choice==2)
        {
            Sorting sorts = new Sorting();
            sorts.sorting(list);
        }
        else
        {
            System.out.println("Invalid choice!!!!");
        }
    }
}
