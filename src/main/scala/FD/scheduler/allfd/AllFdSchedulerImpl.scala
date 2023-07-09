package FD.scheduler.allfd

import FD.conf.Conf
import FD.scheduler.{SchedulerImpl, TaskTable}
import FD.structures.{FDTree, FDs}

import scala.collection.mutable.ArrayBuffer

class AllFdSchedulerImpl extends SchedulerImpl {
  var taskTable: TaskTable = null
  def this(fDTree: FDTree,
           conf: Conf,
           distributeAttribute: Int){
    this
    this.taskTable = new AllFdTaskTable(fDTree,
      conf.numPartition,
      distributeAttribute,
      conf.numAttributes,
      conf.validatorThreshold)
    println("**************************all fd********************************")
  }
  override def getTasks(nonFDs: ArrayBuffer[FDs]) = {
    taskTable.getTasks(nonFDs)
  }

  override def reGetTasks(nonFDs: ArrayBuffer[FDs]): (Boolean, Map[Int, Array[FDs]]) = {
    taskTable.reGetTasks(nonFDs)
  }
}
