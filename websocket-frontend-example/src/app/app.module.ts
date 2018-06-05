import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';


import {AppComponent} from './app.component';
import {WebSocketService} from './services/websocket.service';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import {HttpModule} from '@angular/http';


@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    HttpModule,
  ],
  providers: [WebSocketService, HttpClient],
  bootstrap: [AppComponent]
})
export class AppModule {
}
