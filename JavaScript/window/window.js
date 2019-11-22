console.log('window object',window)
console.log('this keyword',this);
console.log(this===window)

// alert for display popup mez
// window.alert('welcome to JS');
// alert('Welcome to UST Global');
// let confirmed=confirm('are you sure u want to delete') //when u want exit to application or not that time u can use
// console.log('confirmn Delete',confirmed)
 let age=prompt('what is your age:',21);//  to give input to pop up mez
 console.log('age',age);
 const person={
    name:"ashwini",
    age:21,
    gender:'female',
    lastname:'BD',
    getname:function(){
        console.log('this keyword',this)
        return this.name + "  " + this.lastname
    }
   }
   let fullName=person.getname()
   console.log('Full Name',fullName)
