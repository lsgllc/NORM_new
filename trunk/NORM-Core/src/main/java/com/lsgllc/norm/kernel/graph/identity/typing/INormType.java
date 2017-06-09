package com.lsgllc.norm.kernel.graph.identity.typing;


import jdk.internal.org.objectweb.asm.Opcodes;

/**
 * Created By: sameloyiv
 * Date: 1/4/13
 * Time: 3:16 PM
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
public interface INormType<T>  {
    interface ITyped{};
    enum THING_TYPES implements ITyped{
        ONTOLOGY,ONT_SEGMENT,OBJECT_STORE,OBJECT,ENTITY,ATTRIBUTE,PROPERTY,VALUE, TYPE
    }
    enum INSTANCE_TYPE implements Opcodes,ITyped {
        BOOLEAN,CHAR, FLOAT,DOUBLE,BYTE,SHORT,INTEGER,LONG,STRING,OBJECT
    }
    enum OWL_TYPE implements ITyped  {
        SUBJECT, TRIPLE, PREDICATE
    }
    enum RELATIONSHIP implements ITyped {
         HAS_ONE_OR_MORE, HAS_ZERO_OR_MORE, IS_CONTAINED_BY, REFERENCED_BY
     }

     INormType<T> getType();
     void setType(INormType<T> type);
}
