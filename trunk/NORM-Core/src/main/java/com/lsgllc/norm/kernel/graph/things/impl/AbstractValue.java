package com.lsgllc.norm.kernel.graph.things.impl;

import com.lsgllc.norm.kernel.graph.instance.INormValue;
import com.lsgllc.norm.kernel.graph.things.INormThing;

/**
 * Created By: sameloyiv
 * Date: 6/5/17
 * Time: 11:07 PM
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
public class AbstractValue< V extends INormThing<?,?,?>> implements INormValue<V> {
    protected V value;

    public AbstractValue(V value) {
        this.value = value;
    }

    public void setValue(V value) {
        this.value = value;
    }


    public V getValue() {
        return this.value;
    }
}
