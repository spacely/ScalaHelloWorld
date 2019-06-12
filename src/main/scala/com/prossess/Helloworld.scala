package com.prossess

object Helloworld   {

  def main(args: Array[String]): Unit ={

    println("Hello world")
    //println(add(5,6))
    //list: List[Int] = List(1, 2, 3)
    val list = List(1,2,3,7,8,4,11.8)
    println(mean(list))
  }

  def add(first: Int, second: Int) : Int ={

     first+second
  }

  def mean(values: List[Double]): Double ={

     var sum:Double  = 0
    for(v: Double <- values){
        sum = sum + v

      }
      val mean = sum/values.length

     mean
  }



}
