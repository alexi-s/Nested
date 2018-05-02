package com.inner;

/**
 * Created by student on 02.05.2018.
 */
public class Ship {

    private double weight;
    private Engine engine;

    public class Engine {
        private double power;
        private Engine engine;

        public Engine() {
            power = weight * 123;
        }

        public double getPower() {
            return power;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "power=" + power +
                    '}';
        }
    }

    public void doWork(){
        int n;
        class MyWork{
            private int a;
            void test(){
                a = 4;
                weight = 5.6;
                System.out.println("test in do work in ship");
            }
        }

        MyWork m = new MyWork();
        m.test();
        m.a = 6;
        System.out.println(m.a);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Ship(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "weight=" + weight +
                ", engine=" + engine +
                '}';
    }
}
