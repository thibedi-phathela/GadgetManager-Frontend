import { Component, OnInit } from '@angular/core';
import { DataService } from 'src/app/data.service';

@Component({
  selector: 'app-data-display',
  templateUrl: 'data-display.component.html',
  styleUrls: ['data-display.component.css'],
})
export class DataDisplayComponent implements OnInit {
  data: any[] = []; 
  newDeviceName: any;
  newDeviceId: any;

  constructor(private dataService: DataService) {}

  ngOnInit() {
    this.loadData();
  }

  loadData() {
    this.dataService.getData().subscribe(
      (response) => {
        this.data = response;
      },
      (error) => {
        console.log('Error:', error);
      }
    );
  }

  addDevice() {
    const newDevice = {
      deviceName: this.newDeviceName,
      deviceId: this.newDeviceId,
      isActive: true,
    };
    this.dataService.addDevice(newDevice).subscribe(
      () => {
        console.log('Device added successfully');
        this.newDeviceName = ''; // Clear the input field after adding the device
        this.newDeviceId = '';
        this.loadData();
      },
      (error) => {
        console.log('Error adding device:', error);
      }
    );
  }
  
  deleteDevice(deviceId: number) {
    this.dataService.deleteDevice(deviceId).subscribe(
      () => {
        console.log('Device deleted successfully');
        this.loadData();
      },
      (error) => {
        console.log('Error deleting device:', error);
      }
    );
  }
}
