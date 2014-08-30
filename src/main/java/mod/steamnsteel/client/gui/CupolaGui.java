/*
 * Copyright (c) 2014 Rosie Alexander and Scott Killen.
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 3 of the License, or (at your option) any
 * later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, see <http://www.gnu.org/licenses>.
 */

package mod.steamnsteel.client.gui;

import mod.steamnsteel.block.machine.CupolaBlock;
import mod.steamnsteel.inventory.CupolaContainer;
import mod.steamnsteel.tileentity.CupolaTE;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class CupolaGui extends SteamNSteelGui
{
    private static final ResourceLocation TEXTURE = getResourceLocation(CupolaBlock.NAME);

    final CupolaTE te;

    public CupolaGui(InventoryPlayer playerInventory, CupolaTE te)
    {
        super(new CupolaContainer(playerInventory, te));
        this.te = te;
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

        mc.getTextureManager().bindTexture(TEXTURE);

        final int xStart = (width - xSize) / 2;
        final int yStart = (height - ySize) / 2;
        drawTexturedModalRect(xStart, yStart, 0, 0, xSize, ySize);

        // int scaleAdjustment;
        // if (te.isActive())
        // {
        //     scaleAdjustment = te.getBurnTimeRemainingScaled(12);
        //     drawTexturedModalRect(xStart + 57, yStart + 36 + 23 - scaleAdjustment, 176, 12 - scaleAdjustment, 14, scaleAdjustment + 2);
        // }

        // scaleAdjustment = te.getCookProgressScaled(24);
        // drawTexturedModalRect(xStart + 83, yStart + 34, 176, 14, scaleAdjustment + 1, 16);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_)
    {
        // final String name = StatCollector.translateToLocal(te.getInventoryName());
        // fontRendererObj.drawString(name, xSize / 2 - fontRendererObj.getStringWidth(name) / 2, 6, TEXT_COLOR);
        // fontRendererObj.drawString(StatCollector.translateToLocal(.VANILLA_INVENTORY), 8, ySize - 96 + 2, TEXT_COLOR);
    }
}
