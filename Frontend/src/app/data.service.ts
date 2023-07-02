import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable()
export class DataService {
  private baseApi = 'http://127.0.0.1:8080/gadgets/devices';
  
  constructor(private http: HttpClient) {}

  getData(): Observable<any[]> {
    return this.http.get<any[]>(this.baseApi);
  }

  addDevice(device: any) {
    return this.http.post(this.baseApi, device);
  }

  deleteDevice(deviceId: number): Observable<any> {
    const url = `${this.baseApi}/${deviceId}`;
    return this.http.delete(url);
  }
}
