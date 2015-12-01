package com.gof.designpattern.cofr.basis;

import com.gof.designpattern.cofr.Monster;

/**
 * Created by yl3 on 01.12.15.
 */
public class PigZhu extends DiscipleOfTangShen {
    @Override
    public void fightMonster(Monster monster) {
        if (monster.getMonsterLevel() > Util.PIGZHU_LEVEL) {
            successor.fightMonster(monster);
        } else {
            System.out.println("PigZhu fighting!!");
        }
    }
}
