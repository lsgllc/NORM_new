package com.lsgllc.norm.kernel.graph.owl;

import com.lsgllc.norm.kernel.graph.INormContainer;

import java.io.Serializable;
import java.util.concurrent.ConcurrentSkipListSet;

/**
 * Created By: sameloyiv
 * Date: 1/3/13
 * Time: 10:26 AM
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
public interface INormOntology<K,V> extends INormContainer<K, ConcurrentSkipListSet<V>>,Serializable {
}
