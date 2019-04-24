import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-servers',
  //  template: `<app-server></app-server><app-server></app-server>`,
  templateUrl: './servers.component.html',
  styleUrls: ['./servers.component.css']
})
export class ServersComponent implements OnInit {
  allowNewServer = false;
  serverCreationStatus = 'No server created!';
  serverName = 'testserver';
  //serverName1 = '';
  serverCreated = false;
  servers = ['TestServer', 'TestServer 1'];

  constructor() {
    setTimeout(() => { this.allowNewServer = true; }, 2000);
  }
  ngOnInit() {
  }
  onCreateServer() {
    this.serverCreated = true;
    this.servers.push(this.serverName);

    this.serverCreationStatus = 'Server was created! Name is' + " " + this.serverName;
  }

  onUpdateServerName(event: Event) {
    //console.log(event);
    //this.serverName =  event.target.value;
    this.serverName = (<HTMLInputElement>event.target).value;
  }


}