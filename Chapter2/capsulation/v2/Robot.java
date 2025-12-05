package Chapter2.capsulation.v2;

public class Robot {

    private boolean leftLeg;
    private boolean rightLeg;

    private boolean leftArm;
    private boolean rightArm;

    // 무분별한 세터 남용
//    public void setLeftLeg(Boolean leftLeg) {
//        this.leftLeg = leftLeg;
//    }
//    public void setRightLeg(Boolean rightLeg) {
//        this.rightLeg = rightLeg;
//    }
//
//    public void setLeftArm(Boolean leftArm) {
//        this.leftArm = leftArm;
//    }
//    public void setRightArm(Boolean rightArm) {
//        this.rightArm = rightArm;
//    }

    // 의미 있는 세터
    public void walk (boolean power) {
        this.leftLeg = power;
        this.rightLeg = power;
        this.leftArm = power;
        this.rightArm = power;
    }

    public void realWalk () {
        System.out.println(leftLeg + " " + rightLeg + " " + leftArm + " " + rightArm);
    }

}
