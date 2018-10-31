#!/bin/bash


read -p "Ingrese un caracter: " carac

case $carac in
	[0-9]*)
		respuesta="numero"
		;;
	a)
		respuesta="vocal"
		;;
	e)
		respuesta="vocal"
		;;
	i)
		respuesta="vocal"
		;;
	o)
		respuesta="vocal"
		;;
	u)
		respuesta="vocal"
		;;
	b)
		respuesta="consonante"
		;;
	c)
		respuesta="consonante"
		;;
	d)
		respuesta="consonante"
		;;
	f)
		respuesta="consonante"
		;;
	g)
		respuesta="consonante"
		;;
	
	h)
		respuesta="consonante"
		;;
	j)
		respuesta="consonante"
		;;
	k)
		respuesta="consonante"
		;;
	l)
		respuesta="consonante"
		;;
	m)
		respuesta="consonante"
		;;
	n)
		respuesta="consonante"
		;;
	p)
		respuesta="consonante"
		;;
	q)
		respuesta="consonante"
		;;
	r)
		respuesta="consonante"
		;;
	s)
		respuesta="consonante"
		;;
	t)
		respuesta="consonante"
		;;
	v)
		respuesta="consonante"
		;;
	w)
		respuesta="consonante"
		;;
	x)
		respuesta="consonante"
		;;
	y)
		respuesta="consonante"
		;;
	z)
		respuesta="consonante"
		;;
	*)
		respuesta="error"
		;;
esac

	echo $respuesta
exit 0

