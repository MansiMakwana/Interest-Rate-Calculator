import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { LoanInfo } from './loan-info';

@Injectable({
  providedIn: 'root'
})
export class IRCService {

  constructor(private http:HttpClient) { }

  public calculate(loanInfo:LoanInfo)
  {
    return this.http.get("http://localhost:8088/",loanInfo);
  }
}
