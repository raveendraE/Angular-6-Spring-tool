import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { AppRoutingModule } from './/app-routing.module';
import { AppComponent } from './app.component';

import {AgGridModule} from 'ag-grid-angular/main';

import { HttpClientModule } from '@angular/common/http';

import {RedComponentComponent} from "./red-component/red-component.component";

@NgModule({
  declarations: [
    LoginComponent,
    HomeComponent,
    AppComponent, 
    RedComponentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    AgGridModule.withComponents([RedComponentComponent])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
