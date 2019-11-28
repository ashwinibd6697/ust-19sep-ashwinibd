import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-us',
  templateUrl: './us.component.html',
  styleUrls: ['./us.component.css']
})
export class UsComponent implements OnInit {
entr;
  constructor(private http:HttpClient) { this.getEnt(); }

  ngOnInit() {
  }
  getEnt() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=c143f726ab994b898534102e79f01ba0').subscribe(data => {
    this.entr = data.articles;
    console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    } );
  }

}
