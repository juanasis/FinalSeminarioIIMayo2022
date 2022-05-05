import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Contacto } from 'src/app/interfaces/contacto';
import { ContactoService } from 'src/app/services/contacto.service';

@Component({
  selector: 'app-tab4',
  templateUrl: './tab4.page.html',
  styleUrls: ['./tab4.page.scss'],
})
export class Tab4Page implements OnInit {
  formContacto = new FormGroup({
    nombre: new FormControl('',Validators.required),
    correo: new FormControl('',Validators.required),
     mensaje: new FormControl('',Validators.required)

  })
  contacto: Contacto = {
    id: 0,
    nombre: '',
    correo: '',
    mensaje: ''
  };
  constructor(private contactoService: ContactoService) { }

  ngOnInit() {

  }
  createContacto(){
    this.contactoService.post(this.convertirAContacto()).subscribe(
      resp => {
      console.log('Contacto',resp.data);
      }
    );
  }

  convertirAContacto(){
    this.contacto.nombre = this.formContacto.get('nombre').value;
    this.contacto.correo = this.formContacto.get('correo').value;
    this.contacto.mensaje = this.formContacto.get('mensaje').value;
    return this.contacto;
  }
}
