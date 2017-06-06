package com.lsgllc.norm.kernel.graph.instance.identity.impl;

import java.util.UUID;

/**
 * Created By: sameloyiv
 * Date: 2/3/13
 * Time: 4:16 PM
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
public class ShortId extends AbstractNormInstanceId<INSTANCE_TYPE> {
    public ShortId(String canonicalName) {
        super(INSTANCE_TYPE.SHORT, UUID.fromString(canonicalName));
    }

    public ShortId() {
        super(INSTANCE_TYPE.SHORT);
    }
}
