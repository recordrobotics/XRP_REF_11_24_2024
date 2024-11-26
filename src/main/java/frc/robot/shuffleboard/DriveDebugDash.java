package frc.robot.shuffleboard;

import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.ShuffleboardTab;
import frc.robot.subsystems.Drivetrain;

public class DriveDebugDash {
    // todo get ShuffleBoard tab
    Drivetrain m_drivetrain;

    ShuffleboardTab m_tab = Shuffleboard.getTab("First Robot Shuffleboard");
    

    public DriveDebugDash(Drivetrain drivetrain) {
        m_drivetrain = drivetrain;
        m_tab.add("TestValue",1);
    }

    public void periodic() {
        // read drive train sensors and update dash
        
    }

    public void disabled() {
        // read PID constants and set them on the drive train.
    }

}