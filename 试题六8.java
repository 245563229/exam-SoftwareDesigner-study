//public class BridgePattern {
//    public static void main(String[] args){
//        Product productA = new Product();
//        productA.setName("ss");
//        Color red = new Red();
//        productA.setColor(red);
//    }
//}
//
//abstract class Product {
//    private String name;
//    protected Color color;
//
//    public void setColor(Color color) {
//        this.color = color;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public abstract void Operation();
//}
//
//class ProductA extends Product {
//    @Override
//    public void Operation() {
//        color.OperationImp(this.getName());
//    }
//}
//
//interface Color {
//    public void OperationImp(String name);
//}
//
//class Red implements Color {
//    @Override
//    public void OperationImp(String name) {
//        System.out.println("Red");
//    }
//}
//
//class Blue implements Color {
//    @Override
//    public void OperationImp(String name) {
//        System.out.println("Blue");
//    }
//}