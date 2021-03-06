package info.u_team.usefulbackpacks;

import org.apache.logging.log4j.*;

import net.minecraftforge.common.ForgeVersion;

public class UsefulBackPacksConstants {
	
	public static final String MODID = "usefulbackpacks";
	public static final String NAME = "Useful Backpacks";
	public static final String VERSION = "@VERSION@";
	public static final String MCVERSION = ForgeVersion.mcVersion;
	public static final String DEPENDENCIES = "required-after:uteamcore@[1.3.0,);";
	public static final String UPDATEURL = "https://api.u-team.info/update/usefulbackpacks.json";
	
	public static final String COMMONPROXY = "info.u_team.usefulbackpacks.proxy.CommonProxy";
	public static final String CLIENTPROXY = "info.u_team.usefulbackpacks.proxy.ClientProxy";
	
	public static final Logger LOGGER = LogManager.getLogger(NAME);
	
}