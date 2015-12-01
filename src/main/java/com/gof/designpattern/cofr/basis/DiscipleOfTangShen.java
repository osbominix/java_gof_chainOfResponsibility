package com.gof.designpattern.cofr.basis;

import com.gof.designpattern.cofr.Monster;

/**
 * Created by yl3 on 01.12.15.
 */
public abstract class DiscipleOfTangShen {


    protected DiscipleOfTangShen successor;

    public void setSuccessor(DiscipleOfTangShen successor) {
        this.successor = successor;
    }

    abstract public void fightMonster(Monster monster);
}
