// SOURCE - https://www.udemy.com/course/advanced-and-object-oriented-javascript/learn/lecture/9914628
//////////////////////////////////////////////////////////////////////////////////////////////////////

var myObject = {
  name: "Abhi",
};

// get the descriptor of the property
var descriptor = Object.getOwnPropertyDescriptor(myObject, "name");
// access the property values from the descriptor
console.log(descriptor.enumerable);
console.log(descriptor.configurable);
console.log(descriptor.writable);
console.log(descriptor.value);
