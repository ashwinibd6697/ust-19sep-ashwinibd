import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-struct-directive',
  templateUrl: './struct-directive.component.html',
  styleUrls: ['./struct-directive.component.css']
})
export class StructDirectiveComponent implements OnInit {
  // switch
  color='yellow';
  // if
  showHide=false;
  // for
  products =[
    {
      img : 'https://cdn.pixabay.com/photo/2019/09/12/15/21/sea-bridge-4471852__340.jpg',
      name : 'night mode'
    },
    {
      img : 'https://cdn.pixabay.com/photo/2019/10/01/12/24/path-4518094__340.jpg',
      name : 'Friends'
    },
    {
      img : 'https://cdn.pixabay.com/photo/2019/09/10/13/24/asia-4466113__340.jpg',
      name : 'My childhood Memory'
    }
  ]
   
  constructor() {
    setTimeout(()=>{
      this.showHide=true;
    },5000);
   }

  ngOnInit() {
  }

}
