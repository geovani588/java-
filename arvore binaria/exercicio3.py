# exercicio 3 //3. Escreva uma função que conta o número de nós não-folha de uma árvore binária.
class Node:
    def __init__(self, key):
        self.key = key
        self.left = None
        self.right = None

def count_non_leaf_nodes(root):
    if root is None or (root.left is None and root.right is None):
        return 0
    else:
        return 1 + count_non_leaf_nodes(root.left) + count_non_leaf_nodes(root.right)

# Exemplo de uso
# Cria uma árvore binária de busca
root = Node(10)
root.left = Node(5)
root.right = Node(12)
root.left.left = Node(3)
root.left.right = Node(7)
root.right.right = Node(21)

# Conta o número de  não-folha
num_non_leaf_nodes = count_non_leaf_nodes(root)

print("O número de nós não-folha da árvore é:", num_non_leaf_nodes)