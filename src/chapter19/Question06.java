package chapter19;

public class Question06 {
    public static void main(String[] args) {
        Association<Integer, String> m=new Association<>(12,"m");
        Triplet<String> str=new Triplet<>("a", "b","c");
Question5 q5=new Question5();
    Association<Triplet,Question5> m2=new Association<>();
    m2.setE(str);
    m2.setT(q5);
        System.out.println(m2);



    }


}
