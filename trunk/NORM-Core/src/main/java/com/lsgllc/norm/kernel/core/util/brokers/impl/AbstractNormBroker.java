package com.lsgllc.norm.kernel.core.util.brokers.impl;

import com.lsgllc.norm.kernel.core.util.brokers.INormBroker;
import com.lsgllc.norm.kernel.graph.INormContainer;
import com.lsgllc.norm.kernel.graph.identity.INormId;
import com.lsgllc.norm.kernel.graph.identity.typing.INormType;
import org.apache.camel.*;

import java.util.concurrent.*;

/**
 * Created By: sameloyiv
 * Date: 3/11/13
 * Time: 5:14 PM
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
public class AbstractNormBroker<K, V> implements INormBroker<INormType.ITyped,K,V> {


    public V getOntology(K ontology) {
        //TODO: INCOMPLETE - Implement ontology retrieval functionality
        return null;
    }
}
