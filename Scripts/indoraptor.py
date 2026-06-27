#!/usr/bin/python3

import random

seed = b'DINOBONE'

seed = int.from_bytes(seed, 'big', signed=False)

random.seed(seed)

DNA=list('TCAG') * 100
AL=3

random.shuffle(DNA)

mka = lambda: ''.join([random.choice(DNA) for _ in range(AL)])

mkprot = lambda ln: ''.join([mka() for _ in range(ln)])

if __name__ == '__main__':

    exa = 500
    exl = 4000
    of = 'Indoraptor.dna'

    open(of, 'x').close()

    for _ in range(exa):
        s = mkprot(exl)

        with open(of, 'a') as f:
            f.write(s)
    
    with open(of, 'a') as f:
        f.write('\n')

