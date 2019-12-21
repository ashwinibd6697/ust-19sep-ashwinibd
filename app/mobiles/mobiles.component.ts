import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobiles',
  templateUrl: './mobiles.component.html',
  styleUrls: ['./mobiles.component.css']
})
export class MobilesComponent implements OnInit {
  s3;
  mob = [{
    name: 'redmi',
    imgUrl: 'https://cdn.pixabay.com/photo/2017/02/27/21/39/mobile-phone-2104312_960_720.jpg',
  details:"Rs:4999                                                  Samsung Galaxy With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15."},
    {
      name: 'samsung',
      imgUrl: 'https://cdn.pixabay.com/photo/2016/11/10/16/03/android-1814556__340.jpg',
      details:"Rs:4999                                                  Samsung Galaxy With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15."},
      {
        name: 'vivo',
        imgUrl: 'https://cdn.pixabay.com/photo/2017/08/07/22/21/technology-2608530__340.jpg',
        details:"Rs:4999                                                  Samsung Galaxy With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15."},
        {
          name: 'nokia',
          imgUrl: 'https://cdn.pixabay.com/photo/2017/04/05/01/15/iphone-2203712__340.jpg',
          details:"Rs:4999                                                  Samsung Galaxy With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15."}
  ];
  constructor() { }

  ngOnInit() {
  }
  sendCar(k){
    this.s3 = k;
    console.log(k);
  }
}
