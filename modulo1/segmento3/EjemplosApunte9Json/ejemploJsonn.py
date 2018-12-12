import json

persona={}
#persona['nombre']='German'
#persona['apellido']='Dasin'

#Escribir
#with open('persona.json','w') as fileOut:
#	json.dump(persona, fileOut)

#Leer
with open('persona.json','r') as fileIn:
	persona=json.load(fileIn)

print(persona)
