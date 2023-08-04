import { Component, OnInit } from '@angular/core';
import { AadharService } from '../aadhar.service';
import { Aadhar } from '../aadhar';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-approve-verify-aadhar',
  templateUrl: './approve-verify-aadhar.component.html',
  styleUrls: ['./approve-verify-aadhar.component.css']
})
export class ApproveVerifyAadharComponent implements OnInit {

  aadhars:Array<Aadhar>=[];
  msg:string=""
  cid:number=0;
  constructor(public as:AadharService, private route: ActivatedRoute) { }
  ngOnInit(): void {
    let queryParamValue  = "";
    this.route.queryParams.subscribe(params => {
      queryParamValue = params['page'];
      console.log("querparam",queryParamValue)
    })
    this.findAllAadhar(queryParamValue);
  }
  findAllAadhar(queryParamValue: string){
    this.as.findAllAadhar().subscribe({
      next:(result:any)=>{ 
        this.aadhars= result.filter((item:any) => item.status === "pending" && item.requestType === queryParamValue);
        console.log("All Aadhars",this.aadhars)
      },
      error:(error:any)=>console.log(error),
      complete:()=>console.log("complete")
    })
  }

  updateAadharFromDb(updateAadhar:any,aadharStatus :any) {
    let aadhar = {
      ...updateAadhar,
      status: aadharStatus
    };
    this.as.updateAadhar(aadhar).subscribe({
      next: (result: any) => console.log(result),
      error: (error: any) => console.log(error),
      complete: () => { this.msg = "Aadhar " + aadharStatus }
      //complete:()=>console.log("completed")
    })
  }
}
