package tr.edu.maltepe.oop;
public  class Simple_main {

 public static void main(String []args){
        //
       System.out.println("simple main.....");

       Person enes = new Person("Enes", 22);
  
       System.out.println(enes.getName());
       System.out.println(enes.getAge());
       enes.speaks();
        }
}