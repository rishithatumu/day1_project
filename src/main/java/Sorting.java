import java.util.ArrayList;
import java.util.Collections;

public class Sorting
{
    public void sorting(ArrayList<Integer> list)
    {
        int temporary_variable;
        for(int iterator1=list.size()-1; iterator1>0; iterator1--)
        {
            for(int iterator2=0; iterator2<iterator1; iterator2++)
            {
                if(list.get(iterator1)>list.get(iterator2))
                {
                    Collections.swap(list, iterator1, iterator2);
                }
            }
        }
        System.out.print("The swapped array list is: "+list);
    }
}
