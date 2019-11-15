package com.teachmeskill.hometask6.Transport;

import java.util.Objects;

class MilitaryAirTransport extends AirTransport {
    private boolean catapultSystem;
    private int amountRocket;

    public MilitaryAirTransport(){

    }
    public MilitaryAirTransport(float power, int maxSpeed, float weight, String mark, int wingspan, int minRunwayLength,
                                boolean catapultSystem, int amountRocket) {
        super(power, maxSpeed, weight, mark, wingspan, minRunwayLength);
        this.catapultSystem = catapultSystem;
        this.amountRocket = amountRocket;
    }

    @Override
    public String toString() {
        return "MilitaryAirTransport{" +
                "catapultSystem=" + catapultSystem +
                ", amountRocket=" + amountRocket +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MilitaryAirTransport that = (MilitaryAirTransport) o;
        return catapultSystem == that.catapultSystem &&
                amountRocket == that.amountRocket;
    }

    @Override
    public int hashCode() {
        return Objects.hash(catapultSystem, amountRocket);
    }

    public boolean isCatapultSystem() {
        return catapultSystem;
    }

    public int getAmountRocket() {
        return amountRocket;
    }

    public void rocketShot(int amountRocket) {
        for (int i = 0; i <= amountRocket; i++) {
            if (i <= amountRocket) {
                System.out.println("Ракета пошла");
            }
            i++;
        }
        System.out.println("Боеприпасы отсутствуют");
    }

    public void catapultCheck(boolean catapultSystem) {
        if (catapultSystem == true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У Вас отсутствует система катапультирования");
        }
    }

    public void informationMilitaryPlane() {
        System.out.println("Военный самолет : " +
                "система катапультирования = " + isCatapultSystem() +
                ", количество ракет = " + getAmountRocket() +
                ", размах крыльев = " + getWingspan() +
                ", минимальная длинна взлетно-посадочной полосы = " + getMinRunwayLength() +
                ", мощность = " + getPower() +
                ", мощность в килловатах = " + powerCalculation(getPower()) +
                ", максимальная скорость = " + getMaxSpeed() +
                ", вес = " + getWeight() +
                ", марка = '" + getMark() + '\'');
    }
}
