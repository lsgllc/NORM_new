package com.lsgllc.norm.kernel.depricated.impl;

import com.lsgllc.norm.kernel.graph.identity.INormId;
import com.lsgllc.norm.kernel.graph.ontology.identity.impl.ObjectId;
import com.lsgllc.norm.kernel.graph.things.INormThing;
import com.lsgllc.norm.kernel.graph.things.impl.AbstractNormThing;

/**
 * Created By: sameloyiv
 * Date: 2/1/13
 * Time: 5:11 PM
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
public class AbstractNormObjectThing< K extends INormId<?>,V extends INormThing<K,?>> extends AbstractNormThing<K,V> implements INormThing<K,V> {

    public AbstractNormObjectThing(K id) {
        super(id);
    }

    protected AbstractNormObjectThing(K id, V thing) {
        super(id, thing);
    }

    public AbstractNormObjectThing(V thing) {
        super((K) new ObjectId(), thing);
    }
}
