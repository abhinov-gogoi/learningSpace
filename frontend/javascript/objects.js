var myObject = {
    _name: "Abhi",

    get name() {
        return this._name;
    },

    set name(value) {
        this._name = value;
    },
};

console.log(myObject.name)
// enumerable means access/iterable using a foreach loop
console.log(myObject.propertyIsEnumerable("name"))

// make it non enumerable
Object.defineProperty(myObject, "name", {enumerable: false});
console.log(myObject.propertyIsEnumerable("name"))



