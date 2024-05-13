//class Pizza {
//    private String parts;
//
//    public void setParts(String parts) {
//        this.parts = parts;
//    }
//
//    public String toSting() {
//        return this.parts;
//    }
//}
//
//
//abstract class PizzaBuilder {
//    protected Pizza pizza;
//
//    public Pizza getPizza() {
//        return pizza;
//    }
//
//    public void createNewPizza() {
//        pizza = new Pizza();
//    }
//
//    public abstract void buildParts();
//}
//
//abstract class HawaPizzaBuilder extends PizzaBuilder {
//    public void buildParts() {
//        pizza.setParts("Cross");
//    }
//}
//
//abstract class SpicyPizzaBuilder extends PizzaBuilder {
//    @Override
//    public void buildParts() {
//        pizza.setParts("sss");
//    }
//}
//
//class Waiter {
//    private PizzaBuilder pizzaBuilder;
//
//    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
//        this.pizzaBuilder = pizzaBuilder;
//    }
//
//    public Pizza getPizza() {
//        return pizzaBuilder.getPizza();
//    }
//    public void construct(){
//        pizzaBuilder.createNewPizza();
//        pizzaBuilder.buildParts();
//    }
//}
//
//class FastFoodOrdering {
//    public static void main(String[] args){
//        Waiter waiter = new Waiter();
//        PizzaBuilder hawaPizzabuilder = new HawaPizzaBuilder(){};
//        waiter.setPizzaBuilder(hawaPizzabuilder);
//        waiter.construct();
//
//    }
//}
