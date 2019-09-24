package com.lambton;


import java.util.*;

public class CollectionFrameworkExample
{
    public static void main(String[] args)
    {
        ArrayList<String> mStringArrayList = new ArrayList<>();
        mStringArrayList.add("A");
        mStringArrayList.add("B");
        mStringArrayList.add("C");
        mStringArrayList.add("D");

        //System.out.println(mStringArrayList);
        for (int i =0 ; i < mStringArrayList.size(); i++)
        {
            System.out.println(mStringArrayList.get(i).toString());
        }
        for (String s : mStringArrayList)
        {
            System.out.println(s);
        }
        Set<String>mySet = new HashSet<>();
        mySet.add("Punjab");
        mySet.add("UP");
        mySet.add("Gujrat");

        System.out.println(mySet);
        mySet.add("Punjab");
        System.out.println(mySet);

        Map<String, String>stringMap = new HashMap<>();
        stringMap.put("IND","INDIA");
        stringMap.put("NZ","NEWZEALAND");
        stringMap.put("AUD","AUSTRALIA");
        stringMap.put("PAK","PAKISTAN");

        System.out.println(stringMap);
        stringMap.put("IND","INDIA");
        System.out.println(stringMap);






    }

}
