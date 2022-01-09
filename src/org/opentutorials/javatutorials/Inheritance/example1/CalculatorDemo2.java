package org.opentutorials.javatutorials.Inheritance.example1;

class MultiplicationableCalculator extends Calculator { // CalculatorDemo1.java 에 만든 Calculator 를 확장(상속) 함.
    public void multiplication() {
        System.out.println(this.left * this.right); // 이 내용 또한 Calculator 에 있는 전역변수 left,right 를 들고온 것
    }
}

public class CalculatorDemo2 {

    public static void main(String[] args) {

        MultiplicationableCalculator c1 = new MultiplicationableCalculator();
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        /**
         * 내용을 보면 Calculator 에서 상속하여 들고온 sum(더하기) 과 avg(평균) 그리고 setoprands 를 사용하며
         * MultiplicationableCalculator 에서 만든 multiplication(곱하기)도 사용하고있다.
         */
    }


}
