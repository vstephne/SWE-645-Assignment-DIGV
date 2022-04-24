import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { FormComponent } from './form/form.component';
import { ListSurveyComponent } from './list-survey/list-survey.component';

const routes: Routes = [
  {path: 'home', component: HomeComponent},
  {path: 'form', component: FormComponent},
  {path: 'list-survey', component: ListSurveyComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents =[HomeComponent,FormComponent,ListSurveyComponent]