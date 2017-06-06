package com.lsgllc.norm.kernel.depricated.impl;

import com.lsgllc.norm.kernel.graph.identity.INormId;
import com.lsgllc.norm.kernel.graph.ontology.identity.impl.OntologyId;
import com.lsgllc.norm.kernel.graph.owl.INormOntology;
import com.lsgllc.norm.kernel.graph.things.INormThing;
import com.lsgllc.norm.kernel.graph.things.impl.AbstractNormThing;

/**
 * Created By: sameloyiv
 * Date: 1/2/13
 * Time: 5:38 PM
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
@Deprecated
public class AbstractNormOntology<K extends INormId<?>,V extends INormThing<K,?>> extends AbstractNormThing<K,V> implements INormOntology<K,V> {

    public AbstractNormOntology(K id) {
        super(id);
    }

    protected AbstractNormOntology(K id, V thing) {
        super(id, thing);
    }

    public AbstractNormOntology(V thing) {
        super((K) new OntologyId(), thing);
    }




//    private V persistMember(K entityURISegment) {
//        V lastSegment = null,thisSegment = null;
//        int separatorLocation = entityURISegment.indexOf(".");
//        if (separatorLocation>0){
//            thisSegment = (V) new NormOntology(entityURISegment.substring(0,separatorLocation-1));
//            lastSegment = (V) persistMember(entityURISegment.substring(separatorLocation+1));
//        } else if (separatorLocation == 0){
//            thisSegment = (V) new NormOntology(entityURISegment.substring(1));
//        } else {
//            return null;
//        }
//        if (lastSegment != null){
//            thisSegment.put(lastSegment.getEntityURI(),lastSegment);
//        }
//        return thisSegment;
//
//    }

//    @Override
//    public INormOntologySegment persistMember(Object entityURISegment) {
//        return null;
//    }
}
