function checkPass()
{  let f=document.forms[0];
    let message=document.getElementById('error')
    let un=f.uName.value;
    let pa=f.password.value
    if(un.length>4 && pa.length>7){
        f.uName.style.border="2px solid green"
        f.password.style.border="2px solid green"
        document.getElementById("r").disabled = false;
    } 
    else{
        f.uName.style.border="2px solid red"
        f.password.style.border="2px solid grered"
        document.getElementById("r").disabled = true;
        message.innerHTML='Enter correctly'
         message.style.color='red';
    }
}
        
        
    
        // function disableBtn() {
        //     document.getElementById("r").disabled = true;
        // }
        
        // function enableBtn() {
        //     document.getElementById("r").disabled = false;
        // }
  