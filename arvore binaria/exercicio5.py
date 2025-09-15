# exercicio 5 //5. Escreva uma função que calcula a altura de uma árvore binária.
class TreeNode:
    def __init__(self, value):
        self.value = value
        self.left = 0
        self.right = 0

def alturaarvorebinaria(node):
    if node == 0:
        return 0
    else:
        # Recursivamente calcula a altura das subárvores esquerda e direita
        altura_esquerda = alturaarvorebinaria(node.left)
        altura_direita = alturaarvorebinaria(node.right)
        
        # A altura da árvore é o máximo entre a altura das subárvores + 1 (para contar o nó atual)
        return max(altura_esquerda, altura_direita) + 1

# Construa sua árvore binária
raiz = TreeNode(500)
raiz.left = TreeNode(750)
raiz.right = TreeNode(500)
raiz.left.left = TreeNode(250)
raiz.left.right = TreeNode(5)

# Calcule a altura da árvore
altura = alturaarvorebinaria(raiz)
print("Altura da árvore binária: ", altura)