// SOURCE - https://www.udemy.com/course/advanced-and-object-oriented-javascript/learn/lecture/9819782 -----------
//////////////////////////////////////////////////////////////////////////////////////////////////////

var myObject = {};

// lets define 2 properties
Object.defineProperty(myObject, "age", { value: 25 });

Object.defineProperty(myObject, "name", {
  value: "Abhi",
  enumerable: true,
  configurable: true,
  writable: true,
});

// when we define properties this way, by default enumerable, configurable and writable will be false
console.log("age" in myObject);
console.log(myObject.propertyIsEnumerable("age")); // false by default when we declare properties with Object.defineProperty()
delete myObject.age;
console.log("age" in myObject); // cannot be deleted as its non-configurable
