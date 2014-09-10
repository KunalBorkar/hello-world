package com

import org.springframework.boot._
import org.springframework.boot.autoconfigure._
import org.springframework.stereotype._
import org.springframework.web.bind.annotation._

import scala.collection.JavaConversions._

object MyFirstProject	{
	def main(args: Array[String])	{
		SpringApplication.run(classOf[MyFirstProject])
  }
}

@Controller
@EnableAutoConfiguration
class MyFirstProject {
	@RequestMapping(Array("/"))
	@ResponseBody
	def home(): String = "Hello World..My Name is Kunal"
}