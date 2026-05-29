package frc.robot.subsystems;

import frc.robot.Constants;
import edu.wpi.first.wpilibj.RobotBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.PersistMode;
import com.revrobotics.ResetMode;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;

public class IntakeSubsystem extends SubsystemBase{
    //Intake roller. AKA rolly bar
    public final SparkMax intakeMotor1;
    public final SparkMaxConfig intakeConfig1;

    public final SparkMax intakeMotor2;
    public final SparkMaxConfig intakeConfig2;
    public IntakeSubsystem(){
        intakeMotor1 = new SparkMax(Constants.IntakeMotors.INTAKE_MOTOR_ID_1, MotorType.kBrushless);
        intakeConfig1 = new SparkMaxConfig();
        intakeConfig1.idleMode(IdleMode.kCoast);
        intakeConfig1.inverted(Constants.IntakeMotors.INTAKE_MOTOR_1_INVERTED);
        intakeMotor1.configure(intakeConfig1, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);

        intakeMotor2 = new SparkMax(Constants.IntakeMotors.INTAKE_MOTOR_ID_2, MotorType.kBrushless);
        intakeConfig2 = new SparkMaxConfig();
        intakeConfig1.idleMode(IdleMode.kCoast);
        intakeConfig1.inverted(Constants.IntakeMotors.INTAKE_MOTOR_2_INVERTED);
        intakeMotor2.configure(intakeConfig1, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }
    public void setSpeed(double speed){
        intakeMotor1.set(speed);
        intakeMotor2.set(speed);
    }
    public void 
}