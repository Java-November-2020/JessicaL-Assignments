public class StringManipulator {
    
    // trim and concatenate
    public static String trimAndConcat(String string1, String string2){
        return string1.trim().concat(string2.trim());
    }

    //getIndexOrNull(String, char) 
    public static String getIndexOrNull(String input, char c){
        int index = input.indexOf(c);
        if(index == -1){
            return null;
        }
        else{
            return "" + index;
        }
        
    }
    
    //getIndexOrNull(String, String)
    public static String getIndexOrNull(String str1, String str2){
        int index1 = str1.indexOf(str2);
        if(index1 == -1){
            return null;
        }
        else{
            return "" + index1;
        }
    }
  
    //conCatSubstring(String, int, int, String) 
    public static String concatSubstring(String str3, int num1, int num2, String str4){
        String subStr = str3.substring(num1, num2);
        return subStr.concat(str4);

    }




}
