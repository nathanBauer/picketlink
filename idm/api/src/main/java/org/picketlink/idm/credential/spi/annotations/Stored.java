package org.picketlink.idm.credential.spi.annotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * This annotation denotes a property of a Class implementing the CredentialStorage
 * interface as being persistent.  Properties annotated with @Stored must be
 * Serializable.
 * 
 * @author Shane Bryzak
 */
@Target({FIELD, METHOD})
@Documented
@Retention(RUNTIME)
@Inherited
public @interface Stored {

}
