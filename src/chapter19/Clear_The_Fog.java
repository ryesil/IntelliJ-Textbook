package chapter19;

import java.util.Locale;

public class Clear_The_Fog {
    public static void main(String[] args) {

    }
   public static String fogy(String str){
     String str2=str.replaceAll("[^fFoOgG]","");
     if(!str2.toLowerCase().contains("fog")){
         return "It's a clear day!";
     }

       System.out.println("bu nedir ya ben neden ogrenemiyorum :(");
       System.out.print("Simdi calisiyor ama 5 dakika sonra calisir mi bilemiyorum");
       System.out.println("Bu kapak olmadi");

       System.out.println("Bu da kapak olsun");

    return "Ben senin babani";
   }



}
