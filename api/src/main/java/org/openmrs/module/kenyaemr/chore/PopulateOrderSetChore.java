/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.kenyaemr.chore;

import org.openmrs.api.PatientService;
import org.openmrs.module.kenyacore.chore.AbstractChore;
import org.openmrs.module.kenyaemr.orderset.OrderSetManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.PrintWriter;

@Component("kenyaemr.chore.populateOrderSetChore")
public class PopulateOrderSetChore extends AbstractChore {

	@Autowired
	private PatientService patientService;

	/**
	 * @see AbstractChore#perform(PrintWriter)
	 */
	@Override
	public void perform(PrintWriter output) {
		OrderSetManager setManager = new OrderSetManager();
		setManager.refresh();
	}
}
