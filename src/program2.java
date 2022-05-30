public class program2 {
    int id;
    String name;
    int phoneNumber;
    void insert(int i, String n, int l) {
        id=i;
        name=n;
        phoneNumber=l;
    }
    void display(){System.out.println(id+" "+name+" "+phoneNumber);}
}
 class testprogram2 {
    public static void main(String[] args) {
        program2 e1=new program2();
        program2 e2=new program2();
        program2 e3=new program2();
        e1.insert(101,"Davii",712345679);
        e2.insert(102,"Manu",234567890);
        e3.insert(103,"Nick",716_243_324);
        e1.display();
        e2.display();
        e3.display();
    }
}
