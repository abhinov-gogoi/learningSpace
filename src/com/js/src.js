document.write("hello world" + "<br>")


// JUST like in JAVA there are wrapper classes for the primitive type - Number, Sting and Boolean
// we can create variables both ways 
var hello_primitive = "hello worldddddd"
var s1 = hello_primitive.substring(2, 6);
document.write(s1 + "<br>")

var hello_wrapper = new String("hello worldssssssssss")
var s2 = hello_wrapper.substring(3, 15);
document.write(s2 + "<br>")

document.write(typeof s2)
document.write(s2 instanceof String) // false because https://www.udemy.com/course/advanced-and-object-oriented-javascript/learn/lecture/10048084#overview


