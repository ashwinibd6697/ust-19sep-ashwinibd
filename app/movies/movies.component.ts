import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {
movies;
i1;
  constructor(private http: HttpClient) { }

  ngOnInit() {
  }
  getMovies(event) {
    this.i1= event.target.value;
    this.http.get<any>('http://www.omdbapi.com/?apikey=db079894&s='+this.i1).subscribe(data => {
      this.movies = data.Search;
      console.log(data);
    },err =>{
      console.log(err)
    },()=>{
      console.log('succesfull')
    });
  }
}
