import { Component, OnInit } from '@angular/core';
import { Book } from './book';
import { BookService } from './book.service';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {
  private title: String = 'Create new book';
  private book: Book = new Book();



  constructor(
    private bookService: BookService,
    private router: Router,
    private activateRoute: ActivatedRoute
  ) { }

  ngOnInit() {
  }

  public create(): void {
    console.log(this.book);
    this.bookService.create(this.book)
      .subscribe(cliente => {
        this.router.navigate(['/books']);
        // swal('Nuevo cliente', `Cliente ${book.nombre} creado con éxito!!!`, 'success')
      });
  }

  public update(): void {
    this.bookService.update(this.book)
      .subscribe(cliente => {
        this.router.navigate(['/clientes']);
        // swal('Cliente Actualizado', `Cliente ${cliente.nombre} actualizado con éxito!!!`, 'success')
      });
  }


}
