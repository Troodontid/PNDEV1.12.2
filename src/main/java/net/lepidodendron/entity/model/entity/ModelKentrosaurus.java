package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraKentrosaurus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelKentrosaurus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Hips;
    private final AdvancedModelRenderer Righthipspike_r1;
    private final AdvancedModelRenderer Lefthipspike_r1;
    private final AdvancedModelRenderer Hips_r1;
    private final AdvancedModelRenderer Leftleg1;
    private final AdvancedModelRenderer Leftleg2;
    private final AdvancedModelRenderer Leftleg3;
    private final AdvancedModelRenderer Leftlegspike;
    private final AdvancedModelRenderer Leftlegspiketip_r1;
    private final AdvancedModelRenderer Leftlegspikebase_r1;
    private final AdvancedModelRenderer RightLeg1;
    private final AdvancedModelRenderer RightLeg2;
    private final AdvancedModelRenderer RightLeg3;
    private final AdvancedModelRenderer Rightlegspike;
    private final AdvancedModelRenderer Rightlegspiketip_r1;
    private final AdvancedModelRenderer Rightlegspikebase_r1;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer Rightbodymiddlebackplate_r1;
    private final AdvancedModelRenderer Leftbodymiddlebackplate_r1;
    private final AdvancedModelRenderer Rightbodymiddlefrontplate_r1;
    private final AdvancedModelRenderer Leftbodymiddlefrontplate_r1;
    private final AdvancedModelRenderer Leftbodyspike;
    private final AdvancedModelRenderer Leftbodymiddlespiketip_r1;
    private final AdvancedModelRenderer Leftbodymiddlespikebase_r1;
    private final AdvancedModelRenderer Rightbodyspike;
    private final AdvancedModelRenderer Rightbodymiddlespiketip_r1;
    private final AdvancedModelRenderer Rightbodymiddlespikebase_r1;
    private final AdvancedModelRenderer Bodyfront;
    private final AdvancedModelRenderer Rightbodyfrontbackplate_r1;
    private final AdvancedModelRenderer Leftbodyfrontbackplate_r1;
    private final AdvancedModelRenderer Leftbodyfrontfrontplate_r1;
    private final AdvancedModelRenderer Rightbodyfrontfrontplate_r1;
    private final AdvancedModelRenderer Bodyfrontslope_r1;
    private final AdvancedModelRenderer Leftarm1;
    private final AdvancedModelRenderer Leftarm2;
    private final AdvancedModelRenderer Leftarm3;
    private final AdvancedModelRenderer Rightarm1;
    private final AdvancedModelRenderer Rightarm2;
    private final AdvancedModelRenderer Rightarm3;
    private final AdvancedModelRenderer Neck1;
    private final AdvancedModelRenderer Leftneckbaseplate_r1;
    private final AdvancedModelRenderer Neckbase_r1;
    private final AdvancedModelRenderer Neck2;
    private final AdvancedModelRenderer Rightneckmiddleplate_r1;
    private final AdvancedModelRenderer Neck3;
    private final AdvancedModelRenderer Rightneckfrontplate_r1;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer Upperjawslopefront_r1;
    private final AdvancedModelRenderer Upperjawslopebase_r1;
    private final AdvancedModelRenderer Upperjawfront_r1;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer Rightcheeklower_r1;
    private final AdvancedModelRenderer Lowerjawfront_r1;
    private final AdvancedModelRenderer Lowerjawmiddle_r1;
    private final AdvancedModelRenderer Tail1;
    private final AdvancedModelRenderer Righttailbasespike_r1;
    private final AdvancedModelRenderer Lefttailbasespike_r1;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Righttailmiddlebasespike_r1;
    private final AdvancedModelRenderer Lefttailmiddlebasespike_r1;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Righttailmiddlespike_r1;
    private final AdvancedModelRenderer Lefttailmiddlebasespike_r2;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer Righttailmiddleendspike_r1;
    private final AdvancedModelRenderer Lefttailmiddleendspike_r1;
    private final AdvancedModelRenderer Tail5;
    private final AdvancedModelRenderer Righttailendspike_r1;
    private final AdvancedModelRenderer Lefttailendspike_r1;

    private ModelAnimator animator;

    public ModelKentrosaurus() {
        this.textureWidth = 105;
        this.textureHeight = 105;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 9.0F, -3.0F);


        this.Hips = new AdvancedModelRenderer(this);
        this.Hips.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.root.addChild(Hips);


        this.Righthipspike_r1 = new AdvancedModelRenderer(this);
        this.Righthipspike_r1.setRotationPoint(-3.5F, -5.9736F, 2.4185F);
        this.Hips.addChild(Righthipspike_r1);
        this.setRotateAngle(Righthipspike_r1, -0.384F, -0.0774F, -0.4233F);
        this.Righthipspike_r1.cubeList.add(new ModelBox(Righthipspike_r1, 38, 0, 0.0F, -8.9952F, -1.2181F, 1, 9, 1, 0.0F, true));

        this.Lefthipspike_r1 = new AdvancedModelRenderer(this);
        this.Lefthipspike_r1.setRotationPoint(3.5F, -5.9736F, 2.4185F);
        this.Hips.addChild(Lefthipspike_r1);
        this.setRotateAngle(Lefthipspike_r1, -0.384F, 0.0774F, 0.4233F);
        this.Lefthipspike_r1.cubeList.add(new ModelBox(Lefthipspike_r1, 38, 0, -1.0F, -8.9952F, -1.2181F, 1, 9, 1, 0.0F, false));

        this.Hips_r1 = new AdvancedModelRenderer(this);
        this.Hips_r1.setRotationPoint(0.0F, -7.25F, -4.0F);
        this.Hips.addChild(Hips_r1);
        this.setRotateAngle(Hips_r1, -0.0436F, 0.0F, 0.0F);
        this.Hips_r1.cubeList.add(new ModelBox(Hips_r1, 38, 13, -4.5F, 0.0F, -0.75F, 9, 12, 10, 0.0F, false));

        this.Leftleg1 = new AdvancedModelRenderer(this);
        this.Leftleg1.setRotationPoint(4.25F, 0.75F, 1.75F);
        this.Hips.addChild(Leftleg1);
        this.setRotateAngle(Leftleg1, -0.1309F, 0.0F, 0.0F);
        this.Leftleg1.cubeList.add(new ModelBox(Leftleg1, 66, 0, -2.5F, -4.5F, -4.0F, 5, 10, 6, 0.0F, false));

        this.Leftleg2 = new AdvancedModelRenderer(this);
        this.Leftleg2.setRotationPoint(0.0F, 5.25F, -3.0F);
        this.Leftleg1.addChild(Leftleg2);
        this.setRotateAngle(Leftleg2, 0.1745F, 0.0F, 0.0F);
        this.Leftleg2.cubeList.add(new ModelBox(Leftleg2, 0, 0, -1.5F, -0.1375F, -0.3567F, 3, 9, 4, 0.0F, false));

        this.Leftleg3 = new AdvancedModelRenderer(this);
        this.Leftleg3.setRotationPoint(0.0F, 7.6125F, 1.8933F);
        this.Leftleg2.addChild(Leftleg3);
        this.setRotateAngle(Leftleg3, -0.0436F, 0.0F, 0.0F);
        this.Leftleg3.cubeList.add(new ModelBox(Leftleg3, 62, 38, -2.5F, -0.0436F, -4.251F, 5, 2, 6, 0.0F, false));

        this.Leftlegspike = new AdvancedModelRenderer(this);
        this.Leftlegspike.setRotationPoint(2.0F, -3.25F, 1.0F);
        this.Leftleg1.addChild(Leftlegspike);


        this.Leftlegspiketip_r1 = new AdvancedModelRenderer(this);
        this.Leftlegspiketip_r1.setRotationPoint(3.1819F, -0.9069F, 3.5014F);
        this.Leftlegspike.addChild(Leftlegspiketip_r1);
        this.setRotateAngle(Leftlegspiketip_r1, 0.7257F, -1.2707F, -0.7965F);
        this.Leftlegspiketip_r1.cubeList.add(new ModelBox(Leftlegspiketip_r1, 0, 33, -0.4009F, -1.0468F, 0.4986F, 5, 1, 1, -0.01F, false));

        this.Leftlegspikebase_r1 = new AdvancedModelRenderer(this);
        this.Leftlegspikebase_r1.setRotationPoint(0.5F, 0.0F, 0.0F);
        this.Leftlegspike.addChild(Leftlegspikebase_r1);
        this.setRotateAngle(Leftlegspikebase_r1, 0.4346F, -1.0861F, -0.4831F);
        this.Leftlegspikebase_r1.cubeList.add(new ModelBox(Leftlegspikebase_r1, 21, 49, -1.0F, -1.0F, -0.5F, 5, 1, 1, 0.2F, false));

        this.RightLeg1 = new AdvancedModelRenderer(this);
        this.RightLeg1.setRotationPoint(-4.25F, 0.75F, 1.75F);
        this.Hips.addChild(RightLeg1);
        this.setRotateAngle(RightLeg1, -0.1309F, 0.0F, 0.0F);
        this.RightLeg1.cubeList.add(new ModelBox(RightLeg1, 66, 0, -2.5F, -4.5F, -4.0F, 5, 10, 6, 0.0F, true));

        this.RightLeg2 = new AdvancedModelRenderer(this);
        this.RightLeg2.setRotationPoint(0.0F, 5.25F, -3.0F);
        this.RightLeg1.addChild(RightLeg2);
        this.setRotateAngle(RightLeg2, 0.1745F, 0.0F, 0.0F);
        this.RightLeg2.cubeList.add(new ModelBox(RightLeg2, 0, 0, -1.5F, -0.1375F, -0.3567F, 3, 9, 4, 0.0F, true));

        this.RightLeg3 = new AdvancedModelRenderer(this);
        this.RightLeg3.setRotationPoint(0.0F, 7.6125F, 1.8933F);
        this.RightLeg2.addChild(RightLeg3);
        this.setRotateAngle(RightLeg3, -0.0436F, 0.0F, 0.0F);
        this.RightLeg3.cubeList.add(new ModelBox(RightLeg3, 62, 38, -2.5F, -0.0436F, -4.251F, 5, 2, 6, 0.0F, true));

        this.Rightlegspike = new AdvancedModelRenderer(this);
        this.Rightlegspike.setRotationPoint(-2.0F, -3.25F, 1.0F);
        this.RightLeg1.addChild(Rightlegspike);


        this.Rightlegspiketip_r1 = new AdvancedModelRenderer(this);
        this.Rightlegspiketip_r1.setRotationPoint(-3.1819F, -0.9069F, 3.5014F);
        this.Rightlegspike.addChild(Rightlegspiketip_r1);
        this.setRotateAngle(Rightlegspiketip_r1, 0.7257F, 1.2707F, 0.7965F);
        this.Rightlegspiketip_r1.cubeList.add(new ModelBox(Rightlegspiketip_r1, 0, 33, -4.5991F, -1.0468F, 0.4986F, 5, 1, 1, -0.01F, true));

        this.Rightlegspikebase_r1 = new AdvancedModelRenderer(this);
        this.Rightlegspikebase_r1.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.Rightlegspike.addChild(Rightlegspikebase_r1);
        this.setRotateAngle(Rightlegspikebase_r1, 0.4346F, 1.0861F, 0.4831F);
        this.Rightlegspikebase_r1.cubeList.add(new ModelBox(Rightlegspikebase_r1, 21, 49, -4.0F, -1.0F, -0.5F, 5, 1, 1, 0.2F, true));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Hips.addChild(Bodymiddle);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 0, 23, -5.0F, -7.25F, -10.0F, 10, 14, 12, 0.2F, false));

        this.Rightbodymiddlebackplate_r1 = new AdvancedModelRenderer(this);
        this.Rightbodymiddlebackplate_r1.setRotationPoint(-3.0F, -6.75F, -3.5F);
        this.Bodymiddle.addChild(Rightbodymiddlebackplate_r1);
        this.setRotateAngle(Rightbodymiddlebackplate_r1, -0.1687F, -0.045F, -0.258F);
        this.Rightbodymiddlebackplate_r1.cubeList.add(new ModelBox(Rightbodymiddlebackplate_r1, 32, 23, -0.5F, -6.05F, -2.0F, 1, 8, 2, 0.0F, true));

        this.Leftbodymiddlebackplate_r1 = new AdvancedModelRenderer(this);
        this.Leftbodymiddlebackplate_r1.setRotationPoint(3.0F, -6.75F, -3.5F);
        this.Bodymiddle.addChild(Leftbodymiddlebackplate_r1);
        this.setRotateAngle(Leftbodymiddlebackplate_r1, -0.1687F, 0.045F, 0.258F);
        this.Leftbodymiddlebackplate_r1.cubeList.add(new ModelBox(Leftbodymiddlebackplate_r1, 32, 23, -0.5F, -6.05F, -2.0F, 1, 8, 2, 0.0F, false));

        this.Rightbodymiddlefrontplate_r1 = new AdvancedModelRenderer(this);
        this.Rightbodymiddlefrontplate_r1.setRotationPoint(-2.5F, -5.75F, -8.25F);
        this.Bodymiddle.addChild(Rightbodymiddlefrontplate_r1);
        this.setRotateAngle(Rightbodymiddlefrontplate_r1, -0.2138F, -0.0338F, -0.2597F);
        this.Rightbodymiddlefrontplate_r1.cubeList.add(new ModelBox(Rightbodymiddlefrontplate_r1, 6, 23, -0.3019F, -6.7393F, -1.9022F, 1, 8, 2, -0.01F, true));

        this.Leftbodymiddlefrontplate_r1 = new AdvancedModelRenderer(this);
        this.Leftbodymiddlefrontplate_r1.setRotationPoint(2.5F, -5.75F, -8.25F);
        this.Bodymiddle.addChild(Leftbodymiddlefrontplate_r1);
        this.setRotateAngle(Leftbodymiddlefrontplate_r1, -0.2138F, 0.0338F, 0.2597F);
        this.Leftbodymiddlefrontplate_r1.cubeList.add(new ModelBox(Leftbodymiddlefrontplate_r1, 6, 23, -0.6981F, -6.7393F, -1.9022F, 1, 8, 2, -0.01F, false));

        this.Leftbodyspike = new AdvancedModelRenderer(this);
        this.Leftbodyspike.setRotationPoint(3.5F, -7.75F, 2.0F);
        this.Bodymiddle.addChild(Leftbodyspike);
        this.setRotateAngle(Leftbodyspike, 0.1745F, 0.0F, 0.0F);


        this.Leftbodymiddlespiketip_r1 = new AdvancedModelRenderer(this);
        this.Leftbodymiddlespiketip_r1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Leftbodyspike.addChild(Leftbodymiddlespiketip_r1);
        this.setRotateAngle(Leftbodymiddlespiketip_r1, -0.5115F, 0.0992F, 0.2427F);
        this.Leftbodymiddlespiketip_r1.cubeList.add(new ModelBox(Leftbodymiddlespiketip_r1, 55, 57, -0.6981F, -6.7393F, -0.1522F, 1, 8, 1, -0.01F, false));

        this.Leftbodymiddlespikebase_r1 = new AdvancedModelRenderer(this);
        this.Leftbodymiddlespikebase_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Leftbodyspike.addChild(Leftbodymiddlespikebase_r1);
        this.setRotateAngle(Leftbodymiddlespikebase_r1, -0.3806F, 0.0992F, 0.2427F);
        this.Leftbodymiddlespikebase_r1.cubeList.add(new ModelBox(Leftbodymiddlespikebase_r1, 48, 75, -0.5F, -6.05F, -1.0F, 1, 8, 1, 0.0F, false));

        this.Rightbodyspike = new AdvancedModelRenderer(this);
        this.Rightbodyspike.setRotationPoint(-3.5F, -7.75F, 2.0F);
        this.Bodymiddle.addChild(Rightbodyspike);
        this.setRotateAngle(Rightbodyspike, 0.1745F, 0.0F, 0.0F);


        this.Rightbodymiddlespiketip_r1 = new AdvancedModelRenderer(this);
        this.Rightbodymiddlespiketip_r1.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.Rightbodyspike.addChild(Rightbodymiddlespiketip_r1);
        this.setRotateAngle(Rightbodymiddlespiketip_r1, -0.5115F, -0.0992F, -0.2427F);
        this.Rightbodymiddlespiketip_r1.cubeList.add(new ModelBox(Rightbodymiddlespiketip_r1, 55, 57, -0.3019F, -6.7393F, -0.1522F, 1, 8, 1, -0.01F, true));

        this.Rightbodymiddlespikebase_r1 = new AdvancedModelRenderer(this);
        this.Rightbodymiddlespikebase_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Rightbodyspike.addChild(Rightbodymiddlespikebase_r1);
        this.setRotateAngle(Rightbodymiddlespikebase_r1, -0.3806F, -0.0992F, -0.2427F);
        this.Rightbodymiddlespikebase_r1.cubeList.add(new ModelBox(Rightbodymiddlespikebase_r1, 48, 75, -0.5F, -6.05F, -1.0F, 1, 8, 1, 0.0F, true));

        this.Bodyfront = new AdvancedModelRenderer(this);
        this.Bodyfront.setRotationPoint(0.0F, -0.204F, -8.8452F);
        this.Bodymiddle.addChild(Bodyfront);
        this.Bodyfront.cubeList.add(new ModelBox(Bodyfront, 5, 5, -5.0F, -3.046F, -8.9048F, 10, 9, 9, -0.01F, false));

        this.Rightbodyfrontbackplate_r1 = new AdvancedModelRenderer(this);
        this.Rightbodyfrontbackplate_r1.setRotationPoint(-2.0F, -3.546F, -3.6548F);
        this.Bodyfront.addChild(Rightbodyfrontbackplate_r1);
        this.setRotateAngle(Rightbodyfrontbackplate_r1, -0.0287F, -0.0837F, -0.1039F);
        this.Rightbodyfrontbackplate_r1.cubeList.add(new ModelBox(Rightbodyfrontbackplate_r1, 0, 23, -0.5F, -5.8F, -1.5F, 1, 8, 2, 0.0F, true));

        this.Leftbodyfrontbackplate_r1 = new AdvancedModelRenderer(this);
        this.Leftbodyfrontbackplate_r1.setRotationPoint(2.0F, -3.546F, -3.6548F);
        this.Bodyfront.addChild(Leftbodyfrontbackplate_r1);
        this.setRotateAngle(Leftbodyfrontbackplate_r1, -0.0287F, 0.0837F, 0.1039F);
        this.Leftbodyfrontbackplate_r1.cubeList.add(new ModelBox(Leftbodyfrontbackplate_r1, 0, 23, -0.5F, -5.8F, -1.5F, 1, 8, 2, 0.0F, false));

        this.Leftbodyfrontfrontplate_r1 = new AdvancedModelRenderer(this);
        this.Leftbodyfrontfrontplate_r1.setRotationPoint(1.9134F, -4.8887F, -8.1249F);
        this.Bodyfront.addChild(Leftbodyfrontfrontplate_r1);
        this.setRotateAngle(Leftbodyfrontfrontplate_r1, 0.4827F, -0.0053F, 0.0914F);
        this.Leftbodyfrontfrontplate_r1.cubeList.add(new ModelBox(Leftbodyfrontfrontplate_r1, 63, 0, -0.5898F, -1.7862F, -0.3299F, 1, 3, 2, -0.01F, false));

        this.Rightbodyfrontfrontplate_r1 = new AdvancedModelRenderer(this);
        this.Rightbodyfrontfrontplate_r1.setRotationPoint(-1.9134F, -4.8887F, -8.1249F);
        this.Bodyfront.addChild(Rightbodyfrontfrontplate_r1);
        this.setRotateAngle(Rightbodyfrontfrontplate_r1, 0.4827F, 0.0053F, -0.0914F);
        this.Rightbodyfrontfrontplate_r1.cubeList.add(new ModelBox(Rightbodyfrontfrontplate_r1, 63, 0, -0.4102F, -1.7862F, -0.3299F, 1, 3, 2, -0.01F, true));

        this.Bodyfrontslope_r1 = new AdvancedModelRenderer(this);
        this.Bodyfrontslope_r1.setRotationPoint(0.0F, -2.4822F, -8.6834F);
        this.Bodyfront.addChild(Bodyfrontslope_r1);
        this.setRotateAngle(Bodyfrontslope_r1, 0.48F, 0.0F, 0.0F);
        this.Bodyfrontslope_r1.cubeList.add(new ModelBox(Bodyfrontslope_r1, 35, 40, -4.5F, -0.5076F, -0.018F, 9, 8, 9, 0.0F, false));

        this.Leftarm1 = new AdvancedModelRenderer(this);
        this.Leftarm1.setRotationPoint(4.25F, 2.204F, -5.9048F);
        this.Bodyfront.addChild(Leftarm1);
        this.setRotateAngle(Leftarm1, 0.2182F, 0.0F, 0.0F);
        this.Leftarm1.cubeList.add(new ModelBox(Leftarm1, 17, 74, -1.5F, -1.5F, -2.0F, 4, 7, 4, 0.0F, false));

        this.Leftarm2 = new AdvancedModelRenderer(this);
        this.Leftarm2.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.Leftarm1.addChild(Leftarm2);
        this.setRotateAngle(Leftarm2, -0.2618F, 0.0F, 0.0F);
        this.Leftarm2.cubeList.add(new ModelBox(Leftarm2, 50, 0, -1.0F, -1.0F, -1.5F, 3, 8, 3, 0.0F, false));

        this.Leftarm3 = new AdvancedModelRenderer(this);
        this.Leftarm3.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.Leftarm2.addChild(Leftarm3);
        this.setRotateAngle(Leftarm3, 0.0436F, 0.0F, 0.0F);
        this.Leftarm3.cubeList.add(new ModelBox(Leftarm3, 22, 53, -1.5F, 0.0F, -2.75F, 4, 2, 4, 0.0F, false));

        this.Rightarm1 = new AdvancedModelRenderer(this);
        this.Rightarm1.setRotationPoint(-4.25F, 2.204F, -5.9048F);
        this.Bodyfront.addChild(Rightarm1);
        this.setRotateAngle(Rightarm1, 0.2182F, 0.0F, 0.0F);
        this.Rightarm1.cubeList.add(new ModelBox(Rightarm1, 17, 74, -2.5F, -1.5F, -2.0F, 4, 7, 4, 0.0F, true));

        this.Rightarm2 = new AdvancedModelRenderer(this);
        this.Rightarm2.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.Rightarm1.addChild(Rightarm2);
        this.setRotateAngle(Rightarm2, -0.2618F, 0.0F, 0.0F);
        this.Rightarm2.cubeList.add(new ModelBox(Rightarm2, 50, 0, -2.0F, -1.0F, -1.5F, 3, 8, 3, 0.0F, true));

        this.Rightarm3 = new AdvancedModelRenderer(this);
        this.Rightarm3.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.Rightarm2.addChild(Rightarm3);
        this.setRotateAngle(Rightarm3, 0.0436F, 0.0F, 0.0F);
        this.Rightarm3.cubeList.add(new ModelBox(Rightarm3, 22, 53, -2.5F, 0.0F, -2.75F, 4, 2, 4, 0.0F, true));

        this.Neck1 = new AdvancedModelRenderer(this);
        this.Neck1.setRotationPoint(-0.5F, -2.5371F, -9.0454F);
        this.Bodyfront.addChild(Neck1);
        this.Neck1.cubeList.add(new ModelBox(Neck1, 64, 62, -2.5F, -0.009F, -4.8595F, 6, 6, 8, 0.0F, false));

        this.Leftneckbaseplate_r1 = new AdvancedModelRenderer(this);
        this.Leftneckbaseplate_r1.setRotationPoint(-0.6634F, -0.6016F, -1.8296F);
        this.Neck1.addChild(Leftneckbaseplate_r1);
        this.setRotateAngle(Leftneckbaseplate_r1, 0.3231F, -0.1063F, -0.1023F);
        this.Leftneckbaseplate_r1.cubeList.add(new ModelBox(Leftneckbaseplate_r1, 62, 38, -0.4836F, -1.8587F, -1.3181F, 1, 3, 2, 0.0F, true));

        this.Neckbase_r1 = new AdvancedModelRenderer(this);
        this.Neckbase_r1.setRotationPoint(1.6634F, -0.6016F, -1.8296F);
        this.Neck1.addChild(Neckbase_r1);
        this.setRotateAngle(Neckbase_r1, 0.3231F, 0.1063F, 0.1023F);
        this.Neckbase_r1.cubeList.add(new ModelBox(Neckbase_r1, 62, 38, -0.5164F, -1.8587F, -1.3181F, 1, 3, 2, 0.0F, false));

        this.Neck2 = new AdvancedModelRenderer(this);
        this.Neck2.setRotationPoint(0.0F, 0.241F, -4.3595F);
        this.Neck1.addChild(Neck2);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 0, 67, -1.5F, 0.0F, -5.0F, 4, 5, 6, 0.0F, false));

        this.Rightneckmiddleplate_r1 = new AdvancedModelRenderer(this);
        this.Rightneckmiddleplate_r1.setRotationPoint(1.0F, -0.75F, -2.25F);
        this.Neck2.addChild(Rightneckmiddleplate_r1);
        this.setRotateAngle(Rightneckmiddleplate_r1, -0.1309F, 0.0F, 0.0F);
        this.Rightneckmiddleplate_r1.cubeList.add(new ModelBox(Rightneckmiddleplate_r1, 21, 49, -1.75F, -1.25F, -1.0F, 0, 3, 2, 0.0F, true));
        this.Rightneckmiddleplate_r1.cubeList.add(new ModelBox(Rightneckmiddleplate_r1, 21, 49, 0.75F, -1.25F, -1.0F, 0, 3, 2, 0.0F, false));

        this.Neck3 = new AdvancedModelRenderer(this);
        this.Neck3.setRotationPoint(0.0F, 0.25F, -5.0F);
        this.Neck2.addChild(Neck3);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 34, 75, -1.0F, 0.0F, -3.0F, 3, 4, 4, -0.02F, false));

        this.Rightneckfrontplate_r1 = new AdvancedModelRenderer(this);
        this.Rightneckfrontplate_r1.setRotationPoint(1.0F, -1.75F, -2.25F);
        this.Neck3.addChild(Rightneckfrontplate_r1);
        this.setRotateAngle(Rightneckfrontplate_r1, -0.1745F, 0.0F, 0.0F);
        this.Rightneckfrontplate_r1.cubeList.add(new ModelBox(Rightneckfrontplate_r1, 0, 0, -1.25F, 0.0F, 0.75F, 0, 2, 1, 0.0F, true));
        this.Rightneckfrontplate_r1.cubeList.add(new ModelBox(Rightneckfrontplate_r1, 0, 0, 0.25F, 0.0F, 0.75F, 0, 2, 1, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(1.0F, 2.0F, -2.5F);
        this.Neck3.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 0, 49, -2.0F, -2.0F, -2.0F, 3, 2, 2, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 64, 62, -1.5F, -1.0F, -3.75F, 2, 1, 2, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 63, 80, 0.01F, -1.75F, -1.75F, 1, 1, 2, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 63, 80, -2.01F, -1.75F, -1.75F, 1, 1, 2, 0.01F, true));

        this.Upperjawslopefront_r1 = new AdvancedModelRenderer(this);
        this.Upperjawslopefront_r1.setRotationPoint(0.0F, -1.75F, -3.75F);
        this.Head.addChild(Upperjawslopefront_r1);
        this.setRotateAngle(Upperjawslopefront_r1, 0.1745F, 0.0F, 0.0F);
        this.Upperjawslopefront_r1.cubeList.add(new ModelBox(Upperjawslopefront_r1, 59, 62, -1.0F, 0.0577F, -2.58F, 1, 1, 3, -0.01F, false));

        this.Upperjawslopebase_r1 = new AdvancedModelRenderer(this);
        this.Upperjawslopebase_r1.setRotationPoint(0.0F, -2.0F, -2.0F);
        this.Head.addChild(Upperjawslopebase_r1);
        this.setRotateAngle(Upperjawslopebase_r1, 0.1745F, 0.0F, 0.0F);
        this.Upperjawslopebase_r1.cubeList.add(new ModelBox(Upperjawslopebase_r1, 32, 63, -1.5F, 0.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.Upperjawfront_r1 = new AdvancedModelRenderer(this);
        this.Upperjawfront_r1.setRotationPoint(-0.5F, -1.0F, -3.75F);
        this.Head.addChild(Upperjawfront_r1);
        this.setRotateAngle(Upperjawfront_r1, 0.0873F, 0.0F, 0.0F);
        this.Upperjawfront_r1.cubeList.add(new ModelBox(Upperjawfront_r1, 32, 59, -0.5F, 0.0F, -2.5F, 1, 1, 3, 0.0F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(-0.5F, 0.0F, 0.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 53, -1.5F, 0.0F, -2.0F, 3, 1, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 56, -1.0F, -1.75F, -2.0F, 2, 2, 2, -0.02F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 53, 98, 0.99F, -1.75F, -3.25F, 0, 2, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 53, 98, -0.99F, -1.75F, -3.25F, 0, 2, 2, 0.0F, true));

        this.Rightcheeklower_r1 = new AdvancedModelRenderer(this);
        this.Rightcheeklower_r1.setRotationPoint(-0.75F, -0.25F, -3.0F);
        this.Jaw.addChild(Rightcheeklower_r1);
        this.setRotateAngle(Rightcheeklower_r1, -0.4363F, 0.0F, 0.0F);
        this.Rightcheeklower_r1.cubeList.add(new ModelBox(Rightcheeklower_r1, 54, 98, -0.23F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));
        this.Rightcheeklower_r1.cubeList.add(new ModelBox(Rightcheeklower_r1, 54, 98, 1.73F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.Lowerjawfront_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawfront_r1.setRotationPoint(0.0F, -0.1195F, -3.7256F);
        this.Jaw.addChild(Lowerjawfront_r1);
        this.setRotateAngle(Lowerjawfront_r1, 0.0436F, 0.0F, 0.0F);
        this.Lowerjawfront_r1.cubeList.add(new ModelBox(Lowerjawfront_r1, 76, 84, -0.5F, 0.0183F, -1.9638F, 1, 1, 2, -0.01F, false));

        this.Lowerjawmiddle_r1 = new AdvancedModelRenderer(this);
        this.Lowerjawmiddle_r1.setRotationPoint(0.5F, 1.0F, -1.75F);
        this.Jaw.addChild(Lowerjawmiddle_r1);
        this.setRotateAngle(Lowerjawmiddle_r1, -0.0436F, 0.0F, 0.0F);
        this.Lowerjawmiddle_r1.cubeList.add(new ModelBox(Lowerjawmiddle_r1, 62, 46, -1.5F, -1.0F, -2.0F, 2, 1, 2, 0.0F, false));

        this.Tail1 = new AdvancedModelRenderer(this);
        this.Tail1.setRotationPoint(-0.5F, -6.75F, 4.0F);
        this.Hips.addChild(Tail1);
        this.setRotateAngle(Tail1, -0.0436F, 0.0F, 0.0F);
        this.Tail1.cubeList.add(new ModelBox(Tail1, 32, 57, -3.0F, 0.0F, -0.25F, 7, 9, 9, 0.0F, false));

        this.Righttailbasespike_r1 = new AdvancedModelRenderer(this);
        this.Righttailbasespike_r1.setRotationPoint(-2.0F, 0.5F, 7.25F);
        this.Tail1.addChild(Righttailbasespike_r1);
        this.setRotateAngle(Righttailbasespike_r1, 0.8594F, 0.358F, 1.0062F);
        this.Righttailbasespike_r1.cubeList.add(new ModelBox(Righttailbasespike_r1, 58, 77, -9.0F, -1.0F, -1.0F, 10, 1, 1, 0.0F, true));

        this.Lefttailbasespike_r1 = new AdvancedModelRenderer(this);
        this.Lefttailbasespike_r1.setRotationPoint(3.0F, 0.5F, 7.25F);
        this.Tail1.addChild(Lefttailbasespike_r1);
        this.setRotateAngle(Lefttailbasespike_r1, 0.8594F, -0.358F, -1.0062F);
        this.Lefttailbasespike_r1.cubeList.add(new ModelBox(Lefttailbasespike_r1, 58, 77, -1.0F, -1.0F, -1.0F, 10, 1, 1, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, 0.5F, 8.75F);
        this.Tail1.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.1309F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 49, -2.0F, 0.0F, -2.0F, 5, 7, 11, 0.0F, false));

        this.Righttailmiddlebasespike_r1 = new AdvancedModelRenderer(this);
        this.Righttailmiddlebasespike_r1.setRotationPoint(-1.0F, 0.5F, 7.5F);
        this.Tail2.addChild(Righttailmiddlebasespike_r1);
        this.setRotateAngle(Righttailmiddlebasespike_r1, 0.0739F, 0.4009F, 0.9131F);
        this.Righttailmiddlebasespike_r1.cubeList.add(new ModelBox(Righttailmiddlebasespike_r1, 66, 16, -10.5F, -0.5F, -0.5F, 11, 1, 1, 0.0F, true));

        this.Lefttailmiddlebasespike_r1 = new AdvancedModelRenderer(this);
        this.Lefttailmiddlebasespike_r1.setRotationPoint(2.0F, 0.5F, 7.5F);
        this.Tail2.addChild(Lefttailmiddlebasespike_r1);
        this.setRotateAngle(Lefttailmiddlebasespike_r1, 0.0739F, -0.4009F, -0.9131F);
        this.Lefttailmiddlebasespike_r1.cubeList.add(new ModelBox(Lefttailmiddlebasespike_r1, 66, 16, -0.5F, -0.5F, -0.5F, 11, 1, 1, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.25F, 9.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 60, 46, -1.5F, 0.0F, -1.0F, 4, 5, 11, 0.0F, false));

        this.Righttailmiddlespike_r1 = new AdvancedModelRenderer(this);
        this.Righttailmiddlespike_r1.setRotationPoint(-0.5F, 0.5F, 8.5F);
        this.Tail3.addChild(Righttailmiddlespike_r1);
        this.setRotateAngle(Righttailmiddlespike_r1, 0.2499F, 0.502F, 0.622F);
        this.Righttailmiddlespike_r1.cubeList.add(new ModelBox(Righttailmiddlespike_r1, 66, 18, -9.25F, -0.5F, -0.5F, 10, 1, 1, 0.0F, true));

        this.Lefttailmiddlebasespike_r2 = new AdvancedModelRenderer(this);
        this.Lefttailmiddlebasespike_r2.setRotationPoint(1.5F, 0.5F, 8.5F);
        this.Tail3.addChild(Lefttailmiddlebasespike_r2);
        this.setRotateAngle(Lefttailmiddlebasespike_r2, 0.2499F, -0.502F, -0.622F);
        this.Lefttailmiddlebasespike_r2.cubeList.add(new ModelBox(Lefttailmiddlebasespike_r2, 66, 18, -0.75F, -0.5F, -0.5F, 10, 1, 1, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.5F, 10.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, 0.0873F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 65, 24, -1.0F, 0.0F, -1.0F, 3, 3, 11, 0.0F, false));

        this.Righttailmiddleendspike_r1 = new AdvancedModelRenderer(this);
        this.Righttailmiddleendspike_r1.setRotationPoint(-0.5F, 0.5F, 8.5F);
        this.Tail4.addChild(Righttailmiddleendspike_r1);
        this.setRotateAngle(Righttailmiddleendspike_r1, 0.2421F, 0.5993F, 0.4718F);
        this.Righttailmiddleendspike_r1.cubeList.add(new ModelBox(Righttailmiddleendspike_r1, 1, 86, -10.0F, -0.75F, -0.5F, 11, 1, 1, 0.0F, true));

        this.Lefttailmiddleendspike_r1 = new AdvancedModelRenderer(this);
        this.Lefttailmiddleendspike_r1.setRotationPoint(1.5F, 0.5F, 8.5F);
        this.Tail4.addChild(Lefttailmiddleendspike_r1);
        this.setRotateAngle(Lefttailmiddleendspike_r1, 0.2421F, -0.5993F, -0.4718F);
        this.Lefttailmiddleendspike_r1.cubeList.add(new ModelBox(Lefttailmiddleendspike_r1, 1, 86, -1.0F, -0.75F, -0.5F, 11, 1, 1, 0.0F, false));

        this.Tail5 = new AdvancedModelRenderer(this);
        this.Tail5.setRotationPoint(0.0F, 0.5F, 10.0F);
        this.Tail4.addChild(Tail5);
        this.setRotateAngle(Tail5, 0.0873F, 0.0F, 0.0F);
        this.Tail5.cubeList.add(new ModelBox(Tail5, 34, 0, -0.5F, -0.25F, -1.0F, 2, 2, 11, 0.0F, false));

        this.Righttailendspike_r1 = new AdvancedModelRenderer(this);
        this.Righttailendspike_r1.setRotationPoint(0.0F, 0.75F, 9.0F);
        this.Tail5.addChild(Righttailendspike_r1);
        this.setRotateAngle(Righttailendspike_r1, -0.8923F, -0.5339F, -0.8738F);
        this.Righttailendspike_r1.cubeList.add(new ModelBox(Righttailendspike_r1, 94, 55, -0.5F, -11.8722F, -0.6107F, 1, 12, 1, 0.0F, true));

        this.Lefttailendspike_r1 = new AdvancedModelRenderer(this);
        this.Lefttailendspike_r1.setRotationPoint(1.0F, 0.75F, 9.0F);
        this.Tail5.addChild(Lefttailendspike_r1);
        this.setRotateAngle(Lefttailendspike_r1, -0.8923F, 0.5339F, 0.8738F);
        this.Lefttailendspike_r1.cubeList.add(new ModelBox(Lefttailendspike_r1, 94, 55, -0.5F, -11.8722F, -0.6107F, 1, 12, 1, 0.0F, false));


        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }
    public void renderStatic(float f) {
        //GlStateManager.pushMatrix();
        //GlStateManager.enableBlend();
        //GlStateManager.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
        //GlStateManager.disableCull();
        //this.Neck.render(0.01F);
        //GlStateManager.enableCull();
        //GlStateManager.disableBlend();
        //GlStateManager.popMatrix();
    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        EntityPrehistoricFloraKentrosaurus kentrosaurus = (EntityPrehistoricFloraKentrosaurus) e;

        this.faceTarget(f3, f4, 12, Neck1);
        this.faceTarget(f3, f4, 12, Neck2);
        this.faceTarget(f3, f4, 12, Neck3);
        this.faceTarget(f3, f4, 12, Head);

        AdvancedModelRenderer[] Tail = {this.Tail1, this.Tail2, this.Tail3, this.Tail4, this.Tail5};
        AdvancedModelRenderer[] Neck = {this.Neck1, this.Neck2, this.Neck3, this.Head};
        //AdvancedModelRenderer[] ArmL = {this.leftarm, this.leftarm2, this.leftarm3};
        //AdvancedModelRenderer[] ArmR = {this.rightarm, this.rightarm2, this.rightarm3};

        kentrosaurus.tailBuffer.applyChainSwingBuffer(Tail);

        if (kentrosaurus.getAnimation() == kentrosaurus.LAY_ANIMATION) {
            this.chainSwing(Neck, 0.5F, 0.10F, 0.5, f2, 0.8F);
            this.chainWave(Neck, 0.5F * 2, -0.02F, 0.5F, f2, 0.8F);
        }
        else {
            if (!kentrosaurus.isReallyInWater()) {

                if (f3 == 0.0F || !kentrosaurus.getIsMoving()) {
                    if (kentrosaurus.getAnimation() != kentrosaurus.EAT_ANIMATION
                        && kentrosaurus.getAnimation() != kentrosaurus.DRINK_ANIMATION) {
                        this.chainSwing(Neck, 0.05F, 0.10F, 0.5, f2, 0.8F);
                        this.chainWave(Neck, 0.05F * 2, -0.02F, 0.5F, f2, 0.8F);
                    }

                    this.chainWave(Tail, (0.15F * 0.35F), 0.125F * 0.15F, 0.2F, f2, 1F);
                    this.chainSwing(Tail, (0.15F * 0.35F) * 4F, 0.05F * 0.35F, 0.12F, f2, 1F);


                    return;
                }

                if (kentrosaurus.getIsFast()) { //Running


                } else { //Walking

                }
            } else {
                //Swimming pose:
                if (f3 == 0.0F) { //static in water
                    return;
                }
                //moving in water
                return;
            }
        }
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraKentrosaurus ee = (EntityPrehistoricFloraKentrosaurus) entitylivingbaseIn;

        if (!ee.isReallyInWater()) {
            if (ee.getIsMoving()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }
        else {
            //Swimming pose:
            if (!ee.getIsMoving()) { //static in water
                //
            }
            else {
                //moving in water
                //
            }
        }
        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            //animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            //animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.MAKE_NEST_ANIMATION) {
            //animNest(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            //animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.DRINK_ANIMATION) { //The graze anim
            //animGraze(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.ROAR_ANIMATION) { //The noise anim
            //animNoise(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animNoise(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraKentrosaurus entity = (EntityPrehistoricFloraKentrosaurus) entitylivingbaseIn;

    }



    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraKentrosaurus entity = (EntityPrehistoricFloraKentrosaurus) entitylivingbaseIn;

        int animCycle = 20;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;

        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -20D + (((tickAnim - 0D) / 3D) * (-10D-(-20D)));
            yy = -10D + (((tickAnim - 0D) / 3D) * (0D-(-10D)));
            zz = -10D + (((tickAnim - 0D) / 3D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -10D + (((tickAnim - 3D) / 4D) * (15D-(-10D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            zz = -10D + (((tickAnim - 3D) / 4D) * (-5D-(-10D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 15D + (((tickAnim - 7D) / 3D) * (25D-(15D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 7D) / 3D) * (0D-(-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 25D + (((tickAnim - 10D) / 3D) * (-7.5D-(25D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (-10D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (-10D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = -7.5D + (((tickAnim - 13D) / 5D) * (-30D-(-7.5D)));
            yy = -10D + (((tickAnim - 13D) / 5D) * (-10D-(-10D)));
            zz = -10D + (((tickAnim - 13D) / 5D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = -30D + (((tickAnim - 18D) / 2D) * (-20D-(-30D)));
            yy = -10D + (((tickAnim - 18D) / 2D) * (-10D-(-10D)));
            zz = -10D + (((tickAnim - 18D) / 2D) * (-10D-(-10D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = -1.5D + (((tickAnim - 0D) / 2D) * (-1.25+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.2D-(-1.5D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = -1.25+(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.2) + (((tickAnim - 2D) / 1D) * (-1D-(-1.25+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.2D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 3D) / 2D) * (-0.75+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.5D-(-1D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = -0.75+(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.5) + (((tickAnim - 5D) / 2D) * (-0.5D-(-0.75+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.5D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 7D) / 3D) * (0D-(-0.5D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0.5D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 13D) / 5D) * (1D-(0.5D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 18D) / 2D) * (-1.5D-(1D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*720-10))*3), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360+10))*3), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360+10))*3));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*360+10))*-0.5) + (((tickAnim - 0D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*360+10))*-0.5D-(Math.sin((Math.PI/180)*1D*(Math.PI/180)*(((double)tickAnim/20D)/1*360+10))*-0.5D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720+30))*-0.5) + (((tickAnim - 0D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.3D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720+30))*-0.5D)));
            zz = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720))*-0.5) + (((tickAnim - 0D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720))*-0.5D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720))*-0.5D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*360+10))*-0.5) + (((tickAnim - 2D) / 1D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*360+10))*-0.5D-(Math.sin((Math.PI/180)*1D*(Math.PI/180)*(((double)tickAnim/20D)/1*360+10))*-0.5D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.3) + (((tickAnim - 2D) / 1D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720+30))*-0.5D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.3D)));
            zz = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720))*-0.5) + (((tickAnim - 2D) / 1D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720))*-0.5D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720))*-0.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*360+10))*-0.5) + (((tickAnim - 3D) / 7D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*360+10))*-0.5D-(Math.sin((Math.PI/180)*1D*(Math.PI/180)*(((double)tickAnim/20D)/1*360+10))*-0.5D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720+30))*-0.5) + (((tickAnim - 3D) / 7D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720+30))*-0.5D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720+30))*-0.5D)));
            zz = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720))*-0.5) + (((tickAnim - 3D) / 7D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720))*-0.5D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720))*-0.5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*360+10))*-0.5) + (((tickAnim - 10D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*360+10))*-0.5D-(Math.sin((Math.PI/180)*1D*(Math.PI/180)*(((double)tickAnim/20D)/1*360+10))*-0.5D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720+30))*-0.5) + (((tickAnim - 10D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.3D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720+30))*-0.5D)));
            zz = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720))*-0.5) + (((tickAnim - 10D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720))*-0.5D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720))*-0.5D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*360+10))*-0.5) + (((tickAnim - 12D) / 1D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*360+10))*-0.5D-(Math.sin((Math.PI/180)*1D*(Math.PI/180)*(((double)tickAnim/20D)/1*360+10))*-0.5D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.3) + (((tickAnim - 12D) / 1D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720+30))*-0.5D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.3D)));
            zz = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720))*-0.5) + (((tickAnim - 12D) / 1D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720))*-0.5D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)/1*720))*-0.5D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -5D + (((tickAnim - 0D) / 3D) * (15D-(-5D)));
            yy = -5D + (((tickAnim - 0D) / 3D) * (-5D-(-5D)));
            zz = 5D + (((tickAnim - 0D) / 3D) * (5D-(5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 15D + (((tickAnim - 3D) / 4D) * (17.5D-(15D)));
            yy = -5D + (((tickAnim - 3D) / 4D) * (0D-(-5D)));
            zz = 5D + (((tickAnim - 3D) / 4D) * (5D-(5D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 17.5D + (((tickAnim - 7D) / 3D) * (17.5D-(17.5D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 7D) / 3D) * (0D-(5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 17.5D + (((tickAnim - 10D) / 3D) * (50D-(17.5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (10D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 50D + (((tickAnim - 13D) / 5D) * (22.5D-(50D)));
            yy = 5D + (((tickAnim - 13D) / 5D) * (5D-(5D)));
            zz = 10D + (((tickAnim - 13D) / 5D) * (10D-(10D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 22.5D + (((tickAnim - 18D) / 2D) * (-5D-(22.5D)));
            yy = 5D + (((tickAnim - 18D) / 2D) * (-5D-(5D)));
            zz = 10D + (((tickAnim - 18D) / 2D) * (5D-(10D)));
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25) + (((tickAnim - 5D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg2.offsetX = (float) Math.toRadians(xx);
        this.Leftleg2.offsetY = (float) Math.toRadians(yy);
        this.Leftleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 27.5D + (((tickAnim - 0D) / 3D) * (-5D-(27.5D)));
            yy = 2.5D + (((tickAnim - 0D) / 3D) * (0D-(2.5D)));
            zz = 5D + (((tickAnim - 0D) / 3D) * (5D-(5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -5D + (((tickAnim - 3D) / 4D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 3D) / 4D) * (0D-(5D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 7D) / 3D) * (40D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 40D + (((tickAnim - 10D) / 3D) * (47.5D-(40D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 47.5D + (((tickAnim - 13D) / 5D) * (57.5D-(47.5D)));
            yy = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (5D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 57.5D + (((tickAnim - 18D) / 2D) * (27.5D-(57.5D)));
            yy = 0D + (((tickAnim - 18D) / 2D) * (2.5D-(0D)));
            zz = 5D + (((tickAnim - 18D) / 2D) * (5D-(5D)));
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25) + (((tickAnim - 5D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftleg3.offsetX = (float) Math.toRadians(xx);
        this.Leftleg3.offsetY = (float) Math.toRadians(yy);
        this.Leftleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10D + (((tickAnim - 0D) / 3D) * (5D-(10D)));
            yy = 10D + (((tickAnim - 0D) / 3D) * (0D-(10D)));
            zz = 10D + (((tickAnim - 0D) / 3D) * (10D-(10D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 5D + (((tickAnim - 3D) / 4D) * (-5D-(5D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            zz = 10D + (((tickAnim - 3D) / 4D) * (5D-(10D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -5D + (((tickAnim - 7D) / 3D) * (-10D-(-5D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 7D) / 3D) * (0D-(5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -10D + (((tickAnim - 10D) / 3D) * (5D-(-10D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (10D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (10D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 5D + (((tickAnim - 13D) / 5D) * (10D-(5D)));
            yy = 10D + (((tickAnim - 13D) / 5D) * (10D-(10D)));
            zz = 10D + (((tickAnim - 13D) / 5D) * (10D-(10D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 10D + (((tickAnim - 18D) / 2D) * (10D-(10D)));
            yy = 10D + (((tickAnim - 18D) / 2D) * (10D-(10D)));
            zz = 10D + (((tickAnim - 18D) / 2D) * (10D-(10D)));
        }
        this.setRotateAngle(Leftlegspike, Leftlegspike.rotateAngleX + (float) Math.toRadians(xx), Leftlegspike.rotateAngleY + (float) Math.toRadians(yy), Leftlegspike.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 25D + (((tickAnim - 0D) / 3D) * (-7.5D-(25D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (10D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (10D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = -7.5D + (((tickAnim - 3D) / 5D) * (-30D-(-7.5D)));
            yy = 10D + (((tickAnim - 3D) / 5D) * (10D-(10D)));
            zz = 10D + (((tickAnim - 3D) / 5D) * (10D-(10D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = -30D + (((tickAnim - 8D) / 2D) * (-20D-(-30D)));
            yy = 10D + (((tickAnim - 8D) / 2D) * (10D-(10D)));
            zz = 10D + (((tickAnim - 8D) / 2D) * (10D-(10D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -20D + (((tickAnim - 10D) / 3D) * (-10D-(-20D)));
            yy = 10D + (((tickAnim - 10D) / 3D) * (0D-(10D)));
            zz = 10D + (((tickAnim - 10D) / 3D) * (10D-(10D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -10D + (((tickAnim - 13D) / 4D) * (15D-(-10D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 10D + (((tickAnim - 13D) / 4D) * (5D-(10D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 15D + (((tickAnim - 17D) / 3D) * (25D-(15D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 17D) / 3D) * (0D-(5D)));
        }
        this.setRotateAngle(RightLeg1, RightLeg1.rotateAngleX + (float) Math.toRadians(xx), RightLeg1.rotateAngleY + (float) Math.toRadians(yy), RightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            yy = 0.5D + (((tickAnim - 3D) / 5D) * (1D-(0.5D)));
            zz = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            yy = 1D + (((tickAnim - 8D) / 2D) * (-1.5D-(1D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = -1.5D + (((tickAnim - 10D) / 2D) * (-1.25+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.2D-(-1.5D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            yy = -1.25+(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.2) + (((tickAnim - 12D) / 1D) * (-1D-(-1.25+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.2D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 13D) / 2D) * (-0.75+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.5D-(-1D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
            yy = -0.75+(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.5) + (((tickAnim - 15D) / 2D) * (-0.5D-(-0.75+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.5D)));
            zz = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 17D) / 3D) * (0D-(-0.5D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
        }
        this.RightLeg1.offsetX = (float) Math.toRadians(xx);
        this.RightLeg1.offsetY = (float) Math.toRadians(yy);
        this.RightLeg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 17.5D + (((tickAnim - 0D) / 3D) * (50D-(17.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (-10D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 50D + (((tickAnim - 3D) / 5D) * (22.5D-(50D)));
            yy = -5D + (((tickAnim - 3D) / 5D) * (-5D-(-5D)));
            zz = -10D + (((tickAnim - 3D) / 5D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 22.5D + (((tickAnim - 8D) / 2D) * (-5D-(22.5D)));
            yy = -5D + (((tickAnim - 8D) / 2D) * (5D-(-5D)));
            zz = -10D + (((tickAnim - 8D) / 2D) * (-5D-(-10D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -5D + (((tickAnim - 10D) / 3D) * (15D-(-5D)));
            yy = 5D + (((tickAnim - 10D) / 3D) * (5D-(5D)));
            zz = -5D + (((tickAnim - 10D) / 3D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 15D + (((tickAnim - 13D) / 4D) * (17.5D-(15D)));
            yy = 5D + (((tickAnim - 13D) / 4D) * (0D-(5D)));
            zz = -5D + (((tickAnim - 13D) / 4D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 17.5D + (((tickAnim - 17D) / 3D) * (17.5D-(17.5D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 17D) / 3D) * (0D-(-5D)));
        }
        this.setRotateAngle(RightLeg2, RightLeg2.rotateAngleX + (float) Math.toRadians(xx), RightLeg2.rotateAngleY + (float) Math.toRadians(yy), RightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25) + (((tickAnim - 12D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25) + (((tickAnim - 15D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D)));
            zz = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightLeg2.offsetX = (float) Math.toRadians(xx);
        this.RightLeg2.offsetY = (float) Math.toRadians(yy);
        this.RightLeg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 40D + (((tickAnim - 0D) / 3D) * (47.5D-(40D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 47.5D + (((tickAnim - 3D) / 5D) * (57.5D-(47.5D)));
            yy = 0D + (((tickAnim - 3D) / 5D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 5D) * (-5D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 57.5D + (((tickAnim - 8D) / 2D) * (27.5D-(57.5D)));
            yy = 0D + (((tickAnim - 8D) / 2D) * (-2.5D-(0D)));
            zz = -5D + (((tickAnim - 8D) / 2D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 27.5D + (((tickAnim - 10D) / 3D) * (-5D-(27.5D)));
            yy = -2.5D + (((tickAnim - 10D) / 3D) * (0D-(-2.5D)));
            zz = -5D + (((tickAnim - 10D) / 3D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -5D + (((tickAnim - 13D) / 4D) * (0D-(-5D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 13D) / 4D) * (0D-(-5D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 17D) / 3D) * (40D-(0D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
        }
        this.setRotateAngle(RightLeg3, RightLeg3.rotateAngleX + (float) Math.toRadians(xx), RightLeg3.rotateAngleY + (float) Math.toRadians(yy), RightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25) + (((tickAnim - 12D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25) + (((tickAnim - 15D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D)));
            zz = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightLeg3.offsetX = (float) Math.toRadians(xx);
        this.RightLeg3.offsetY = (float) Math.toRadians(yy);
        this.RightLeg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -10D + (((tickAnim - 0D) / 3D) * (5D-(-10D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (-10D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (-10D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 8) {
            xx = 5D + (((tickAnim - 3D) / 5D) * (10D-(5D)));
            yy = -10D + (((tickAnim - 3D) / 5D) * (-10D-(-10D)));
            zz = -10D + (((tickAnim - 3D) / 5D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 10D + (((tickAnim - 8D) / 2D) * (10D-(10D)));
            yy = -10D + (((tickAnim - 8D) / 2D) * (-10D-(-10D)));
            zz = -10D + (((tickAnim - 8D) / 2D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10D + (((tickAnim - 10D) / 3D) * (5D-(10D)));
            yy = -10D + (((tickAnim - 10D) / 3D) * (0D-(-10D)));
            zz = -10D + (((tickAnim - 10D) / 3D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 5D + (((tickAnim - 13D) / 4D) * (-5D-(5D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = -10D + (((tickAnim - 13D) / 4D) * (-5D-(-10D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -5D + (((tickAnim - 17D) / 3D) * (-10D-(-5D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 17D) / 3D) * (0D-(-5D)));
        }
        this.setRotateAngle(Rightlegspike, Rightlegspike.rotateAngleX + (float) Math.toRadians(xx), Rightlegspike.rotateAngleY + (float) Math.toRadians(yy), Rightlegspike.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*720+10))*-3), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360))*-5), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360))*-3));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.2D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.2) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.2D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.2D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.2) + (((tickAnim - 12D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.2D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodymiddle.offsetX = (float) Math.toRadians(xx);
        this.Bodymiddle.offsetY = (float) Math.toRadians(yy);
        this.Bodymiddle.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*720-40))*-3), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360+30))*5), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360+30))*-3));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.3D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.3) + (((tickAnim - 5D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.3D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1) + (((tickAnim - 12D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.3D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.3) + (((tickAnim - 15D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.3D)));
            zz = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodyfront.offsetX = (float) Math.toRadians(xx);
        this.Bodyfront.offsetY = (float) Math.toRadians(yy);
        this.Bodyfront.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 7.5D + (((tickAnim - 0D) / 3D) * (22.5D-(7.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 0D) / 3D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 22.5D + (((tickAnim - 3D) / 4D) * (32.5D-(22.5D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (10D-(0D)));
            zz = -5D + (((tickAnim - 3D) / 4D) * (-10D-(-5D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 32.5D + (((tickAnim - 7D) / 3D) * (-17.5D-(32.5D)));
            yy = 10D + (((tickAnim - 7D) / 3D) * (10D-(10D)));
            zz = -10D + (((tickAnim - 7D) / 3D) * (-15D-(-10D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -17.5D + (((tickAnim - 10D) / 3D) * (-35D-(-17.5D)));
            yy = 10D + (((tickAnim - 10D) / 3D) * (5D-(10D)));
            zz = -15D + (((tickAnim - 10D) / 3D) * (-10D-(-15D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -35D + (((tickAnim - 13D) / 4D) * (-2.5D-(-35D)));
            yy = 5D + (((tickAnim - 13D) / 4D) * (0D-(5D)));
            zz = -10D + (((tickAnim - 13D) / 4D) * (-5D-(-10D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -2.5D + (((tickAnim - 17D) / 3D) * (7.5D-(-2.5D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 17D) / 3D) * (-5D-(-5D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 13D) / 2D) * (-0.75+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.2D-(-1D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
            yy = -0.75+(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.2) + (((tickAnim - 15D) / 2D) * (-0.5D-(-0.75+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.2D)));
            zz = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 17D) / 1D) * (-0.25+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.5D-(-0.5D)));
            zz = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = -0.25+(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.5) + (((tickAnim - 18D) / 2D) * (0D-(-0.25+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.5D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.Leftarm1.offsetX = (float) Math.toRadians(xx);
        this.Leftarm1.offsetY = (float) Math.toRadians(yy);
        this.Leftarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 10D + (((tickAnim - 0D) / 3D) * (-2.5D-(10D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 0D) / 3D) * (0D-(5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -2.5D + (((tickAnim - 3D) / 4D) * (-60D-(-2.5D)));
            yy = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -60D + (((tickAnim - 7D) / 3D) * (-32.5D-(-60D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (12.5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = -32.5D + (((tickAnim - 10D) / 3D) * (12.5D-(-32.5D)));
            yy = -5D + (((tickAnim - 10D) / 3D) * (-5D-(-5D)));
            zz = 12.5D + (((tickAnim - 10D) / 3D) * (5D-(12.5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 12.5D + (((tickAnim - 13D) / 4D) * (-15D-(12.5D)));
            yy = -5D + (((tickAnim - 13D) / 4D) * (0D-(-5D)));
            zz = 5D + (((tickAnim - 13D) / 4D) * (0D-(5D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -15D + (((tickAnim - 17D) / 3D) * (10D-(-15D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (5D-(0D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25) + (((tickAnim - 15D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D)));
            zz = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 17D) / 1D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25) + (((tickAnim - 18D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.Leftarm2.offsetX = (float) Math.toRadians(xx);
        this.Leftarm2.offsetY = (float) Math.toRadians(yy);
        this.Leftarm2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 15D + (((tickAnim - 0D) / 3D) * (57.5D-(15D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (5D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 57.5D + (((tickAnim - 3D) / 4D) * (105D-(57.5D)));
            yy = 5D + (((tickAnim - 3D) / 4D) * (0D-(5D)));
            zz = 5D + (((tickAnim - 3D) / 4D) * (0D-(5D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 105D + (((tickAnim - 7D) / 3D) * (77.5D-(105D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 77.5D + (((tickAnim - 10D) / 3D) * (22.5D-(77.5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 22.5D + (((tickAnim - 13D) / 4D) * (17.5D-(22.5D)));
            yy = -2.5D + (((tickAnim - 13D) / 4D) * (0D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 13D) / 4D) * (5D-(2.5D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 17.5D + (((tickAnim - 17D) / 3D) * (15D-(17.5D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 17D) / 3D) * (0D-(5D)));
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 13D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25) + (((tickAnim - 15D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D)));
            zz = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 17D) / 1D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25) + (((tickAnim - 18D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D)));
            zz = 0D + (((tickAnim - 18D) / 2D) * (0D-(0D)));
        }
        this.Leftarm3.offsetX = (float) Math.toRadians(xx);
        this.Leftarm3.offsetY = (float) Math.toRadians(yy);
        this.Leftarm3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -17.5D + (((tickAnim - 0D) / 3D) * (-35D-(-17.5D)));
            yy = -10D + (((tickAnim - 0D) / 3D) * (-5D-(-10D)));
            zz = 15D + (((tickAnim - 0D) / 3D) * (10D-(15D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = -35D + (((tickAnim - 3D) / 4D) * (-2.5D-(-35D)));
            yy = -5D + (((tickAnim - 3D) / 4D) * (0D-(-5D)));
            zz = 10D + (((tickAnim - 3D) / 4D) * (5D-(10D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -2.5D + (((tickAnim - 7D) / 3D) * (7.5D-(-2.5D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 7D) / 3D) * (5D-(5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 7.5D + (((tickAnim - 10D) / 3D) * (22.5D-(7.5D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 10D) / 3D) * (5D-(5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 22.5D + (((tickAnim - 13D) / 4D) * (32.5D-(22.5D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (-10D-(0D)));
            zz = 5D + (((tickAnim - 13D) / 4D) * (10D-(5D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 32.5D + (((tickAnim - 17D) / 3D) * (-17.5D-(32.5D)));
            yy = -10D + (((tickAnim - 17D) / 3D) * (-10D-(-10D)));
            zz = 10D + (((tickAnim - 17D) / 3D) * (15D-(10D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 3D) / 2D) * (-0.75+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.2D-(-1D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = -0.75+(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.2) + (((tickAnim - 5D) / 2D) * (-0.5D-(-0.75+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*-0.2D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 7D) / 1D) * (-0.25+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.5D-(-0.5D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            yy = -0.25+(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.5) + (((tickAnim - 8D) / 2D) * (0D-(-0.25+Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*-0.5D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
        }
        this.Rightarm1.offsetX = (float) Math.toRadians(xx);
        this.Rightarm1.offsetY = (float) Math.toRadians(yy);
        this.Rightarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = -32.5D + (((tickAnim - 0D) / 3D) * (12.5D-(-32.5D)));
            yy = 5D + (((tickAnim - 0D) / 3D) * (5D-(5D)));
            zz = -12.5D + (((tickAnim - 0D) / 3D) * (-5D-(-12.5D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 12.5D + (((tickAnim - 3D) / 4D) * (-15D-(12.5D)));
            yy = 5D + (((tickAnim - 3D) / 4D) * (0D-(5D)));
            zz = -5D + (((tickAnim - 3D) / 4D) * (0D-(-5D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = -15D + (((tickAnim - 7D) / 3D) * (10D-(-15D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 3D) * (-5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 10D + (((tickAnim - 10D) / 3D) * (-2.5D-(10D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 10D) / 3D) * (0D-(-5D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = -2.5D + (((tickAnim - 13D) / 4D) * (-60D-(-2.5D)));
            yy = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 4D) * (0D-(0D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = -60D + (((tickAnim - 17D) / 3D) * (-32.5D-(-60D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (-12.5D-(0D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25) + (((tickAnim - 5D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 1D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25) + (((tickAnim - 8D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightarm2.offsetX = (float) Math.toRadians(xx);
        this.Rightarm2.offsetY = (float) Math.toRadians(yy);
        this.Rightarm2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 3) {
            xx = 77.5D + (((tickAnim - 0D) / 3D) * (22.5D-(77.5D)));
            yy = 0D + (((tickAnim - 0D) / 3D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 3D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 7) {
            xx = 22.5D + (((tickAnim - 3D) / 4D) * (17.5D-(22.5D)));
            yy = 2.5D + (((tickAnim - 3D) / 4D) * (0D-(2.5D)));
            zz = -2.5D + (((tickAnim - 3D) / 4D) * (-5D-(-2.5D)));
        }
        else if (tickAnim >= 7 && tickAnim < 10) {
            xx = 17.5D + (((tickAnim - 7D) / 3D) * (15D-(17.5D)));
            yy = 0D + (((tickAnim - 7D) / 3D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 7D) / 3D) * (0D-(-5D)));
        }
        else if (tickAnim >= 10 && tickAnim < 13) {
            xx = 15D + (((tickAnim - 10D) / 3D) * (57.5D-(15D)));
            yy = 0D + (((tickAnim - 10D) / 3D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 3D) * (-5D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 17) {
            xx = 57.5D + (((tickAnim - 13D) / 4D) * (105D-(57.5D)));
            yy = -5D + (((tickAnim - 13D) / 4D) * (0D-(-5D)));
            zz = -5D + (((tickAnim - 13D) / 4D) * (0D-(-5D)));
        }
        else if (tickAnim >= 17 && tickAnim < 20) {
            xx = 105D + (((tickAnim - 17D) / 3D) * (77.5D-(105D)));
            yy = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 17D) / 3D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25) + (((tickAnim - 5D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.25D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 8) {
            xx = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 1D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 8 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25) + (((tickAnim - 8D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.3))*0.25D)));
            zz = 0D + (((tickAnim - 8D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Rightarm3.offsetX = (float) Math.toRadians(xx);
        this.Rightarm3.offsetY = (float) Math.toRadians(yy);
        this.Rightarm3.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*720+60))*5), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360+30))*-5), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360+30))*3));

        if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.2D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.2) + (((tickAnim - 5D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.2D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.2D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.2) + (((tickAnim - 15D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.2D)));
            zz = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.offsetX = (float) Math.toRadians(xx);
        this.Neck1.offsetY = (float) Math.toRadians(yy);
        this.Neck1.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*720+90))*-3), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360+60))*-5), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360+60))*3));

        if (tickAnim >= 3 && tickAnim < 5) {
            xx = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 5 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1) + (((tickAnim - 5D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D)));
            zz = 0D + (((tickAnim - 5D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 15) {
            xx = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 13D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D-(0D)));
            zz = 0D + (((tickAnim - 13D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 15 && tickAnim < 17) {
            xx = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1) + (((tickAnim - 15D) / 2D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D)));
            zz = 0D + (((tickAnim - 15D) / 2D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck2.offsetX = (float) Math.toRadians(xx);
        this.Neck2.offsetY = (float) Math.toRadians(yy);
        this.Neck2.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*720+60))*-3), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360+30))*5), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360+30))*-3));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*720-70))*3), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360+30))*-3), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*720+30))*-5), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360+60))*-5), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360+60))*-3));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1) + (((tickAnim - 12D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.offsetX = (float) Math.toRadians(xx);
        this.Tail1.offsetY = (float) Math.toRadians(yy);
        this.Tail1.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*720-30))*-3), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360))*-5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360))*-3));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1) + (((tickAnim - 12D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.offsetX = (float) Math.toRadians(xx);
        this.Tail2.offsetY = (float) Math.toRadians(yy);
        this.Tail2.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*720-90))*-3), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360-60))*-5), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360-60))*-3));

        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 2 && tickAnim < 3) {
            xx = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1) + (((tickAnim - 2D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D)));
            zz = 0D + (((tickAnim - 2D) / 1D) * (0D-(0D)));
        }
        else if (tickAnim >= 3 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 3D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 10D) / 2D) * (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 2D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
            yy = (Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1) + (((tickAnim - 12D) / 1D) * (0D-(Math.sin(1D*(Math.PI/180)*(((double)tickAnim/20D)*360/0.2))*0.1D)));
            zz = 0D + (((tickAnim - 12D) / 1D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.offsetX = (float) Math.toRadians(xx);
        this.Tail3.offsetY = (float) Math.toRadians(yy);
        this.Tail3.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*720-120))*-5), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360-120))*-5), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360-120))*-3));


        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*720-150))*-3), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360-150))*-5), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D)*1D)/1*360-150))*-3));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
    EntityPrehistoricFloraKentrosaurus entity = (EntityPrehistoricFloraKentrosaurus) entitylivingbaseIn;

        int animCycle = 60;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Hips, Hips.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3+30))*-2), Hips.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+60))*3), Hips.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+60))*3));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3+70))*-0.3) + (((tickAnim - 0D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.2D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3+70))*-0.3D)));
            zz = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3))*0.5) + (((tickAnim - 0D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3))*0.5D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3))*0.5D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.2) + (((tickAnim - 6D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3+70))*-0.3D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.2D)));
            zz = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3))*0.5) + (((tickAnim - 6D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3))*0.5D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3))*0.5D)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3+70))*-0.3) + (((tickAnim - 12D) / 18D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3+70))*-0.3D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3+70))*-0.3D)));
            zz = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3))*0.5) + (((tickAnim - 12D) / 18D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3))*0.5D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3))*0.5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3+70))*-0.3) + (((tickAnim - 30D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.2D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3+70))*-0.3D)));
            zz = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3))*0.5) + (((tickAnim - 30D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3))*0.5D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3))*0.5D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.2) + (((tickAnim - 36D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3+70))*-0.3D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.2D)));
            zz = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3))*0.5) + (((tickAnim - 36D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3))*0.5D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*720/3))*0.5D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Hips.offsetX = (float) Math.toRadians(xx);
        this.Hips.offsetY = (float) Math.toRadians(yy);
        this.Hips.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -17.5D + (((tickAnim - 0D) / 12D) * (-10D-(-17.5D)));
            yy = -5D + (((tickAnim - 0D) / 12D) * (0D-(-5D)));
            zz = -5D + (((tickAnim - 0D) / 12D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -10D + (((tickAnim - 12D) / 11D) * (12.5D-(-10D)));
            yy = 0D + (((tickAnim - 12D) / 11D) * (-5D-(0D)));
            zz = -5D + (((tickAnim - 12D) / 11D) * (0D-(-5D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 12.5D + (((tickAnim - 23D) / 7D) * (15D-(12.5D)));
            yy = -5D + (((tickAnim - 23D) / 7D) * (-10D-(-5D)));
            zz = 0D + (((tickAnim - 23D) / 7D) * (-5D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 15D + (((tickAnim - 30D) / 12D) * (-22.5D-(15D)));
            yy = -10D + (((tickAnim - 30D) / 12D) * (-10D-(-10D)));
            zz = -5D + (((tickAnim - 30D) / 12D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = -22.5D + (((tickAnim - 42D) / 10D) * (-47.5D-(-22.5D)));
            yy = -10D + (((tickAnim - 42D) / 10D) * (-10D-(-10D)));
            zz = -5D + (((tickAnim - 42D) / 10D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = -47.5D + (((tickAnim - 52D) / 8D) * (-17.5D-(-47.5D)));
            yy = -10D + (((tickAnim - 52D) / 8D) * (-5D-(-10D)));
            zz = -5D + (((tickAnim - 52D) / 8D) * (-5D-(-5D)));
        }
        this.setRotateAngle(Leftleg1, Leftleg1.rotateAngleX + (float) Math.toRadians(xx), Leftleg1.rotateAngleY + (float) Math.toRadians(yy), Leftleg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 0D) / 6D) * (-1+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.3D-(-1D)));
            zz = -1D + (((tickAnim - 0D) / 6D) * (-0.75D-(-1D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = -1+(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.3) + (((tickAnim - 6D) / 6D) * (-1D-(-1+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.3D)));
            zz = -0.75D + (((tickAnim - 6D) / 6D) * (-0.5D-(-0.75D)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 12D) / 6D) * (-0.75+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*-0.5D-(-1D)));
            zz = -0.5D + (((tickAnim - 12D) / 6D) * (-0.25D-(-0.5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 18D) / 5D) * (0D-(0D)));
            yy = -0.75+(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*-0.5) + (((tickAnim - 18D) / 5D) * (-0.5D-(-0.75+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*-0.5D)));
            zz = -0.25D + (((tickAnim - 18D) / 5D) * (0D-(-0.25D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 23D) / 7D) * (0D-(-0.5D)));
            zz = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 30D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = 0D + (((tickAnim - 42D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 42D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 52D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 52D) / 8D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 52D) / 8D) * (-1D-(0D)));
        }
        this.Leftleg1.offsetX = (float) Math.toRadians(xx);
        this.Leftleg1.offsetY = (float) Math.toRadians(yy);
        this.Leftleg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = -7.5D + (((tickAnim - 0D) / 12D) * (15D-(-7.5D)));
            yy = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 15D + (((tickAnim - 12D) / 11D) * (15D-(15D)));
            yy = 0D + (((tickAnim - 12D) / 11D) * (5D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 15D + (((tickAnim - 23D) / 7D) * (25D-(15D)));
            yy = 5D + (((tickAnim - 23D) / 7D) * (5D-(5D)));
            zz = 0D + (((tickAnim - 23D) / 7D) * (5D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 25D + (((tickAnim - 30D) / 12D) * (53.75D-(25D)));
            yy = 5D + (((tickAnim - 30D) / 12D) * (5D-(5D)));
            zz = 5D + (((tickAnim - 30D) / 12D) * (7.5D-(5D)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = 53.75D + (((tickAnim - 42D) / 10D) * (42.5D-(53.75D)));
            yy = 5D + (((tickAnim - 42D) / 10D) * (5D-(5D)));
            zz = 7.5D + (((tickAnim - 42D) / 10D) * (10D-(7.5D)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 42.5D + (((tickAnim - 52D) / 8D) * (-7.5D-(42.5D)));
            yy = 5D + (((tickAnim - 52D) / 8D) * (0D-(5D)));
            zz = 10D + (((tickAnim - 52D) / 8D) * (0D-(10D)));
        }
        this.setRotateAngle(Leftleg2, Leftleg2.rotateAngleX + (float) Math.toRadians(xx), Leftleg2.rotateAngleY + (float) Math.toRadians(yy), Leftleg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.25) + (((tickAnim - 6D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.25D)));
            zz = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 18D) / 5D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25) + (((tickAnim - 18D) / 5D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25D)));
            zz = 0D + (((tickAnim - 18D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 23D) / 37D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 37D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 37D) * (0D-(0D)));
        }
        this.Leftleg2.offsetX = (float) Math.toRadians(xx);
        this.Leftleg2.offsetY = (float) Math.toRadians(yy);
        this.Leftleg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 25D + (((tickAnim - 0D) / 12D) * (-5D-(25D)));
            yy = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 0D) / 12D) * (5D-(5D)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = -5D + (((tickAnim - 12D) / 11D) * (-5D-(-5D)));
            yy = 0D + (((tickAnim - 12D) / 11D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 12D) / 11D) * (0D-(5D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = -5D + (((tickAnim - 23D) / 7D) * (35D-(-5D)));
            yy = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 35D + (((tickAnim - 30D) / 12D) * (30D-(35D)));
            yy = 0D + (((tickAnim - 30D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = 30D + (((tickAnim - 42D) / 10D) * (30D-(30D)));
            yy = 0D + (((tickAnim - 42D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 30D + (((tickAnim - 52D) / 8D) * (25D-(30D)));
            yy = 0D + (((tickAnim - 52D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 52D) / 8D) * (5D-(0D)));
        }
        this.setRotateAngle(Leftleg3, Leftleg3.rotateAngleX + (float) Math.toRadians(xx), Leftleg3.rotateAngleY + (float) Math.toRadians(yy), Leftleg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.25) + (((tickAnim - 6D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.25D)));
            zz = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 23) {
            xx = 0D + (((tickAnim - 18D) / 5D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25) + (((tickAnim - 18D) / 5D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25D)));
            zz = 0D + (((tickAnim - 18D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 23 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 23D) / 37D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 23D) / 37D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 23D) / 37D) * (0D-(0D)));
        }
        this.Leftleg3.offsetX = (float) Math.toRadians(xx);
        this.Leftleg3.offsetY = (float) Math.toRadians(yy);
        this.Leftleg3.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 15D + (((tickAnim - 0D) / 12D) * (-22.5D-(15D)));
            yy = 10D + (((tickAnim - 0D) / 12D) * (10D-(10D)));
            zz = 5D + (((tickAnim - 0D) / 12D) * (5D-(5D)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = -22.5D + (((tickAnim - 12D) / 10D) * (-47.5D-(-22.5D)));
            yy = 10D + (((tickAnim - 12D) / 10D) * (10D-(10D)));
            zz = 5D + (((tickAnim - 12D) / 10D) * (5D-(5D)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = -47.5D + (((tickAnim - 22D) / 8D) * (-17.5D-(-47.5D)));
            yy = 10D + (((tickAnim - 22D) / 8D) * (5D-(10D)));
            zz = 5D + (((tickAnim - 22D) / 8D) * (5D-(5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = -17.5D + (((tickAnim - 30D) / 12D) * (-10D-(-17.5D)));
            yy = 5D + (((tickAnim - 30D) / 12D) * (0D-(5D)));
            zz = 5D + (((tickAnim - 30D) / 12D) * (5D-(5D)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = -10D + (((tickAnim - 42D) / 11D) * (12.5D-(-10D)));
            yy = 0D + (((tickAnim - 42D) / 11D) * (5D-(0D)));
            zz = 5D + (((tickAnim - 42D) / 11D) * (0D-(5D)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 12.5D + (((tickAnim - 53D) / 7D) * (15D-(12.5D)));
            yy = 5D + (((tickAnim - 53D) / 7D) * (10D-(5D)));
            zz = 0D + (((tickAnim - 53D) / 7D) * (5D-(0D)));
        }
        this.setRotateAngle(RightLeg1, RightLeg1.rotateAngleX + (float) Math.toRadians(xx), RightLeg1.rotateAngleY + (float) Math.toRadians(yy), RightLeg1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 0D + (((tickAnim - 12D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 22D) / 8D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 22D) / 8D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 22D) / 8D) * (-1D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 30D) / 6D) * (-1+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.25D-(-1D)));
            zz = -1D + (((tickAnim - 30D) / 6D) * (-0.75D-(-1D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = -1+(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.25) + (((tickAnim - 36D) / 6D) * (-1D-(-1+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.25D)));
            zz = -0.75D + (((tickAnim - 36D) / 6D) * (-0.5D-(-0.75D)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 42D) / 6D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 42D) / 6D) * (-0.75+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*-0.5D-(-1D)));
            zz = -0.5D + (((tickAnim - 42D) / 6D) * (-0.25D-(-0.5D)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0D + (((tickAnim - 48D) / 5D) * (0D-(0D)));
            yy = -0.75+(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*-0.5) + (((tickAnim - 48D) / 5D) * (-0.5D-(-0.75+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*-0.5D)));
            zz = -0.25D + (((tickAnim - 48D) / 5D) * (0D-(-0.25D)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 53D) / 7D) * (0D-(-0.5D)));
            zz = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
        }
        this.RightLeg1.offsetX = (float) Math.toRadians(xx);
        this.RightLeg1.offsetY = (float) Math.toRadians(yy);
        this.RightLeg1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 25D + (((tickAnim - 0D) / 12D) * (53.75D-(25D)));
            yy = -5D + (((tickAnim - 0D) / 12D) * (-5D-(-5D)));
            zz = -5D + (((tickAnim - 0D) / 12D) * (-7.5D-(-5D)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 53.75D + (((tickAnim - 12D) / 10D) * (42.5D-(53.75D)));
            yy = -5D + (((tickAnim - 12D) / 10D) * (-5D-(-5D)));
            zz = -7.5D + (((tickAnim - 12D) / 10D) * (-10D-(-7.5D)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 42.5D + (((tickAnim - 22D) / 8D) * (-7.5D-(42.5D)));
            yy = -5D + (((tickAnim - 22D) / 8D) * (0D-(-5D)));
            zz = -10D + (((tickAnim - 22D) / 8D) * (0D-(-10D)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = -7.5D + (((tickAnim - 30D) / 12D) * (15D-(-7.5D)));
            yy = 0D + (((tickAnim - 30D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 15D + (((tickAnim - 42D) / 11D) * (15D-(15D)));
            yy = 0D + (((tickAnim - 42D) / 11D) * (-5D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 15D + (((tickAnim - 53D) / 7D) * (25D-(15D)));
            yy = -5D + (((tickAnim - 53D) / 7D) * (-5D-(-5D)));
            zz = 0D + (((tickAnim - 53D) / 7D) * (-5D-(0D)));
        }
        this.setRotateAngle(RightLeg2, RightLeg2.rotateAngleX + (float) Math.toRadians(xx), RightLeg2.rotateAngleY + (float) Math.toRadians(yy), RightLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.3D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.3) + (((tickAnim - 36D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.3D)));
            zz = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 42D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 42D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0D + (((tickAnim - 48D) / 5D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25) + (((tickAnim - 48D) / 5D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25D)));
            zz = 0D + (((tickAnim - 48D) / 5D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightLeg2.offsetX = (float) Math.toRadians(xx);
        this.RightLeg2.offsetY = (float) Math.toRadians(yy);
        this.RightLeg2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 35D + (((tickAnim - 0D) / 12D) * (30D-(35D)));
            yy = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 30D + (((tickAnim - 12D) / 10D) * (30D-(30D)));
            yy = 0D + (((tickAnim - 12D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 30D + (((tickAnim - 22D) / 8D) * (25D-(30D)));
            yy = 0D + (((tickAnim - 22D) / 8D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 22D) / 8D) * (-5D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 25D + (((tickAnim - 30D) / 12D) * (-5D-(25D)));
            yy = 0D + (((tickAnim - 30D) / 12D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 30D) / 12D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = -5D + (((tickAnim - 42D) / 11D) * (-5D-(-5D)));
            yy = 0D + (((tickAnim - 42D) / 11D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 42D) / 11D) * (0D-(-5D)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = -5D + (((tickAnim - 53D) / 7D) * (35D-(-5D)));
            yy = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 53D) / 7D) * (0D-(0D)));
        }
        this.setRotateAngle(RightLeg3, RightLeg3.rotateAngleX + (float) Math.toRadians(xx), RightLeg3.rotateAngleY + (float) Math.toRadians(yy), RightLeg3.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.25) + (((tickAnim - 36D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.25D)));
            zz = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 42 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 42D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 42D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 42D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 48 && tickAnim < 53) {
            xx = 0D + (((tickAnim - 48D) / 5D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25) + (((tickAnim - 48D) / 5D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25D)));
            zz = 0D + (((tickAnim - 48D) / 5D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RightLeg3.offsetX = (float) Math.toRadians(xx);
        this.RightLeg3.offsetY = (float) Math.toRadians(yy);
        this.RightLeg3.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail1, Tail1.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3+60))*3), Tail1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3))*5), Tail1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3))*3));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05) + (((tickAnim - 6D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D)));
            zz = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05) + (((tickAnim - 36D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D)));
            zz = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail1.offsetX = (float) Math.toRadians(xx);
        this.Tail1.offsetY = (float) Math.toRadians(yy);
        this.Tail1.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3-30))*3), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-90))*5), Tail2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-90))*3));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05) + (((tickAnim - 6D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D)));
            zz = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05) + (((tickAnim - 36D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D)));
            zz = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail2.offsetX = (float) Math.toRadians(xx);
        this.Tail2.offsetY = (float) Math.toRadians(yy);
        this.Tail2.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3-60))*2), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-100))*5), Tail3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-100))*3));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05) + (((tickAnim - 6D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D)));
            zz = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05) + (((tickAnim - 36D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D)));
            zz = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail3.offsetX = (float) Math.toRadians(xx);
        this.Tail3.offsetY = (float) Math.toRadians(yy);
        this.Tail3.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3-90))*2), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-120))*10), Tail4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-120))*3));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05) + (((tickAnim - 6D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D)));
            zz = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05) + (((tickAnim - 36D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.05D)));
            zz = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Tail4.offsetX = (float) Math.toRadians(xx);
        this.Tail4.offsetY = (float) Math.toRadians(yy);
        this.Tail4.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Tail5, Tail5.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3-120))*2), Tail5.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-150))*10), Tail5.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-150))*3));


        this.setRotateAngle(Bodymiddle, Bodymiddle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3-10))*2), Bodymiddle.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+20))*-3), Bodymiddle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+20))*-3));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 12) {
            xx = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.1) + (((tickAnim - 6D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.1D)));
            zz = 0D + (((tickAnim - 6D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 12 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 12D) / 18D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.1D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 42) {
            xx = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.1) + (((tickAnim - 36D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.1D)));
            zz = 0D + (((tickAnim - 36D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodymiddle.offsetX = (float) Math.toRadians(xx);
        this.Bodymiddle.offsetY = (float) Math.toRadians(yy);
        this.Bodymiddle.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Bodyfront, Bodyfront.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3-10))*-3), Bodyfront.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+90))*-3), Bodyfront.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3+90))*-3));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.2D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 6D) / 12D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.2) + (((tickAnim - 6D) / 12D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.2D)));
            zz = 0D + (((tickAnim - 6D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 18D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.2D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 36D) / 12D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.2) + (((tickAnim - 36D) / 12D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.2D)));
            zz = 0D + (((tickAnim - 36D) / 12D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Bodyfront.offsetX = (float) Math.toRadians(xx);
        this.Bodyfront.offsetY = (float) Math.toRadians(yy);
        this.Bodyfront.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 2.5D + (((tickAnim - 0D) / 7D) * (-30D-(2.5D)));
            yy = 10D + (((tickAnim - 0D) / 7D) * (0D-(10D)));
            zz = -10D + (((tickAnim - 0D) / 7D) * (-5D-(-10D)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = -30D + (((tickAnim - 7D) / 11D) * (12.5D-(-30D)));
            yy = 0D + (((tickAnim - 7D) / 11D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 7D) / 11D) * (-2.5D-(-5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 12.5D + (((tickAnim - 18D) / 12D) * (22.5D-(12.5D)));
            yy = 0D + (((tickAnim - 18D) / 12D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 18D) / 12D) * (0D-(-2.5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 22.5D + (((tickAnim - 30D) / 10D) * (32.5D-(22.5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 32.5D + (((tickAnim - 40D) / 10D) * (37.5D-(32.5D)));
            yy = 2.5D + (((tickAnim - 40D) / 10D) * (10D-(2.5D)));
            zz = -2.5D + (((tickAnim - 40D) / 10D) * (-10D-(-2.5D)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 37.5D + (((tickAnim - 50D) / 10D) * (2.5D-(37.5D)));
            yy = 10D + (((tickAnim - 50D) / 10D) * (10D-(10D)));
            zz = -10D + (((tickAnim - 50D) / 10D) * (-10D-(-10D)));
        }
        this.setRotateAngle(Leftarm1, Leftarm1.rotateAngleX + (float) Math.toRadians(xx), Leftarm1.rotateAngleY + (float) Math.toRadians(yy), Leftarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 7D) / 6D) * (-1+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.35D-(-1D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (-0.25D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            yy = -1+(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.35) + (((tickAnim - 13D) / 5D) * (-1D-(-1+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.35D)));
            zz = -0.25D + (((tickAnim - 13D) / 5D) * (-0.5D-(-0.25D)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0D + (((tickAnim - 18D) / 6D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 18D) / 6D) * (-1+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*-0.25D-(-1D)));
            zz = -0.5D + (((tickAnim - 18D) / 6D) * (-0.25D-(-0.5D)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 24D) / 6D) * (0D-(0D)));
            yy = -1+(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*-0.25) + (((tickAnim - 24D) / 6D) * (-1D-(-1+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*-0.25D)));
            zz = -0.25D + (((tickAnim - 24D) / 6D) * (0D-(-0.25D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 30D) / 10D) * (-0.5D-(-1D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 40D) / 10D) * (0D-(-0.5D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 50D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 50D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 50D) / 10D) * (0D-(0D)));
        }
        this.Leftarm1.offsetX = (float) Math.toRadians(xx);
        this.Leftarm1.offsetY = (float) Math.toRadians(yy);
        this.Leftarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = -57.5D + (((tickAnim - 0D) / 7D) * (7.5D-(-57.5D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            zz = 10D + (((tickAnim - 0D) / 7D) * (5D-(10D)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 7.5D + (((tickAnim - 7D) / 11D) * (-27.5D-(7.5D)));
            yy = 0D + (((tickAnim - 7D) / 11D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 7D) / 11D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = -27.5D + (((tickAnim - 18D) / 12D) * (-12.5D-(-27.5D)));
            yy = 0D + (((tickAnim - 18D) / 12D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 18D) / 12D) * (0D-(2.5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -12.5D + (((tickAnim - 30D) / 10D) * (-25D-(-12.5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (2.5D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = -25D + (((tickAnim - 40D) / 10D) * (-65D-(-25D)));
            yy = 2.5D + (((tickAnim - 40D) / 10D) * (5D-(2.5D)));
            zz = 2.5D + (((tickAnim - 40D) / 10D) * (10D-(2.5D)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = -65D + (((tickAnim - 50D) / 10D) * (-57.5D-(-65D)));
            yy = 5D + (((tickAnim - 50D) / 10D) * (0D-(5D)));
            zz = 10D + (((tickAnim - 50D) / 10D) * (10D-(10D)));
        }
        this.setRotateAngle(Leftarm2, Leftarm2.rotateAngleX + (float) Math.toRadians(xx), Leftarm2.rotateAngleY + (float) Math.toRadians(yy), Leftarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 7 && tickAnim < 13) {
            xx = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 7D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 13 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.25) + (((tickAnim - 13D) / 5D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.25D)));
            zz = 0D + (((tickAnim - 13D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 24) {
            xx = 0D + (((tickAnim - 18D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 24 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 24D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25) + (((tickAnim - 24D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25D)));
            zz = 0D + (((tickAnim - 24D) / 6D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Leftarm2.offsetX = (float) Math.toRadians(xx);
        this.Leftarm2.offsetY = (float) Math.toRadians(yy);
        this.Leftarm2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 7) {
            xx = 92.5D + (((tickAnim - 0D) / 7D) * (22.5D-(92.5D)));
            yy = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 7 && tickAnim < 18) {
            xx = 22.5D + (((tickAnim - 7D) / 11D) * (15D-(22.5D)));
            yy = 0D + (((tickAnim - 7D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 7D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 15D + (((tickAnim - 18D) / 12D) * (-7.5D-(15D)));
            yy = 0D + (((tickAnim - 18D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 40) {
            xx = -7.5D + (((tickAnim - 30D) / 10D) * (42.5D-(-7.5D)));
            yy = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 40 && tickAnim < 50) {
            xx = 42.5D + (((tickAnim - 40D) / 10D) * (87.5D-(42.5D)));
            yy = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 40D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 50 && tickAnim < 60) {
            xx = 87.5D + (((tickAnim - 50D) / 10D) * (92.5D-(87.5D)));
            yy = 0D + (((tickAnim - 50D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 50D) / 10D) * (0D-(0D)));
        }
        this.setRotateAngle(Leftarm3, Leftarm3.rotateAngleX + (float) Math.toRadians(xx), Leftarm3.rotateAngleY + (float) Math.toRadians(yy), Leftarm3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 22.5D + (((tickAnim - 0D) / 10D) * (32.5D-(22.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (2.5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 32.5D + (((tickAnim - 10D) / 10D) * (37.5D-(32.5D)));
            yy = -2.5D + (((tickAnim - 10D) / 10D) * (-10D-(-2.5D)));
            zz = 2.5D + (((tickAnim - 10D) / 10D) * (10D-(2.5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 37.5D + (((tickAnim - 20D) / 10D) * (2.5D-(37.5D)));
            yy = -10D + (((tickAnim - 20D) / 10D) * (-10D-(-10D)));
            zz = 10D + (((tickAnim - 20D) / 10D) * (10D-(10D)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 2.5D + (((tickAnim - 30D) / 7D) * (-30D-(2.5D)));
            yy = -10D + (((tickAnim - 30D) / 7D) * (0D-(-10D)));
            zz = 10D + (((tickAnim - 30D) / 7D) * (5D-(10D)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = -30D + (((tickAnim - 37D) / 11D) * (12.5D-(-30D)));
            yy = 0D + (((tickAnim - 37D) / 11D) * (0D-(0D)));
            zz = 5D + (((tickAnim - 37D) / 11D) * (2.5D-(5D)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 12.5D + (((tickAnim - 48D) / 12D) * (22.5D-(12.5D)));
            yy = 0D + (((tickAnim - 48D) / 12D) * (0D-(0D)));
            zz = 2.5D + (((tickAnim - 48D) / 12D) * (0D-(2.5D)));
        }
        this.setRotateAngle(Rightarm1, Rightarm1.rotateAngleX + (float) Math.toRadians(xx), Rightarm1.rotateAngleY + (float) Math.toRadians(yy), Rightarm1.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 0D) / 10D) * (-0.5D-(-1D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            yy = -0.5D + (((tickAnim - 10D) / 10D) * (0D-(-0.5D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 30D) / 7D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 7D) * (-1D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 37D) / 6D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 37D) / 6D) * (-1+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.35D-(-1D)));
            zz = 0D + (((tickAnim - 37D) / 6D) * (-0.25D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 43D) / 5D) * (0D-(0D)));
            yy = -1+(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.35) + (((tickAnim - 43D) / 5D) * (-1D-(-1+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.35D)));
            zz = -0.25D + (((tickAnim - 43D) / 5D) * (-0.5D-(-0.25D)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = 0D + (((tickAnim - 48D) / 6D) * (0D-(0D)));
            yy = -1D + (((tickAnim - 48D) / 6D) * (-1+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*-0.25D-(-1D)));
            zz = -0.5D + (((tickAnim - 48D) / 6D) * (-0.25D-(-0.5D)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 54D) / 6D) * (0D-(0D)));
            yy = -1+(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*-0.25) + (((tickAnim - 54D) / 6D) * (-1D-(-1+Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*-0.25D)));
            zz = -0.25D + (((tickAnim - 54D) / 6D) * (0D-(-0.25D)));
        }
        this.Rightarm1.offsetX = (float) Math.toRadians(xx);
        this.Rightarm1.offsetY = (float) Math.toRadians(yy);
        this.Rightarm1.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -12.5D + (((tickAnim - 0D) / 10D) * (-25D-(-12.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (-2.5D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (-2.5D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = -25D + (((tickAnim - 10D) / 10D) * (-65D-(-25D)));
            yy = -2.5D + (((tickAnim - 10D) / 10D) * (-5D-(-2.5D)));
            zz = -2.5D + (((tickAnim - 10D) / 10D) * (-10D-(-2.5D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = -65D + (((tickAnim - 20D) / 10D) * (-57.5D-(-65D)));
            yy = -5D + (((tickAnim - 20D) / 10D) * (0D-(-5D)));
            zz = -10D + (((tickAnim - 20D) / 10D) * (-10D-(-10D)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = -57.5D + (((tickAnim - 30D) / 7D) * (7.5D-(-57.5D)));
            yy = 0D + (((tickAnim - 30D) / 7D) * (0D-(0D)));
            zz = -10D + (((tickAnim - 30D) / 7D) * (-5D-(-10D)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = 7.5D + (((tickAnim - 37D) / 11D) * (-27.5D-(7.5D)));
            yy = 0D + (((tickAnim - 37D) / 11D) * (0D-(0D)));
            zz = -5D + (((tickAnim - 37D) / 11D) * (-2.5D-(-5D)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = -27.5D + (((tickAnim - 48D) / 12D) * (-12.5D-(-27.5D)));
            yy = 0D + (((tickAnim - 48D) / 12D) * (0D-(0D)));
            zz = -2.5D + (((tickAnim - 48D) / 12D) * (0D-(-2.5D)));
        }
        this.setRotateAngle(Rightarm2, Rightarm2.rotateAngleX + (float) Math.toRadians(xx), Rightarm2.rotateAngleY + (float) Math.toRadians(yy), Rightarm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 37) {
            xx = 0D + (((tickAnim - 0D) / 37D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 37D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 37D) * (0D-(0D)));
        }
        else if (tickAnim >= 37 && tickAnim < 43) {
            xx = 0D + (((tickAnim - 37D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 37D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 37D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 43 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 43D) / 5D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.25) + (((tickAnim - 43D) / 5D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*0.25D)));
            zz = 0D + (((tickAnim - 43D) / 5D) * (0D-(0D)));
        }
        else if (tickAnim >= 48 && tickAnim < 54) {
            xx = 0D + (((tickAnim - 48D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 48D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25D-(0D)));
            zz = 0D + (((tickAnim - 48D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 54 && tickAnim < 60) {
            xx = 0D + (((tickAnim - 54D) / 6D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25) + (((tickAnim - 54D) / 6D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.5))*0.25D)));
            zz = 0D + (((tickAnim - 54D) / 6D) * (0D-(0D)));
        }
        this.Rightarm2.offsetX = (float) Math.toRadians(xx);
        this.Rightarm2.offsetY = (float) Math.toRadians(yy);
        this.Rightarm2.offsetZ = (float) Math.toRadians(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -7.5D + (((tickAnim - 0D) / 10D) * (42.5D-(-7.5D)));
            yy = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 10 && tickAnim < 20) {
            xx = 42.5D + (((tickAnim - 10D) / 10D) * (87.5D-(42.5D)));
            yy = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 10D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 20 && tickAnim < 30) {
            xx = 87.5D + (((tickAnim - 20D) / 10D) * (92.5D-(87.5D)));
            yy = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 20D) / 10D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 37) {
            xx = 92.5D + (((tickAnim - 30D) / 7D) * (22.5D-(92.5D)));
            yy = 0D + (((tickAnim - 30D) / 7D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 7D) * (0D-(0D)));
        }
        else if (tickAnim >= 37 && tickAnim < 48) {
            xx = 22.5D + (((tickAnim - 37D) / 11D) * (15D-(22.5D)));
            yy = 0D + (((tickAnim - 37D) / 11D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 37D) / 11D) * (0D-(0D)));
        }
        else if (tickAnim >= 48 && tickAnim < 60) {
            xx = 15D + (((tickAnim - 48D) / 12D) * (-7.5D-(15D)));
            yy = 0D + (((tickAnim - 48D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 48D) / 12D) * (0D-(0D)));
        }
        this.setRotateAngle(Rightarm3, Rightarm3.rotateAngleX + (float) Math.toRadians(xx), Rightarm3.rotateAngleY + (float) Math.toRadians(yy), Rightarm3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Neck1, Neck1.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3))*5), Neck1.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3))*5), Neck1.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3))*3));

        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 0D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 0D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 6 && tickAnim < 18) {
            xx = 0D + (((tickAnim - 6D) / 12D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.1) + (((tickAnim - 6D) / 12D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 6D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 18 && tickAnim < 30) {
            xx = 0D + (((tickAnim - 18D) / 12D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 18D) / 12D) * (0D-(0D)));
            zz = 0D + (((tickAnim - 18D) / 12D) * (0D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 36) {
            xx = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
            yy = 0D + (((tickAnim - 30D) / 6D) * (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.1D-(0D)));
            zz = 0D + (((tickAnim - 30D) / 6D) * (0D-(0D)));
        }
        else if (tickAnim >= 36 && tickAnim < 48) {
            xx = 0D + (((tickAnim - 36D) / 12D) * (0D-(0D)));
            yy = (Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.1) + (((tickAnim - 36D) / 12D) * (0D-(Math.sin(3D*(Math.PI/180)*(((double)tickAnim/60D)*360/0.3))*-0.1D)));
            zz = 0D + (((tickAnim - 36D) / 12D) * (0D-(0D)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Neck1.offsetX = (float) Math.toRadians(xx);
        this.Neck1.offsetY = (float) Math.toRadians(yy);
        this.Neck1.offsetZ = (float) Math.toRadians(zz);



        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3+100))*5), Neck2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-60))*-5), Neck2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-60))*-3));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3+30))*-5), Neck3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-130))*6), Neck3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-130))*3));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*720/3+90))*-3), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(2+Math.sin((Math.PI/180)*((((double)tickAnim/60D)*3D)*360/3-150))*2), Jaw.rotateAngleY + (float) Math.toRadians(0), Jaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 10D + (((tickAnim - 0D) / 12D) * (5D-(10D)));
            yy = 5D + (((tickAnim - 0D) / 12D) * (0D-(5D)));
            zz = 5D + (((tickAnim - 0D) / 12D) * (5D-(5D)));
        }
        else if (tickAnim >= 12 && tickAnim < 23) {
            xx = 5D + (((tickAnim - 12D) / 11D) * (5D-(5D)));
            yy = 0D + (((tickAnim - 12D) / 11D) * (5D-(0D)));
            zz = 5D + (((tickAnim - 12D) / 11D) * (0D-(5D)));
        }
        else if (tickAnim >= 23 && tickAnim < 30) {
            xx = 5D + (((tickAnim - 23D) / 7D) * (5D-(5D)));
            yy = 5D + (((tickAnim - 23D) / 7D) * (10D-(5D)));
            zz = 0D + (((tickAnim - 23D) / 7D) * (5D-(0D)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 5D + (((tickAnim - 30D) / 12D) * (20D-(5D)));
            yy = 10D + (((tickAnim - 30D) / 12D) * (10D-(10D)));
            zz = 5D + (((tickAnim - 30D) / 12D) * (5D-(5D)));
        }
        else if (tickAnim >= 42 && tickAnim < 52) {
            xx = 20D + (((tickAnim - 42D) / 10D) * (20D-(20D)));
            yy = 10D + (((tickAnim - 42D) / 10D) * (10D-(10D)));
            zz = 5D + (((tickAnim - 42D) / 10D) * (5D-(5D)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 20D + (((tickAnim - 52D) / 8D) * (10D-(20D)));
            yy = 10D + (((tickAnim - 52D) / 8D) * (5D-(10D)));
            zz = 5D + (((tickAnim - 52D) / 8D) * (5D-(5D)));
        }
        this.setRotateAngle(Leftlegspike, Leftlegspike.rotateAngleX + (float) Math.toRadians(xx), Leftlegspike.rotateAngleY + (float) Math.toRadians(yy), Leftlegspike.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 12) {
            xx = 5D + (((tickAnim - 0D) / 12D) * (20D-(5D)));
            yy = -10D + (((tickAnim - 0D) / 12D) * (-10D-(-10D)));
            zz = -5D + (((tickAnim - 0D) / 12D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 12 && tickAnim < 22) {
            xx = 20D + (((tickAnim - 12D) / 10D) * (20D-(20D)));
            yy = -10D + (((tickAnim - 12D) / 10D) * (-10D-(-10D)));
            zz = -5D + (((tickAnim - 12D) / 10D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 22 && tickAnim < 30) {
            xx = 20D + (((tickAnim - 22D) / 8D) * (10D-(20D)));
            yy = -10D + (((tickAnim - 22D) / 8D) * (-5D-(-10D)));
            zz = -5D + (((tickAnim - 22D) / 8D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 30 && tickAnim < 42) {
            xx = 10D + (((tickAnim - 30D) / 12D) * (5D-(10D)));
            yy = -5D + (((tickAnim - 30D) / 12D) * (0D-(-5D)));
            zz = -5D + (((tickAnim - 30D) / 12D) * (-5D-(-5D)));
        }
        else if (tickAnim >= 42 && tickAnim < 53) {
            xx = 5D + (((tickAnim - 42D) / 11D) * (5D-(5D)));
            yy = 0D + (((tickAnim - 42D) / 11D) * (-5D-(0D)));
            zz = -5D + (((tickAnim - 42D) / 11D) * (0D-(-5D)));
        }
        else if (tickAnim >= 53 && tickAnim < 60) {
            xx = 5D + (((tickAnim - 53D) / 7D) * (5D-(5D)));
            yy = -5D + (((tickAnim - 53D) / 7D) * (-10D-(-5D)));
            zz = 0D + (((tickAnim - 53D) / 7D) * (-5D-(0D)));
        }
        this.setRotateAngle(Rightlegspike, Rightlegspike.rotateAngleX + (float) Math.toRadians(xx), Rightlegspike.rotateAngleY + (float) Math.toRadians(yy), Rightlegspike.rotateAngleZ + (float) Math.toRadians(zz));


    }

        public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraKentrosaurus e = (EntityPrehistoricFloraKentrosaurus) entity;
        animator.update(entity);

//        animator.setAnimation(e.EAT_ANIMATION); //10 ticks
//        animator.startKeyframe(4);
//        animator.rotate(this.upperbody2, (float) Math.toRadians(10), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.upperbody, (float) Math.toRadians(7.5), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.neck, (float) Math.toRadians(30), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.head, (float) Math.toRadians(15), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.rotate(this.jaw, (float) Math.toRadians(25), (float) Math.toRadians(0), (float) Math.toRadians(0));
//        animator.endKeyframe();
//        animator.setStaticKeyframe(3);
//        animator.resetKeyframe(3);

    }
}
