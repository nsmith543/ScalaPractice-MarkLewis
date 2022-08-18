package practice1pkg

import io.StdIn._

object timeInSeconds extends App {

  // This will convert a string with time to total seconds

  /*
  Code written by Nathan Smith
  */

  println("Enter a time with colons between the values of hours, minutes, seconds:")
  val time = readLine()
  val firstColon = time.indexOf(":")
  val secondColon = time.lastIndexOf(":")
  val hours = time.substring(0, firstColon).toInt
  val minutes = time.substring(firstColon + 1, secondColon).toInt
  val seconds = time.substring(secondColon + 1).toInt
  println(s"$hours, $minutes, $seconds")

  val totalSeconds = hours*3600 + minutes*60 + seconds
  println(totalSeconds)


}