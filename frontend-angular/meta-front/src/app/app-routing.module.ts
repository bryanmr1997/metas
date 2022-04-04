import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginComponent } from './componentes/login/login.component';

const routes: Routes = [
  {path: '',redirectTo:'login',pathMatch:'full'},
  {path: 'login',component: LoginComponent},
  {path: 'metas',loadChildren: ()=> import ('./componentes/menu-tareas/menu-tareas.module').then(x =>x.MenuTareasModule)},
  {path: '**',redirectTo:'login',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
