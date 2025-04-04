package com.gregtechceu.gtceu.common.data.materials;

import com.gregtechceu.gtceu.GTCEu;
import com.gregtechceu.gtceu.api.data.chemical.material.Material;
import com.gregtechceu.gtceu.api.fluids.FluidBuilder;

import static com.gregtechceu.gtceu.api.data.chemical.material.info.MaterialFlags.DISABLE_DECOMPOSITION;
import static com.gregtechceu.gtceu.common.data.GTMaterials.*;

public class GTMUMaterials {

    public static void register() {
        TitaniumTrichloride = new Material.Builder(GTCEu.id("titanium_trichloride"))
                .liquid(new FluidBuilder().customStill())
                .color(0x3A028B)
                .flags(DISABLE_DECOMPOSITION)
                .components(Titanium, 1, Chlorine, 3)
                .buildAndRegister();
    }
}
