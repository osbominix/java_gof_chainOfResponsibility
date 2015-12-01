package com.gof.designpattern;

import com.gof.designpattern.cofr.Monster;
import com.gof.designpattern.cofr.basis.MonkeyKing;
import com.gof.designpattern.cofr.basis.PigZhu;
import com.gof.designpattern.cofr.basis.Sha;

/**
 * Created by yl3 on 01.12.15.
 */
public class CommandCenter {

    public static void main( String[] args ) {
        MonkeyKing monkeyKing = new MonkeyKing();
        PigZhu pigZhu = new PigZhu();
        Sha sha = new Sha();

        sha.setSuccessor(pigZhu);
        pigZhu.setSuccessor(monkeyKing);

        Monster smallMonster = new Monster(1);
        Monster middleMonster = new Monster(30);
        Monster bigMonster = new Monster(90);
        Monster hugeMonster = new Monster(1000);

        sha.fightMonster(smallMonster);
        sha.fightMonster(middleMonster);
        sha.fightMonster(bigMonster);
        sha.fightMonster(hugeMonster);

    }

}
