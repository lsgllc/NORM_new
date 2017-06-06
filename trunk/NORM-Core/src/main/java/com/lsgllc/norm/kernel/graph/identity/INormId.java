package com.lsgllc.norm.kernel.graph.identity;

import com.lsgllc.norm.kernel.graph.identity.typing.INormType;
import com.lsgllc.norm.kernel.graph.things.IKeyValuePair;

import java.util.UUID;

/**
 * Created By: sameloyiv
 * Date: 12/31/12
 * Time: 11:30 AM
 * <p/>
 * <p/>
 * (c) Loy Services Group, LLC. 2008-2014
 * ---------------------------------------------------------------------
 * Change History:
 * Name		    Date		Description
 * ------------	-----------	--------------------------------------------
 *
 * @author
 * @description
 * @date
 */
public interface INormId<T, KV extends IKeyValuePair<?,?>> extends INormType<T>, IKeyValuePair<K, V> {
    KV getKey();

}
