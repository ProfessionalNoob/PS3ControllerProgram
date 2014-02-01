/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.parsing.IInputOutput;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends SimpleRobot {
    /**
     * This function is called once each time the robot enters autonomous mode.
     */



throttle = joystick.getY();
turnValue = joystick.getX();

leftMtr = throttle + turnValue;
rightMtr = throttle - turnValue;

public double getArcadeLeftMotor() {
        return leftMtr + skim(rightMtr);
    }

    public double getArcadeRightMotor() {
        return rightMtr + skim(leftMtr);            
    }

public double skim(double v) {
    if (v > 1.0) {
        return -((v - 1.0) * RobotMap.TURNING_GAIN);
    } else if (v < -1.0) {
        return -((v + 1.0) * RobotMap.TURNING_GAIN);
    } return 0; 
    }

    public void autonomous() {
        
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {

    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
}
