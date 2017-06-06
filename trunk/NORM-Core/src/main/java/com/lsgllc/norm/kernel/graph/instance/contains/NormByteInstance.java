package com.lsgllc.norm.kernel.graph.instance.contains;

import com.lsgllc.norm.kernel.graph.instance.INormInstance;
import com.lsgllc.norm.kernel.graph.instance.identity.impl.ByteId;
import com.lsgllc.norm.kernel.graph.instance.impl.scalar.AbstractNormByteInstance;
import com.lsgllc.norm.kernel.graph.instance.types.impl.ByteType;
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
public class NormByteInstance extends AbstractNormByteInstance<ByteId,INormThing<?,?>,INormInstance<ByteId,INormThing<?,?>,ByteType>> {
    public NormByteInstance(Byte value) {
        super(value);
    }
}
