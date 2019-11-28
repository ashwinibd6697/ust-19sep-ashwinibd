import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property',
  templateUrl: './property.component.html',
  styleUrls: ['./property.component.css']
})
export class PropertyComponent implements OnInit {
 name = 'Ashwini';
 imgurl = 'https://cdn.pixabay.com/photo/2019/09/26/03/09/flower-4504952__340.jpg';
 address = 'Ballekere, Sriranagapatna taluk mandya dist 571415';
 colorName = 'red';
 isActive = false;
 clspan = 2;
  constructor() {
    setInterval(() => {
      this.colorName = 'blue';
      this.isActive  = !this.isActive;
    }, 2000);
   }

  ngOnInit() {
  //   setInterval(() => {
  //     this.colorName = 'blue';
  //     // this.isActive  = !this.isActive;
  //   }, 2000);
  }

}
