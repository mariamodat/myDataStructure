package finalTerm.hashTable;

import java.util.HashMap;

public class LeftJoins {


public  HashTable<String,String[]> leftJoin (HashMap<String,String> left , HashMap<String,String> right){

 HashTable <String,String[]> hashTable= new HashTable<String,String[]>();
 left.forEach((key,value)->{
   String[] values= new String[2];
   values[0]=value;
   values[1]=right.get(key);
   hashTable.add(key,values);
 });
return hashTable;

}

}
