class Mobile {
    String brand;
    int price;
    String name;

    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Mobile iphone10 = new Mobile();
        iphone10.brand = "Apple";
        iphone10.price = 100;
        iphone10.name = "Smartphone";

        iphone10.show();

        Mobile a54 = new Mobile();
        a54.brand = "Samsung";
        a54.price = 80;
        a54.name = "Smartphone";

        a54.show();
    }
}
