package net.lepidodendron.entity.render.tile;

import net.lepidodendron.LepidodendronMod;
import net.lepidodendron.block.BlockDisplayWallMount;
import net.lepidodendron.entity.model.entity.*;
import net.lepidodendron.item.ItemRoseFlower;
import net.lepidodendron.item.entities.*;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.block.model.IBakedModel;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;
import org.lwjgl.opengl.GL11;

public class RenderDisplayWallMount extends TileEntitySpecialRenderer<BlockDisplayWallMount.TileEntityDisplayWallMount> {

    public static final PropertyDirection FACING = BlockDirectional.FACING;
    private static final ResourceLocation TEXTURE_ACANTHODES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acanthodes.png");
    private final ModelAcanthodes modelAcanthodes;
    private static final ResourceLocation TEXTURE_ACROLEPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/acrolepis_static.png");
    private final ModelAcrolepis modelAcrolepis;
    private static final ResourceLocation TEXTURE_AEGIROCASSIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/aegirocassis.png");
    private final ModelAegirocassis modelAegirocassis;
    private static final ResourceLocation TEXTURE_AKMONISTION = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/akmonistion.png");
    private final ModelAkmonistion modelAkmonistion;
    private static final ResourceLocation TEXTURE_ALBERTONIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/albertonia.png");
    private final ModelAlbertonia modelAlbertonia;
    private static final ResourceLocation TEXTURE_ANTEOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/anteosaurus.png");
    private final ModelAnteosaurus modelAnteosaurus;
    private static final ResourceLocation TEXTURE_ANTINEOSTEUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/antineosteus_static.png");
    private final ModelAntineosteus modelAntineosteus;
    private static final ResourceLocation TEXTURE_ARANDASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/arandaspis.png");
    private final ModelArandaspis modelArandaspis;
    private static final ResourceLocation TEXTURE_ARCHOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/archosaurus.png");
    private final ModelArchosaurus modelArchosaurus;
    private static final ResourceLocation TEXTURE_ATELEASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ateleaspis.png");
    private final ModelAteleaspis modelAteleaspis;
    private static final ResourceLocation TEXTURE_BANDRINGA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bandringa.png");
    private final ModelBandringa modelBandringa;
    private static final ResourceLocation TEXTURE_BELANTSEA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/belantsea.png");
    private final ModelBelantsea modelBelantsea;
    private static final ResourceLocation TEXTURE_BIRKENIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/birkenia.png");
    private final ModelBirkenia modelBirkenia;
    private static final ResourceLocation TEXTURE_BOTHRIOLEPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/bothriolepis.png");
    private final ModelBothriolepis modelBothriolepis;
    private static final ResourceLocation TEXTURE_BROCHOADMONES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/brochoadmones_static.png");
    private final ModelBrochoadmones modelBrochoadmones;
    private static final ResourceLocation TEXTURE_CAMPBELLODUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/campbellodus.png");
    private final ModelCampbellodus modelCampbellodus;
    private static final ResourceLocation TEXTURE_CEPHALASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cephalaspis.png");
    private final ModelCephalaspis modelCephalaspis;
    private static final ResourceLocation TEXTURE_CLADOSELACHE = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cladoselache.png");
    private final ModelCladoselache modelCladoselache;
    private static final ResourceLocation TEXTURE_COCCOSTEUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/coccosteus.png");
    private final ModelCoccosteus modelCoccosteus;
    private static final ResourceLocation TEXTURE_COELACANTHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/coelacanthus.png");
    private final ModelCoelacanthus modelCoelacanthus;
    private static final ResourceLocation TEXTURE_COELOPHYSIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/coelophysis.png");
    private final ModelCoelophysis modelCoelophysis;
    private static final ResourceLocation TEXTURE_COELUROSAURAVUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/coelurosauravus.png");
    private final ModelWeigeltisaurid modelWeigeltisaurid;
    private static final ResourceLocation TEXTURE_COTYLORHYNCHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/cotylorhynchus.png");
    private final ModelCotylorhynchus modelCotylorhynchus;
    private static final ResourceLocation TEXTURE_CTENOSPONDYLUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ctenospondylus.png");
    private final ModelCtenospondylus modelCtenospondylus;
    private static final ResourceLocation TEXTURE_DAEDALICHTHYS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/daedalichthys.png");
    private final ModelDaedalichthys modelDaedalichthys;
    private static final ResourceLocation TEXTURE_DIADECTES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/diadectes.png");
    private final ModelDiadectes modelDiadectes;
    private static final ResourceLocation TEXTURE_DIMETRODON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dimetrodon.png");
    private final ModelDimetrodon modelDimetrodon;
    private static final ResourceLocation TEXTURE_DORYASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/doryaspis.png");
    private final ModelDoryaspis modelDoryaspis;
    private static final ResourceLocation TEXTURE_DORYPTERUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dorypterus.png");
    private final ModelDorypterus modelDorypterus;
    private static final ResourceLocation TEXTURE_DRACOPRISTIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dracopristis.png");
    private final ModelDracopristis modelDracopristis;
    private static final ResourceLocation TEXTURE_DREPANASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/drepanaspis.png");
    private final ModelDrepanaspis modelDrepanaspis;
    private static final ResourceLocation TEXTURE_DUNKLEOSTEUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/dunkleosteus.png");
    private final ModelDunkleosteus modelDunkleosteus;
    private static final ResourceLocation TEXTURE_EBENAQUA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/ebenaqua.png");
    private final ModelEbenaqua modelEbenaqua;
    private static final ResourceLocation TEXTURE_EDESTUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/edestus.png");
    private final ModelEdestus modelEdestus;
    private static final ResourceLocation TEXTURE_EGLONASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eglonaspis.png");
    private final ModelEglonaspis modelEglonaspis;
    private static final ResourceLocation TEXTURE_EORAPTOR = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eoraptor.png");
    private final ModelEoraptor modelEoraptor;
    private static final ResourceLocation TEXTURE_ERYOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eryops.png");
    private final ModelEryops modelEryops;
    private static final ResourceLocation TEXTURE_ESTEMMENOSUCHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/estemmenosuchus.png");
    private final ModelEstemmenosuchus modelEstemmenosuchus;
    private static final ResourceLocation TEXTURE_EUSTHENOPTERON = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/eusthenopteron.png");
    private final ModelEusthenopteron modelEusthenopteron;
    private static final ResourceLocation TEXTURE_FURCACAUDA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/furcacauda.png");
    private final ModelFurcacauda modelFurcacauda;
    private static final ResourceLocation TEXTURE_GEMUENDINA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gemuendina.png");
    private final ModelGemuendina modelGemuendina;
    private static final ResourceLocation TEXTURE_GERARUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gerarus.png");
    private final ModelGerarus modelGerarus;
    private static final ResourceLocation TEXTURE_GLAURUNG = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/glaurung.png");
    private static final ResourceLocation TEXTURE_GNATHORHIZA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gnathorhiza.png");
    private final ModelGnathorhiza modelGnathorhiza;
    private static final ResourceLocation TEXTURE_GORGONOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gorgonops.png");
    private final ModelGorgonops modelGorgonops;
    private static final ResourceLocation TEXTURE_GROENLANDASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/groenlandaspis.png");
    private final ModelGroenlandaspis modelGroenlandaspis;
    private static final ResourceLocation TEXTURE_GYRACANTHIDES = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/gyracanthides.png");
    private final ModelGyracanthides modelGyracanthides;
    private static final ResourceLocation TEXTURE_HELICOPRION = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/helicoprion.png");
    private final ModelHelicoprion modelHelicoprion;
    private static final ResourceLocation TEXTURE_HEMICYCLASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hemicyclaspis.png");
    private final ModelHemicyclaspis modelHemicyclaspis;
    private static final ResourceLocation TEXTURE_HERRERASAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/herrerasaurus.png");
    private final ModelHerrerasaurus modelHerrerasaurus;
    private static final ResourceLocation TEXTURE_HETEROSTEUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/heterosteus.png");
    private final ModelHeterosteus modelHeterosteus;
    private static final ResourceLocation TEXTURE_HIBERNASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hibernaspis.png");
    private final ModelHibernaspis modelHibernaspis;
    private static final ResourceLocation TEXTURE_HYNERIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/hyneria.png");
    private final ModelHyneria modelHyneria;
    private static final ResourceLocation TEXTURE_INIOPTERYX = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/iniopteryx.png");
    private final ModelIniopteryx modelIniopteryx;
    private static final ResourceLocation TEXTURE_INOSTRANCEVIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/inostrancevia.png");
    private final ModelInostrancevia modelInostrancevia;
    private static final ResourceLocation TEXTURE_JANASSA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/janassa.png");
    private final ModelJanassa modelJanassa;
    private static final ResourceLocation TEXTURE_KAIBABVENATOR = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/kaibabvenator.png");
    private final ModelKaibabvenator modelKaibabvenator;
    private static final ResourceLocation TEXTURE_LAMINACARIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/laminacaris.png");
    private final ModelLaminacaris modelLaminacaris;
    private static final ResourceLocation TEXTURE_LILIENSTERNUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/liliensternus.png");
    private final ModelLiliensternus modelLiliensternus;
    private static final ResourceLocation TEXTURE_LIMNOSCELIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/limnoscelis.png");
    private final ModelLimnoscelis modelLimnoscelis;
    private static final ResourceLocation TEXTURE_LISOWICIA = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lisowicia.png");
    private final ModelLisowicia modelLisowicia;
    private static final ResourceLocation TEXTURE_LISTRACANTHUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/listracanthus.png");
    private final ModelListracanthus modelListracanthus;
    private static final ResourceLocation TEXTURE_LUNASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lunaspis.png");
    private final ModelLunaspis modelLunaspis;
    private static final ResourceLocation TEXTURE_LUNGMENSHANASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lungmenshanaspis.png");
    private final ModelLungmenshanaspis modelLungmenshanaspis;
    private static final ResourceLocation TEXTURE_LYSTROSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/lystrosaurus.png");
    private final ModelLystrosaurus modelLystrosaurus;
    private static final ResourceLocation TEXTURE_MENASPIS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/menaspis.png");
    private final ModelMenaspis modelMenaspis;
    private static final ResourceLocation TEXTURE_MOSCHOPS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/moschops.png");
    private final ModelMoschops modelMoschops;
    private static final ResourceLocation TEXTURE_SCUTOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/scutosaurus.png");
    private final ModelScutosaurus modelScutosaurus;
    private static final ResourceLocation TEXTURE_SHRINGASAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/shringasaurus_m.png");
    private final ModelShringasaurus modelShringasaurus;
    private static final ResourceLocation TEXTURE_TAPINOCEPHALUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/tapinocephalus.png");
    private final ModelTapinocephalus modelTapinocephalus;
    private static final ResourceLocation TEXTURE_VIVAXOSAURUS = new ResourceLocation(LepidodendronMod.MODID + ":textures/entities/vivaxosaurus.png");
    private final ModelVivaxosaurus modelVivaxosaurus;



