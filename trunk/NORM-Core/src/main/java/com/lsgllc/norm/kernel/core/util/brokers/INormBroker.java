package com.lsgllc.norm.kernel.core.util.brokers;


import com.lsgllc.norm.kernel.graph.identity.INormId;
import org.apache.camel.Component;

import java.util.concurrent.ConcurrentNavigableMap;

/**
 * Created By: sameloyiv
 * Date: 3/6/13
 * Time: 5:32 PM
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
public interface INormBroker<K,V> extends ConcurrentNavigableMap<K,V>,Component {
    INormId<K> getId(String key);
    ClassLoader getContextClassLoader();
    V get(String key);
    void remove(String key);
    void update(String key);
    K add(K key, V value);
}
