package com.lsgllc.norm.kernel.core.normgen.templates.uom.common.vehicle;

import com.lsgllc.norm.kernel.core.normgen.templates.uom.common.organizations.IOrganization;

import java.io.Serializable;
import java.util.Set;

/**
 * Created By: sameloyiv
 * Date: 10/11/12
 * Time: 4:22 PM
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
public interface IOwner<O extends IOrganization, V extends IVehicle> extends Serializable {
    Set<O> getOwners();

    Set<V> getVehicles();

    V getVehicleByVIN(IVIN vin);

    V getVehicleByOwner(O owner);

}
