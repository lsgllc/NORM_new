package com.lsgllc.norm.kernel.graph.instance.impl;

import com.lsgllc.norm.kernel.graph.identity.INormId;
import com.lsgllc.norm.kernel.graph.instance.types.INormInstanceType;
import com.lsgllc.norm.kernel.graph.ontology.identity.impl.AbstractNormMetaId;
import com.lsgllc.norm.kernel.graph.identity.typing.INormType;

/**
 * Created By: sameloyiv
 * Date: 2/7/13
 * Time: 3:52 PM
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
public class NormObjectValue<V, T extends ELEMENT_TYPES> extends AbstractNormValue<V,T> {
    //    private INormInstanceType<T> valueType;
    private V value = null;

    public NormObjectValue(V value, T metaType) {
        super(value, (INormId<T>) AbstractNormMetaId.createId(metaType));
        this.value = value;
//        this.metaType = metaType;
    }


    public INormInstanceType<T> getValueType() {
        return (INormInstanceType<T>) this.getId().getObjType();
    }

    public void setValueType(INormInstanceType<T> valueType) {
        this.getId().setObjType((INormType<T>) valueType);
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
