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


public class DecentralcleaningCustomizer implements DescriptorCustomizer {
    @Override
    public void customize(ClassDescriptor descriptor) {
        ExpressionBuilder centralCleaning = new ExpressionBuilder();
        Expression expression = centralCleaning.getField("MDEV_ISBEDCENTER").equal((short)0).and(centralCleaning.getField("MDEV_ISCLEANINGDEVICE").equal((short)0));
        descriptor.getInheritancePolicy().setOnlyInstancesExpression(expression);
    }
}