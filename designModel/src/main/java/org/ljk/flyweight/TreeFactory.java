package org.ljk.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/6 15:04
 */
public class TreeFactory {
    private static Map<String,Tree> map = new ConcurrentHashMap<>();
    public static Tree getTree(String name,String data){
        if (map.containsKey(name)){
            return map.get(name);
        }
        Tree tree = new Tree(name, data);
        map.put(name,tree);
        return tree;
    }
}
