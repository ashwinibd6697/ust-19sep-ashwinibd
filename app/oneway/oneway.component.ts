import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-oneway',
  templateUrl: './oneway.component.html',
  styleUrls: ['./oneway.component.css']
})
export class OnewayComponent implements OnInit {
//  propert binding
  name = "Ashwini";
  age =21;
  // style binding
  color= 'red';
  //class binding
   isActive=false;
   colspan=2;
   input='';
   s="im good";
  constructor() { 
    setInterval(()=>{
      this.isActive=!this.isActive;
      this.color='blue';
    },2000);
  }
  // Event binding
  
  printAlertMsg(){
    alert('u are super ashwini');
  }
// two way binding
dataInput(event){
  this.input=event.target.value;
}
  ngOnInit() {
  }

}
