import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutComponent } from './about/about.component';
import { AdminPanelComponent } from './admin-panel/admin-panel.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { DemoComponent } from './demo/demo.component';
import { HomeComponent } from './home/home.component';
import { LoginSuccessComponent } from './login-success/login-success.component';
import { LoginComponent } from './login/login.component';
import { OfficesComponent } from './offices/offices.component';
import { PlansComponent } from './plans/plans.component';
import { RegistrationComponent } from './registration/registration.component';
import { ServicesComponent } from './services/services.component';

const routes: Routes = [
  {path:'', component:HomeComponent},
  {path:'admin', component:AdminPanelComponent},
  {path:'login', component:LoginComponent},
  {path:'loginsuccess', component:LoginSuccessComponent},
  {path:'registration', component:RegistrationComponent},
  {path: 'about', component:AboutComponent},
  {path:'plans', component:PlansComponent},
  {path:'contact', component:ContactUsComponent},
  {path:'services', component:ServicesComponent},
  {path:'offices', component:OfficesComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
