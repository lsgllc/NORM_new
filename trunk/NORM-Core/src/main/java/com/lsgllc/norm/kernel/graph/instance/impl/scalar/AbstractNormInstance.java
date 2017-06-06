package com.lsgllc.norm.kernel.graph.instance.impl.scalar;

import com.lsgllc.norm.kernel.graph.instance.INormInstance;
import com.lsgllc.norm.kernel.graph.instance.INormValue;
import com.lsgllc.norm.kernel.graph.instance.types.INormInstanceType;
import com.lsgllc.norm.kernel.graph.things.INormThing;
import com.lsgllc.norm.kernel.graph.things.impl.AbstractNormThing;

/**
 * Created By: sameloyiv
 * Date: 2/3/13
 * Time: 2:00 PM
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
public class AbstractNormInstance<K,V extends INormThing<?,?>,T> extends AbstractNormThing<K,V> implements INormInstance<K,V,INormValue<?,INormInstanceType<T>>> {

    private INormValue<?,INormInstanceType<T>> value;

    public AbstractNormInstance(K id,INormValue<?,INormInstanceType<T>> value) {
        super(id);

        this.value = value;
    }

    protected AbstractNormInstance(K id, V thing) {
        super(id, thing);
    }


    public INormValue<?, INormInstanceType<T>> getValue() {
        return value;
    }

    public void setValue(INormValue<?, INormInstanceType<T>> value) {
        this.value = value;
    }


    public Object getValue(String canonicalName, String type) {
        return null;
    }

    public void setValue(Object personType, String canonicalName, String type) {
    }


}
