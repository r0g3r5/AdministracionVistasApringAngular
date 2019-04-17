import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";

import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { LoginComponent } from "./pages/seguridad/login/login.component";
import { InicioComponent } from "./pages/inicio/inicio.component";
import { NavComponent } from "./_templates/nav/nav.component";
import { HeaderComponent } from "./_templates/header/header.component";
import { SeguridadComponent } from "./pages/seguridad/seguridad.component";
import { PanelMenuModule } from "primeng/panelmenu";
import { BrowserAnimationsModule } from "@angular/platform-browser/animations";
import { MenuItem } from "primeng/api";
import { HttpClientModule } from "@angular/common/http";

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    InicioComponent,
    NavComponent,
    HeaderComponent,
    SeguridadComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    HttpClientModule,
    PanelMenuModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {}
