package com.lsgllc.norm.kernel.graph.ontology.things.impl.containedby;

import com.lsgllc.norm.kernel.graph.ontology.identity.impl.ObjectStoreId;
import com.lsgllc.norm.kernel.graph.ontology.identity.impl.OntologySegmentId;
import com.lsgllc.norm.kernel.graph.things.INormThing;
import com.lsgllc.norm.kernel.depricated.impl.AbstractOntologySegment;

/**
 * Created By: sameloyiv
 * Date: 2/4/13
 * Time: 1:16 PM
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
public class NormOntologySegment<K extends OntologySegmentId,V extends INormThing<K,ObjectStoreId>> extends AbstractOntologySegment<K,V> {
    public NormOntologySegment(K id) {
        super(id);
    }

    protected NormOntologySegment(K id, V thing) {
        super(id, thing);
    }

    public NormOntologySegment(V thing) {
        super(thing);
    }
}
