import {Component, OnInit} from '@angular/core';
import {Router, RouterLink} from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor( private router: Router) {
  }

  ngOnInit() {
    if(!sessionStorage.getItem('user')) {
      this.router.navigate(['login']);
    }
  }

}
