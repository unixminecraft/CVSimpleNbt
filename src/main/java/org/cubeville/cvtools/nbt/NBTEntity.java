package org.cubeville.cvtools.nbt;

import org.bukkit.craftbukkit.v1_15_R1.entity.CraftEntity;
import net.minecraft.server.v1_15_R1.NBTTagCompound;

public class NBTEntity {

	net.minecraft.server.v1_15_R1.Entity nmsEntity;
	org.bukkit.entity.Entity entity;
    //NBTTagCompound tag;
	
	public NBTEntity(org.bukkit.entity.Entity entity) {
            //tag = new NBTTagCompound();
		this.entity = entity;
		nmsEntity = ((CraftEntity) entity).getHandle();
		//tag = nmsEntity.e(tag);
	}
	
	public String getName() {
		if (nmsEntity.hasCustomName()) {
			return nmsEntity.getCustomName().getString();
		} else {
			return nmsEntity.getName();
		}
	}
	
	public org.bukkit.entity.Entity getRawEntity() {
		return entity;
	}
	
	public net.minecraft.server.v1_15_R1.Entity getRawNMSEntity() {
		return nmsEntity;
	}
}
