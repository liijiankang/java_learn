class Condition {
}
object Condition{
  def main(args: Array[String]): Unit = {
    val score = 90
    //传统写法
    var level=if (score < 60){"bad"}
    else if (score < 80){ "ok" }
    else if (score < 90 ) {"well"}
    else {"good"}
//    println(level)

    //match用法
    val gender = 0
    var result = gender match {
      case 0 => "boy"
      case 1 => "girl"
    }
//    println(result)

    //match代替if
    level=score match {
      case x if x<60=> "bad"
      case x if x<80 => "ok"
      case x if x<90 => "well"
      case _ => "good"
    }
//    println(level)

    //for循环
//    for(i <- 1 to 10){
//        println(i)
//    }
    for (i <- 1 to 10 if i %2 ==0){
//      println(i)
    }
    //嵌套循环
    for (i <- 1 to 10) {
      for (j <- 10 to 20) {
        //        println(s"i:${i} j:${j}")
      }
    }
    //改进for循环
    for (i <- 1 to 10;j <- 10 to 20){
      println(s"i:${i} j:${j}")
    }

  }
}


