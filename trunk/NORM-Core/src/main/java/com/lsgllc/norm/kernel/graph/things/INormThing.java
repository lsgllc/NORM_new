package com.lsgllc.norm.kernel.graph.things;

import com.lsgllc.norm.kernel.graph.INormContainer;
import com.lsgllc.norm.kernel.graph.identity.INormId;
import com.lsgllc.norm.util.exceptions.NormNotFoundException;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created By: sameloyiv
 * Date: 1/4/13
 * Time: 11:47 AM
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
public interface INormThing<T,K,V extends INormThing<?,?,? >> extends INormId<T,K,V>, INormContainer<K,V >, Serializable {
    V getThing() throws NormNotFoundException;
    void setThing(V thing);
}
