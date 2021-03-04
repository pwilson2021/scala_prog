import java.io.File

object FunctionalScala2 {
  def main(args: Array[String]): Unit = {
    val fileList = (new java.io.File("./")).listFiles
    val fileList2 = (new java.io.File("C://Users/TURNTABL/Downloads")).listFiles

//    listFiles(fileList)
//    listFilesAndDirectories(fileList)
//
    //listFilesWithSize(fileList)
    groupFilesMap(fileList2)
  }

  def listFiles(fileList: Array[File]): Unit = {
    val files = fileList filter (x => !x.isHidden && x.isFile)
    files foreach(x => println(x))
  }

  def listFilesAndDirectories(fileList: Array[File]): Unit = {
    val partition = fileList partition(x => x.isDirectory)
    println(partition._1 foreach(x => println(x)))
    println(partition._2 foreach (x => println(x)))
  }

  def listFilesWithSize(fileList: Array[File]): Unit = {
    fileList filter(_.isFile) map(x => (x.getName, x.length())) foreach(x => println(x))
  }

  def groupFiles(fileList: Array[File]) = {
      //fileList filter(x => x.isFile && !x.isHidden ) sortBy(x => x.length()) take(10) foreach(x => println(x.getName))
      fileList filter(x => x.isFile && !x.isHidden ) sortBy(x => -x.length()) take(10) foreach(x => println(x.getName))
  }

  def groupFilesMap(fileList: Array[File]): Unit = {
    //From smallest to biggest first 10 files
    fileList filter(x => x.isFile && !x.isHidden ) map(x => (x.getName, x.length())) sortBy(_._2) take(10) foreach(x => println(x))

    //From biggest to smallest first 10 files
    fileList filter(x => x.isFile && !x.isHidden ) map(x => (x.getName, x.length())) sortBy(-_._2) take(10) foreach(x => println(x))
  }


}
