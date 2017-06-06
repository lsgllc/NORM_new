package com.lsgllc.norm.kernel.graph.instance.impl.owl;

import com.lsgllc.norm.kernel.graph.identity.INormId;
import com.lsgllc.norm.kernel.graph.instance.INormInstance;
import com.lsgllc.norm.kernel.graph.instance.identity.impl.ObjectInstanceId;
import com.lsgllc.norm.kernel.graph.instance.impl.NormObjectValue;
import com.lsgllc.norm.kernel.graph.instance.impl.scalar.AbstractNormInstance;
import com.lsgllc.norm.kernel.depricated.INormProperty;

/**
 * Created By: sameloyiv
 * Date: 2/7/13
 * Time: 3:21 PM
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
public class AbstractAttributeInstance<K extends INormId<INSTANCE_TYPE>,V extends INormInstance<?,?,T>,T> extends AbstractNormInstance<K,V,T> {
    public AbstractAttributeInstance(INormProperty<K, V> value) {
        super((K) new ObjectInstanceId(), new NormObjectValue(value, THING_TYPES.ATTRIBUTE));
    }
}
