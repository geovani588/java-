# exercicio 1 //1. Utilizando os conceitos de grafos, defina uma árvore.
class node:
    def __init__(self, chave: int):
        self.chave = chave
        self.left = 0
        self.right = 0

def arvoreBinaria(lista, chave):
    if chave in lista:
        index = lista.index(chave)
        no = node(chave)
        if index > 0:
            no.left = arvoreBinaria(lista[:index], lista[index-1])
        elif index < len(lista)-1:
            no.right = arvoreBinaria(lista[index+1:], lista[index+1])
        return no
   
    return None

def inorder_traversal(root):
    if root:
        inorder_traversal(root.left)
        print(root.chave)
        inorder_traversal(root.right)

# Exemplo de criação da árvore
lista = [50, 30, 20, 40, 70, 60, 80]
root = arvoreBinaria(lista, 50)

# Exibição da árvore em ordem
print("Árvore em ordem:")
inorder_traversal(root)
