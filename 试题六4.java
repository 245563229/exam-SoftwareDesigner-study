//public class Main1 {
//    public static void main(String [] args){
//        Product product1 = new Product(2024,5.24);
//        System.out.println('1');
//         Product product2 =(Product) product1.Clone();
//    }
//}
//
//
//interface Prototype {
//    public Object Clone();
//}
//
//class Product implements Prototype {
//
//    private int id;
//    private double price;
//
//    public Product(int id, double price) {
//        this.id = id;
//        this.price = price;
//    }
//
//    public int getId() {
//        return id;
//    }
//    public double getPrice(){
//        return  price;
//    }
//    @Override
//    public Object Clone() {
//        Product object = new Product();
//        object.id = this.id;
//        object.price = this.price;
//        return object;
//    }
//}
