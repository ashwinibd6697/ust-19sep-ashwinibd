import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
    selector : 'app-home',
    templateUrl : './home.component.html',
    styleUrls : ['./homw.component.css']
})

 export class HomeComponent {
news;
  // img = 'https://cdn.pixabay.com/photo/2019/09/26/03/09/flower-4504952__340.jpg';
    // isActive : boolean = false;
  constructor(private http: HttpClient) {
    // setTimeout(()=>{
      // this.isActive=!this.isActive;
    // },200);
    this.getNews();
  }
  getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=us&apiKey=c143f726ab994b898534102e79f01ba0').subscribe(data => {
    this.news = data.articles;
    console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('news got successfully');
    } );
  }

}
