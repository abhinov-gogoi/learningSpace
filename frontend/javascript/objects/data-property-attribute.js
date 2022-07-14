// SOURCE - https://www.udemy.com/course/advanced-and-object-oriented-javascript/learn/lecture/9819782 -----------
//////////////////////////////////////////////////////////////////////////////////////////////////////

var myObject = {};

// lets define 2 properties
Object.defineProperty(myObject, "age", { value: 25 });

Object.defineProperty(myObject, "name", {
  value: "Abhi",
  enumerable: true, // If true, the property will be iterated over a foreach loop
  configurable: true, // If false, any attempts to delete the property 'name' or change its attributes (Writable, Configurable, or Enumerable) will fail.
  writable: true, // If false, the 'value' of the property can not be changed
});

// when we define properties this way, by default enumerable, configurable and writable will be false
console.log("age" in myObject);
console.log(myObject.propertyIsEnumerable("age")); // false by default when we declare properties with Object.defineProperty()
delete myObject.age;
console.log("age" in myObject); // cannot be deleted as its non-configurable
