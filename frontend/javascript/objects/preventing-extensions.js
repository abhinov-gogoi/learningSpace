// SOURCE - https://www.udemy.com/course/advanced-and-object-oriented-javascript/learn/lecture/9819818
//////////////////////////////////////////////////////////////////////////////////////////////////////

// 3 ways to prevent extensions
// LEVEL 1 :  Non-Extensible - cannot add new properties
// LEVEL 2 :  Seal It -        non-extensible(cannot add new properties) + non-configurable(cannot delete the property and change is attributes - Writable, Configurable, or Enumerable)
// LEVEL 3 :  Freeze It -      non-extensible + Sealed + non-writable(all properties becomes read-only)

// -------------------------------------------NON-EXTENSIBLE EXAMPLE--------------------------------------------
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

// ---------------------------------------------OBJECT SEALING EXAMPLE------------------------------------------
var myObject2 = {
  name: "Iphoony2",
};

console.log(Object.isExtensible(myObject2)); // true by default
console.log(Object.isSealed(myObject2)); // false by default

// seal the object
Object.seal(myObject2);
console.log(Object.isExtensible(myObject2)); // false now
console.log(Object.isSealed(myObject2)); // false now

// ----------------------------------------------OBJECT FREEZING EXAMPLE---------------------------------------
var myObject3 = {
  name: "Iphoony3",
};

console.log(Object.isExtensible(myObject3)); // true by default
console.log(Object.isSealed(myObject3)); // false by default
console.log(Object.isFrozen(myObject)); // false by default

// FREEZE the object
Object.freeze(myObject3);
console.log(Object.isExtensible(myObject3)); // false now
console.log(Object.isSealed(myObject3)); // false now
console.log(Object.isFrozen(myObject3)); // false now
