package com.lsgllc.norm.kernel.graph.identity.impl;

import com.lsgllc.norm.kernel.graph.identity.INormKey;

/**
 * Created by pls1526 on 6/6/2017.
 */
public class AbstractNormKey<K> implements INormKey<K> {

    protected K key;
    public void setKey(K key) {
        this.key = key;
    }

    public K getKey() {
        return this.key;
    }
}
