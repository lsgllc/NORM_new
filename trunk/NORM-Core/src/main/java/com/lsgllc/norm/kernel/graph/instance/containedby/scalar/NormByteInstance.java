package com.lsgllc.norm.kernel.graph.instance.containedby.scalar;

import com.lsgllc.norm.kernel.graph.instance.INormInstance;
import com.lsgllc.norm.kernel.graph.instance.identity.impl.ByteId;
import com.lsgllc.norm.kernel.graph.instance.impl.scalar.AbstractNormByteInstance;
import com.lsgllc.norm.kernel.graph.instance.types.impl.ByteType;
import com.lsgllc.norm.kernel.depricated.INormProperty;
import com.lsgllc.norm.kernel.graph.identity.typing.INormType;

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
public class NormByteInstance extends AbstractNormByteInstance<ByteId,INormInstance<INormProperty,INormInstance,INormType<INSTANCE_TYPE>>,ByteType> {
    public NormByteInstance(Byte value) {
        super(value);
    }
}
