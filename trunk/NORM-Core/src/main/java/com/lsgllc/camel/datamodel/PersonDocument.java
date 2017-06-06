package com.lsgllc.camel.datamodel;

/**
 * Created By: sameloyiv
 * Date: 12/11/12
 * Time: 12:19 PM
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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @version
 */
@XmlRootElement(name = "person")
@XmlAccessorType(XmlAccessType.FIELD)
public class PersonDocument {
    @XmlAttribute
    private String user;
    @XmlElement
    private String firstName;
    @XmlElement
    private String lastName;
    @XmlElement
    private String city;

    @Override
    public String toString() {
        return "PersonOld[user: " + user + "]";
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
