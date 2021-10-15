#Se expanden todos los nodos a una nivel en el árbol de búsqueda antes de expandir cualquier nodo
#del próximo nivel.

graph = {"S": ["A","D"],
            "D": ["S","A","E"],
            "A": ["S","D", "B"],
	    "E": ["D","B","F"],
	    "B": ["C","E","A"],
	    "F": ["G","E"],
        "C": ["B"],
        "G": ["F"]
		}

#Se puede implementar utilizando una cola primero en entrar primero en salir (FIFO)

visited = []    # List to keep track of visited nodes.
queue = []      #Inicializa la cola

#función con un parámetro
def resultado(arg):
    a = arg.append(1)
    return (a)
    

def  Breadth_First_Search(visited, graph, node):
  visited.append(node)
  queue.append(node)

  while queue:
    s = queue.pop(0) 
    print (s, end = " ") 

    for neighbour in graph[s]:
      if neighbour not in visited:
        visited.append(neighbour)
        queue.append(neighbour)

# Driver Code

data1 = Breadth_First_Search(visited, graph, 'S')
print (data1)





