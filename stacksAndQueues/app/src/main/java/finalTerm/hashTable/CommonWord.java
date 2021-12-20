package finalTerm.hashTable;

import java.util.HashMap;
import java.util.Map;

public class CommonWord {
       private int tempCounter=0;
       private String tempWord="";
  public String mostCommonWord(String string) throws Exception {
    String[] arrString = string.split(" ");
    HashTable<String, Integer> hashMap = new HashTable<>();
    for (String str : arrString) {
      if (hashMap.contains(str) && !str.isEmpty()) {
        hashMap.add(str, hashMap.get(str) + 1);
        if (hashMap.get(str)>tempCounter){ tempCounter=hashMap.get(str);
        tempWord=str;
        }
      }
      else {
        hashMap.add(str, 1);
      }
    }
    return tempWord;
//    String maxStr = "";
//    int maxVal = 0;
//    for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
//      String key = entry.getKey();
//      Integer count = entry.getValue();
//      if (count > maxVal) {
//        maxVal = count;
//        maxStr = key;
//      } else if (count == maxVal) {
//        if (key.length() < maxStr.length())
//          maxStr = key;
//      }
//    }
//    return maxStr;
  }

}
