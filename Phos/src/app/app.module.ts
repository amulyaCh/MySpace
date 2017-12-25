import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import { UserAuthenticationComponent } from './user-authentication/user-authentication.component';
import { UserLoginComponent } from './user-authentication/user-login/user-login.component';
import { UserRegisterComponent } from './user-authentication/user-register/user-register.component';
import { UserAuthenticationModule } from './user-authentication/user-authentication.module';



@NgModule({
  declarations: [
    AppComponent,
    UserAuthenticationComponent,
    UserLoginComponent,
    UserRegisterComponent,
  ],
  imports: [
    BrowserModule,
    UserAuthenticationModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
