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
public class CharId extends AbstractNormInstanceId<INSTANCE_TYPE> {
    public CharId(String canonicalName) {
        super(INSTANCE_TYPE.CHAR, UUID.fromString(canonicalName));
    }

    public CharId() {
        super(INSTANCE_TYPE.CHAR);
    }
}
