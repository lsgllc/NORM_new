package com.lsgllc.norm.kernel.graph.identity;

import com.lsgllc.norm.kernel.graph.identity.typing.INormType;
import com.lsgllc.norm.kernel.graph.identity.typing.INormTypeContainer;
import com.lsgllc.norm.kernel.graph.things.INormThing;
import com.lsgllc.norm.kernel.graph.things.impl.AbstractKeyValuePair;

import java.util.UUID;

/**
 * Created By: sameloyiv
 * Date: 6/5/17
 * Time: 11:21 PM
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
public class AbstractNormId<T extends INormType<?>,K extends UUID,V extends INormThing<?,?,?>> extends AbstractKeyValuePair<K,V> implements INormId<T,K,V> {
    protected T type;
    protected K id;

    public K getUUID() {
        return id;
    }


    public INormType<T> getType() {
        return null;
    }


    }
}
