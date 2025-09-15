# outro exemplo do exercicio 1
class Node:
    def __init__(self, key):
        self.key = key
        self.left = None
        self.right = None

def insert(root, key):
    if root is None:
        return Node(key)
    else:
        if key < root.key:
            root.left = insert(root.left, key)
        else:
            root.right = insert(root.right, key)
    return root

def inorder_traversal(root):
    if root:
        inorder_traversal(root.left)
        print(root.key)
        inorder_traversal(root.right)

# Cria uma árvore binária de pesquisa.
root = None
keys = [40, 20, 60, 50, 70, 10, 30]
for key in keys:
    root = insert(root, key)

# Percurso em ordem na árvore.
print("Percurso em ordem:")
inorder_traversal(root)