
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid = "BLackTower_LMM", name = "BlackTower Beta", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class BlackTower{
	
	@Instance("BlackTower")
    public static BlackTower instance;
	
	//@SidedProxy(clientSide="ClientProxy", serverSide="CommonProxy")
    //public static CommonProxy proxy;
	
	@PreInit
    public void preInit(FMLPreInitializationEvent event) {
            
    }
	
	@Init
    public void load(FMLInitializationEvent event) {
            //proxy.registerRenderers();
    }
    
	@PostInit
    public void postInit(FMLPostInitializationEvent event) {
            
    }

}