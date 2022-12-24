interface User {
  id: string
  firstname: string
  lastname: string
  address: string
  city: string
  state: string
  phone: string
  zipcode: string
  email: string
  date: string
  likelihood: string
  fav_feature: string
  interest: string
  raffle: string
  comments: string
}


import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-display-surveys',
  templateUrl: './display-surveys.component.html',
  styleUrls: ['./display-surveys.component.css']
})
export class DisplaySurveysComponent implements OnInit {
   //trial =[];
//    surveys =[ {
//     "id": 1,
//     "firstname": "varshaa",
//     "lastname": "Shree",
//     "address": "Kitty Pozer",
//     "city": "Fairfax",
//     "state": "VA",
//     "phone": "7034532425",
//     "zipcode": "22030",
//     "email": "vs@gmail.com",
//     "date": "2-2-2022",
//     "likelihood": "Attend",
//     "fav_feature": "Campus",
//     "interest": "Courses",
//     "raffle": 23,
//     "comments": "whatever you want to do"
// },
// {
//     "id": 2,
//     "firstname": "varshaa",
//     "lastname": "B",
//     "address": "Kitty Pozer",
//     "city": "Fairfax",
//     "state": "VA",
//     "phone": "7034532425",
//     "zipcode": "22030",
//     "email": "vs@gmail.com",
//     "date": "2-2-2022",
//     "likelihood": "Attend",
//     "fav_feature": "Campus",
//     "interest": "Courses",
//     "raffle": 23,
//     "comments": "Dope"
// }];
   
  
 surveys:User[]=[];
 

  
  constructor(private http: HttpClient) {

  }

  ngOnInit(): void {
    const headers= new HttpHeaders()
  .set('content-type', 'application/json')
  .set('Access-Control-Allow-Origin', '*');

  
    function getUsers(): Promise<User[]> {

        // For now, consider the data is stored on a static `users.json` file
        return fetch('http://3.91.100.164:31568/Getstudents')
                // the JSON body is taken from the response
                .then(response => response.json())
                .then(response => {
                        // The response has an `any` type, so we need to cast
                        // it to the `User` type, and return it from the promise
                        return response as User[]
                })
    }
    
    getUsers()
        .then(users => {
             this.surveys=users
        })

      
//   this.http.get<any>('http://localhost:8080/Getstudents',{ 'headers': headers }).subscribe(response => 
  //   response.forEach(
  //     (data:any) => 
  //       this.surveys.push(data)));
  //   console.log(this.surveys);
   };

}