#!/usr/bin/python3

tab = {
        'Phenylalanine': ['TTT', 'TTC'],
        'Leucine': ['TTA', 'TTG', 'CTT', 'CTC', 'CTA', 'CTG'],
        'Isoleucine': ['ATT', 'ATC', 'ATA'],
        'Methionine': ['ATG'],
        'Valine': ['GTT', 'GTC', 'GTA', 'GTG'],
        'Serine': ['TCT', 'TCC', 'TCA', 'TCG', 'AGT', 'AGC'],
        'Proline': ['CCT', 'CCC', 'CCA', 'CCG'],
        'Threonine': ['ACT', 'ACC', 'ACA', 'ACG'],
        'Alanine': ['GCT', 'GCC', 'GCA', 'GCG'],
        'Tyrosine': ['TAT', 'TAC'],
        'Stop': ['TAA', 'TAG', 'TGA'],
        'Histidine': ['CAT', 'CAC'],
        'Glutamine': ['CAA', 'CAG'],
        'Asparagine': ['AAT', 'AAC'],
        'Lysine': ['AAA', 'AAG'],
        'Aspartic acid': ['GAT', 'GAC'],
        'Glutamic acid': ['GAA', 'GAG'],
        'Cysteine': ['TGT', 'TGC'],
        'Tryptophan': ['TGG'],
        'Arginine': ['CGT', 'CGC', 'CGA', 'CGG', 'AGA', 'AGG'],
        'Glycine': ['GGT', 'GGC', 'GGA', 'GGG'],
}

def identify(blk):
    for r, cds in tab.items():
        if blk in cds:
            return r
    raise ValueError(blk)

def idall(s):
    cl = []
    tl = []
    while len(s) > 0:
        c = identify(s[:3])
        s = s[3:]
        if c == 'Stop':
            cl.append(tl)
            tl = []
        else:
            tl.append(c)
    return cl

if __name__ == '__main__':
    import pprint
    import pickle
    ifn = 'Indoraptor.dna'
    ofn = 'Indoraptor.amino_acids'
    with open(ifn, 'r') as f:
        hugechunk = f.read().strip()
    assert len(hugechunk) % 3 == 0
    hugechunk = idall(hugechunk)
    wuh = len(hugechunk)
    with open(ofn, 'w') as os:
        pprint.pprint(hugechunk, stream=os)
    with open(ofn + '.pkl', 'wb') as f:
        pickle.dump(hugechunk, f)
    print('Decoded %d amino acid chains' % (wuh,))

