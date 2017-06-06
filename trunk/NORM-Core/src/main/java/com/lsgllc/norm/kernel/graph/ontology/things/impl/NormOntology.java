package com.lsgllc.norm.kernel.graph.ontology.things.impl;

import com.lsgllc.norm.kernel.graph.ontology.identity.impl.OntologyId;
import com.lsgllc.norm.kernel.graph.ontology.identity.impl.OntologySegmentId;
import com.lsgllc.norm.kernel.graph.things.INormThing;
import com.lsgllc.norm.kernel.depricated.impl.AbstractNormOntology;

/**
 * Created By: sameloyiv
 * Date: 2/4/13
 * Time: 1:09 PM
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
public class NormOntology <K extends OntologyId,V extends INormThing<K,OntologySegmentId>> extends AbstractNormOntology<K,V> {
    public NormOntology(K id) {
        super(id);
    }

    protected NormOntology(K id, V thing) {
        super(id, thing);
    }

    public NormOntology(V thing) {
        super(thing);
    }
}
