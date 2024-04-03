public class Doggos {
    String name; private double weight;
    public Doggos (String name, double weight){
        this.name = name; this.weight=weight;
    }
    public  void  myName (){
        System.out.println("Кто хороший мальчик? " +name +" хороший мальчик, но толстый(((( "+weight+" кг");
        bark();
    }

    public void bark() {
        System.out.println("Ваф");
    }
    public void golosM (int j){
        for (int i = 0; i < j; i++) {
            bark();
        }
    }
}
