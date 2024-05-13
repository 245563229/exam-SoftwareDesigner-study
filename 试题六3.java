//import java.util.*;
//
//class Product {
//    private String partA;
//    private String partB;
//
//    public Product() {
//    }
//
//    public void setPartA(String s) {
//        this.partA = s;
//    }
//
//    public void setPartB(String s) {
//        this.partB = s;
//    }
//}
//
//interface Builder {
//    public void buildPartA();
//
//    public void buildPartB();
//
//    public void getResult();
//}
//
//class ConcreteBuilder1 implements Builder {
//    private Product product;
//
//    public ConcreteBuilder1() {
//        product = new Product();
//    }
//
//    public void buildPartA() {
//        product.setPartA("Component A");
//    }
//
//    public void buildPartB() {
//        product.setPartB("Component B");
//    }
//
//    public Product getResult() {
//        return product;
//    }
//}
//class Director {
//    private Builder builder;
//   public Director(Builder builder){this.builder = builder;}
//    public void construct(){
//       builder.buildPartA();
//    }
//}
//class Test {
//    public static void main(String[] args){
//        Director director1 = new Director(new ConcreteBuilder1());
//        director1.construct();
//    }
//}