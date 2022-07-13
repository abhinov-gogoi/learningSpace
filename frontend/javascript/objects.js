var myObject = {
    _id : 001,
    _name: "Abhi",
    _age : 25,

    get name() {
        return this._name;
    },

    set name(value) {
        this._name = value;
    },
};


// iterating each property in an object
for(item in myObject) {
    console.log(item)
}

// enumerable means access/iterable using a foreach loop
console.log(myObject.propertyIsEnumerable("name"))

// make it non enumerable
Object.defineProperty(myObject, "name", {enumerable: false});
console.log(myObject.propertyIsEnumerable("name"))



