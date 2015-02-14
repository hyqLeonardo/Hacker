import math

def distance(x1, y1, x2, y2) :
    dx = x2 - x1
    dy = y2 - y1
    dsquared = dx**2 + dy**2
    result = math.sqrt(dsquared)
    return result


def is_between(x, y, z) :
    return x <= y and y <= z


def factorial(n) :
    if not isinstance(n, int) :
        print 'Factorial is only defined for integer'
        return None
    elif n < 0 :
        print 'Factorial is not defined for negative integers'
    elif n == 0 :
        return 1
    else :
        return n * factorial(n-1)


def fib(n) :
    first = 0
    second = 1
    if n == 0 :
        return 0
    elif n == 1 :
        return 1
    else :
        f = fib(n - 1)
        s = fib(n - 2)
        result = f + s
        return result


def factorial_print(n) :
    space = ' ' * (4 * n)
    print space, 'factorial', n
    if n == 0 :
        print space, 'returning 1'
        return 1
    else :
        recurse = factorial_print(n - 1)
        result = n * recurse
        print space, 'returning', result
        return result


####-------------------Exercise-------------------####

## 6.4

def b(z) :
    prod = a(z, z)
    print z, prod
    return prod

def a(x, y) :
    x = x + 1
    return x * y

def c(x, y, z) :
    total = x + y + z
    square = b(total) ** 2
    return square


## 6.5

def ack(m, n) :
    if m == 0 :
        return n + 1
    elif m > 0 and n == 0 :
        return ack(m - 1, 1)
    elif m > 0 and n > 0 :
        return ack(m - 1, ack(m, n - 1))

## 6.7

def is_power(a, b) :
    if float(a)/b == 1 :
        return True
    elif a % b == 0 :
        return is_power(a/b, b)
    else :
        return False

## 6.8
    
def gcd(a, b) :
    if b == 0 :
        return a
    else :
        r = a % b
        return gcd(b, r)


