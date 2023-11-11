# This is purely used as a bruteforce method to calculate 
# the common exponent of an array of numbers, 
# with which they all flip back to 1 with a given modulus.

# A much more sensible approach would be the extended Euclidean algorithm.

def normalizing_exponent(base, modulus, exponent):
    result = base

    while result != 1:
        result = (result * base) % modulus
        exponent += 1
    return exponent

def mod_pow(base, exponent, modulus):
    result = 1

    for i in range(exponent):
        result = (result * base) % modulus
    return result

def smallest_common_exponential(values, modulus):
    exponent = 1
    changed = True

    while changed:
        new_i = exponent
        changed = False

        for val in values:
            if(mod_pow(val, exponent, modulus) != 1):
                new_i = normalizing_exponent(val, modulus, exponent)
                changed = True
        
        if(changed):
            exponent = new_i
    return exponent


# Setup
values = [666, 1113, 1313]
modulus = 150_869_437

# Test 
# values = [3, 7, 17, 23]
# modulus = 19

# Run
exponent = smallest_common_exponential(values, modulus)
print(f"Smallest Common Exponential for val^i ≡ 1 mod m is {exponent}")

# Check
print("Check:")
for val in values:
    print(f"{val}^{exponent} mod {modulus} ≡ {mod_pow(val, exponent, modulus)}")