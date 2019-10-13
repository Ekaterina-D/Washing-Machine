package com.company;

public class WashingMachine { //стиральная машина

    boolean regime = false;
    private boolean idle = true;//простой

    void wash() { //стирка
        if (idle == true) {
            int timeWork = 0;
            int timeWash;
            if (regime == false) {
                timeWash = 5;
                System.out.println("Режим: Нормальная стирка");
                System.out.println("Стирка 5 минут");
            } else {
                timeWash = 3;
                System.out.println("Режим: Споласкивание");
                System.out.println("Стирка 3 минуты");
            }
            while (timeWork < timeWash) {
                idle = false;
                timeWork++;//считаем время работы
            }
            idle = true;
        }
    }

    void wring() { //отжим
        if (idle == true) {
            System.out.println("Отжим 3 минуты");
        }
    }

    void mode() { //режим
        //false - нормальная стирка
        //true - споласкивание
        if (idle == true) {
            regime = !regime; //меняем режим
        }
    }

}