import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { WelcomePageComponent } from './welcome-page/welcome-page.component';
import { FormComponent } from './form/form.component';
import {DisplaySurveysComponent} from "./display-surveys/display-surveys.component";


const routes: Routes = [
  {path: 'welcome-page', component: WelcomePageComponent},
  {path: 'form', component: FormComponent},
  {path: 'display-surveys', component: DisplaySurveysComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents =[WelcomePageComponent,FormComponent]
