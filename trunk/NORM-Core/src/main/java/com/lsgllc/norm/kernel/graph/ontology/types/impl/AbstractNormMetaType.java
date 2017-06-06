package com.lsgllc.norm.kernel.graph.ontology.types.impl;

import com.lsgllc.norm.kernel.graph.identity.INormId;
import com.lsgllc.norm.kernel.graph.ontology.identity.impl.AbstractNormMetaId;
import com.lsgllc.norm.kernel.graph.identity.typing.INormType;
import com.lsgllc.norm.kernel.graph.identity.typing.impl.AbstractNormType;

/**
 * Created By: sameloyiv
 * Date: 1/4/13
 * Time: 2:44 PM
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
public   class AbstractNormMetaType<T extends ELEMENT_TYPES>  extends AbstractNormType<T> {
    protected INormId<T> id;

    protected AbstractNormMetaType(T type) {
        super(type);
        this.id = (INormId<T>) AbstractNormMetaId.createId(type);
    }

    public  static INormType<THING_TYPES> createType(THING_TYPES type) {

        INormType<THING_TYPES> normType = null;
        switch (type) {
            case ONTOLOGY:
                break;
            case ONT_SEGMENT:
                break;
            case OBJECT_STORE:
                break;
            case OBJECT:
                break;
            case ENTITY:
                break;
            case ATTRIBUTE:
                break;
            case PROPERTY:
                break;
            case VALUE:
                break;
            case TRIPLE:
                break;
            case PREDICATE:
                break;
            case TYPE:
                break;
        }
        return normType;

    }
}
