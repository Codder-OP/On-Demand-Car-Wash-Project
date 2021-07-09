import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegistrationComponent } from './registration/registration.component';
import { FormsModule }   from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { LoginSuccessComponent } from './login-success/login-success.component';
import { HomeComponent } from './home/home.component';
import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { ServiceComponent } from './service/service.component';
import { AnimationComponent } from './animation/animation.component';
import { DemoComponent } from './demo/demo.component';
import { AboutComponent } from './about/about.component';
import { PlansComponent } from './plans/plans.component';
import { ContactUsComponent } from './contact-us/contact-us.component';
import { ServicesComponent } from './services/services.component';
import { OfficesComponent } from './offices/offices.component';
import { AdminPanelComponent } from './admin-panel/admin-panel.component';
import { WasherPanelComponent } from './washer-panel/washer-panel.component';
import { UserPanelComponent } from './user-panel/user-panel.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegistrationComponent,
    LoginSuccessComponent,
    HomeComponent,
    FooterComponent,
    HeaderComponent,
    ServiceComponent,
    AnimationComponent,
    DemoComponent,
    AboutComponent,
    PlansComponent,
    ContactUsComponent,
    ServicesComponent,
    OfficesComponent,
    AdminPanelComponent,
    WasherPanelComponent,
    UserPanelComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
