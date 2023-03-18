package com.knoldus.vehicletrait

import org.scalatest.funsuite.AnyFunSuite

class VehicleTest extends AnyFunSuite {
  test("A Car should be able to be driven") {
    val car = new Car
    assert(car.move == "can be driven")
  }

  test("A Boat should be able to be sailed") {
    val boat = new Boat
    assert(boat.move == "can be sailed")
  }

  test("An Aeroplane should be able to be flown") {
    val aeroplane = new Aeroplane
    assert(aeroplane.move == "can be flown")
  }

  test("A FlyingCar should be able to be driven and flown") {
    val flyingCar = new Vehicle.FlyingCar
    assert(flyingCar.move == "can be driven and can be flown")
  }

  test("A Hovercraft should be able to be driven and sailed") {
    val hovercraft = new Vehicle.Hovercraft
    assert(hovercraft.move == "can be sailed and can be driven")
  }
}

