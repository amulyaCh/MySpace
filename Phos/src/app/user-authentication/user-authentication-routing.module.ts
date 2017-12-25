import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { UserLoginComponent } from './user-login/user-login.component';
import { UserRegisterComponent } from './user-register/user-register.component';

const userAuthenticationRoutes: Routes = [
  { path: 'user-login', component: UserLoginComponent },
  { path: 'user-registration', component: UserRegisterComponent },
];

@NgModule({
  imports: [
    RouterModule.forChild(userAuthenticationRoutes)
  ],
  exports: [RouterModule]
})

export class UserAuthenticationRoutingModule {}
