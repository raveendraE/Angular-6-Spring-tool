import { Component} from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {GridOptions} from 'ag-grid';
import {RedComponentComponent} from "../red-component/red-component.component";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent {
  
  private restAPIUrl = 'http://localhost:8080/Project/CodeTest/login';

  gridOptions: GridOptions;
  columnDefs: any[]
  rowData: any[];

  constructor(private _http:HttpClient) {
      this._http.get(this.restAPIUrl).subscribe((res:Response) => this.restdata(res));
      this.gridOptions = <GridOptions>{};
      this.columnDefs = [
          {width: 80,headerName: "EMP-ID", field: "id"},
          {width: 150,headerName: "EMPLOYEE-NAME", field: "name", cellRendererFramework: RedComponentComponent},
          {width: 200,headerName: "EMAIL", field: "email"},
          {width: 200,headerName: "DEPT", field: "dept"}, 
          {width: 100,headerName: "ADDRESS", field: "address"},
          {width: 200,headerName: "ZIP CODE", field: "pincode"},
          {width: 100,headerName: "COUNTRY", field: "country"},
         
      ];
  }

  public refreshData(){
    this._http.get(this.restAPIUrl).subscribe((res:Response) => this.restdata(res));
  }
  onGridReady(params) {
      params.api.sizeColumnsToFit();
  }

  selectAllRows() {
      this.gridOptions.api.selectAll();
  }

private restdata(results){
  //alert("Result >> "+results.responseList);
  this.rowData = results.responseList;
  }
}
