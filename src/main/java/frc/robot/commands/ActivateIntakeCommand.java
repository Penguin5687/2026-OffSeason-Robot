package frc.robot.commands;

import frc.robot.subsystems.IntakeSubsystem;

import edu.wpi.first.wpilibj2.command.Command;

import frc.robot.RobotContainer;

public class ActivateIntakeCommand extends Command{
    public void activateIntakeCommand(){
        addRequirements(m_intakeSubsystem);
    }
}
