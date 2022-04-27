import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormComponentComponent } from './form-component/form-component.component';
import { WelcomePageComponent } from './welcome-page/welcome-page.component';
import { ListSurveyComponent } from './list-survey/list-survey.component';

@NgModule({
  declarations: [
    AppComponent,
    FormComponentComponent,
    WelcomePageComponent,
    ListSurveyComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
