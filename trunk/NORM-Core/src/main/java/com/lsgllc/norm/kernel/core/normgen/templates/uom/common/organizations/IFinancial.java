package com.lsgllc.norm.kernel.core.normgen.templates.uom.common.organizations;

import com.lsgllc.norm.kernel.core.normgen.templates.uom.common.lien.ILien;

import java.util.Set;

/**
 * Created By: sameloyiv
 * Date: 9/19/12
 * Time: 12:53 PM
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
public interface IFinancial<T extends ORGANIZATION_TYPES> extends IOrganization<T> {
    Set<ILien> getLiens();
}
