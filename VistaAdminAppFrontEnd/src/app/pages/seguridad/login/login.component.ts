import { Component, OnInit } from "@angular/core";
import { FormGroup, FormControl } from "@angular/forms";
import { Router } from "@angular/router";

@Component({
  selector: "app-login",
  templateUrl: "./login.component.html",
  styleUrls: ["./login.component.css"]
})
export class LoginComponent implements OnInit {
  password: boolean = false;
  loginForm: FormGroup;
  msj: string;

  constructor(private router: Router) {
    this.loginForm = new FormGroup({
      nombreUsuario: new FormControl(""),
      clave: new FormControl("")
    });
  }

  ngOnInit() {}

  autenticar() {
    console.log("autenticar..." + this.loginForm.value["nombreUsuario"]);
    let userName = this.loginForm.value["nombreUsuario"];
    let password = this.loginForm.value["clave"];
    if (userName != "" && password != "") {
      this.router.navigate(["/adminvista"]);
    } else {
      this.msj = "Usurio o password incorrectos...!";
    }
  }
}
