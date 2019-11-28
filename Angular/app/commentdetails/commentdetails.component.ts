import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-commentdetails',
  templateUrl: './commentdetails.component.html',
  styleUrls: ['./commentdetails.component.css']
})
export class CommentdetailsComponent implements OnInit {
  Comments: any[] = [];
  constructor() { }

  ngOnInit() {
  }
  getAllComments(event) {
    console.log('childData', event);
    this.Comments.push(event);
  }
}
