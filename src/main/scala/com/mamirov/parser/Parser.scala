package com.mamirov.parser

trait Parser {
  def getUrl: String
  def parse: List[String]

}
