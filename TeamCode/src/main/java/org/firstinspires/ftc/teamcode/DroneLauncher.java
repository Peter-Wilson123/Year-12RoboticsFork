package org.firstinspires.ftc.teamcode;

import android.bluetooth.BluetoothClass;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;


@TeleOp (name="blank")
public class DroneLauncher extends OpMode
{
    DcMotor motor;

    @Override
    public void init()
    {
        //option one
        //motor = hardwareMap.dcMotor.get("blank");
        //motor = hardwareMap.get(DcMotor.class, deviceName: "blank");
telemetry.addData("It is working","run");
    }

    @Override
    public void loop()
    {
        if (gamepad1.left_bumper && gamepad1.right_bumper)
        {
            motor.setPower(0.8);
        }
        motor.setPower(0);
    }
}
