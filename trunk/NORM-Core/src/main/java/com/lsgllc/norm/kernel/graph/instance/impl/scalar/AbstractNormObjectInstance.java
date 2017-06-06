package com.lsgllc.norm.kernel.graph.instance.impl.scalar;

import com.lsgllc.norm.kernel.graph.instance.impl.NormScalarValue;
import com.lsgllc.norm.kernel.graph.ontology.identity.impl.ObjectId;
import com.lsgllc.norm.kernel.graph.things.INormThing;

/**
 * Created By: sameloyiv
 * Date: 2/7/13
 * Time: 12:09 AM
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
public class AbstractNormObjectInstance<K extends ObjectId,V extends INormThing<?,?>,T> extends AbstractNormInstance<K,V,T> {
    public AbstractNormObjectInstance(INormThing<?,?> value) {
        super((K) new ObjectId(), new NormScalarValue(value, INSTANCE_TYPE.BOOLEAN));
    }
}
