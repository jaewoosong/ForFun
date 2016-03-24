def ngramGen(txtFile, n):
    f = open(txtFile, 'r')
    lines = f.readlines()
    ngram = list()

    for oneLine in lines:
        tokens = oneLine.split()
        for i in range(0, len(tokens)-n+1):
            ngram.append(tokens[i:i+n])

    f.close()
    print(ngram)

