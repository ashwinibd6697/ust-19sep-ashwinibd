let element=document.getElementById('demo')
console.log('Elemnt;',element)
console.log('Element Text=',element.textContent)
element.textContent='hi acchu'
// to create element use creatElement()
let buttonElement=document.createElement('button')
buttonElement.textContent='Click Here!!!'
console.log('button Element=',buttonElement)
// to add this element to DOM use appendChild()
document.body.appendChild(buttonElement)


let ulElement=document.createElement('ul')
let li1Element=document.createElement('li')
let li2Element=document.createElement('li')
let li3Element=document.createElement('li')
li1Element.textContent='JAVA'
li2Element.textContent='HTML'
li3Element.textContent='CSS'
ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)
document.body.appendChild(ulElement)
element.style.color="red"
element.style.fontSize= '30px'