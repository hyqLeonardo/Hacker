class Vec:
    def __init__(self, labels, function):
        self.D = labels
        self.f = function

D = {0, 1, 0, 3}

def zero_vec(D):
    return Vec(D, {d:0 for d in D})


def setitem(v, d, val):
    v.f[d] = val
    
def getitem(v, d):
    return v.f[d] if d in v.f else 0


'''
My version :  not so good, kind of ~ "traditional"

def list2vec(L):
    return Vec( { x for x in range(len(L)) }, { x : L[x] for x in range(len(L)) } )
'''

def list2vec(L):
    return Vec(set(range(len(L))), {k : x for k, x in enumerate(L)} )

def asser(v):
    assert len(v) == 3
    return v[1]


## -------------------

'''
My version :  old fashion --

def list_dot(u, v):
    return sum([ u[i] * v[i] for i in range(len(u)) ])
'''

def list_dot(u, v):
    return sum([ a*b for a, b in zip(u, v) ])


'''
Basic version, where the domain of rows must all be the same.

def triangular_solve(rowlist, b):
    x = zero_vec(rowlist[0].D)
    for i in reversed(range(len(rowlist))):
        x[i] = (b[i] - rowlist[i] * x) / rowlist[i][i]
    return x
'''

## General version

def triangular_solve(rowlist, label_list, b):
    x = zero_vec(set(label_list))
    for r in reversed(range(len(rowlist))):
        c = lable_list[r]
        x[c] = (b[c] - x * rowlist[r]) / rowlist[r][c]
    return x












    
