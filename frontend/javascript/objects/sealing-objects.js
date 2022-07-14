// SOURCE - https://www.udemy.com/course/advanced-and-object-oriented-javascript/learn/lecture/9819822
//////////////////////////////////////////////////////////////////////////////////////////////////////

// Non-Extensible - cannot add new properties
// Seal It - non-extensible(cannot add new properties) + non-configurable(cannot delete the property and change is attributes - Writable, Configurable, or Enumerable)
// Freeze It - non-extensible + Seal It + non-writable(all properties becomes read-only)

var myObject = {
  name: "Iphoony",
};

console.log(Object.isExtensible(myObject)); // true by default
console.log(Object.isSealed(myObject)); // false by default

// seal the object
Object.seal(myObject);
console.log(Object.isExtensible(myObject)); // false now
console.log(Object.isSealed(myObject)); // false now
