package FD.sampler
import FD.structures.{FDList, FDs}
import FD.validator.ValidationResult


abstract class AbstractSampler extends Sampler {
  override def takeSample(): FDList = new FDList()

  override def takeSample1(): SampleResult = new SampleResult(new FDList(), 0l)

  //Design for integrated sampling and verification
  override def validate(fds: Array[FDs]): ValidationResult = null
}
