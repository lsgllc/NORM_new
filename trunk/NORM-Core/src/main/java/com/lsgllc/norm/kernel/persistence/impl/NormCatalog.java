package com.lsgllc.norm.kernel.persistence.impl;

import com.lsgllc.norm.kernel.core.util.containment.impl.AbstractNormContainer;
import com.lsgllc.norm.kernel.graph.instance.identity.IOntologyId;
import com.lsgllc.norm.kernel.depricated.INormObject;
import com.lsgllc.norm.kernel.persistence.INormCatalog;

/**
 * Created By: sameloyiv
 * Date: 10/10/14
 * Time: 12:41 PM
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
public class NormCatalog<K extends IOntologyId<INormObject>,V> extends AbstractNormContainer<K,V> implements INormCatalog<K,V> {
}

