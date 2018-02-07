/**
* $HeadURL$
* $LastChangedRevision$
* $LastChangedDate$
* $Author$
* Created on 05.02.2018, 19:06:16
* ===========================================================================
* Copyright (c) 2006-2018 OrgaCard Siemantel & Alt GmbH. All rights reserved.
*/

package de.haruko.mobiledevice.entity.mapper;

import org.eclipse.persistence.expressions.Expression;
import org.eclipse.persistence.descriptors.ClassDescriptor;
import org.eclipse.persistence.expressions.ExpressionBuilder;
import org.eclipse.persistence.sessions.factories.DescriptorCustomizer;


public class WarddistributionCustomizer implements DescriptorCustomizer {
    @Override
    public void customize(ClassDescriptor descriptor) {
        ExpressionBuilder wardDistribution = new ExpressionBuilder();
        Expression expression = wardDistribution.getField("MDEV_ISBEDCENTER").equal((short)0)
                .and(wardDistribution.getField("MDEV_ISPREPARATIONDEVICE").equal((short)0))
                .and(wardDistribution.getField("MDEV_ISTRANSPORTDEVICE").equal((short)0))
                .and(wardDistribution.getField("MDEV_ISCLEANINGDEVICE").equal((short)0));
        descriptor.getInheritancePolicy().setOnlyInstancesExpression(expression);
    }
}