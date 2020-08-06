package org.ljk.builder;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 14:07
 */
public class BuilderTest {
    public static void main(String[] args) {
        DefaultConcreteProductBuilder defaultConcreteProductBuilder = new DefaultConcreteProductBuilder();
        Director director = new Director(defaultConcreteProductBuilder);
        Product product = director.makeProduct("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k");
        System.out.println(product.toString());
    }
}
