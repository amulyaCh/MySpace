import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { UserLoginComponent } from './user-login/user-login.component';
import { UserRegisterComponent } from './user-register/user-register.component';
import { UserAuthenticationRoutingModule } from './user-authentication-routing.module';

@NgModule({
  declarations: [
    UserLoginComponent,
    UserRegisterComponent
  ],
  imports: [
    FormsModule,
    UserAuthenticationRoutingModule
  ]
})
export class UserAuthenticationModule {}
