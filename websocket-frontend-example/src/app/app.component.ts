import {Component} from '@angular/core';
import {WebSocketService} from './services/websocket.service';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  public notifications = 0;

  constructor(private webSocketService: WebSocketService, private http: HttpClient) {

    let stompClient = this.webSocketService.connect();

    stompClient.connect({}, frame => {

      stompClient.subscribe('/topic/notification', notifications => {

        this.notifications = JSON.parse(notifications.body).count;

      });

    });
  }

  callWebSocket() {
    this.http.get('http://localhost:8080/websocket-backend/notify').subscribe();
  }
}
