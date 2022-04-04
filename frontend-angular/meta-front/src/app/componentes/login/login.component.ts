import { LoginService } from './../../Service/login/login.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  hola='';
  forms:FormGroup;
  constructor(private fb: FormBuilder, private router: Router, private loginService:LoginService) {
    this.forms=this.fb.group({
      usuario:['',Validators.required],
      password:['',Validators.required]
      
    })
   }

  ngOnInit(): void {

   
  }
  ingresar(){
    
   


    const usuario=this.forms.value.usuario;

    const password=this.forms.value.password;

    this.loginService.obtenerNombrePorPass(usuario,password)
    .subscribe((response:any)=>{
      if(response=="OK"){
        this.router.navigate(['metas']);
      }else{
        this.forms.reset();
      }
    })


    console.log(usuario);
    console.log(password);

    // if(usuario =='bryan' && password=='123'){
    //   this.router.navigate(['metas']);
    // }else{
    //   this.forms.reset();
    // }


  }
}
