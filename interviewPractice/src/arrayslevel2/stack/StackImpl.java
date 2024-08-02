package interviewPractice.src.arrayslevel2.stack;

import java.util.ArrayList;
import java.util.List;

public class StackImpl
{
    private List<Integer> list = new ArrayList<>();

    public long size()
    {
        return this.list.size();
    }

    void push(int value)
    {
        list.add(value);
    }
    public Integer pop() throws Exception
    {
        //throwing an exception if list is empty
        if(this.list.isEmpty())
        {
            throw new Exception("The stack is empty, push a value before popping it");

        }
        int value = this.list.remove(this.list.size()-1);
        return value;
    }
}
