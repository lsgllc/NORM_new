package com.lsgllc.norm.kernel.core.util.brokers;


import com.lsgllc.norm.kernel.graph.INormContainer;
import com.lsgllc.norm.kernel.graph.identity.INormId;
import com.lsgllc.norm.kernel.graph.identity.typing.INormType;
import org.apache.camel.Component;


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
public interface INormBroker<T ,K ,V> {

    V getOntology(K ontology);

}
