package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.opencv.core.Mat;

@TeleOp(name="blank")
public class MecanumWheelMovementTest extends OpMode {
    @Override
    public void init() {

        telemetry.addData("It is working","run");
        DcMotor motor1;
        DcMotor motor2;
        DcMotor motor3;
        DcMotor motor4;

        //motor1 = hardwareMap.get(DcMotor.class, deviceName: "blank");
        //motor2 = hardwareMap.get(DcMotor.class, deviceName: "blank");
        //motor3 = hardwareMap.get(DcMotor.class, deviceName: "blank");
        //motor4 = hardwareMap.get(DcMotor.class, deviceName: "blank");


    }

    @Override
    public void loop() {
        double x = gamepad1.left_stick_x;
        double y = -gamepad1.left_stick_y;
        double turn = gamepad1.right_stick_x;
        double theta = Math.atan2(y,x);
        double power = Math.hypot(x,y);

        //inputs are: theta, power, and turn
        double sin = Math.sin(theta - Math.PI/4);
        double cos = Math.cos(theta - Math.PI/4);
        double max = Math.max((Math.abs(sin)),(Math.abs(cos)));

        double leftFront = power * cos/max + turn;
        double rightFront = power * sin/max - turn;
        double leftRear = power * sin/max + turn;
        double rightRear = power * cos/max - turn;

        if ((power + Math.abs(turn)) > 1){
            leftFront /= power + Math.abs(turn);
            rightFront /= power + Math.abs(turn);
            leftRear /= power + Math.abs(turn);
            rightRear /= power + Math.abs(turn);
        }

        //MAKE SURE TO ADJUST IF NEEDED
        //motor1.setPower(leftFront);
        //motor2.setPower(rightFront);
        //motor3.setPower(leftRear);
        //motor4.setPower(rightRear);




    }
}
