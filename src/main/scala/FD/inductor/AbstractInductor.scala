package FD.inductor
import FD.structures.FDList

trait AbstractInductor extends InductorInterface{
  override def updatePositiveCover(nonFds: FDList): Int = 0
  override def updatePositiveCover(nonFds: FDList, currentAttribute: Int): Int = 0
}
