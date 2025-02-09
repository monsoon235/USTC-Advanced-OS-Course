package FD.validator
import FD.structures.FDs

abstract class AbstractValidator extends Validator {
  override def validate(fds: Array[FDs]): ValidationResult = new ValidationResult()
  override def validate(assignment: Map[Int, Array[FDs]]): ValidationResult = new ValidationResult()
  override def detectionValidate(assignment: Map[Int, Array[FDs]]): ValidationResult = new ValidationResult()
}
