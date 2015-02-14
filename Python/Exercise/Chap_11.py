## 11. 1

def words_key() :
    """ Use words in words.txt as key value
          to build a dictionary
    """
    d = dict()
    fin = open('words.txt')
    for line in fin :
        word = line.strip()
        d[word] = None
    return d
        
## 11. 2

def histogram(s) :
    """ Given a string, return the times
          each word appeared in it.
    """
    d = dict()
    for c in s :
        d[c] = d.get(c, 0) + 1
    return d


## 11. 3

def order_print(h) :
    l = h.keys()
    l.sort()
    print l
    for c in l :
        print c, h[c]


## 11. 4

def reverse_lookup(d, v) :
    l = []
    for k in d :
        if d[k] == v :
            l.append(k)
    return l


## 11. 5

def invert_dict(d) :
    inverse = dict()
    for key, val in d.iteritems() :
       inverse.setdefault(val, []).append(key)
    return inverse

## 11. 6

def fibonacci_ori(n) :
    if n == 0 :
        return 0
    elif n == 1 :
         return 1
    else :
        return fibonacci_ori(n-1) + fibonacci(n-2)


#----------  Use   Memo ------------

known = {0 : 0, 1 : 1}

def fibonacci(n) :
    if n in known :
        return known[n]

    res = fibonacci(n-1) + fibonacci(n-2)
    known[n] = res
    return res


## 11. 7

def ack(m, n) :
    if m == 0 :
        return n + 1
    elif m > 0 and n == 0 :
        return ack(m-1, 1)
    elif m > 0 and n > 0 :
        return ack(m-1, ack(m, n-1))


cache = {}

def ack_memo(m, n) :
    if m == 0 :
        return n + 1
    if n== 0 :
        return ack_memo(m-1, 1)
    try :
        return cache[m, n]
    except KeyError :
        cache[m, n] = ack_memo(m-1, ack_memo(m, n-1))
        return cache[m, n]



## 11. 9

def rotate_letter(letter, n) :
    if letter.isupper() :
        start = ord('A')
    elif letter.islower() :
        start = ord('a')
    else :
        return letter

    c = ord(letter) - start
    i = (c + n) % 26 + start
    return chr(i)

def rotate_word(word, n) :

    res = ''
    for letter in word :
        res += rotate_letter(letter, n)
    return res


#-----------------  This is my version ---------------

def rotate_pairs(L) :
    """ Given a word list, find all the
          rotate pairs in it
    """
    res = dict()

    for word in L :
        res[word]  = []
        for i in range(25) :
            r_word = rotate_word(word, i+1)
            print r_word, L
            if r_word in L :
                res[word].append(r_word)

    return res




## 11. 10

def read_dictionary(filename='c06d'):
    """Reads from a file and builds a dictionary that maps from
    each word to a string that describes its primary pronunciation.

    Secondary pronunciations are added to the dictionary with
    a number, in parentheses, at the end of the key, so the
    key for the second pronunciation of "abdominal" is "abdominal(2)".

    filename: string
    returns: map from string to pronunciation
    """
    d = dict()
    fin = open(filename)
    for line in fin:

        # skip over the comments
        if line[0] == '#': continue

        t = line.split()
        word = t[0].lower()
        pron = ' '.join(t[1:])
        d[word] = pron

    return d


#--------------- My simplified version (only give one word "scent") --------------

def find_word(d) :  
    res = []
    for w in d :
        if w[1 : ] in d and w.replace(w[1], '') in d :
            if d[w] == d[w[1 : ]] and d[w] == d[w.replace(w[1], '')] :
                res.append(w)
    return res


# -------------- Full solution ----------------

def homophones(a, b, phonetic):
    """Checks if words two can be pronounced the same way.

    If either word is not in the pronouncing dictionary, return False

    a, b: strings
    phonetic: map from words to pronunciation codes
    """
    if a not in phonetic or b not in phonetic:
        return False

    return phonetic[a] == phonetic[b]


def check_word(word, word_dict, phonetic):
    """Checks to see if the word has the following property:
    removing the first letter yields a word with the same
    pronunciation, and removing the second letter yields a word
    with the same pronunciation.

    word: string
    word_dict: dictionary with words as keys
    phonetic: map from words to pronunciation codes
    """
    word1 = word[1:] 
    if word1 not in word_dict:
        return False
    if not homophones(word, word1, phonetic):
        return False

    word2 = word[0] + word[2:]
    if word2 not in word_dict:
        return False
    if not homophones(word, word2, phonetic):
        return False
    
    return True


if __name__ == '__main__':
    phonetic = read_dictionary()
    word_dict = words_key()

    for word in word_dict:
        if check_word(word, word_dict, phonetic):
            print word, word[1:], word[0] + word[2:]



















    
