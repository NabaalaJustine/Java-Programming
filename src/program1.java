public class program1 {//creating a class
    int id=45556665;
    String name="JUSTINE";
}
class Testprogram1{//creating another class which contains the main method
    public  static void main(String args[]){
        program1 p1=new program1();
        System.out.println(p1.id);
        System.out.println(p1.name);
    }
}
