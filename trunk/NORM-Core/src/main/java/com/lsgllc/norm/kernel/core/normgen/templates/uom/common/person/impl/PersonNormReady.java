package com.lsgllc.norm.kernel.core.normgen.templates.uom.common.person.impl;

import com.lsgllc.norm.client.persistence.INormPersistable;
import com.lsgllc.norm.kernel.graph.instance.INormInstance;
import com.lsgllc.norm.kernel.graph.instance.identity.impl.ObjectInstanceId;
import com.lsgllc.norm.kernel.graph.instance.impl.owl.AbstractEntityInstance;
import com.lsgllc.norm.util.exceptions.NormNotFoundException;
import com.lsgllc.norm.kernel.core.normgen.templates.uom.common.contact.IContactInformation;
import com.lsgllc.norm.kernel.core.normgen.templates.uom.common.person.IPersonNormReady;
import com.lsgllc.norm.kernel.core.normgen.templates.uom.common.person.PERSON_TYPE;
import com.lsgllc.norm.kernel.core.normgen.templates.uom.common.vehicle.IVehicle;
import com.lsgllc.norm.kernel.core.normgen.templates.uom.exceptions.StrangeAndWonderfulException;
import com.lsgllc.norm.kernel.core.normgen.templates.uom.exceptions.UOMSpecifiedException;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

/**
 * Created By: sameloyiv
 * Date: 12/14/12
 * Time: 10:26 AM
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
public class PersonNormReady<T extends INSTANCE_TYPE, K extends ObjectInstanceId, V extends INormInstance<?,?,T>>  extends AbstractEntityInstance<K,V,T> implements IPersonNormReady<PERSON_TYPE>, INormPersistable {

    public PersonNormReady() {
        super(PersonNormReady.class.getCanonicalName(),null);
    }


    @Override
    public PERSON_TYPE getType() throws NormNotFoundException {
        return (PERSON_TYPE) this.getValue(this.getClass().getCanonicalName(), "type");
    }
    @Override
    public String getFirstName() throws UOMSpecifiedException, StrangeAndWonderfulException, NormNotFoundException {
        return (String) this.getValue(this.getClass().getCanonicalName(), "firstName");
    }


    @Override
    public String getMiddleName() throws UOMSpecifiedException, StrangeAndWonderfulException, NormNotFoundException {
        return (String) this.getValue(this.getClass().getCanonicalName(), "middleName");
    }


    @Override
    public String getLastName() throws UOMSpecifiedException, StrangeAndWonderfulException, NormNotFoundException {
        return (String) this.getValue(this.getClass().getCanonicalName(), "lastName");
    }


    @Override
    public String getSalutation() throws UOMSpecifiedException, StrangeAndWonderfulException, NormNotFoundException {
        return (String) this.getValue(this.getClass().getCanonicalName(), "salutation");
    }


    @Override
    public String getNameSuffix() throws UOMSpecifiedException, StrangeAndWonderfulException, NormNotFoundException {
        return (String) this.getValue(this.getClass().getCanonicalName(), "nameSuffix");
    }


    @Override
    public Set<HashMap<IContactInformation, List<String>>> getKnownAddresses() throws UOMSpecifiedException, StrangeAndWonderfulException, NormNotFoundException {
        return (Set<HashMap<IContactInformation, List<String>>>) this.getValue(this.getClass().getCanonicalName(), "knownAddresses");
    }
    @Override
    public List<IVehicle> getAllVehicles() throws UOMSpecifiedException, StrangeAndWonderfulException, NormNotFoundException {
        return (List<IVehicle>) this.getValue(this.getClass().getCanonicalName(), "allVehicles");
    }

    @Override
    public void setLastName(String lastName) throws UOMSpecifiedException, StrangeAndWonderfulException {
        this.setValue(lastName, this.getClass().getCanonicalName(), "lastName");
    }
    @Override
    public void setType(PERSON_TYPE personType) {
        this.setValue(personType, this.getClass().getCanonicalName(), "type");
    }
    @Override
    public void setFirstName(String firstName) throws UOMSpecifiedException, StrangeAndWonderfulException {
        this.setValue(firstName, this.getClass().getCanonicalName(), "firstName");
    }
    @Override
    public void setMiddleName(String middleName) throws UOMSpecifiedException, StrangeAndWonderfulException {
        this.setValue(middleName, this.getClass().getCanonicalName(), "middleName");
    }
    @Override
    public void setSalutation(String salutation) throws UOMSpecifiedException, StrangeAndWonderfulException {
        this.setValue(salutation, this.getClass().getCanonicalName(), "salutation");
    }
    @Override
    public void setNameSuffix(String nameSuffix) throws UOMSpecifiedException, StrangeAndWonderfulException {
        this.setValue(nameSuffix, this.getClass().getCanonicalName(), "nameSuffix");
    }
    @Override
    public void setKnownAddresses(Set<HashMap<IContactInformation, List<String>>> knownAddresses) throws UOMSpecifiedException, StrangeAndWonderfulException, NormNotFoundException {
        this.setValue(knownAddresses, this.getClass().getCanonicalName(), "knownAddresses");
    }
}
