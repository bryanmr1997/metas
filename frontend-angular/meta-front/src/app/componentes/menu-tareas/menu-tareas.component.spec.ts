import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MenuTareasComponent } from './menu-tareas.component';

describe('MenuTareasComponent', () => {
  let component: MenuTareasComponent;
  let fixture: ComponentFixture<MenuTareasComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MenuTareasComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MenuTareasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
