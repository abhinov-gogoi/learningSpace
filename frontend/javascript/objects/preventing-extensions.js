// SOURCE - https://www.udemy.com/course/advanced-and-object-oriented-javascript/learn/lecture/9819818
//////////////////////////////////////////////////////////////////////////////////////////////////////

// Non-Extensible
// Freeze It
// Seal It

var myObject = {
  name: "Iphoony",
};

// EXTENSIBLE - means we can add new propeerties to the object
console.log(Object.isExtensible(myObject)); // true by default

// make it NON-EXTENSIBLE
Object.preventExtensions(myObject);
console.log(Object.isExtensible(myObject)); // false, cause its non-extensible

// lets try to add a new property now
myObject.price = 1000;

// check if price property exists on myObject
console.log("price" in myObject); // false

// similarily we cannot add function as well to a NON-EXTENSIBLE object
