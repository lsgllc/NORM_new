package com.lsgllc.norm.kernel.graph.things.impl;

import com.lsgllc.norm.kernel.graph.identity.INormKey;

import java.util.UUID;

/**
 * Created By: sameloyiv
 * Date: 6/5/17
 * Time: 11:03 PM
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
public abstract class AbstractKey<K extends UUID> implements INormKey<K> {

    protected K key;

    public AbstractKey(K key) {
        this.key = key;
    }

    public AbstractKey(){
        this((K) UUID.randomUUID());
    }

    public void setKey(K key) {

    }

    public K getKey() {
        return null;
    }
}
