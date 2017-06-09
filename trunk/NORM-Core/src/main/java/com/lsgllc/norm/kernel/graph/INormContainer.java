package com.lsgllc.norm.kernel.graph;

import java.net.URI;
import java.util.Map;


/**
 * Created By: sameloyiv
 * Date: 12/6/12
 * Time: 12:37 PM
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
public interface INormContainer< K, V > extends Map<K,V> {
    URI getEntityURI();

}
