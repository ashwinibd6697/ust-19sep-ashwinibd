import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
 export class ParentComponent implements OnInit {
selected;
  cars = [
    {
      name : 'car1',
      img : 'https://cdn.pixabay.com/photo/2012/05/29/00/43/car-49278__340.jpg'
    },
    {
      name : 'car2',
      img : 'https://cdn.pixabay.com/photo/2015/05/28/23/12/auto-788747__340.jpg'
    },
    {
      name : 'car3',
      img : 'https://cdn.pixabay.com/photo/2016/02/13/13/11/cuba-1197800__340.jpg'
    },
    {
      name : 'car4',
      img : 'https://cdn.pixabay.com/photo/2015/09/02/12/25/bmw-918408__340.jpg'
    }
  ];
  constructor() { }
  send(i){
    this.selected=i;
    console.log(i)
  }
  ngOnInit() {
  }

}
