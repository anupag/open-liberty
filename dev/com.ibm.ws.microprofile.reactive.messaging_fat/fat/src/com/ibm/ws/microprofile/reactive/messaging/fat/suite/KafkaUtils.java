/*******************************************************************************
 * Copyright (c) 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.microprofile.reactive.messaging.fat.suite;

import java.io.File;
import java.net.URL;

/**
 *
 */
public class KafkaUtils {

    public static File[] kafkaClientLibs() {
        File libsDir = new File("lib/LibertyFATTestFiles/libs");
        return libsDir.listFiles();
    }

    public static URL kafkaPermissions() {
        return KafkaUtils.class.getResource("permissions.xml");
    }

}