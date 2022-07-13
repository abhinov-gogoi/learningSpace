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
console.log(myObject.propertyIsEnumerable("age"));
delete myObject.age;
console.log("age" in myObject);
