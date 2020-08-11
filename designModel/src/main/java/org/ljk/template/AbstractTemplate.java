package org.ljk.template;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/11 19:16
 */
public abstract class AbstractTemplate {
    public void operation(){
        System.out.println("step1...");
        System.out.println("step2...");
        System.out.println("step3...");

        templateMethod();
    }
    public abstract void templateMethod();
}
