// SOURCE - https://www.udemy.com/course/advanced-and-object-oriented-javascript/learn/lecture/9929804
//////////////////////////////////////////////////////////////////////////////////////////////////////

// constructions are just like functions but first letter is CAPITALISED
function Flight() {}

var flight1 = new Flight();
var flight2 = new Flight();

console.log(flight1 instanceof Flight);
console.log(flight1 instanceof Flight);

console.log(flight1.constructor === Flight);
console.log(flight2.constructor === Flight);
