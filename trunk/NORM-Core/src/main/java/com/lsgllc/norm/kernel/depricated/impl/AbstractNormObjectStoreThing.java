package com.lsgllc.norm.kernel.depricated.impl;

import com.lsgllc.norm.kernel.graph.things.INormThing;
import com.lsgllc.norm.kernel.graph.identity.INormId;
import com.lsgllc.norm.kernel.graph.ontology.identity.impl.ObjectStoreId;
import com.lsgllc.norm.kernel.depricated.INormObjectStore;
import com.lsgllc.norm.kernel.graph.things.impl.AbstractNormThing;

/**
 * Created By: sameloyiv
 * Date: 1/7/13
 * Time: 4:21 PM
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
public class AbstractNormObjectStoreThing< K extends INormId<?>,V extends INormThing<K,?>> extends AbstractNormThing<K,V> implements INormObjectStore<K,V> {


    public AbstractNormObjectStoreThing(K id) {
        super(id);
    }

    protected AbstractNormObjectStoreThing(K id, V thing) {
        super(id, thing);
    }

    public AbstractNormObjectStoreThing(V thing) {
        super((K) new ObjectStoreId(), thing);
    }
}
