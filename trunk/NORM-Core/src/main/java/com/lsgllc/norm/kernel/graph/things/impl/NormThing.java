package com.lsgllc.norm.kernel.graph.things.impl;

import com.lsgllc.norm.kernel.graph.impl.AbstractNormContainer;
import com.lsgllc.norm.kernel.graph.things.INormThing;
import com.lsgllc.norm.kernel.graph.identity.typing.INormType;
import com.lsgllc.norm.util.exceptions.NormNotFoundException;

import java.util.UUID;

/**
 * Created By: sameloyiv
 * Date: 1/4/13
 * Time: 11:57 AM
 * <p/>
 * <p/>
 * (c) Texas Department of Motor Vehicles  2013
 * ---------------------------------------------------------------------
 * Change History:
 * Name		    Date		Description
 * ------------	-----------	--------------------------------------------
 *
 * @author
 * @description
 * @date
 */
public  class NormThing<T, K extends UUID ,V extends INormThing<?,?,?>> extends AbstractNormContainer<K,V> implements INormThing<T,K,V>{

    private T type;
    private K id;
    private V thing;


    public NormThing(K id) {
        this.id = id;
    }

    public NormThing(K id, V thing) {
        this(id);
        this.thing = thing;
    }
    public V getValue() {
        return null;
    }

    public void setKey(UUID key) {

    }

    public K getKey() {
        return null;
    }


    public V getThing() throws NormNotFoundException {
        return null;
    }

    public void setThing(V thing) {

    }

    public INormType<T> getType() {
        return null;
    }

    public void setType(INormType<T> type) {

    }

    public K getId() {
        return null;
    }
}
