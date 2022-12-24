import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'swe_hw3';

  constructor(private router: Router) {
    this.router.navigate(['/', 'welcome-page']);
  }

  ngOnInit(){

  }

}
