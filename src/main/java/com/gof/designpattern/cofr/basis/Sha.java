package com.gof.designpattern.cofr.basis;

import com.gof.designpattern.cofr.Monster;

/**
 * Created by yl3 on 01.12.15.
 */
public class Sha extends DiscipleOfTangShen {
    @Override
    public void fightMonster(Monster monster) {
        if (monster.getMonsterLevel() > Util.SHA_LEVEL) {
            successor.fightMonster(monster);
        } else {
            System.out.println("Sha fighting!");
        }
    }
}
