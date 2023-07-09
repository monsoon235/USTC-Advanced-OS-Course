package FD.validator

import FD.conf.Conf
import FD.structures.FDs

trait Validator {
  def validate(fds: Array[FDs]): ValidationResult
  def validate(assignment: Map[Int, Array[FDs]]): ValidationResult
  def detectionValidate(assignment: Map[Int, Array[FDs]]): ValidationResult

  var dataSet: Array[Array[Int]]
  var cardinalityOfAttributes: Array[Int]
  var currentAttribute: Int
  var partitionID: Int
  var conf: Conf
}
