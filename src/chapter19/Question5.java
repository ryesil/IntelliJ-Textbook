package chapter19;
class Triplet<E>{
  private E thing1;
  private E thing2;
  private E thing3;

  public Triplet(){

  }
  public Triplet(E thing1,E thing2, E thing3){
      this.thing1=thing1;
      this.thing2=thing2;
      this.thing3=thing3;
  }

  public void setThing1(E thing1){
      this.thing1=thing1;
  }
  public void setThing2(E thing2){
      this.thing2=thing2;
  }
  public void setThing3(E thing3){
      this.thing3=thing3;
  }
  public E getThing1(){
      return thing1;
  }
  public E getThing2(){
      return thing2;
  }
  public E getThing3(){
      return thing3;
  }

    @Override
    public String toString() {
        return "Triplet{" +
                "thing1=" + thing1 +
                ", thing2=" + thing2 +
                ", thing3=" + thing3 +
                '}';
    }
}



public class Question5 {
    public static void main(String[] args){

        Triplet<Integer> t1=new Triplet<>(3,2,1);
        System.out.println(t1);
    Triplet<String> t2=new Triplet<>("s","r","T");
        System.out.println(t2);

    }
}
