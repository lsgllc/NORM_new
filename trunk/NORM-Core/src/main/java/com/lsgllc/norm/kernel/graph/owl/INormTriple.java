package com.lsgllc.norm.kernel.graph.owl;

import com.lsgllc.norm.kernel.graph.INormContainer;
import com.lsgllc.norm.kernel.graph.identity.INormId;

import java.util.Set;
import java.util.UUID;

/**
 * Created By: sameloyiv
 * Date: 1/4/13
 * Time: 2:22 PM
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
public interface INormTriple<V extends Set<INormId<UUID>>> extends INormContainer<INormId<UUID>, V> {
    Set<V> getAllContainedBy();
    Set<V> getAllContainedIn();
    Set<V> getAllReferencedBy();
}
