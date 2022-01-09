package org.opentutorials.javatutorials.Inheritance.example1;

class DivisionableCalculator extends MultiplicationableCalculator { // CalculatorDemo2.java 에 만든 MultiplicationableCalculator 를 확장(상속) 함.
    public void division() {
        System.out.println(this.left / this.right); // 이 내용은 MultiplicationableCalculator 의 부모 Calculator 에 있는 전역변수 left,right 를 들고온 것
    }
}

public class CalculatorDemo3 {

    public static void main(String[] args){
        DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();
        /**
         * 내용을 보면 MultiplicationableCalculator 에서 상속하여 들고온 multiplication(곱하기) 를 사용하며
         * 그 위의 부모인 Calculator 에서 상속하여 들고온 sum(더하기) 과 avg(평균) 그리고 setoprands 내용도 사용하며
         * DivisionableCalculator 에서 만든 division(나누기) 도 사용하는 모습이다.
         * 결론적으로, 부모가 만든 내용을 자식이 또 만들 필요가 없기때문에, 코드중복을 줄여주며 재활용성이 높으며 유지보수 또한 편리하며 가독성 또한 높아진다.
         */

        // super(left,right);  는 this가 전역변수를 불러오는것처럼 super로 부모클래스를 불러오는것.
    }

}
