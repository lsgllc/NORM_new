package com.lsgllc.norm.kernel.graph.impl;

import com.lsgllc.norm.kernel.graph.INormContainer;

import java.net.URI;

/**
 * Created by pls1526 on 6/6/2017.
 */
public class AbstractNormContainer<K,V> extends AbstractNormHashMap<K,V> implements INormContainer<K,V> {
    public URI getEntityURI() {
        return null;
    }
}
