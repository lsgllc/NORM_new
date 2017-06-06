package com.lsgllc.norm.kernel.graph.instance.identity.impl;

import java.util.UUID;

/**
 * Created By: sameloyiv
 * Date: 2/3/13
 * Time: 4:04 PM
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
public class IntegerId extends AbstractNormInstanceId<INSTANCE_TYPE> {
    public IntegerId(String canonicalName) {
        super(INSTANCE_TYPE.INTEGER, UUID.fromString(canonicalName));
    }

    public IntegerId() {
        super(INSTANCE_TYPE.INTEGER);
    }
}
