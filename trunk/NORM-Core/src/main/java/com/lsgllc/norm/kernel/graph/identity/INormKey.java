package com.lsgllc.norm.kernel.graph.identity;

import java.util.UUID;

/**
 * Created By: sameloyiv
 * Date: 6/5/17
 * Time: 9:36 PM
 * <p/>
 * <p/>
 * (c) Texas Department of Motor Vehicles  2017
 * ---------------------------------------------------------------------
 * Change History:
 * Name		    Date		Description
 * ------------	-----------	--------------------------------------------
 *
 * @author
 * @description
 * @date
 */
public interface INormKey<K> {
    public void setKey(K key);
    public K getKey();
}
