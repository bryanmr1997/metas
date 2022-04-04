import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  urlBackend='http://localhost:8080/api/usuario';


  constructor(private http:HttpClient) { }

 obtenerNombrePorPass(nombre:string,pass:string):Observable<any>{

  const requestOptions: Object = {
    /* other options here */
    responseType: 'text'
  }
    return this.http.get<any>(`${this.urlBackend}/login/${nombre}/${pass}`,requestOptions)
 }


}
