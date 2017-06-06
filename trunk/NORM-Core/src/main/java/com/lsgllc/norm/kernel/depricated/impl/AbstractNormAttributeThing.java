package com.lsgllc.norm.kernel.depricated.impl;

import com.lsgllc.norm.kernel.graph.things.INormThing;
import com.lsgllc.norm.kernel.graph.identity.INormId;
import com.lsgllc.norm.kernel.graph.ontology.identity.impl.AttributeId;
import com.lsgllc.norm.kernel.depricated.INormAttribute;
import com.lsgllc.norm.kernel.graph.things.impl.AbstractNormThing;

/**
 * Created By: sameloyiv
 * Date: 1/7/13
 * Time: 3:49 PM
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
@Deprecated
public class AbstractNormAttributeThing<K extends INormId<?>,V extends INormThing<K,?>> extends AbstractNormThing<K,V> implements INormAttribute<K,V> {
    private V thing = null;
    public AbstractNormAttributeThing(K id) {
        super(id);
    }

    protected AbstractNormAttributeThing(K id, V thing) {
        super(id, thing);
    }

    public AbstractNormAttributeThing(V thing) {
        super((K) new AttributeId(), thing);
    }

    public V getThing() {
        return thing;
    }

    public void setThing(V thing) {
        this.thing = thing;
    }
}
