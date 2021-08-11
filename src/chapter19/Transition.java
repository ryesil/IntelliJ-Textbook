package chapter19;

public class Transition<E> {
    private E e;
    public Transition(){

    }
    public Transition(E e){
        this.e=e;
    }
public E getE(){
        return e;
}
}
