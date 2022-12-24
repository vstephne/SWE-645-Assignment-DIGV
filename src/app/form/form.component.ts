import { Component, OnInit } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {FormBuilder} from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {
  
  ngOnInit(): void {
    const headers= new HttpHeaders()
  .set('content-type', 'application/json')
  .set('Access-Control-Allow-Origin', '*');
    // console.log("constructor");
  }

  title = '';
  formGroup;

  constructor(private formBuilder: FormBuilder, private http: HttpClient,private router:Router) {
    this.formGroup = this.formBuilder.group({
      id: Math.floor(Math.random() * (1000 - 50 + 1))+50,
      firstname: '',
      lastname: '',
      address: '',
      city: '',
      state: '',
      phone: '',
      zipcode: '',
      email: '',
      date: '',
      likelihood: '',
      fav_feature: '',
      interest: '',
      raffle: '',
      comments: ''
    });
   }

   onSubmit(formData: any){
     let body = JSON.stringify(formData);
     const options = {headers: {'Content-Type': 'application/json'}};
     console.log(body)

    
      // let promise = new Promise<void>((resolve, reject) => {
      //   var req = new XMLHttpRequest();
      //   req.open('POST', 'http://localhost:8080/putstudents', body, options);
      //   if (){

      //   }
        
      // });

      const promise = this.http.post('http://3.91.100.164:31568/putstudents', body, options).toPromise();
    console.log(promise);  
    promise.then((data)=>{

      console.log(data);
      alert("Success!!");
      this.router.navigate(['/welcome-page'])
    }).catch((error)=>{
      alert("Error!!");
      console.log("Promise rejected with " + JSON.stringify(error));
    });
      

     //this.http.post<any>('http://localhost:8080/putstudents', body, options).subscribe(data => console.log(data))
    }
    

    // onSubmit():void{
    //   console.log("inside pop up");
    //   var txt;
    //   if (confirm("Thank you for submitting!")) {
    //     console.log("Form Submitted");
    //   } else {
    //     console.log("Cancelled");
    //   }
      
    //   };
  

}
