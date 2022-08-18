package practice1pkg

import io.StdIn._

object prac2 extends App {

  //val age = 18

  if(age>=21) {
    println("Old")
  } else {
    println("young, get lost")
  }

  println("How old are you?")
  val age = readInt()
  val response = if(age < 21) {
      "Get Lost"
  } else {
      println(age + " is old enough")
      "Come In"
  }

  println(response)

  val s1 = "hi there"
  val s2 = readLine+"there"
  if(s1 == s2) println("equal") else println("not equal")
  if(s1 eq s2) println("equal") else println("not equal")

}



