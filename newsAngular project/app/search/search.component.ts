import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
inputdata;
entr;
  constructor(private http:HttpClient) { }

  ngOnInit() {
  }
  getEnt(event) {
    this.inputdata =event.target.value;
     this.http.get<any>('https://newsapi.org/v2/everything?from=2019-10-14&to=2019-10-14&sortBy=popularity&apiKey=c143f726ab994b898534102e79f01ba0&q='+this.inputdata).subscribe(data => {
     this.entr = data.articles;
     console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('news got successfully');
     } );
   }
}
