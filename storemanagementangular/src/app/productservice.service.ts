import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductserviceService {

  constructor(private http : HttpClient) { }


  addproduct(data):Observable<any>{
    return  this.http.post('http://localhost:8080/add', data);

  }
  viewProducts(){
    return  this.http.get<any>('http://localhost:8080/get');

  }

  addtocart(p,q):Observable<any>{
    return  this.http.post(`http://localhost:8080/addcart/${q}`, p);

  }
  viewCart(){
    return  this.http.get<any>('http://localhost:8080/getcart');

  }
  issue(p): Observable<any>{
    return  this.http.post(`http://localhost:8080/order`,p);

  }
}
