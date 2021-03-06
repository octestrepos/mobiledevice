/**
* $HeadURL$
* $LastChangedRevision$
* $LastChangedDate$
* $Author$
* Created on 05.02.2018, 18:45:08
* ===========================================================================
* Copyright (c) 2006-2018 OrgaCard Siemantel & Alt GmbH. All rights reserved.
*/

package de.haruko.mobiledevice.entity;

import de.haruko.mobiledevice.entity.mapper.TransportationCustomizer;
import java.io.Serializable;
import javax.persistence.Entity;
import org.eclipse.persistence.annotations.Customizer;

@Entity
@Customizer(TransportationCustomizer.class)
public class Transportdevice extends Mobiledevice implements Serializable, IMobiledevice {

}
