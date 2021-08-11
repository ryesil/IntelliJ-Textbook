package chapter19;

public class Chapter19Runner {
    public static void main(String[] args) {
        Transition<Integer> t1=new Transition<>(12);
        Transition<Long>   t2=new Transition<>(1l);
        Transition<Float> t3=new Transition<>(2.1f);
        System.out.println(add(t1,t2,t3));


    }
    public static double add(Transition<? extends Number> e1, Transition<? extends Number> e2,
                             Transition<? extends Number> e3){

        return e1.getE().doubleValue()+e2.getE().doubleValue()+e3.getE().doubleValue();
    }
}
