package com.lsgllc.norm.kernel.persistence;

import com.lsgllc.norm.kernel.graph.INormContainer;
import com.lsgllc.norm.kernel.graph.instance.identity.IOntologyId;
import com.lsgllc.norm.kernel.depricated.INormObject;
import com.lsgllc.norm.kernel.graph.things.INormThing;

/**
 * Created By: sameloyiv
 * Date: 10/10/14
 * Time: 12:39 PM
 * <p/>
 * <p/>
 * (c) Texas Department of Motor Vehicles  2014
 * ---------------------------------------------------------------------
 * Change History:
 * Name		    Date		Description
 * ------------	-----------	--------------------------------------------
 *
 * @author
 * @description
 * @date
 */
public interface INormCatalog <K extends IOntologyId<INormObject>,V extends INormThing<K,V>> extends INormContainer<K, V> {
}
