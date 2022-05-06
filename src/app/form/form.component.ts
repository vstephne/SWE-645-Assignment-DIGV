import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
    console.log("constructor");
  }

   onSubmit():void{
    console.log("inside pop up");
    var txt;
    if (confirm("Thank you for submitting!")) {
      console.log("Form Submitted");
    } else {
      console.log("Cancelled");
    }
    
    };

}
