import java.util.*;

public class Main {
    public static void main(string[] args) {
        Director director = new Director();
        Builder builder1 = new Builder();
        director.Construct(builder1);
        Product product1 = builder1.getResult();
        product1.show();
    }
}

class Director {
    public void Construct(Builder builder) {
        builder.BuilderPart();
    }
}

abstract class Builder {
    public abstract void BuilderPart();

    public abstract Product getResult();
}

class Builder1 extends Builder {
    Product product = new Product();

    @Override
    public void BuilderPart() {
        product.Add("A");
    }

    @Override
    public Product getResult() {
        return product;
    }
}

class Builder2 extends Builder {
    Product product = new Product();

    @Override
    public void BuilderPart() {
        product.Add("B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}


class Product {
    List<String> parts = new ArrayList<String>();

    public void Add(String part) {
        part.add(part)
    }

    public void show() {
        System.out.print('产品组成') for (String s : parts) {
            System.out.print(s + " ");
            System.out.print("\n")
        }
    }
}