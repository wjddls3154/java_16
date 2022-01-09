package org.opentutorials.javatutorials.Inheritance.example1;

class Calculator {
    int left, right ;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left+this.right)/2);
    }
}

class SubstractionableCalculator extends Calculator {  // SubstractionableCalculator (자식) 가 → extends Calculator (부모) 로 확장(상속)

    public void substract() {
        System.out.println(this.left-this.right);
    }
}

public class CalculatorDemo1 {

    public static void main(String[] args) {

        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10,20);
        c1.sum();
        c1.avg();
        c1.substract();
        /**
         *  SubstractionableCalculator 는 위에서 확장(상속)을 했기때문에, 자신이 정의하지않은 setoprands,sum,avg 같은 메소드들을 마치 가지고 있는것처럼 호출할수있다.
         *  자식의 내용을 찾아보고 있으면 실행되고 만약,없으면 위로 올라가 부모의 내용을 찾아봤을때 있으면 실행이 되는구조.
         */

    }

}
