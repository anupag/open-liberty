/*******************************************************************************
 * Copyright (c) 2015, 2019 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package com.ibm.ws.ejbcontainer.remote.fat.xml.sf.ejb;

import javax.ejb.CreateException;
import javax.ejb.EJBHome;

/**
 * RemoteHome interface for basic Container Managed Transaction Stateful Session
 * bean.
 **/
public interface BasicCMTStatefulEJBRemoteHome extends EJBHome {
    /**
     * @return BasicCMTStatefulEJBRemote The StatefulBean EJB object.
     * @exception javax.ejb.CreateException
     *                StatefulBean EJB object was not created.
     */
    public BasicCMTStatefulEJBRemote create() throws CreateException, java.rmi.RemoteException;

}
