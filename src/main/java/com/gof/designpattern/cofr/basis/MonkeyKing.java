package com.gof.designpattern.cofr.basis;

import com.gof.designpattern.cofr.Monster;

/**
 * Created by yl3 on 01.12.15.
 */
public class MonkeyKing extends DiscipleOfTangShen {

    @Override
    public void fightMonster(Monster monster) {
        if (monster.getMonsterLevel() < Util.MONKEYKING_LEVEL ) {
            System.out.println("MonkeyKing fighting !!!");
        } else {
            System.out.println("Enemy too strong, let's run away!!!");
        }
    }
}
