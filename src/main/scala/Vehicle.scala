package com.knoldus.vehicletrait

trait Vehicle {
  def move: String
}

class Car extends Vehicle {
  override def move: String = "can be driven"
}

class Boat extends Vehicle {
  override def move: String = "can be sailed"
}

class Aeroplane extends Vehicle {
  override def move: String = "can be flown"
}

object Vehicle {
  val car = new Car

  //flyingcar inherit the properties of vehicle and aeroplane
  class FlyingCar extends Aeroplane {
    override def move: String = s"${car.move} and ${super.move}"
  }

  //hovercraft inherit the properties of vehicle and boat
  class Hovercraft extends Boat {
    override def move: String = s"${super.move} and ${car.move}"
  }
}

