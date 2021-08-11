package Chapter23;

import java.util.Arrays;
import java.util.Locale;

public class Question {
    public static void main(String[] args){
//binary("Ramazan");
// capitilizer("I love coding");
//remover("123ertgfdsaQ234567UJHBVCDSAWQ23456TYHGVSQ1");
  //      System.out.println(arePresent(new String[]{"areaSFDGHJ","aSFD"}));
       // System.out.println(vowels("ALI canALiCan",5));

        wurst("I like chorizos, but not sausages");
    }
    public static void wurst(String str){
        String[] fakeWurst="chorizos Pepperoni Snorkers Gurka sausages".split(" ");
    for(String w:fakeWurst){
        if(str.toLowerCase().contains(w.toLowerCase())){
           str =str.replace(w,"wurst");
        }
    }

        System.out.println(str);
    }


    //ie a ution that returns the first n vowels of a string.
    public static String vowels(String str, int n){//aiuoe
        return str.replaceAll("[^aeiouAEIOU]","").substring(0,n);





    }








    public static boolean arePresent(String[] arr1){// [String, String2], String.contains()
    arr1[0]=arr1[0].toLowerCase();
    arr1[1]=arr1[1].toLowerCase();

        for(int i=0;i<arr1[1].length();i++){
        if(!arr1[0].toLowerCase().contains(Character.toLowerCase(arr1[1].charAt(i))+""))
            return false;
    }
return true;
    }








   public static void remover(String str){

    String str2=str.replaceAll("[^a-zA-Z]","");
       System.out.println(str2);

   }






    public static void capitilizer(String str) { // [String, string, string]
        String store = "";
        String[] str2 = str.split(" ");

        for (int i = 0; i < str2.length; i++) {
           String.format(store,Character.toUpperCase(str2[i].charAt(0)) + str2[i].substring(1) + " ");

        }
        System.out.println(store.trim());//
    }











    //Write a function that transforms all letters from [a, m] to 0 and letters
    // from [n, z] to 1 in a string.
  public static void binary(String name){//'a' n,a,m,e
String store="";
   for(int i=0;i<name.length();i++){

      if(name.charAt(i)>='a'&&name.charAt(i)<='m'){
          store+=String.valueOf(0);
      }if(name.charAt(i)>='n'&&name.charAt(i)<='z'){
          store+="1";
       }

   }

      System.out.println(store);
  }
}
