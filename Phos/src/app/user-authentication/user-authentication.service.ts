import { Router } from '@angular/router';
import * as firebase from 'firebase';
import { Injectable } from '@angular/core';

@Injectable()
export class UserAuthenticationService {
  token: string;
  isAuthenticated() {
    return this.token != null;
  }
}
