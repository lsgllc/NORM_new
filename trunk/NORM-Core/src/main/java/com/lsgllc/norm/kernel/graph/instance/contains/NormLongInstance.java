package com.lsgllc.norm.kernel.graph.instance.contains;

import com.lsgllc.norm.kernel.graph.instance.INormInstance;
import com.lsgllc.norm.kernel.graph.instance.identity.impl.LongId;
import com.lsgllc.norm.kernel.graph.instance.impl.scalar.AbstractNormLongInstance;
import com.lsgllc.norm.kernel.graph.instance.types.impl.LongType;
import com.lsgllc.norm.kernel.graph.things.INormThing;

/**
 * Created By: sameloyiv
 * Date: 2/5/13
 * Time: 6:11 AM
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
public class NormLongInstance extends AbstractNormLongInstance<LongId,INormThing<?,?>,INormInstance<LongId,INormThing<?,?>,LongType>>{
    public NormLongInstance(Long value) {
        super(value);
    }
}
