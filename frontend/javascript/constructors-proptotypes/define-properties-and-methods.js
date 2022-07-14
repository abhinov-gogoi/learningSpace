// SOURCE - https://www.udemy.com/course/advanced-and-object-oriented-javascript/learn/lecture/9929804
//////////////////////////////////////////////////////////////////////////////////////////////////////

// parameterized constructor
function Flight(airlines, flightNumber) {
  // define some properties for the object
  this.airlines = airlines;
  this.flightNumber = flightNumber;

  // define some methods for the object
  this.display = function () {
    console.log(this.airlines + " " + this.flightNumber);
  };
}

// create 2 objects
var flight1 = new Flight("Indian Air", "3HHGTY99");
var flight2 = new Flight("IndSky", "AAQQWER12");

// call the methods on the objects
flight1.display();
flight2.display();
