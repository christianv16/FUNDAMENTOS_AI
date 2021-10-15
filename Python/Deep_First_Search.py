graph = {"S": ["A","D"],
#Cola sale el primero que ingresamos
#Cola: [ S ] → procesar nodo S y desencolarlo.
#Cola: [ ] → nodo A desencolado. Visitar todos sus hijos y encolarlos
            "D": ["S","A","E"],
#Cola: [ D ] → nodo D no es visitado. Lo agregamos a la cola.
            "A": ["S","D", "B"],
#Cola: [ ] → nodo S y D no es visitado. Lo agregamos a la cola
	    "E": ["D","B","F"],
#Cola: [D] → nodo D no es visitado. Lo agregamos a la cola
	    "B": ["C","E","A"],
#Cola: [A,E] → nodo A , E no es visitado. Lo agregamos a la cola
	    "F": ["G","E"],
#Cola: [E] → nodo E no es visitado. Lo agregamos a la cola
        "C": ["B"],
#Cola: [ ] → la cola esta vacía 
        "G": ["F"]
#Cola: [ ] → la cola esta vacía 
		}

# Se puede implementar utilizando una cola primero en entrar primero en salir (FIFO)



def recursived_Deep_First_Search(graph, source,path = [] ):

       if source not in path:

           path.append(source)

           if source not in graph:
               # leaf node, backtrack
               return path

           for neighbour in graph[source]:

               path = recursived_Deep_First_Search(graph, neighbour, path)


       return path


path = recursived_Deep_First_Search(graph, "S")


dato1 = (" ".join(path))

print ("[" + str(dato1) + "]")
