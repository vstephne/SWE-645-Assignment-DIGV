import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { WelcomePageComponent } from './welcome-page/welcome-page.component';
import { FormComponentComponent } from './form-component/form-component.component';


const routes: Routes = [
  {path: 'welcome-page', component: WelcomePageComponent},
  {path: 'form-component', component: FormComponentComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
export const routingComponents =[WelcomePageComponent,FormComponentComponent]