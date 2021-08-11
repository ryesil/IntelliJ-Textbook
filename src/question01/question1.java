package question01;

public class question1 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Product product = new Product("Keyboard");
        System.out.println(product.getName());

        binary(6);


    }

    public static String binary(int num) {
        String store = "";
        String limitless = "";
        int limit = (int) Math.pow(2, num);
        for (int i = 0; i < limit; i++) {
            limitless = Integer.toBinaryString(i);
            while (limitless.length() < num) limitless = 0 + limitless;

            if (limitless.indexOf("11") < 0)
                store += limitless + " ";
        }


        System.out.println(store);
        return store;
    }
}
