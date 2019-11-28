import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-in',
  templateUrl: './in.component.html',
  styleUrls: ['./in.component.css']
})
export class InComponent implements OnInit {
entr;
  constructor(private http:HttpClient) { 
    this.getEnt();
  }

  ngOnInit() {
  }
  getEnt() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=c143f726ab994b898534102e79f01ba0').subscribe(data => {
    this.entr = data.articles;
    console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    } );
  }
}
