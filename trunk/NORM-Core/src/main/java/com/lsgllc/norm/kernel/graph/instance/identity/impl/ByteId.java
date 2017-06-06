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
public class ByteId  extends AbstractNormInstanceId<INSTANCE_TYPE> {
    public ByteId(String canonicalName) {
        super(INSTANCE_TYPE.BYTE, UUID.fromString(canonicalName));
    }

    public ByteId() {
        super(INSTANCE_TYPE.BYTE);
    }
}
