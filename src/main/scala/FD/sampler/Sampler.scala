package FD.sampler

import FD.structures.{FDList, FDs}
import FD.validator.ValidationResult

trait Sampler {
  def takeSample(): FDList
  def takeSample1(): SampleResult

  //validate using sample data structure
  def validate(fds: Array[FDs]): ValidationResult
}
