# exercicio 2 //2. Escreva uma função que conta o número de nós de uma árvore binária.
class TreeNode:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

def contar_nos_arvore_binaria(node):
    if node is None:
        return 0

    total_nos = 1 + contar_nos_arvore_binaria(node.left) + contar_nos_arvore_binaria(node.right)

    return total_nos

# Exemplo de uso:
raiz = TreeNode(1)
raiz.left = TreeNode(2)
raiz.right = TreeNode(3)
raiz.left.left = TreeNode(4)
raiz.left.right = TreeNode(5)
raiz.right.right = TreeNode(7)
raiz.right.left = TreeNode(10)
raiz.right.right.right = TreeNode(7)




total_nos = contar_nos_arvore_binaria(raiz)
print("Número de nós na árvore binária:", total_nos)