package com.lsgllc.norm.kernel.graph.identity.impl;

import com.lsgllc.norm.kernel.graph.identity.INormId;
import com.lsgllc.norm.kernel.graph.identity.typing.INormType;
import com.lsgllc.norm.kernel.graph.identity.typing.impl.NormType;

import java.util.UUID;

/**
 * Created By: sameloyiv
 * Date: 6/5/17
 * Time: 11:21 PM
 * <p/>
 * <p/>
 * (c) Texas Department of Motor Vehicles  2017
 * ---------------------------------------------------------------------
 * Change History:
 * Name		    Date		Description
 * ------------	-----------	--------------------------------------------
 *
 * @author
 * @description
 * @date
 */
public class NormId<T extends INormType.ITyped,K ,V > extends NormType<T> implements INormId<T,K,V> {
    protected NormType<T> type;
    protected K key;

    public NormId(T type) {
        super(type);
        this.key = (K) UUID.randomUUID();
    }

    public NormId(T type, K key){
        super(type);
        this.key = key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public K getKey() {
        return this.key;
    }

    public K getId() {
        return null;
    }
}
