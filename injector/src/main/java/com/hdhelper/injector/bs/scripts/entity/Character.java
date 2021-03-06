package com.hdhelper.injector.bs.scripts.entity;

import com.bytescript.lang.BField;
import com.bytescript.lang.ByteScript;
import com.hdhelper.agent.services.RSCharacter;

@ByteScript(name = "Character")
public abstract class Character extends Entity implements RSCharacter {

    @BField int strictX;
    @BField int strictY;
    @BField int targetIndex;
    @BField String overheadText;
    @BField int animation;
    @BField int orientation;
    @BField int maxHitpoints;
    @BField int hitpoints;
    @BField int healthBarCycle;


    @BField int idleAnimation;
    @BField int walkAnimation;
    @BField int runAnimation;
    @BField int anint2341; //lol


    @Override
    public int getMaxHitpoints() {
        return maxHitpoints;
    }

    @Override
    public int getHitpoints() {
        return hitpoints;
    }

    @Override
    public int getHealthBarCycle() {
        return healthBarCycle;
    }

    @Override
    public int getStrictX() {
        return strictX;
    }

    @Override
    public int getStrictY() {
        return strictY;
    }

    @Override
    public int getTargetIndex() {
        return targetIndex;
    }

    @Override
    public String getOverheadText() {
        return overheadText;
    }

    @Override
    public int getAnimation() {
        return animation;
    }

    @Override
    public int getOrientation() {
        return orientation;
    }

    @Override
    public int getIdleAnimation() {
        return idleAnimation;
    }

    @Override
    public int getWalkAnimation() {
        return walkAnimation;
    }

    @Override
    public int getRunAnimation() {
        return runAnimation;
    }

    @Override
    public int getAnint2341() {
        return anint2341;
    }

}
