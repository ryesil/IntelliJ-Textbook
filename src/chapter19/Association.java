package chapter19;

public class Association<E,T> {
    private E e;
    private T t;

    public Association(){

    }
    public Association(E e,T t){
        this.e=e;
        this.t=t;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public void setT(T t) {
        this.t = t;
    }


    @Override
    public String toString() {
        return "Association{" +
                "e=" + e +
                ", t=" + t +
                '}';
    }
}
