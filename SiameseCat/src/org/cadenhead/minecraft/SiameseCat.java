package org.cadenhead.minecraft;

import java.util.logging.*;
import org.bukkit.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.plugin.java.*;
import org.bukkit.craftbukkit.libs.jline.internal.Log; // For log.  

/** A player (CommandSender) typing the /siamesecat command will spawn a 
 * siamese cat that is owned by the player.  */
public class SiameseCat extends JavaPlugin {

	/** Logger object log is created as an instance variable which sends 
	 * message to the Minecraft server via getLogger("Minecraft").  */
	public static final Logger log = Logger.getLogger("Minecraft");
	
	/** Every mod I created for Spigot server has this onCommand method.  */
	public boolean onCommand(CommandSender sender, Command command, String label, String[] arguments) {
		
		/** In the Command Prompt, "label" is the String object that's passed to onCommand, 
		 * this means if I implement the command /siamesecat.  */
		if (label.equalsIgnoreCase("siamesecat")) {
			/** The sender object is instance of the class Player, then do the following:  */
			if (sender instanceof Player) {
				// Do something cool here.  
				/** Cast the sender as Player, and set the new object me with Player instance, 
				 * object me will inherit all attributes of the sender.  */
				Player me = (Player) sender; 
				/** Get the player's current location.  */
				Location spot = me.getLocation();
				/** Get the game world, getWorld() returns a World object that spawns an entire game world.  */
				World world = me.getWorld();
				/** Spawn one ocelot in the game world.  */
				Ocelot cat = world.spawn(spot, Ocelot.class);
				/** Make it a Siamese cat.  */
				cat.setCatType(Ocelot.Type.SIAMESE_CAT);
				/** Make the Player object "me" its owner.  */
				cat.setOwner(me);
				// Something cool ends here.  
				Log.info("SiameseCat Meow!");
				/** Return true inside the if block, and false outside of it.  It's a standard framework for a mod.  */
				return true;
			}
		}
		return false;
	}
	
}
