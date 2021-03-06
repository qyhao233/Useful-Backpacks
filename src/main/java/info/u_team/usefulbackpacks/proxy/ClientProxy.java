package info.u_team.usefulbackpacks.proxy;

import info.u_team.usefulbackpacks.render.*;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.relauncher.*;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	
	public void preinit(FMLPreInitializationEvent event) {
		super.preinit(event);
		new UsefulBackPacksModelRegistry();
	}
	
	public void init(FMLInitializationEvent event) {
		super.init(event);
		new UsefulBackPacksRenderRegistry();
	}
	
	public void postinit(FMLPostInitializationEvent event) {
		super.postinit(event);
	}
}
