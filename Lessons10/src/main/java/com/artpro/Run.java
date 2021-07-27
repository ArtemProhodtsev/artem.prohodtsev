package com.artpro;

import com.artpro.hands.SamsungHand;
import com.artpro.hands.SonyHand;
import com.artpro.hands.ToshibaHand;
import com.artpro.heads.SamsungHead;
import com.artpro.heads.SonyHead;
import com.artpro.heads.ToshibaHead;
import com.artpro.legs.SamsungLeg;
import com.artpro.legs.SonyLeg;
import com.artpro.legs.ToshibaLeg;

import java.util.List;

public class Run {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */

        List<IRobot> robotList = List.of(
                new Robot(new SonyHead(123), new SamsungHand(456), new ToshibaLeg(789)),
                new Robot(new SamsungHead(321), new ToshibaHand(654), new SonyLeg(987)),
                new Robot(new ToshibaHead(100), new SonyHand(200), new SamsungLeg(300))
        );
        IRobot mostExpensiveRobot = null;
        int maxPrice = 0;
        for (IRobot robot : robotList) {
            System.out.println("Робот №" + (robotList.indexOf(robot) + 1));
            robot.action();
            if (robot.getPrice() > maxPrice) {
                maxPrice = robot.getPrice();
                mostExpensiveRobot = robot;
            }
            System.out.println();
        }
        if (mostExpensiveRobot != null) {
            System.out.println("Самый дорогой робот:");
            mostExpensiveRobot.action();
        } else {
            System.out.println("Самый дорогой робот не определён");
        }
    }
}
