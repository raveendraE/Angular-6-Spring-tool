import {Injectable} from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable()
export class LoginService{
    private RestAPIUrl = 'http://localhost:8080/Project/CodeTest/login';
    private people;
    constructor(private http:HttpClient){
        http.get(this.RestAPIUrl).subscribe((res:Response) => this.people);
        alert(this.people+"hihi")
    }
    private extractData(res:Response){
        let body = res;
    }
    private exceptionHandle(error:Response){
        let errorMessage = '';
        let body = error.json();
        if(body){
            body;
        }
        return Observable.throw(errorMessage || 'Server Error');
    }
}