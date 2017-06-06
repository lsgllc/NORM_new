package com.lsgllc.norm.kernel.graph.identity.typing.impl;

import com.lsgllc.norm.kernel.graph.identity.INormId;
import com.lsgllc.norm.kernel.graph.identity.typing.INormType;
import com.lsgllc.norm.util.client.INormIdentifyable;

/**
 * Created By: sameloyiv
 * Date: 1/4/13
 * Time: 2:44 PM
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
public  abstract class AbstractNormType<T> implements INormType<T>{
    protected T type;

    protected AbstractNormType(T type) {
        this.type = type;
    }


    public INormType<T> getType() {
        return null;
    }

    public void setType(INormType<T> type) {

    }
}
