const person={
           name:'Madhu',
           age :22,
           address:{
                    city:'Mandya',
                    state:'Karnataka',
                    pincode:'571415'
                    },
            hobbies:['chating','sleeping']
                }
 console.log('JavaScript person object',person)
 const jsonObject=JSON.stringify(person)
 console.log('json person object',jsonObject);
 const javaScriptObject=JSON.parse(jsonObject);
 console.log('javascript person object after parse',javaScriptObject)


 localStorage.setItem('email','as@gmail.com')
 let value=localStorage.getItem('email')
 console.log('Email ID:',value)
 localStorage.clear();



