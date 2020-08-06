import java.util.ArrayList;
import java.util.Scanner;

public class Searching
{
    public void searching(ArrayList<Integer> list)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search in the list:");
        int number = sc.nextInt();
        int found=0;
        int index=0;
        for(int iterator=0; iterator<list.size(); iterator++)
        {
            if(number == list.get(iterator))
            {
                found=1;
                index=iterator;
                break;
            }
        }
        if(found==0)
        {
            System.out.println("The required element was not found!!!!");
        }
        else
        {
            System.out.println("The required element was found at the index "+index);
        }
    }
}
