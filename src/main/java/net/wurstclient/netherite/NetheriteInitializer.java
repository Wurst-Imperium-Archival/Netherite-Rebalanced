/*
 * Copyright (C) 2019 | Wurst-Imperium | All rights reserved.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.netherite;

import net.fabricmc.api.ModInitializer;

public final class NetheriteInitializer implements ModInitializer
{
	private static boolean initialized;
	
	@Override
	public void onInitialize()
	{
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		
		if(initialized)
			throw new RuntimeException(
				"MoGlassInitializer.onInitialize() ran twice!");
		
		NetheriteRebalanced.INSTANCE.initialize();
		initialized = true;
	}
}
