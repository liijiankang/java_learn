package org.ljk.facade;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.sun.org.apache.xerces.internal.impl.xs.SubstitutionGroupHandler;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 15:33
 */
public class Client1 {
    Facade facade = new Facade();
    public void doS(){
       facade.doS();
    }
}