    public RenderDisplayWallMount() {
        this.modelAcanthodes = new ModelAcanthodes();
        this.modelAcrolepis = new ModelAcrolepis();
        this.modelAegirocassis = new ModelAegirocassis();
        this.modelAkmonistion = new ModelAkmonistion();
        this.modelAlbertonia = new ModelAlbertonia();
        this.modelAnteosaurus = new ModelAnteosaurus();
        this.modelAntineosteus = new ModelAntineosteus();
        this.modelArandaspis = new ModelArandaspis();
        this.modelArchosaurus = new ModelArchosaurus();
        this.modelAteleaspis = new ModelAteleaspis();
        this.modelBandringa = new ModelBandringa();
        this.modelBelantsea = new ModelBelantsea();
        this.modelBirkenia = new ModelBirkenia();
        this.modelBothriolepis = new ModelBothriolepis();
        this.modelBrochoadmones = new ModelBrochoadmones();
        this.modelCampbellodus = new ModelCampbellodus();
        this.modelCephalaspis = new ModelCephalaspis();
        this.modelCladoselache = new ModelCladoselache();
        this.modelCoccosteus = new ModelCoccosteus();
        this.modelCoelacanthus = new ModelCoelacanthus();
        this.modelCoelophysis = new ModelCoelophysis();
        this.modelWeigeltisaurid = new ModelWeigeltisaurid();
        this.modelCotylorhynchus = new ModelCotylorhynchus();
        this.modelCtenospondylus = new ModelCtenospondylus();
        this.modelDaedalichthys = new ModelDaedalichthys();
        this.modelDiadectes = new ModelDiadectes();
        this.modelDimetrodon = new ModelDimetrodon();
        this.modelDoryaspis = new ModelDoryaspis();
        this.modelDorypterus = new ModelDorypterus();
        this.modelDracopristis = new ModelDracopristis();
        this.modelDrepanaspis = new ModelDrepanaspis();
        this.modelDunkleosteus = new ModelDunkleosteus();
        this.modelEbenaqua = new ModelEbenaqua();
        this.modelEdestus = new ModelEdestus();
        this.modelEglonaspis = new ModelEglonaspis();
        this.modelEoraptor = new ModelEoraptor();
        this.modelEryops = new ModelEryops();
        this.modelEstemmenosuchus = new ModelEstemmenosuchus();
        this.modelEusthenopteron = new ModelEusthenopteron();
        this.modelFurcacauda = new ModelFurcacauda();
        this.modelGemuendina = new ModelGemuendina();
        this.modelGerarus = new ModelGerarus();
        this.modelGnathorhiza = new ModelGnathorhiza();
        this.modelGorgonops = new ModelGorgonops();
        this.modelGroenlandaspis = new ModelGroenlandaspis();
        this.modelGyracanthides = new ModelGyracanthides();
        this.modelHelicoprion = new ModelHelicoprion();
        this.modelHemicyclaspis = new ModelHemicyclaspis();
        this.modelHerrerasaurus = new ModelHerrerasaurus();
        this.modelHeterosteus = new ModelHeterosteus();
        this.modelHibernaspis = new ModelHibernaspis();
        this.modelHyneria = new ModelHyneria();
        this.modelIniopteryx = new ModelIniopteryx();
        this.modelInostrancevia = new ModelInostrancevia();
        this.modelJanassa = new ModelJanassa();
        this.modelKaibabvenator = new ModelKaibabvenator();
        this.modelLaminacaris = new ModelLaminacaris();
        this.modelLiliensternus = new ModelLiliensternus();
        this.modelLimnoscelis = new ModelLimnoscelis();
        this.modelLisowicia = new ModelLisowicia();
        this.modelListracanthus = new ModelListracanthus();
        this.modelLunaspis = new ModelLunaspis();
        this.modelLungmenshanaspis = new ModelLungmenshanaspis();
        this.modelLystrosaurus = new ModelLystrosaurus();
        this.modelMenaspis = new ModelMenaspis();
        this.modelMoschops = new ModelMoschops();
        this.modelScutosaurus = new ModelScutosaurus();
        this.modelShringasaurus = new ModelShringasaurus();
        this.modelTapinocephalus = new ModelTapinocephalus();
        this.modelVivaxosaurus = new ModelVivaxosaurus();
    }

