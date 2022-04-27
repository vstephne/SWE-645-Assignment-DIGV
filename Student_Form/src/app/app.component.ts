import { Component } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Student_Form';

  constructor(private router: Router) {
    this.router.navigate(['/', 'home']);
  }

  ngOnInit(){
    
  }
}

