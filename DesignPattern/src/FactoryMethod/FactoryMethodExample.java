
package FactoryMethod;

public class FactoryMethodExample {
    public static void main(String[] args) {
        // an array of creators
        Creator[] creators = {new ConcreteCreatorA(), new ConcreteCreatorB()};
        // iterate over creators and create products
        for(int i=0; i < creators.length; i++) {
            Product product = creators[i].factoryMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }
        for (Creator creator : creators) {
            Product product = creator.factoryMethod();
            System.out.printf("Created {%s}\n", product.getClass());
        }
    }
}