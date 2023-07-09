package FD.inductor

import FD.structures.FDList

trait InductorInterface {
  def updatePositiveCover(nonFds: FDList): Int
  def updatePositiveCover(nonFds: FDList, currentAttribute: Int): Int
}
