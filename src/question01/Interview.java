package question01;

public class Interview {
    public static void main(String[] args) {

        noOnes(4);
        //System.out.println("asd".indexOf('c'));
    }

    public static String noOnes(int num) {
        String str = "";
        int temp = num;
        int numberOfStrings = (int) Math.pow(2, num);

        for (int i = 0; i < numberOfStrings; i++) {
            String b = Integer.toBinaryString(i);
            while (b.length() < num) b = "0" + b;
            if (b.indexOf("11") == -1) str += b + " ";

        }

        System.out.println(str.trim());
        return str;
    }

}
