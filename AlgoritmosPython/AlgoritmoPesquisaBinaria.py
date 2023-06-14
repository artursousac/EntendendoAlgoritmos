# Algoritmo que utiliza os conceitos de pesquisa binária conforme o livro entendendo algoritmos.


def pesquisaBinaria(lista, item):
    baixo = 0
    alto = len(lista) - 1

    while baixo <= alto:
        meio = (baixo + alto) // 2
        chute = lista[meio]
        if chute == item:
            return meio
        if chute > item:
            alto = meio - 1
        else:
            baixo = meio + 1
    return None

minhaLista = [1, 3, 5, 7, 9, 11]

print(pesquisaBinaria(minhaLista, 3))
print(pesquisaBinaria(minhaLista, -1))
