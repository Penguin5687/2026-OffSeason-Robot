package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.IntakeSubsystem;
// Removed unused imports to keep code clean

public class ActivateIntakeCommand extends Command {
    private final IntakeSubsystem m_intakeSubsystem;

    // FIX 1: Exact class name match, capitalized, and NO 'void' keyword
    // FIX 2: Pass the subsystem instance into the parameters
    public ActivateIntakeCommand(IntakeSubsystem intake) {
        m_intakeSubsystem = intake; // FIX 3: Assign the parameter to your local variable
        
        addRequirements(m_intakeSubsystem);
    }

    @Override
    public void execute() {
        m_intakeSubsystem.setSpeed(0.5); 
    }
    @Override
    public void end(boolean interrupted) {
        m_intakeSubsystem.setSpeed(0);
    }
}
