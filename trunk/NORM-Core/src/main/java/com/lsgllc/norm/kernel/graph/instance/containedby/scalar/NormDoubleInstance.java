package com.lsgllc.norm.kernel.graph.instance.containedby.scalar;

import com.lsgllc.norm.kernel.graph.instance.INormInstance;
import com.lsgllc.norm.kernel.graph.instance.identity.impl.DoubleId;
import com.lsgllc.norm.kernel.graph.instance.impl.scalar.AbstractNormDoubleInstance;
import com.lsgllc.norm.kernel.graph.instance.types.impl.DoubleType;
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
public class NormDoubleInstance extends AbstractNormDoubleInstance<DoubleId,INormInstance<INormProperty,INormInstance,INormType<INSTANCE_TYPE>>,DoubleType> {
    public NormDoubleInstance(Double value) {
        super(value);
    }
}
