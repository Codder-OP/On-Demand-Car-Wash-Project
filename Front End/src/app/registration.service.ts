import { Injectable } from '@angular/core';
import { Users } from './users';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor(private _http:HttpClient) { }
  public loginUserFromRemote(user: Users):Observable<any>{
    return this._http.post<any>("http://localhost:8090/users/login",user);

  }
  public registerUserFromRemote(user: Users):Observable<any>{
    return this._http.post<any>("http://localhost:8090/users/registration",user);

  }
}
