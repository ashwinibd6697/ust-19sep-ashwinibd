import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-attribute-directive',
  templateUrl: './attribute-directive.component.html',
  styleUrls: ['./attribute-directive.component.css']
})
export class AttributeDirectiveComponent implements OnInit {
  c1='red';
  c2='yellow';
  isActive=false;
  constructor() {
    setInterval(()=>{
      this.isActive=!this.isActive;
    },2000)
   }

  ngOnInit() {
  }

}
