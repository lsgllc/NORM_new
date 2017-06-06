package com.lsgllc.norm.kernel.graph.instance.identity.impl;

import java.util.UUID;

/**
 * Created By: sameloyiv
 * Date: 2/3/13
 * Time: 4:05 PM
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
public class DoubleId extends AbstractNormInstanceId<INSTANCE_TYPE> {
    public DoubleId(String canonicalName) {
        super(INSTANCE_TYPE.DOUBLE, UUID.fromString(canonicalName));
    }

    public DoubleId() {
        super(INSTANCE_TYPE.DOUBLE);
    }
}
