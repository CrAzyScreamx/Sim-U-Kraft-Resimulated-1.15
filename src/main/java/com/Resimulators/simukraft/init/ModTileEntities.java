package com.Resimulators.simukraft.init;

import com.Resimulators.simukraft.SimuKraft;
import com.Resimulators.simukraft.common.block.BlockConstructor;
import com.Resimulators.simukraft.common.tileentity.TileConstructor;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.types.Type;
import net.minecraft.block.Blocks;
import net.minecraft.tileentity.FurnaceTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.datafix.DataFixesManager;
import net.minecraft.util.datafix.TypeReferences;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.event.RegistryEvent;

public class ModTileEntities {

public class ModTileEntities {
    public static final TileEntityType<?> CONSTRUCTOR = TileEntityType.Builder.create(TileConstructor::new).build(null);
    public static void init(final RegistryEvent.Register<TileEntityType<?>> event){
        CONSTRUCTOR.setRegistryName("constructor");
        event.getRegistry().register(CONSTRUCTOR);


    }
}
