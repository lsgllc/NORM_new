package com.lsgllc.norm.kernel.graph.things.impl;

import com.lsgllc.norm.kernel.graph.things.IKeyValuePair;
import com.lsgllc.norm.kernel.graph.things.INormKey;
import com.lsgllc.norm.kernel.graph.things.INormThing;

import java.util.UUID;

/**
 * Created By: sameloyiv
 * Date: 6/5/17
 * Time: 11:00 PM
 * <p/>
 * <p/>
 * (c) Texas Department of Motor Vehicles  2017
 * ---------------------------------------------------------------------
 * Change History:
 * Name		    Date		Description
 * ------------	-----------	--------------------------------------------
 *
 * @author
 * @description
 * @date
 */
public abstract class AbstractKeyValuePair<K extends UUID,V extends INormThing<?,?,?>> implements IKeyValuePair<K,V>{

    protected K key;
    protected V value;
    public void setKeyValuePair(IKeyValuePair<K, V> kvPair) {

    }

    public IKeyValuePair<K, V> getKvPair() {
        return null;
    }

    public void setKey(K key) {

    }

    public K getKey() {
        return null;
    }

    public void setValue(V value) {

    }

    public V getValue() {
        return null;
    }
}
