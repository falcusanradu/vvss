import {Component, OnInit} from '@angular/core';
import {Router} from '@angular/router';
import {BackendService} from '../../backend.service';
import {Translate} from '../../translate.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {

  constructor(private translateService: Translate, private router: Router, private backendService: BackendService) {
  }

  ngOnInit() {
  }

  public logout(): void {
    sessionStorage.removeItem('user');
    // sessionStorage.clear();
    this.router.navigate(['/LogIn']);
  }

  isSession(): boolean {
    if (sessionStorage.getItem('user') !== null) {
      return true;
    }
    return false;
  }



}
