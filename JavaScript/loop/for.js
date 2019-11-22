console.log('============for of loop with array===================')
var brands=['kingfisher','bisleri','aqua','kinley']
for(var i of brands ){
    console.log('brands=',i);
}
console.log('============== for in loop with array===========================')
for(var j in brands)
console.log('value=',brands[j]);
console.log('==============for in loop with object===========================')
var person={
    name:"ashwini",
    age:21,
    gender:'female',
    number:7836487264
   }
for(var k in person)
{
    console.log('details=',person[k]);
}
// for comment evrythin shift+alt+A
console.log('========== forEach method only for array==============================')
var m=['Sholay','jollydays','olavina udugore','titanic']
 m.forEach(function(value,index)
 {
     console.log('movie=',value);
 })
 console.log('========================forEach method for object array===========================')
 var p=[{item:'bangles',
         id: 1,
        price:100},
        {item:'lipstick',
         id:2,
        price:200},
        {item:'wathes',
         id:3,
        price:10000},
        {item:'bike',
         id:4,
        price:1000000}]
        p.forEach(function(value,i){
            console.log('item details=',value);
        }
        )
        console.log('======== for empty elements============')
        var a=[10, ,20,30,,]
        for(var i=0;i<a.length;i++)
        {
            console.log('for',a[i]);
        }
               a.forEach(function(value){
            console.log('for each',value)
        })
        for(i in a)
        console.log('for in',a[i]);