/*
 * Copyright (c) 2007-2012 bitExpert AG
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */


package de.bitexpert.eclipse.yuicompressor;


import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;


/**
 * The activator class controls the plug-in`s life cycle.
 *
 * @author	Stephan Hochdörfer <S.Hochdoerfer@bitExpert.de>
 */


public class YUIActivator extends AbstractUIPlugin
{
	/**
	 * The plug-in ID
	 */
	public static final String PLUGIN_ID = "de.bitexpert.eclipse.yuicompressor";
	/**
	 * The shared instance
	 */
	private static YUIActivator plugin;


	/**
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception
	{
		super.start(context);
		plugin = this;
	}


	/**
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception
	{
		plugin = null;
		super.stop(context);
	}


	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static YUIActivator getDefault()
	{
		return plugin;
	}
}