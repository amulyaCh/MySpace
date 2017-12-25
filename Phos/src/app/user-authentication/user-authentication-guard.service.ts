import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { Injectable } from '@angular/core';

import { UserAuthenticationService } from './user-authentication.service';

@Injectable()
export class UserAuthenticationGuardService implements CanActivate {

  constructor(private userAuthenticationService: UserAuthenticationService) {}

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
    return this.userAuthenticationService.isAuthenticated();
  }
}
