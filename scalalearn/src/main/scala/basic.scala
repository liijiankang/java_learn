package main.scala

import scala.collection.mutable.ArrayBuffer

object basic {
  def main(args: Array[String]): Unit = {
    val arr1 = Array(1, 2, 3, 4, 5)
    val arr2 = new Array[Int](3)
    //    print(arr1(0))
    arr2(0) = 1
    arr2(1) = 2

    for (i <- arr2) {
      //      print(arr2(i))
    }
    for (i <- 0 until arr2.length) {
      //      println(s"$i:${arr2(i)}")
    }

    //传递函数引用
    //    arr2.foreach(println)
    //传递函数字面量(匿名函数)
    //    arr2.foreach(x => {println(x)})

    //map作用
    //    val arr3 = arr2.map(x => {x*x})
    //    arr3.foreach(println)

    //reduce作用
    //    val sum = arr2.reduce((x1,x2) => {x1+x2})
    //    println(sum)

    val arr4 = Array(43, 26, 21, 3, 6, 93, 45, 31)
    //求最大值
    //    println(arr4.reduce((x1,x2) => {if (x1>x2) x1 else  x2}))

    val a = Array(1, 2, 3)
    val b = Array(4, 5, 6)

    //++运算符
    //    val add = a ++ b
    //    add.foreach(println)

    //转换成字符串
    //    println(a.mkString(":"))
    //过滤
//    val ints = a.filter(x => x % 2 == 0)
//    ints.foreach(println)
//
//    println(b.find(x => x % 2 == 0))

    //intersect求交集
    val x = Array(4,5,2,7,9)
    val y = Array(5,7,78,32)

//    println(x.intersect(y).mkString(","))
    //求差集，两种写法
//    for (i <- x){
//      if (!y.contains(i)){
//        println(i)
//      }
//    }
//
//    println(x.filter(x => {!y.contains(x)}).mkString(","))
    //    ArrayBuffer:变长数组
    val ab1 = new ArrayBuffer[Int](3)
    val ab2 = ArrayBuffer(1,2,3,4)
  }
}
