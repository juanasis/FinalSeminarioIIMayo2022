import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Contacto } from '../interfaces/contacto';
import { ResponseDto } from '../interfaces/responseDto';

@Injectable({
  providedIn: 'root'
})
export class ContactoService {
  private base = 'http://localhost:8080';
  
  constructor(private httpClient: HttpClient) { }

  post(contacto: Contacto) {
    return this.httpClient.post<ResponseDto>(this.base + `/contactos`, contacto);
  }
}
