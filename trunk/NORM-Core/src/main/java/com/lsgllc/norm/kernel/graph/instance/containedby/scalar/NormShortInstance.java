package com.lsgllc.norm.kernel.graph.instance.containedby.scalar;

import com.lsgllc.norm.kernel.graph.instance.INormInstance;
import com.lsgllc.norm.kernel.graph.instance.impl.scalar.AbstractNormShortInstance;
import com.lsgllc.norm.kernel.graph.instance.types.impl.ShortId;
import com.lsgllc.norm.kernel.graph.instance.types.impl.ShortType;
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
public class NormShortInstance extends AbstractNormShortInstance<ShortId,INormInstance<INormProperty,INormInstance,INormType<INSTANCE_TYPE>>,ShortType> {
    public NormShortInstance(Short value) {
        super(value);
    }
}
