import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-for',
  templateUrl: './for.component.html',
  styleUrls: ['./for.component.css']
})
export class ForComponent implements OnInit {
  products = [
     {
      img : 'https://cdn.pixabay.com/photo/2016/04/14/20/15/muffins-1329679_960_720.jpg',
      name : 'flower',
      price: 200
    },
    {
      img : 'https://cdn.pixabay.com/photo/2014/08/06/20/32/potatoes-411975__340.jpg',
      name: 'potato',
      price : 100
    },
    {
      img : 'https://image.shutterstock.com/image-photo/different-onions-on-wood-260nw-161066597.jpg',
      name: 'onoin',
      price : 400
    },
    {
      img : 'https://cdn.pixabay.com/photo/2016/03/27/22/38/cake-1284548__340.jpg',
      name : 'cake',
      price : 20
    }
  ];

  constructor() { }

  ngOnInit() {
  }

}
