// SOURCE - https://www.udemy.com/course/advanced-and-object-oriented-javascript/learn/lecture/9914618
//////////////////////////////////////////////////////////////////////////////////////////////////////

var myObject = {};

// defining multiple properties together
Object.defineProperties(myObject, {
  _name: {
    value: "Abhi",
    enumerable: true,
    configurable: true,
    writable: true,
  },
  name: {
    get: function () {
      return this._name;
    },
    set: function (value) {
      this._name = value;
    },
    enumerable: true,
    configurable: true,
    // writable: true, // cant use writable with accessor properties (err Cannot both specify accessors and a value or writable attribute)
  },
});

console.log(myObject.name);
