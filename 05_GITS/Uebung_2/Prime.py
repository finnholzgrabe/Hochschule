# This is purely used as a bruteforce method 
# to calculate the first exponent, to which power 
# a given base value equals 1 under a given modulus.

def normalizing_exponent(base, modulus):
    exponent = 1
    result = base

    while result != 1:
        result = (result * base) % modulus
        exponent += 1
    return exponent

# Setup
modulus = 6637
base = 5

# Run
print(normalizing_exponent(base, modulus))