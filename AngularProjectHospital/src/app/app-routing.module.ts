import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreatedoctorComponent } from './createdoctor/createdoctor.component';
import { CreatepatientComponent } from './createpatient/createpatient.component';
import { ErrorComponent } from './error/error.component';
import { ShowdoctorComponent } from './showdoctor/showdoctor.component';
import { ShowpatientComponent } from './showpatient/showpatient.component';

const routes: Routes = [
  {path:'', redirectTo:'/doctors/doctor/add' , pathMatch : 'full'},
  {path:'doctors/doctor/add' , component: CreatedoctorComponent},
  {path:'doctor/view' , component: ShowdoctorComponent},
  {path:'patients/patient/add' , component: CreatepatientComponent},
  {path:'patient/view' , component: ShowpatientComponent},
  {path:'**',component:ErrorComponent}


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
