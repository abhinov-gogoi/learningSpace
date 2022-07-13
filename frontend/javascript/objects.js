var myObject = {
  // underscore is just a convention to denote private properties
  _id: 001,
  _name: "Abhi",
  _age: 25,

  // getter - accessor property
  get name() {
    return this._name;
  },

  // settter - mutator property
  set name(value) {
    this._name = value;
  },
};

// iterating each property in an object
for (item in myObject) {
  console.log(item);
}

// enumerable means access/iterable using a foreach loop
console.log("propertyIsEnumerable :: " + myObject.propertyIsEnumerable("name"));

// make it non enumerable - property cannnot be enumerated/ iterated using foreach loop
Object.defineProperty(myObject, "name", { enumerable: false });
console.log("propertyIsEnumerable :: " + myObject.propertyIsEnumerable("name"));

// make it non-configurable - property cannot be changed or deleted
Object.defineProperty(myObject, "name", { configurable: false });

// lets try to delete name property
delete myObject._name;
delete myObject._age;
console.log("name" in myObject); // name is not deleted as name is non-configurable
console.log("age" in myObject); // age is deleted
