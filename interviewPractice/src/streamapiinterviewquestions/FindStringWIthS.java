package streamapiinterviewquestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringWIthS
{
    public static void main(String args[])
    {
        String[] arr = {"apple","banana","Strawberry","strawberry","cherry","Salsa","grape"};

        List<String> listStr = Arrays.asList(arr);
        List<String> strWiths = listStr.stream()
                .filter(n->n.toLowerCase().startsWith("s"))
                .collect(Collectors.toList());
        System.out.println(strWiths);

        }
    }

