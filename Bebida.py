#!/usr/bin/python
#-*- coding: utf-8 -*-

from Producto import Producto

class Bebida(Producto):
    def __init__(self):
        self.presentacion = None
        self.contenido = None

