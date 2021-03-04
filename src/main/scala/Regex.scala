object Regex {
  def main(args: Array[String]): Unit = {
    regexTest("root:x:0:0:root:/root:/bin/bash")
  }

  def regexTest(text: String): Unit= {
    val gex = raw"(.*):(.*):(.*):(.*):(.*):(.*):(.*)".r

    val gex (username,password,userid,groupid,description,home, directory) = text

    println(
      s"""
        username -> ${username}
        password -> ${password}
        userid -> ${userid}
        groupid -> ${groupid}
        description -> ${description}
        home -> ${home}
        directory -> ${directory}
      """)
  }
}
