package com.lsgllc.norm.kernel.graph.things.impl;

import com.lsgllc.norm.kernel.core.util.containment.impl.AbstractNormContainer;
import com.lsgllc.norm.kernel.graph.things.INormThing;
import com.lsgllc.norm.kernel.graph.identity.typing.INormType;
import com.lsgllc.norm.util.client.INormIdentifyable;
import com.lsgllc.norm.util.exceptions.NormNotFoundException;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

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
public abstract class AbstractNormThing<T, K ,V extends INormThing<?,?,?>> extends AbstractNormContainer<K,V> implements INormThing<T,K,V>{

    private K id;
    private V thing;


    public AbstractNormThing(K id) {
        this.id = id;
    }

    public AbstractNormThing(K id, V thing) {
        this(id);
        this.thing = thing;
    }




}
