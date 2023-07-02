import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { DataDisplayComponent } from 'src/app/data-display/data-display.component';
import { DataService } from './data.service';
import { FormsModule } from '@angular/forms';


@NgModule({
  declarations: [AppComponent, DataDisplayComponent],
  imports: [BrowserModule, HttpClientModule,FormsModule],
  providers: [DataService],
  bootstrap: [AppComponent],
})
export class AppModule {}
