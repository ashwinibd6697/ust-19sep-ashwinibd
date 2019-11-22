const hobbies=['Sleeping','Cricket','Eating','Coding','Roaming']
// to find type of array it will return object bcz all reference type return object only
console.log(typeof hobbies);
// to find ots array or not
console.log(Array.isArray(hobbies))
// to find whether the element is present or not in an array
console.log(hobbies.includes('Eating'))
// to add the elements to an array at last
hobbies.push('cooking','dancing')
console.log('after push method',hobbies)
// to remove the elements from an array
hobbies.pop()
console.log('afetr pop method',hobbies)
// to add the elements from starting index  it return length of array
console.log('after unshift method',hobbies.unshift('googling','Numismetics'))
// to remove from first index it return which elemnt deleted
console.log('after shif methd',hobbies.shift());    
// to add or remove elements from anyware
const hb1=['sleeping','dancing','eating','coding','roaming']
hb1.splice(1,2,'drinking','sitting')
console.log('after splice method',hb1)
//after slice method
const hb2=hb1.slice(2,4)
console.log(hb2)
//to find index of element
const a=hobbies.indexOf('coding',1)
console.log('find index of elements',a)
//to return array elemts as string
String =hobbies.join(':')
console.log(String)
//whenever u need changes of all elements in the given array
const arr=[100,200,300,400,500]
console.log('============map method=============')
const numb=arr.map(function(value,index){
    let nValue=value+50;
    return nValue;
})
console.log(numb)
// numb.forEach(function(v,i)
// { console.log(v+50)})

console.log('using fat aarrow fn')
const hb3=arr.map(value=>value+50)
console.log(hb3)
console.log('============filter==============')
const arr2=arr.filter(value=>value>200)
console.log(arr2)