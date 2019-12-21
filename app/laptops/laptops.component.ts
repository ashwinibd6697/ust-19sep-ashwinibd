import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptops',
  templateUrl: './laptops.component.html',
  styleUrls: ['./laptops.component.css']
})
export class LaptopsComponent implements OnInit {
  s2;
  lap = [{
    name: 'lenova',
    imgUrl: 'https://cdn.pixabay.com/photo/2015/07/17/22/43/student-849825__340.jpg',
    d:"HP Pavilion x360 With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15."},
    {
      name: 'hp',
      imgUrl: 'https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373__340.jpg',
      d:"HP Pavilion x360 With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15."},
      {
        name: 'dell',
        imgUrl: 'https://cdn.pixabay.com/photo/2014/09/24/14/29/mac-459196__340.jpg',
        d:"HP Pavilion x360 With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15."},
        {
          name: 'apple',
          imgUrl: 'https://cdn.pixabay.com/photo/2016/06/28/05/10/laptop-1483974__340.jpg',
          d:"HP Pavilion x360 With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15."}
  ];
  constructor() { }

  ngOnInit() {
  }
  sendCar(j) {
    this.s2 = j;
    console.log(j);
  }
}
