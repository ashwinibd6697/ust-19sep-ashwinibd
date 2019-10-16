import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-output',
  templateUrl: './output.component.html',
  styleUrls: ['./output.component.css']
})
export class OutputComponent implements OnInit {
Comments :any[]=[];

  constructor() { }

  ngOnInit() {
  }
  getAllcomments(event){
    console.log('child data',event)
    this.Comments.push(event)
  }
}
