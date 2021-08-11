//package Chapter23;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//
//public class InsertionSort {
//    public static void main(String[] args){
//        //System.out.println(Arrays.toString(insertionSort(new int[]{5,6,1,3,9,6})));
//                            //{5,1,6
//        //bubbleSort(new int[]{5,6,1,3,9,6});
//       // mergeSort(new int[]{2, 3, 2, 5, 6, 1,-2, 3, 14, 12});
//int[] arr={2, 3, 2, 5, 6, 1,-2, 3, 14, 12};
//quickSort(arr);
//
// }
// public static void
//
//
//
// public static void quickSort(int[] list) {
// }
//
//
//public static void scrabble(){
//        int[] scores=new int[2];
//        boolean currentPlayer=true;
//        Scanner input=new Scanner(System.in);
//    System.out.println("First Player: Write a word");
//        String firstWord=input.next();
//    System.out.println("Second Player: Is this a valid word? (Y/N)");
//        char answer=firstWord.toUpperCase().charAt(0);
//        if(answer=='N'){
//            System.out.println("Invalid word, player X(Current player) won the game");
//            System.exit(1);
//        }
//        if(answer=='Y') {
//            while(true) {
//                scores[0] = firstWord.length();
//                System.out.println("Do you want to continue?");
//                char answer2 = input.next().toUpperCase().charAt(0);
//                if (answer2 == 'N') {
//
//                }
//                System.out.println("Do");
//                scores[0] += firstWord.length();
//
//            }
//    }
//
//}
//
//
//
//
//
//
//
// public static void mergeSort(int[] arr){
//if(arr.length>1){
//    //merge sort the first half
//    int[] firstH=new int[arr.length/2];
//    System.arraycopy(arr,0,firstH,0,arr.length/2 );
//    mergeSort(firstH);
//
//    //mergeSort the second half
//    int secondH[]=new int[arr.length-arr.length/2];
//    System.arraycopy(arr,0,secondH,0,secondH.length);
//    mergeSort(secondH);
//
//    //merge Firsthalf and Second half
//    merge(firstH,secondH,arr);
//}
//     System.out.println(Arrays.toString(arr));
// }
// public static void merge(int[] firstH,int[] secondH,int[] temp){
//int curr1=0;// current Index in firstH
//int curr2=0;// and so on
//int curr3=0;
//while(curr1<firstH.length&&curr2<secondH.length){
//    if(firstH[curr1]<secondH[curr2])
//        temp[curr3++]=firstH[curr1++];
//    else
//        temp[curr3++]=secondH[curr2++];
//}
//while(curr1<firstH.length){
//    temp[curr3++]=firstH[curr1++];
//    while (curr2<secondH.length)
//        temp[curr3++]=secondH[curr2++];
//}
//
//
// }
//
//
// public static void bubbleSorting3(int[] arr){
//  boolean nextPass=true;
//  //Array may be sorted and next pass not needed,
//     for(int k=1;k<arr.length&nextPass;k++){
//         nextPass=false;
//         for(int i=0;i<arr.length-k;i++){
//             if(arr[i]>arr[i+1]){
//                 int temp=arr[i];
//                 arr[i]=arr[i+1];
//                 arr[i+1]=temp;
//                 nextPass=true;
//             }
//         }
//     }
// }
// public static void bubbleSort2(int[] arr){
//       for(int k=1;k<arr.length;k++){
//           //performs the kth pass
//           for(int i=0;i<arr.length-k;i++){
//               if(arr[i]>arr[i+1]) {
//                   int temp = arr[i];
//                   arr[i]=arr[i+1];
//                   arr[i+1]=temp;
//               }
//           }
//       }
// }
//
//
// public static void bubbleSort(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            int max=arr[i];
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[i]>arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//     System.out.println(Arrays.toString(arr));
//
//
//
// }
//    public static int[] insertionSort(int[] list){
//        int i,j,key,temp;
//        for(i=1;i<list.length;i++){
//          key=list[i];//1
//          j=i-1;//1
//          while(j>=0&&key<list[j]){
//                temp=key;
//              key=list[j];
//              list[j]=temp;
//              j--;
//          }
//        }
//        return list;
//    }
//
//}
