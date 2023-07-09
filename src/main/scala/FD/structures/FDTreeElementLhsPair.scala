package FD.structures

import java.util


class FDTreeElementLhsPair(element: FDTreeElement,
                           lhs: util.BitSet,
                           level: Int) extends Serializable{

  def getElement: FDTreeElement = {
    this.element
  }

  def getLhs: util.BitSet = {
    this.lhs
  }

  def getLevel: Int = this.level
}
