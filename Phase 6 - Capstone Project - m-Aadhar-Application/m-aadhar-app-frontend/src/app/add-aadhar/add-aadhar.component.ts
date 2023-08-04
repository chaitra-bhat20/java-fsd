import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { AadharService } from '../aadhar.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-add-aadhar',
  templateUrl: './add-aadhar.component.html',
  styleUrls: ['./add-aadhar.component.css']
})
export class AddAadharComponent implements OnInit {
  
  aadharRef = new FormGroup({
    cname:new FormControl(),
    dob:new FormControl(),
    address:new FormControl(),
    gender:new FormControl(),
    emailid:new FormControl(),
    number:new FormControl()
  })
  storeMsg : string=""
  requestTypeAadhar : string=""
  constructor(public ps:AadharService, private route: ActivatedRoute) { }

  ngOnInit(): void {
    this.route.queryParams.subscribe(params => {
      this.requestTypeAadhar = params['page'];
      console.log("Request Type",this.requestTypeAadhar);
    })
  }

  storeAadhar(){
    let aadhar = this.aadharRef.value;
    let updateAadhar = {
      ...aadhar,
      requestType:this.requestTypeAadhar
    }
    this.ps.storeAadhar(updateAadhar).subscribe({
      next:(result:any)=>this.storeMsg=result,
      error:(error:any)=>console.log(error),
      complete:()=>console.log("completed")
    })
    this.aadharRef.reset();
  }

}
