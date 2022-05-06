import { Component, OnInit } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';

@Component({
  selector: 'app-display-surveys',
  templateUrl: './display-surveys.component.html',
  styleUrls: ['./display-surveys.component.css']
})
export class DisplaySurveysComponent implements OnInit {

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
  surveys =[];

  constructor(private http: HttpClient) {

  }

  ngOnInit(): void {
    const headers= new HttpHeaders()
  .set('content-type', 'application/json')
  .set('Access-Control-Allow-Origin', '*');

    this.http.get<any>('http://localhost:8080/getStudentDetails',{ 'headers': headers }).subscribe(response => response.forEach((data:any) => {this.surveys=data}))
    console.log(this.surveys)
  }

}
