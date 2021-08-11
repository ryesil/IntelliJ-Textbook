package Chapter23;

import com.sun.jdi.StringReference;

import java.util.*;

public class Question28_8Lottery {
    public static void main(String[] args){

        System.out.println(lottery(222));


    }
public static String lottery(int input){//100,1000,234, 432 [2,3,4] [2,3,4],
Random random=new Random();
int lotteryNumber=99+random.nextInt(901);
    System.out.println("Lottery number is "+lotteryNumber);
int lotteryNumberCopy=lotteryNumber;
int inputCopy=input;
  List<Integer> lottery=new ArrayList<>();
  List<Integer> userInput=new ArrayList<>();

while(lotteryNumberCopy>0){//23
    lottery.add(lotteryNumberCopy%10);
    lotteryNumberCopy/=10;//23
}
while(inputCopy>0){
    userInput.add(inputCopy%10);
    inputCopy/=10;// input=input/10;
}
Collections.sort(lottery);
Collections.sort(userInput);
boolean isOneDigit=false;
for(int i=0;i<userInput.size();i++){
  if(String.valueOf(lotteryNumber).contains(String.valueOf(userInput.get(i)))){
      isOneDigit = true;
      break;
  }
}
    System.out.println("lottery "+lottery);
    System.out.println("UserInput "+userInput);

  if(lotteryNumber==input){
     return "$12,000";
  }else if(lottery==userInput){
     return "$5,000";
  }else if(isOneDigit){
      return "$2,000";
    }else{
      return "Try next time...";
  }
}

}
