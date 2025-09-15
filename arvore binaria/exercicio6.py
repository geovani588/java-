# exercicio 6 //Escreva uma função para buscar um número impar em uma árvore binária NÃO orde- nada.
class TreeNode:
    def __init__(self, value):
        self.value = value
        self.left = 0  
        self.right = 0  

def busca_numeros_impares(node):
    if node == 0: 
        return []

    numeros_impares = []

    if node.value % 2 == 1:  # Verifica se o valor é ímpar
        numeros_impares.append(node.value)

    # Realiza a busca recursivamente na subárvore esquerda e direita e combina as listas de números ímpares encontrados
    numeros_impares_esquerda = busca_numeros_impares(node.left)
    numeros_impares_direita = busca_numeros_impares(node.right)

    numeros_impares.extend(numeros_impares_esquerda)
    numeros_impares.extend(numeros_impares_direita)

    return numeros_impares

raiz = TreeNode(10)
raiz.left = TreeNode(4)
raiz.right = TreeNode(17)
raiz.left.left = TreeNode(8)
raiz.left.right = TreeNode(12)
raiz.right.left = TreeNode(15)

numeros_impares = busca_numeros_impares(raiz)
if numeros_impares:
    print("Números ímpares encontrados na árvore:", numeros_impares)
else:
    print("Nenhum número ímpar encontrado na árvore.")
