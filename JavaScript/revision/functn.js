
console.log("========================named function==============")
function s(a,b){
    console.log(a+b);
}
s(10,20);
  console.log("========================expression funvtion==========")
  var q=function(a,b){
      console.log(a+b)
  } 
  q(10,20)
  console.log("===========================self invoked function===========");
  (function(a,b){
      console.log(a+b)
  })
  (10,20);
  console.log("=========================fst arrow============")
  var w=(a,b) => a+b;
  console.log(w(10,20))

  console.log("============variable hoisting==========")
  
  console.log(i);
  var i;
  console.log("============function hoisting==========")
  function hoisting(){
      console.log(g)
      var g=10;
      console.log("asdfg==",g);
  }
   hoisting();
console.log("=========================work flow web api==========");
function f(as){
    setTimeout(function(){
        console.log("sdfghjkl;kjhgfdsfghjk");
          as();    
    },0);
   
}
function s(){
    console.log("qwertyuiiouytre");
}
f(s);



console.log("=========================forofloop=============")
var a=[10,20,30,40];
 for(var i of a)
 console.log(i);
 console.log("===================forin=============")
 for(var j in a)
 console.log(a[j]);
 console.log("==========================forEach================")
 a.forEach(function(v,i){
     console.log(v+40);

 })
console.log(a);