    @Override
    public void render(BlockDisplayWallMount.TileEntityDisplayWallMount entity, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
        BlockPos pos = entity.getPos();
        World world = entity.getWorld();
        EnumFacing facing;
        int currentRotation = 0;
        if (entity != null && entity.hasWorld()) {
            currentRotation = entity.getTileData().getInteger("rotation");
            facing = entity.getWorld().getBlockState(entity.getPos()).getValue(FACING);

            TileEntity te = world.getTileEntity(pos);
            if (te != null) {
                if (te instanceof BlockDisplayWallMount.TileEntityDisplayWallMount) {
                    BlockDisplayWallMount.TileEntityDisplayWallMount tee = (BlockDisplayWallMount.TileEntityDisplayWallMount) te;
                    ItemStack itemstack = tee.getStackInSlot(0);
                    if (itemstack.isEmpty()) {
                        return;
                    }

                    GlStateManager.enableRescaleNormal();
                    GlStateManager.alphaFunc(GL11.GL_GREATER, 0.1f);
                    GlStateManager.enableBlend();
                    RenderHelper.enableStandardItemLighting();
                    GlStateManager.tryBlendFuncSeparate(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA, 1, 0);
                    GlStateManager.pushMatrix();

                    if (itemstack.getItem() == ItemRoseFlower.block) {
                        double offset = 0.12;
                        double voffset = 0.0625;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        this.bindTexture(TEXTURE_GERARUS);
                        modelGerarus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAcanthodesRaw.block) {
                        double offset = 0.04;
                        double voffset = 0.25;
                        double hoffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.35,1.35,1.35);
                        this.bindTexture(TEXTURE_ACANTHODES);
                        modelAcanthodes.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAcrolepisRaw.block) {
                        double offset = 0.04;
                        double voffset = 0.29;
                        double hoffset = 0.14;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.9,1.9,1.9);
                        this.bindTexture(TEXTURE_ACROLEPIS);
                        modelAcrolepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAegirocassisRaw.block) {
                        double offset = 0.25;
                        double voffset = 0.6;
                        double hoffset = -0.4;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 - hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.7,3.7,3.7);
                        this.bindTexture(TEXTURE_AEGIROCASSIS);
                        modelAegirocassis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAkmonistionRaw.block) {
                        double offset = 0.06;
                        double voffset = 0.47;
                        double hoffset = 0.2;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.1,2.1,2.1);
                        this.bindTexture(TEXTURE_AKMONISTION);
                        modelAkmonistion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAlbertoniaRaw.block) {
                        double offset = 0.06;
                        double voffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1,1,1);
                        this.bindTexture(TEXTURE_ALBERTONIA);
                        modelAlbertonia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAnteosaurusRaw.block) {
                        double offset = -0.5;
                        double voffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(6.5,6.5,6.5);
                        this.bindTexture(TEXTURE_ANTEOSAURUS);
                        modelAnteosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);

                    }
                    else if (itemstack.getItem() == ItemAntineosteusRaw.block) {
                        double offset = 0.1;
                        double voffset = 1;
                        double hoffset = 0.8;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 - hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.8,4.8,4.8);
                        this.bindTexture(TEXTURE_ANTINEOSTEUS);
                        modelAntineosteus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);

                    }
                    else if (itemstack.getItem() == ItemArandaspisRaw.block) {
                        double offset = 0.02;
                        double voffset = 0.07;
                        double hoffset = 0.02;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.5,1.5,1.5);
                        this.bindTexture(TEXTURE_ARANDASPIS);
                        modelArandaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemArchosaurusRaw.block) {
                        double offset = -0.15;
                        double voffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.6,1.6,1.6);
                        this.bindTexture(TEXTURE_ARCHOSAURUS);
                        modelArchosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemAteleaspisRaw.block) {
                        double offset = 0.46;
                        double voffset = 0.03;
                        double hoffset = 0.05;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.9,1.9,1.9);
                        this.bindTexture(TEXTURE_ATELEASPIS);
                        modelAteleaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBandringaRaw.block) {
                        double offset = -0.09;
                        double voffset = 0.54;
                        double hoffset = 0.2;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.3,2.3,2.3);
                        this.bindTexture(TEXTURE_BANDRINGA);
                        modelBandringa.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBelantseaRaw.block) {
                        double offset = 0.07;
                        double voffset = 0.03;
                        double hoffset = 0.06;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.1,2.1,2.1);
                        this.bindTexture(TEXTURE_BELANTSEA);
                        modelBelantsea.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBirkeniaRaw.block) {
                        double offset = 0.04;
                        double voffset = 0.21;
                        double hoffset = 0.04;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.2,1.2,1.2);
                        this.bindTexture(TEXTURE_BIRKENIA);
                        modelBirkenia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBothriolepisRaw.block) {
                        double offset = 0.56;
                        double voffset = 0.03;
                        double hoffset = 0.22;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(2.4,2.4,2.4);
                        this.bindTexture(TEXTURE_BOTHRIOLEPIS);
                        modelBothriolepis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemBrochoadmonesRaw.block) {
                        double offset = -0.02;
                        double voffset = 0.1;
                        double hoffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.7,0.7,0.7);
                        this.bindTexture(TEXTURE_BROCHOADMONES);
                        modelBrochoadmones.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCampbellodusRaw.block) {
                        double offset = 0.04;
                        double voffset = 0.08;
                        double hoffset = 0.13;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.1,1.1,1.1);
                        this.bindTexture(TEXTURE_CAMPBELLODUS);
                        modelCampbellodus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCephalaspisRaw.block) {
                        double offset = 0.46;
                        double voffset = 0.03;
                        double hoffset = 0.05;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.8,1.8,1.8);
                        this.bindTexture(TEXTURE_CEPHALASPIS);
                        modelCephalaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCladoselacheRaw.block) {
                        double offset = 0.05;
                        double voffset = 0.55;
                        double hoffset = 0.6;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.2,3.2,3.2);
                        this.bindTexture(TEXTURE_CLADOSELACHE);
                        modelCladoselache.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCoccosteusRaw.block) {
                        double offset = -0.02;
                        double voffset = 0.01;
                        double hoffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.8,0.8,0.8);
                        this.bindTexture(TEXTURE_COCCOSTEUS);
                        modelCoccosteus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCoelacanthusRaw.block) {
                        double offset = 0.03;
                        double voffset = 0.08;
                        double hoffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.8,1.8,1.8);
                        this.bindTexture(TEXTURE_COELACANTHUS);
                        modelCoelacanthus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCoelophysisRaw.block) {
                        double offset = -0.23;
                        double voffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.9,2.9,2.9);
                        this.bindTexture(TEXTURE_COELOPHYSIS);
                        modelCoelophysis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCoelurosauravusRaw.block) {
                        double offset = 0.03;
                        double voffset = 0.03;
                        double hoffset = 0.01;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(0.6,0.6,0.6);
                        this.bindTexture(TEXTURE_COELUROSAURAVUS);
                        modelWeigeltisaurid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCotylorhynchusRaw.block) {
                        double offset = -0.55;
                        double voffset = 0.2;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(6.6,6.6,6.6);
                        this.bindTexture(TEXTURE_COTYLORHYNCHUS);
                        modelCotylorhynchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemCtenospondylusRaw.block) {
                        double offset = -0.22;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3,3,3);
                        this.bindTexture(TEXTURE_CTENOSPONDYLUS);
                        modelCtenospondylus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDaedalichthysRaw.block) {
                        double offset = -0.02;
                        double voffset = 0.2;
                        double hoffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.1,1.1,1.1);
                        this.bindTexture(TEXTURE_DAEDALICHTHYS);
                        modelDaedalichthys.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDiadectesRaw.block) {
                        double offset = -0.39;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.3,4.3,4.3);
                        this.bindTexture(TEXTURE_DIADECTES);
                        modelDiadectes.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDimetrodonRaw.block) {
                        double offset = -0.28;
                        double voffset = -0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.3,4.3,4.3);
                        this.bindTexture(TEXTURE_DIMETRODON);
                        modelDimetrodon.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDoryaspisRaw.block) {
                        double offset = 0.23;
                        double voffset = -0.01;
                        double hoffset = 0.02;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1,1,1);
                        this.bindTexture(TEXTURE_DORYASPIS);
                        modelDoryaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDorypterusRaw.block) {
                        double offset = -0.02;
                        double voffset = 0.08;
                        double hoffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.4,0.4,0.4);
                        this.bindTexture(TEXTURE_DORYPTERUS);
                        modelDorypterus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDracopristisRaw.block) {
                        double offset = -0.02;
                        double voffset = 0.7;
                        double hoffset = 0.6;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.4,3.4,3.4);
                        this.bindTexture(TEXTURE_DRACOPRISTIS);
                        modelDracopristis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDrepanaspisRaw.block) {
                        double offset = 0.58;
                        double voffset = 0.03;
                        double hoffset = 0.02;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(2.4,2.4,2.4);
                        this.bindTexture(TEXTURE_DREPANASPIS);
                        modelDrepanaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemDunkleosteusRaw.block) {
                        double offset = -1.2;
                        double voffset = 0.3;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(11.5,11.5,11.5);
                        this.bindTexture(TEXTURE_DUNKLEOSTEUS);
                        modelDunkleosteus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEbenaquaRaw.block) {
                        double offset = -0.05;
                        double voffset = 0.05;
                        double hoffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(0.35,0.35,0.35);
                        this.bindTexture(TEXTURE_EBENAQUA);
                        modelEbenaqua.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEdestusRaw.block) {
                        double offset = -1.01;
                        double voffset = 0.3;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(9.3,9.3,9.3);
                        this.bindTexture(TEXTURE_EDESTUS);
                        modelEdestus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEglonaspisRaw.block) {
                        double offset = 1.11;
                        double voffset = 0.01;
                        double hoffset = 0.02;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(4.5,4.5,4.5);
                        this.bindTexture(TEXTURE_EGLONASPIS);
                        modelEglonaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEoraptorRaw.block) {
                        double offset = -0.15;
                        double voffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.7,1.7,1.7);
                        this.bindTexture(TEXTURE_EORAPTOR);
                        modelEoraptor.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEryopsRaw.block) {
                        double offset = -0.39;
                        double voffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(5.3,5.3,5.3);
                        this.bindTexture(TEXTURE_ERYOPS);
                        modelEryops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEstemmenosuchusRaw.block) {
                        double offset = -0.73;
                        double voffset = 0.25;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(6.1,6.1,6.1);
                        this.bindTexture(TEXTURE_ESTEMMENOSUCHUS);
                        modelEstemmenosuchus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemEusthenopteronRaw.block) {
                        double offset = -0.14;
                        double voffset = 0.41;
                        double hoffset = 0.6;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 - hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2,2,2);
                        this.bindTexture(TEXTURE_EUSTHENOPTERON);
                        modelEusthenopteron.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemFurcacaudaRaw.block) {
                        double offset = 0.03;
                        double voffset = 0.23;
                        double hoffset = 0.05;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.2,1.2,1.2);
                        this.bindTexture(TEXTURE_FURCACAUDA);
                        modelFurcacauda.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemGemuendinaRaw.block) {
                        double offset = 0.44;
                        double voffset = 0.05;
                        double hoffset = 0.16;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.7,1.7,1.7);
                        this.bindTexture(TEXTURE_GEMUENDINA);
                        modelGemuendina.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemGlaurungRaw.block) {
                        double offset = 0.03;
                        double voffset = 0.03;
                        double hoffset = 0.01;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(0.8,0.8,0.8);
                        this.bindTexture(TEXTURE_GLAURUNG);
                        modelWeigeltisaurid.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemGnathorhizaRaw.block) {
                        double offset = 0.05;
                        double voffset = 0.03;
                        double hoffset = 0.08;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.4,1.4,1.4);
                        this.bindTexture(TEXTURE_GNATHORHIZA);
                        modelGnathorhiza.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemGorgonopsRaw.block) {
                        double offset = -0.3;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2.9,2.9,2.9);
                        this.bindTexture(TEXTURE_GORGONOPS);
                        modelGorgonops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemGroenlandaspisRaw.block) {
                        double offset = 0.02;
                        double voffset = 0.39;
                        double hoffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.9,1.9,1.9);
                        this.bindTexture(TEXTURE_GROENLANDASPIS);
                        modelGroenlandaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemGyracanthidesRaw.block) {
                        double offset = 0.65;
                        double voffset = 0.38;
                        double hoffset = 0.6;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(2.6,2.6,2.6);
                        this.bindTexture(TEXTURE_GYRACANTHIDES);
                        modelGyracanthides.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHelicoprionRaw.block) {
                        double offset = -1.1;
                        double voffset = 0.35;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(10,10,10);
                        this.bindTexture(TEXTURE_HELICOPRION);
                        modelHelicoprion.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHemicyclaspisRaw.block) {
                        double offset = 0.46;
                        double voffset = 0.03;
                        double hoffset = 0.05;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.9,1.9,1.9);
                        this.bindTexture(TEXTURE_HEMICYCLASPIS);
                        modelHemicyclaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHerrerasaurusRaw.block) {
                        double offset = -0.85;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.5,4.5,4.5);
                        this.bindTexture(TEXTURE_HERRERASAURUS);
                        modelHerrerasaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHeterosteusRaw.block) {
                        double offset = -0.27;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(180,0,1,0);
                        GlStateManager.scale(6.5,6.5,6.5);
                        this.bindTexture(TEXTURE_HETEROSTEUS);
                        modelHeterosteus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHibernaspisRaw.block) {
                        double offset = 0.1;
                        double voffset = -0.26;
                        double hoffset = 0.05;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.8,1.8,1.8);
                        this.bindTexture(TEXTURE_HIBERNASPIS);
                        modelHibernaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemHyneriaRaw.block) {
                        double offset = -0.03;
                        double voffset = 0.85;
                        double hoffset = 1.4;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.4,4.4,4.4);
                        this.bindTexture(TEXTURE_HYNERIA);
                        modelHyneria.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemIniopteryxRaw.block) {
                        double offset = 0.06;
                        double voffset = 0.06;
                        double hoffset = 0.12;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(1.4,1.4,1.4);
                        this.bindTexture(TEXTURE_INIOPTERYX);
                        modelIniopteryx.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemInostranceviaRaw.block) {
                        double offset = -0.29;
                        double voffset = 0.02;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.3,4.3,4.3);
                        this.bindTexture(TEXTURE_INOSTRANCEVIA);
                        modelInostrancevia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemJanassaRaw.block) {
                        double offset = 0.39;
                        double voffset = -0.01;
                        double hoffset = 0.13;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.6,1.6,1.6);
                        this.bindTexture(TEXTURE_JANASSA);
                        modelJanassa.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemKaibabvenatorRaw.block) {
                        double offset = 0.04;
                        double voffset = 0.05;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(5.7,5.7,5.7);
                        this.bindTexture(TEXTURE_KAIBABVENATOR);
                        modelKaibabvenator.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLaminacarisRaw.block) {
                        double offset = 0.96;
                        //double voffset = -0.01;
                        double voffset = -0;
                        //double hoffset = 0.43;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(3.8,3.8,3.8);
                        this.bindTexture(TEXTURE_LAMINACARIS);
                        modelLaminacaris.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLiliensternusRaw.block) {
                        double offset = -0.32;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.9,3.9,3.9);
                        this.bindTexture(TEXTURE_LILIENSTERNUS);
                        modelLiliensternus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLimnoscelisRaw.block) {
                        double offset = -0.15;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(2,2,2);
                        this.bindTexture(TEXTURE_LIMNOSCELIS);
                        modelLimnoscelis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLisowiciaRaw.block) {
                        double offset = -0.79;
                        double voffset = 0.5;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(8.7,8.7,8.7);
                        this.bindTexture(TEXTURE_LISOWICIA);
                        modelLisowicia.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemListracanthusRaw.block) {
                        double offset = 0.06;
                        //double voffset = 0.06;
                        double voffset = 0;
                        //double hoffset = 0.12;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.4,3.4,3.4);
                        this.bindTexture(TEXTURE_LISTRACANTHUS);
                        modelListracanthus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLunaspisRaw.block) {
                        double offset = 0.45;
                        //double voffset = -0.01;
                        double voffset = 0;
                        //double hoffset = 0.13;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.9,1.9,1.9);
                        this.bindTexture(TEXTURE_LUNASPIS);
                        modelLunaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLungmenshanaspisRaw.block) {
                        double offset = 0.2;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.1,1.1,1.1);
                        this.bindTexture(TEXTURE_LUNGMENSHANASPIS);
                        modelLungmenshanaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemLystrosaurusRaw.block) {
                        double offset = -0.25;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(3.7,3.7,3.7);
                        this.bindTexture(TEXTURE_LYSTROSAURUS);
                        modelLystrosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMenaspisRaw.block) {
                        double offset = 0.3;
                        double voffset = 0;
                        double hoffset = 0;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5 + hoffset, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5 - hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5 + hoffset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.rotate(90,1,0,0);
                        GlStateManager.scale(1.2,1.2,1.2);
                        this.bindTexture(TEXTURE_MENASPIS);
                        modelMenaspis.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemMoschopsRaw.block) {
                        double offset = -0.45;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.5,4.5,4.5);
                        this.bindTexture(TEXTURE_MOSCHOPS);
                        modelMoschops.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemScutosaurusRaw.block) {
                        double offset = -0.36;
                        double voffset = 0.15;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(5.2,5.2,5.2);
                        this.bindTexture(TEXTURE_SCUTOSAURUS);
                        modelScutosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemShringasaurusRaw.block) {
                        double offset = -0.45;
                        double voffset = 0.07;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.2,4.2,4.2);
                        this.bindTexture(TEXTURE_SHRINGASAURUS);
                        modelShringasaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemTapinocephalusRaw.block) {
                        double offset = -0.7;
                        double voffset = 0.15;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(6.5,6.5,6.5);
                        this.bindTexture(TEXTURE_TAPINOCEPHALUS);
                        modelTapinocephalus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }
                    else if (itemstack.getItem() == ItemVivaxosaurusRaw.block) {
                        double offset = -0.3;
                        double voffset = 0.1;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + (1 - offset));
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5 + voffset, z + offset);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(180, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + (1 - offset), y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(270, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + offset, y + 0.5 + voffset, z + 0.5);
                            GlStateManager.rotate(180, 0F, 0F, 1F);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        GlStateManager.scale(4.5,4.5,4.5);
                        this.bindTexture(TEXTURE_VIVAXOSAURUS);
                        modelVivaxosaurus.renderStatic(Minecraft.getMinecraft().player.ticksExisted);
                    }


                    // ********************************************************************
                    else { //standard items
                        float scale = 0.6666F;
                        if (facing == EnumFacing.UP || facing == EnumFacing.DOWN || facing == EnumFacing.NORTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z + 0.98);
                            GlStateManager.scale(scale, scale, scale);
                        }
                        if (facing == EnumFacing.SOUTH) {
                            GlStateManager.translate(x + 0.5, y + 0.5, z + 0.02);
                            GlStateManager.scale(scale, scale, scale);
                        }
                        if (facing == EnumFacing.WEST) {
                            GlStateManager.translate(x + 0.98, y + 0.5, z + 0.5);
                            GlStateManager.scale(scale, scale, scale);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        if (facing == EnumFacing.EAST) {
                            GlStateManager.translate(x + 0.02, y + 0.5, z + 0.5);
                            GlStateManager.scale(scale, scale, scale);
                            GlStateManager.rotate(90, 0F, 1F, 0F);
                        }
                        GlStateManager.rotate(currentRotation, 0F, 0F, 1F);
                        IBakedModel model = Minecraft.getMinecraft().getRenderItem().getItemModelWithOverrides(itemstack, world, null);
                        //model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.FIXED, false);
                        model = ForgeHooksClient.handleCameraTransforms(model, ItemCameraTransforms.TransformType.GROUND, false);
                        Minecraft.getMinecraft().getTextureManager().bindTexture(TextureMap.LOCATION_BLOCKS_TEXTURE);
                        Minecraft.getMinecraft().getRenderItem().renderItem(itemstack, model);
                    }

                    GlStateManager.popMatrix();
                    GlStateManager.disableRescaleNormal();
                    GlStateManager.disableBlend();

                }
            }
        }
    }
}